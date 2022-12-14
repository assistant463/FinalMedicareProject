package in.medicare.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignupAddress {
	
	@FindBy(id = "addressLineOne")
	private  WebElement address1;
	
	@FindBy(id = "addressLineTwo")
	private WebElement address2;
	
	@FindBy(id = "city")
	private WebElement CityName;
	
	@FindBy(id = "postalCode")
	private WebElement PostalCode;
	
	@FindBy(id = "state")
	private WebElement StateName;
	
	@FindBy(id = "country")
	private WebElement CountryName;
	
	@FindBy(linkText = "submit")
	private WebElement saveAddress;
	
	public SignupAddress(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public void signUp() {
		address1.sendKeys("wadi-e-huda");
		address2.sendKeys("2ndStage");
		CityName.sendKeys("Shimoga");
		PostalCode.sendKeys("577203");
		StateName.sendKeys("karnataka");
		CountryName.sendKeys("India");
	}
	
	

}
