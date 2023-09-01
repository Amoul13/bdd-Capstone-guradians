package tek.bdd.guardians.pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tek.bdd.guardians.base.BaseSetup;

public class SignInPage extends BaseSetup {
	

	public SignInPage () {
		
		PageFactory.initElements(getDriver(), this);
	}
	
	//login
	
	@FindBy(id = "signinLink")
	public WebElement clickSign;
	
	
	@FindBy(id = "email")
	public WebElement email;
	
	@FindBy(id = "password")
	public WebElement password;
	
	@FindBy(id = "loginBtn")
	public WebElement loginBtn;
	
	@FindBy(id = "accountLink")
	public WebElement logoutOption;
	
	//register
	
	@FindBy(id = "newAccountBtn")
	public WebElement newAccount;
	
	@FindBy(id = "nameInput")

    public WebElement nameInputField;


    @FindBy(id = "emailInput")

    public WebElement emailInputField;


    @FindBy(id = "passwordInput")

    public WebElement passwordInputField;


    @FindBy(id = "confirmPasswordInput")

    public WebElement confirmPassInputField;


    @FindBy(id = "signupBtn")

    public WebElement signupBttn;
	
    @FindBy(id ="accountLink")
    
    public WebElement accountbttn;
    
	@FindBy(xpath = "//h1[text()='Your Profile']")
	public WebElement yourProfileText;
	
	
	
	
	
	

}