package in.medicare.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AllDrugsCategories {
	
	@FindBy(linkText = "cart")
	private WebElement Cart;
	
	@FindBy(linkText = "medicare")
	private WebElement Checkout;
	
	public AllDrugsCategories(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnCart() {
		Cart.click();
		Checkout.click();
		
	}
}
