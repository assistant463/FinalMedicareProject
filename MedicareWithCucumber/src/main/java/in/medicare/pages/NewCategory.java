package in.medicare.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NewCategory {
	
	@FindBy(id = "name")
	private WebElement categoryName;
	
	@FindBy(id = "description")
	private WebElement enterCategoryDescription;
	
	@FindBy(name = "submit")
	private WebElement save;
	

public void CategoryDetails() {
	categoryName.sendKeys("Fever");
	enterCategoryDescription.sendKeys("HighFeverWithCold");
	save.click();
	
	}
}