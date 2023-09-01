package tek.bdd.guardians.pages;

import tek.bdd.guardians.base.BaseSetup;

public class POMFactory extends BaseSetup {
	
	private SignInPage signIn;
	
	private RetailHomePage retail;
	
	private RetailAccountPage account;
	
	private RetailOrderPage order;
	
	public POMFactory() {
		
		this.signIn = new SignInPage();
		
		this.retail = new RetailHomePage();
		
		this.account = new RetailAccountPage();
		
		this.order = new RetailOrderPage();
		
		
		
	}	
	public SignInPage signIn() {
		
		return this.signIn;
	}
	
	public RetailHomePage retailHome() {
		return retail;
	}
	
	public RetailAccountPage retailAccount() {
		return account;
	}
	
	public RetailOrderPage retailOrderPage() {
		return order;
	}

}