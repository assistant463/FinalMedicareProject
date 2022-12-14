package in.medicae.testscripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import in.medicare.pages.AllDrugsCategories;
import in.medicare.pages.LandingPage;
import in.medicare.pages.PaymentDetails;
import in.medicare.pages.ProductManagement;
import in.medicare.pages.SignupAddress;
import in.medicare.pages.ValidateTheSuccessText;
import in.medicare.pages.ViewCategory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BuyMedicineSteps {
	WebDriver driver;
	
	@Given("a user is on a landing page")
	public void a_user_is_on_a_landing_page() {
		System.setProperty("webdriver.chrome.driver", "resources//chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://localhost:8080/medicare/");
	    
	}

	@When("login with normal user")
	public void login_with_normal_user() {
		LandingPage L1 = new LandingPage(driver);
		L1.normalLogin();
		L1.dropDown();
		L1.ViewProducts();
		
		
		
		Select select = new Select( (WebElement) driver);
		select.selectByVisibleText("Logout");
	   
	}

	@When("purchase the item")
	public void purchase_the_item() {
		AllDrugsCategories categories = new AllDrugsCategories(driver);
		categories.clickOnCart();
		
		SignupAddress singup = new SignupAddress(driver);
		singup.signUp();
		
		PaymentDetails details = new PaymentDetails(driver);
		details.payment();
		
		ValidateTheSuccessText valTheText = new ValidateTheSuccessText(driver);
		valTheText.shopping();
		
		String ecpectedMsg = "Your Order is Confirmed!!";
		String actualMsg = valTheText.getSuccessMsg();
	   
	}

	@When("login with admin user")
	public void login_with_admin_user() {
		LandingPage L2 = new LandingPage(driver);
		L2.adminLogin();
		L2.manageProductaList();
		L2.createNewCatagory();
	   
	}

	@When("create the new product")
	public void create_the_new_product() {
		ProductManagement pm = new ProductManagement(driver);
		pm.manageProduct();
	    
	}

	@When("the product is visible in view section")
	public void the_product_is_visible_in_view_section() {
	   
		ViewCategory vc = new ViewCategory(driver);
		vc.viewFeverCategory();
	}

	@When("update quantity in basket and click refresh button")
	public void update_quantity_in_basket_and_click_refresh_button() {
	   
	}

	@When("add multiple products")
	public void add_multiple_products() {
	  
	}

	@When("validate the amount and grand total")
	public void validate_the_amount_and_grand_total() {
	   
	}

	@Then("when you purchase a product its quantity next time is reduced")
	public void when_you_purchase_a_product_its_quantity_next_time_is_reduced() {
	    
	}


}
