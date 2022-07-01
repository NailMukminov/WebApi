package Forms;

import aquality.selenium.elements.interfaces.ILabel;
import aquality.selenium.forms.Form;
import org.openqa.selenium.By;

public class InfoForm extends Form {
	private final ILabel pageName = getElementFactory().getLabel(By.xpath("//h1[@class='page_name']"), "Page name");

	public InfoForm() {
		super(By.xpath("//div[@id='page_info_wrap']"), "Page info form");
	}

	public String getPageNameText() {
		return pageName.getText();
	}
}
