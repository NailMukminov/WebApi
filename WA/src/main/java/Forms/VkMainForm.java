package Forms;

import aquality.selenium.forms.Form;
import org.openqa.selenium.By;

public class VkMainForm extends Form {
	private final VkIdForm vkIdForm = new VkIdForm();

	public VkMainForm() {
		super(By.xpath("//div[@index='index_login']"), "VkMainForm");
	}

	public VkIdForm getVkIdForm() {
		return vkIdForm;
	}
}
