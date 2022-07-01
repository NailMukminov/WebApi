package Tests;

import Utils.JsonUtils;
import aquality.selenium.browser.AqualityServices;
import aquality.selenium.browser.Browser;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class PredPostTests {
	private static final String CONFIG_PATH = "../WA/src/main/resources/config.json";
	protected final Browser browser = AqualityServices.getBrowser();
	protected final String pathTestingDataFile = (String) JsonUtils.smartReadJson(CONFIG_PATH, "testingDataFile");
	protected static final String VK_URL = (String) JsonUtils.smartReadJson(CONFIG_PATH, "url");
	protected static final String PATH_TO_PHOTO = (String) JsonUtils.smartReadJson(CONFIG_PATH, "pathToPhoto");
	protected static final String PATH_TO_WALL_POST_FILE = (String) JsonUtils.smartReadJson(CONFIG_PATH, "pathToWallPostFile");
	protected static final String PATH_TO_WALL_EDIT_FILE = (String) JsonUtils.smartReadJson(CONFIG_PATH, "pathToWallEditFile");
	protected static final String PATH_TO_WALL_CREATE_COMMENT_FILE = (String) JsonUtils.smartReadJson(CONFIG_PATH, "pathToWallCreateCommentFile");
	protected static final String PATH_TO_WALL_GET_LIKES_FILE = (String) JsonUtils.smartReadJson(CONFIG_PATH, "pathToWallGetLikesFile");
	protected static final String PATH_TO_WALL_DELETE_FILE = (String) JsonUtils.smartReadJson(CONFIG_PATH, "pathToWallDeleteFile");
	protected static final String PATH_TO_PHOTOS_GET_UPLOAD_SERVER_FILE = (String) JsonUtils.smartReadJson(CONFIG_PATH, "pathToPhotosGetUploadServerFile");
	protected static final String PATH_TO_PHOTOS_SAVE_FILE = (String) JsonUtils.smartReadJson(CONFIG_PATH, "PathToPhotosSaveFile");

	@BeforeTest
	public void pred() {
		browser.goTo(VK_URL);
	}

	@AfterTest
	public void post() {
		browser.quit();
	}
}
