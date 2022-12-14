package in.medicare.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PaymentDetails {
 
	@FindBy(id = "cardNumber")
	private WebElement CardNum;
	
	@FindBy(id = "expityMonth")
	private  WebElement ExpiryMnth;
	
	@FindBy(id = "expityYear")
	private WebElement ExpiryYear;
	
	@FindBy(id = "cvCode")
	private WebElement CVV;
	
	@FindBy(linkText = "medicare")
	private WebElement payment;
	
	public PaymentDetails(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void payment() {
		CardNum.sendKeys("123456789");
		
		ExpiryMnth.sendKeys("02");
		
		ExpiryYear.sendKeys("2024");
		
		CVV.sendKeys("4567");
		
		payment.click();
		
	}
}
