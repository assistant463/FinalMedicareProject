package in.medicare.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LandingPage {
	
	@FindBy(id = "login")
	private WebElement Login;
	
	@FindBy(id = "username")
	private WebElement UsrName;
	
	@FindBy(id = "password")
	private WebElement PassWord;
	
	@FindBy(name = "submit")
	private WebElement Submit;
	
	@FindBy(id = "a_Antipyretics")
	private WebElement Category;
	
	@FindBy(linkText = "/medicare/logout")
	private WebElement ddown;
	
	@FindBy(id = "listProducts")
	private WebElement viewProducts;
	
	@FindBy(id = "manageProduct")
	private WebElement Manageprdt;
	
	@FindBy(className = "btn btn-warning btn-xs")
	private WebElement addNewCatagory;
	
	public LandingPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

public void normalLogin() {
	Login.click();
	UsrName.sendKeys("kn@gmail.com");
	PassWord.sendKeys("12345");
	Submit.click();
	Category.click();
}
public void adminLogin() {
	UsrName.sendKeys("vk@gmail.com");
	PassWord.sendKeys("admin");
	Submit.click();
	
}
public void dropDown() {
	ddown.click();
}
public void ViewProducts() {
	viewProducts.click();
}
public void manageProductaList() {
	Manageprdt.click();
}
public void createNewCatagory() {
	 addNewCatagory.click();
}
}
