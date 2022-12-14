package in.medicare.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ViewCategory {
	
	@FindBy(id = "a_Fever")
	private WebElement viewCat;
	
	public ViewCategory(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void viewFeverCategory() {
		viewCat.click();
	}
	
	
	

}
