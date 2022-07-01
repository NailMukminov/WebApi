package Forms;

import aquality.selenium.elements.interfaces.IButton;
import aquality.selenium.forms.Form;
import org.openqa.selenium.By;

public class VkIdForm extends Form {
	private final IButton signInBtn = getElementFactory().getButton(By.xpath("//button[contains(@class, 'signInButton')]"), "signInButton");

	public VkIdForm() {
		super(By.xpath("//div[@class='VkIdForm']"), "VkIdForm");
	}

	public void clickSignInBtn() {
		signInBtn.click();
	}
}
