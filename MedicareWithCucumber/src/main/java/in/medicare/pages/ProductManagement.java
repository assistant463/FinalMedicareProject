package in.medicare.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductManagement {

	@FindBy(id = "name")
	private WebElement productName;
	
	@FindBy(id = "brand")
	private WebElement brandName;
	
	@FindBy(id = "description")
	private WebElement enterDescription;
	
	@FindBy(id = "unitPrice")
	private WebElement enterUnitPrice;
	
	@FindBy(id = "quantity")
	private WebElement numOfQuantity;
	
	@FindBy(id = "file")
	private WebElement uploadFile;
	private WebElement frame;
	
	
	@FindBy(id = "categoryId")
	private WebElement category;
	
	@FindBy(className = "btn btn-warning btn-xs")
	private WebElement addCategory;
	
	public ProductManagement(WebDriver driver) {
		PageFactory.initElements(driver, this);
		driver.switchTo().activeElement();
	}
	
	public void manageProduct() {
		productName.sendKeys("Meftal");
		brandName.sendKeys("BlueCross");
		enterDescription.sendKeys("HighFever");
		enterUnitPrice.sendKeys("60");
		numOfQuantity.sendKeys("10");
		uploadFile.click();
		frame.sendKeys("D:\\michal-parzuchowski-7TWRwDjfGew-unsplash.jpg");
		category.click();
		addCategory.click();
	}
	

}
