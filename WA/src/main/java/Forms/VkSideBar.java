package Forms;

import aquality.selenium.elements.interfaces.IButton;
import aquality.selenium.forms.Form;
import org.openqa.selenium.By;

public class VkSideBar extends Form {
	private final IButton myPageBtn = getElementFactory().getButton(By.xpath("//li[@id='l_pr']//a[@class='left_row']"), "myPageBtn");

	public VkSideBar() {
		super(By.xpath("//div[@id='side_bar']"), "VkSideBar");
	}

	public void clickMyPageBtn() {
		myPageBtn.click();
	}
}
