package tek.bdd.guardians.steps;


import java.util.List;
import java.util.Map;

import org.junit.Assert;

import io.cucumber.java.en.*;
import tek.bdd.guardians.pages.POMFactory;
import tek.bdd.guardians.utilities.CommonUtility;
import tek.bdd.guardians.utilities.DataGenerator;

public class SignInSteps extends CommonUtility {
	

	POMFactory pom = new POMFactory();
	private String randomEmail;
	
	
	@Given("User is on retail website")
	public void userIsOnRetailWebsite() {
	   String str =pom.signIn().getDriver().getCurrentUrl();
       Assert.assertTrue(str.equals("https://tek-retail-ui.azurewebsites.net/"));
	}
	@When("User click on Sign in option")
	public void userClickOnSignInOption() {
		
		 click(pom.signIn().clickSign);
	  
	}
	@When("User enter email {string} and password {string}")
	public void userEnterEmailAndPassword(String string, String string2) {
		sendText(pom.signIn().email , string);
		
		sendText(pom.signIn().password , string2);
		
		
	 
	}
	@When("User click on login button")
	public void userClickOnLoginButton() {
		
		click(pom.signIn().loginBtn);
	   
	}
	@Then("User should be logged in into Account")
	public void userShouldBeLoggedInIntoAccount() {
		
		Assert.assertTrue(pom.signIn().logoutOption.isDisplayed());
		
		logger.info("user logged in successfully");
	 
	}
	
	//Register for account
	
	@When("User click on Create New Account button")
	public void userClickOnCreateNewAccountButton() {
		
		click(pom.signIn().newAccount);
		
	    
	}
	@When("User fill the signUp information with below data")
	public void userFillTheSignUpInformationWithBelowData(io.cucumber.datatable.DataTable dataTable) {
		// Converting DataTable to List of Maps for easy access
		
		 randomEmail = DataGenerator.getEmail();
        List<Map<String, String>> signUpDetails = dataTable.asMaps(String.class, String.class);

        // Assuming there's only one set of data in this example, but you can iterate through all sets if needed
        Map<String, String> data = signUpDetails.get(0);

        String name = data.get("name");
        String email = randomEmail;
        String password = data.get("password");
        String confirmPassword = data.get("confirmPassword");
        
        //sendText(pomFactory.retailAccountPage().cardNumberField, paymentInfo.get(0).get("cardNumber"));
        
        sendText(pom.signIn().nameInputField, name);
        sendText(pom.signIn().emailInputField, email);
        sendText(pom.signIn().passwordInputField, password);
        sendText(pom.signIn().confirmPassInputField, confirmPassword);
        
        
	}
	@When("User click on SignUp button")
	public void userClickOnSignUpButton() throws InterruptedException {
		
		
		click(pom.signIn().signupBttn);
		logger.info("user click SigIn successfully");
		Thread.sleep(2000);
	}
	@Then("Verify user account is created")
	public void verifyUserAccountIsCreated() {
	   Assert.assertTrue(pom.signIn().logoutOption.isDisplayed());
	   logger.info("user verify account successfully");
	}

}