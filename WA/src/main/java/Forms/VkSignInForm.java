package Forms;

import aquality.selenium.elements.interfaces.IButton;
import aquality.selenium.elements.interfaces.ITextBox;
import aquality.selenium.forms.Form;
import org.openqa.selenium.By;

public class VkSignInForm extends Form {
	private final ITextBox inputLoginBox = getElementFactory().getTextBox(By.xpath("//input[@name='login']"), "InputLoginBox");
	private final ITextBox inputPasswordBox = getElementFactory().getTextBox(By.xpath("//input[@name='password']"), "InputLoginBox");
	private final IButton enterLoginBtn = getElementFactory().getButton(By.xpath("//div[contains(@class, 'EnterLogin')]//button"), "enterLoginBtn");
	private final IButton enterPasswordBtn = getElementFactory().getButton(By.xpath("//button[@type='submit']"), "enterPasswordBtn");

	public VkSignInForm() {
		super(By.xpath("//div[@class='vkc__Auth__pageBox']"), "VkSignInForm");
	}

	public void inputLogin(String login) {
		inputLoginBox.clearAndType(login);
	}

	public void inputPassword(String password) {
		inputPasswordBox.clearAndType(password);
	}

	public void clickEnterLogin() {
		enterLoginBtn.click();
	}

	public void clickEnterPassword() {
		enterPasswordBtn.click();
	}
}
