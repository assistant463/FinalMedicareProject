package in.medicare.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class ValidateTheSuccessText {
	
	@FindBy(xpath ="//div[contains(@class,'alert alert-success')]")
	private WebElement successMsg;
	
	@FindBy(linkText = "/medicare/show/all/products")
	private WebElement continueShopping;
	
	public  ValidateTheSuccessText (WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	

	public String  getSuccessMsg() {
		String successMsgText = successMsg.getText();
		return successMsgText;
	}
		
		public void shopping() {
			 continueShopping.click();
		}
	
	}


