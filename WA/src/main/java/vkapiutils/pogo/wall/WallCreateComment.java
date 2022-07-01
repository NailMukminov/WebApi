package vkapiutils.pogo.wall;

import com.google.gson.annotations.SerializedName;

public class WallCreateComment {
	@SerializedName(value = "access_token")
	private String accessToken;
	@SerializedName(value = "owner_id")
	private int ownerId;
	@SerializedName(value = "post_id")
	private int postId;
	@SerializedName(value = "from_group")
	private int fromGroup;
	private String message;
	@SerializedName(value = "reply_to_comment")
	private int replyToComment;
	private String attachments;
	@SerializedName(value = "sticker_id")
	private int stickerId;
	private String guid;
	private String v;

	public String generateUrl() {
		return "owner_id=" + ownerId
		 + "&post_id=" + postId
		 + "&from_group=" + fromGroup
		 + "&message=" + message
		 + "&reply_to_comment=" + replyToComment
		 + "&attachments=" + attachments
		 + "&sticker_id=" + stickerId
		 + "&guid=" + guid
		 + "&access_token=" + accessToken
		 + "&v=" + v;
	}

	public String getAccessToken() {
		return accessToken;
	}

	public void setAccessToken(String accessToken) {
		this.accessToken = accessToken;
	}

	public int getOwnerId() {
		return ownerId;
	}

	public void setOwnerId(int ownerId) {
		this.ownerId = ownerId;
	}

	public int getPostId() {
		return postId;
	}

	public void setPostId(int postId) {
		this.postId = postId;
	}

	public int isFrom_group() {
		return fromGroup;
	}

	public void setFromGroup(int fromGroup) {
		this.fromGroup = fromGroup;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public int getReplyToComment() {
		return replyToComment;
	}

	public void setReplyToComment(int replyToComment) {
		this.replyToComment = replyToComment;
	}

	public String getAttachments() {
		return attachments;
	}

	public void setAttachments(String attachments) {
		this.attachments = attachments;
	}

	public int getStickerId() {
		return stickerId;
	}

	public void setStickerId(int stickerId) {
		this.stickerId = stickerId;
	}

	public String getGuid() {
		return guid;
	}

	public void setGuid(String guid) {
		this.guid = guid;
	}

	public String getV() {
		return v;
	}

	public void setV(String v) {
		this.v = v;
	}
}
