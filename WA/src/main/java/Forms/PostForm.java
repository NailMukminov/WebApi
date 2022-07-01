package Forms;

import aquality.selenium.elements.interfaces.IButton;
import aquality.selenium.elements.interfaces.ILabel;
import aquality.selenium.forms.Form;
import org.openqa.selenium.By;

public class PostForm extends Form {
	private final ILabel wallTextLabel = getElementFactory().getLabel(By.xpath(String.format("%s//div[contains(@class,'wall_post_text')]", super.getLocator().toString().substring(9))), "Wall text");
	private final IButton creatorName = getElementFactory().getButton(By.xpath(String.format("%s//a[@class='author']", super.getLocator().toString().substring(9))), "Creator name");
	private final IButton imagePost = getElementFactory().getButton(By.xpath(String.format("%s//a[contains(@onclick, 'showPhoto')]", super.getLocator().toString().substring(9))), "imagePost");
	private final IButton likeBtn = getElementFactory().getButton(By.xpath(String.format("%s//span[contains(@class, 'like')]", super.getLocator().toString().substring(9))), "likeBtn");
	private final IButton openCommentBtn = getElementFactory().getButton(By.xpath(String.format("%s//a[contains(@class, 'replies_next')]", super.getLocator().toString().substring(9))), "commentBtn");
	private final ILabel likeCountLabel = getElementFactory().getLabel(By.xpath(String.format("%s//div[contains(@class, 'counter')]", super.getLocator().toString().substring(9))), "likeCountLabel");

	public PostForm(String idPost, String userId) {
		super(By.xpath(String.format("//div[@id='post%s_%s']", userId, idPost)), "Post");
	}

	public String getWallTextLabelText() {
		return wallTextLabel.getText();
	}

	public ILabel getWallTextLabel() {
		return wallTextLabel;
	}

	public String getNameOfCreator() {
		return creatorName.getText();
	}

	public String getHrefOfImage() {
		return imagePost.getAttribute("href");
	}

	public void clickLikeBtn() {
		likeBtn.click();
	}

	public void clickCommentBtn() {
		openCommentBtn.click();
	}

	public String countLikes() {
		return likeCountLabel.getText();
	}
}
