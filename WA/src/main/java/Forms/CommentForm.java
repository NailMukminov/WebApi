package Forms;

import aquality.selenium.elements.interfaces.IButton;
import aquality.selenium.forms.Form;
import org.openqa.selenium.By;

public class CommentForm extends Form {
	private final IButton nameCreatorBtn = getElementFactory().getButton(By.xpath(String.format("%s//a[@class='author']", super.getLocator().toString().substring(9))), "");

	public CommentForm(String idComment) {
		super(By.xpath(String.format("//div[contains(@id, '%s')]", idComment)), "CommentForm");
	}

	public String getNameCreatorText() {
		return nameCreatorBtn.getText();
	}
}
