package Tests;

import vkapiutils.Photos;
import vkapiutils.Wall;
import Forms.*;
import Utils.JsonUtils;
import Utils.StringUtils;
import aquality.selenium.browser.AqualityServices;
import org.testng.Assert;
import org.testng.annotations.Test;
import vkapiutils.pogo.pass.User;
import vkapiutils.pogo.photo.GetWallUploadServer;
import vkapiutils.pogo.photo.SaveWallPhoto;
import vkapiutils.pogo.wall.*;

public class VkApi extends PredPostTests{
	private final User testUser = (User) JsonUtils.deserializeJsonObject(pathTestingDataFile, "users", 0, User.class);
	private final WallPost wallPost = (WallPost)JsonUtils.smartDeserialize(PATH_TO_WALL_POST_FILE, WallPost.class);
	private final WallEdit wallEdit = (WallEdit)JsonUtils.smartDeserialize(PATH_TO_WALL_EDIT_FILE, WallEdit.class);
	private final WallCreateComment wallCreateComment = (WallCreateComment) JsonUtils.smartDeserialize(PATH_TO_WALL_CREATE_COMMENT_FILE, WallCreateComment.class);
	private final WallGetLikes wallGetLikes = (WallGetLikes) JsonUtils.smartDeserialize(PATH_TO_WALL_GET_LIKES_FILE, WallGetLikes.class);
	private final WallDelete wallDelete = (WallDelete) JsonUtils.smartDeserialize(PATH_TO_WALL_DELETE_FILE, WallDelete.class);
	private final GetWallUploadServer pogoUpload = (GetWallUploadServer) JsonUtils.smartDeserialize(PATH_TO_PHOTOS_GET_UPLOAD_SERVER_FILE, GetWallUploadServer.class);
	private final SaveWallPhoto saveWallPhoto = (SaveWallPhoto) JsonUtils.smartDeserialize(PATH_TO_PHOTOS_SAVE_FILE, SaveWallPhoto.class);
	private final String expectedCountLikes = "1";

	@Test
	public void test() {
		VkMainForm vkMainForm = new VkMainForm();
		vkMainForm.getVkIdForm().clickSignInBtn();

		VkSignInForm vkSignInForm = new VkSignInForm();
		vkSignInForm.inputLogin(testUser.getLogin());
		vkSignInForm.clickEnterLogin();
		vkSignInForm.inputPassword(testUser.getPassword());
		vkSignInForm.clickEnterPassword();

		VkSideBar vkSideBar = new VkSideBar();
		vkSideBar.clickMyPageBtn();

		wallPost.setMessage(StringUtils.generateRandomString());
		var wallPostResponse = Wall.post(wallPost.generateUrl());
		int postId = wallPostResponse.getPostId();

		InfoForm infoForm = new InfoForm();
		PostForm post = new PostForm(String.valueOf(postId), testUser.getId());
		Assert.assertTrue(post.state().waitForDisplayed(),"Post doesn't exist");
		Assert.assertEquals(post.getWallTextLabelText(), wallPost.getMessage(), "Post text doesn't match expected");
		Assert.assertEquals(post.getNameOfCreator(), infoForm.getPageNameText(), "Post creator doesn't match expected");

		var uploadServerResponse = Photos.getWallUploadServer(pogoUpload.generateUrl());
		String uploadUrl = uploadServerResponse.getUploadUrl();
		var uploadImageResponse = Photos.uploadToServer(uploadUrl,"photo", PATH_TO_PHOTO);

		saveWallPhoto.setServer(uploadImageResponse.getServer());
		saveWallPhoto.setPhoto(uploadImageResponse.getPhoto());
		saveWallPhoto.setHash(uploadImageResponse.getHash());
		saveWallPhoto.setUserId(uploadServerResponse.getUserID());
		var jsonResponse = Photos.saveWallPhoto(saveWallPhoto.generateUrl());
		var idPhoto = jsonResponse.getPhotoId();

		wallEdit.setPostId(postId);
		wallEdit.setMessage(StringUtils.generateRandomString());
		wallEdit.setAttachments(wallEdit.getAttachments()+idPhoto);
		Wall.edit(wallEdit.generateUrl());
		Assert.assertEquals(wallEdit.getAttachments(), post.getHrefOfImage().substring(15), "Attachment wasn't added");
		Assert.assertEquals(post.getWallTextLabelText(), wallEdit.getMessage(), "Text of post wasn't changed");

		wallCreateComment.setPostId(postId);
		wallCreateComment.setMessage(StringUtils.generateRandomString());

		var wallCreateCommentResponse = Wall.createComment(wallCreateComment.generateUrl());
		int idComment = wallCreateCommentResponse.getCommentId();
		CommentForm commentForm = new CommentForm(String.valueOf(idComment));
		post.clickCommentBtn();
		Assert.assertTrue(commentForm.state().waitForDisplayed(), "Comment doesn't exist");
		Assert.assertEquals(commentForm.getNameCreatorText(), infoForm.getPageNameText(), "Comment creator is invalid");

		post.clickLikeBtn();
		AqualityServices.getConditionalWait().waitFor(() -> post.countLikes().equals(expectedCountLikes));
		wallGetLikes.setPostId(postId);
		var wallGetLikesResponse = Wall.getLikes(wallGetLikes.generateUrl());
		Assert.assertEquals(wallGetLikes.getOwnerId(), wallGetLikesResponse.getBody().getObject().getJSONObject("response").getJSONArray("users").getJSONObject(0).getInt("uid"));

		wallDelete.setPostId(postId);
		Wall.delete(wallDelete.generateUrl());
		AqualityServices.getConditionalWait().waitFor(() -> post.state().waitForNotDisplayed());
		Assert.assertFalse(post.state().isDisplayed(), "Post is exist");
	}
}
