package tek.bdd.guardians.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tek.bdd.guardians.base.BaseSetup;

public class RetailAccountPage extends BaseSetup {
	
	
	public  RetailAccountPage() {
		
		PageFactory.initElements(getDriver(), this);
	}
	
	//@updateAccount

    @FindBy(linkText = "Account")
    public WebElement accountLink;

    @FindBy(id = "nameInput")
    public WebElement nameField;

    @FindBy(id = "personalPhoneInput")
    public WebElement phoneField;

    @FindBy(id = "personalUpdateBtn")
    public WebElement updateBttn;

    @FindBy(xpath = "//div[text()='Personal Information Updated Successfully']")
    public WebElement personalInfoUpdateSuccessMssg;
    
    //@addPaymentMethod

    @FindBy(xpath = "//p[text()='Add a payment method']")
    public WebElement addPaymentlink;


    @FindBy(id = "cardNumberInput")
    public WebElement cardNumberField;

    @FindBy(id = "nameOnCardInput")
    public WebElement nameOnCardField;

    @FindBy(id = "expirationMonthInput")
    public WebElement expirationMonthField;

    @FindBy(id = "expirationYearInput")
    public WebElement expireationYearField;

    @FindBy(id = "securityCodeInput")
    public WebElement securityCodeField;

    @FindBy(id = "paymentSubmitBtn")
    public WebElement paymentSubmitBtn;

    @FindBy(xpath = "//div[text()='Payment Method added sucessfully']")
    public WebElement paymentMethodSuccessMssg;
    
    
    
    
    
    //edit payment
    @FindBy(className = "account__payment-sub-title")
    public WebElement clickOnCard;
    
    @FindBy(xpath = "//div[@class= 'flex gap-2 py-2']//button[1]")
    public WebElement editBtn;
    
    @FindBy(id = "cardNumberInput")
    public WebElement cardNumberField2;

    @FindBy(id = "nameOnCardInput")
    public WebElement nameOnCardField2;

    @FindBy(id = "expirationMonthInput")
    public WebElement expirationMonthField2;

    @FindBy(id = "expirationYearInput")
    public WebElement expireationYearField2;

    @FindBy(id = "securityCodeInput")
    public WebElement securityCodeField2;

    @FindBy(id = "paymentSubmitBtn")
    public WebElement updateBtn2;
    
    @FindBy(xpath = "//div[text() = 'Payment Method updated Successfully']")
    
    public WebElement edditMesg;
    
    //remove payment 
    
    @FindBy(xpath = "//button[text() ='remove']")
    public WebElement removeBtn;
    
    //add address 
    
    @FindBy(xpath = "//div[starts-with(@class,'account__address-new-')]")
	public WebElement addAddressLink;
	
	@FindBy(id = "countryDropdown")
	public WebElement AddressCountryDropdown;
	
	@FindBy(id = "fullNameInput")
	public WebElement addressNameField;
	
	@FindBy(id = "phoneNumberInput")
	public WebElement addressPhoneField;
	
	@FindBy(id = "streetInput")
	public WebElement addressStreetField;
	
	@FindBy(id = "apartmentInput")
	public WebElement addressApartmentNum;
	
	@FindBy(id = "cityInput")
	public WebElement addressCityField;
	
	@FindBy(name = "state")
	public WebElement addressStateDropdown;
	
	@FindBy(id = "zipCodeInput")
	public WebElement addressZipCodeField;
	
	@FindBy(id = "addressBtn")
	public WebElement addressAddBttn;
	
	@FindBy(xpath = "//div[text()='Address Added Successfully']")
	public WebElement addressSuccessMssg;
	
	//edit address
	
	@FindBy(xpath = "//button[@class='account__address-btn' and text()='Edit']")
	public WebElement editAddressBtn;
	 
	@FindBy(id = "addressBtn")
	public WebElement updateAddressBtn;
	 
	@FindBy(xpath = "//div[text()='Address Updated Successfully']")
	public WebElement addressUpdatedSuccessfully;
    
	@FindBy(xpath = "//button[@class='account__address-btn' and text()='Remove']")
	public WebElement removeAddressBtn;
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

}