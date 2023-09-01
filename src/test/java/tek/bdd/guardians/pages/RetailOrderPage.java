package tek.bdd.guardians.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tek.bdd.guardians.base.BaseSetup;

public class RetailOrderPage extends BaseSetup {
	
	
	public RetailOrderPage () {
		
		PageFactory.initElements(getDriver(), this);
	}
	
	
	@FindBy(id = "search")
	public WebElement allDepartmentDropdown;
	
	@FindBy(id = "searchInput")
	public WebElement searchInputField;
	
	@FindBy(id = "searchBtn")
	public WebElement searchBttn;
	
	@FindBy(xpath = "//img[@alt='Kasa Outdoor Smart Plug']")
	public WebElement itemkasaoutdoorsmartplug;
	
	@FindBy(xpath = "//select[starts-with(@class,'product')]") 
	public WebElement qtyDropdown;// select quantity
	
	@FindBy(id = "addToCartBtn")
	public WebElement addToCartBttn; // add to cart button
	
	@FindBy(xpath = "//span[@id='cartQuantity']")
	public WebElement cartItemQty; // cart
	@FindBy(xpath = "//p[text() ='Cart ']")
	public WebElement cart;
	
	
	
	@FindBy(xpath = "//span[text()='Delete']")
	public List<WebElement> emptycart;
	
	//Apex Legends
	
	@FindBy(id = "cartBtn")
	public WebElement cartBttn;
	
	@FindBy(id = "proceedBtn")
	public WebElement proceedToCheckoutBttn;
	
	@FindBy(id = "placeOrderBtn")
	public WebElement placeOrderBttn;
	
	@FindBy(xpath = "//div[text()='Order Placed Successfully']")
	public WebElement orderPlacedSuccessfullyMssg;
	
	@FindBy(xpath = "//img[starts-with(@alt,'Apex Legends')]")
	public WebElement apexLegendsItem;

	@FindBy(id="search")
	public WebElement searchElectronics;
	
	@FindBy(id="searchInput")
	public WebElement searchInput;
	
	@FindBy(xpath="//p[text()='Cleaning Gel for Car']")
	public WebElement CleaningGel;
	
	
	//Cancel order
	@FindBy(id = "orderLink")
	public WebElement OrderLink;
	
	@FindBy(xpath = "//div[@class='order']//descendant::p[7]")
	public List<WebElement> listOfOrders;
	
	@FindBy(xpath = "//button[text()='Cancel The Order']")
	public List<WebElement> cancelOrderBttn;
	
	@FindBy(id = "reasonInput")
	public WebElement reasonForCancelation;
	
	@FindBy(id = "orderSubmitBtn")
	public WebElement cancelationSubmitBttn;
	
	@FindBy(xpath = "//p[text()='Your Order Has Been Cancelled']")
	public WebElement orderCancelledSuccessMssg;
	
	@FindBy (id = "returnBtn")
	public WebElement returnBtn;
	
	@FindBy(id = "dropOffInput")
	public WebElement dropOff;
	
	@FindBy(id = "orderSubmitBtn")
	public WebElement orderSubmitBtn;
	
	@FindBy(xpath = "//p[text() = 'Return was successfull']")
	public WebElement returnMesg;
	
	//Review
	
	@FindBy(id = "reviewBtn")
	public WebElement reviewBtn;
	
	@FindBy(id = "headlineInput")
	public WebElement headlineInput;
	
	@FindBy(id = "descriptionInput")	
	public WebElement descriptionInput;

	@FindBy(id = "reviewSubmitBtn")	
	public WebElement reviewSubmitBtn;
	
	@FindBy(xpath = "//div[text() = 'Your review was added successfully']")	
	public WebElement successMesg;
	
	@FindBy(xpath="//p[text()='Cart ']")
	public WebElement CartButton;
	
	
	
	
	
	
	
	
	
	
	

}