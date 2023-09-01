package tek.bdd.guardians.steps;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import io.cucumber.java.en.*;
import tek.bdd.guardians.pages.POMFactory;
import tek.bdd.guardians.utilities.CommonUtility;

public class RetailOrderSteps extends CommonUtility {

	POMFactory pom = new POMFactory();

	@When("User change the category to {string}")
	public void userChangeTheCategoryTo(String category) {

		selectByVisibleText(pom.retailOrderPage().allDepartmentDropdown, category);
		logger.info("Category was selected successfully from dropdown");
	}


	@When("User search for an item {string}")
	public void userSearchForAnItem(String kasaOutdoorSmartPlug) {

		sendText(pom.retailOrderPage().searchInputField, kasaOutdoorSmartPlug);
		logger.info("Item name was entered successfully");

	}
	@When("User click on Search icon")
	public void userClickOnSearchIcon() {

		click(pom.retailOrderPage().searchBttn);
		logger.info("Search button was clicked successfully");

	}
	@When("User click on item")
	public void userClickOnItem() {

		click(pom.retailOrderPage().itemkasaoutdoorsmartplug);
		logger.info("item was clicked successfully");

	}
	@When("User select quantity {string}")
	public void userSelectQuantity(String itemQty) {
		selectByVisibleText(pom.retailOrderPage().qtyDropdown, itemQty);
		logger.info("item quantity was selected succcessfully");

	}
	@When("User click add to Cart button")
	public void userClickAddToCartButton() {
		click(pom.retailOrderPage().addToCartBttn);
		logger.info("Add item to the cart button was clicked successfully");

	}
	@Then("the cart icon quantity should change to {string}")
	public void theCartIconQuantityShouldChangeTo(String itemQtyInTheCart) {

		Assert.assertEquals(pom.retailOrderPage().cartItemQty.getText(), itemQtyInTheCart);
		logger.info("Item qty in the cart was validated successfully");
	}
	
	@Then("empty cart")
	public void emptyCart() {
		click(pom.retailOrderPage().cart);
		List<WebElement> empty = pom.retailOrderPage().emptycart;
		
		for(WebElement emp : empty) {
			click(emp);
		}

	}


	//Place an order 

	@When("User change the category to {string} search for an item Apex Legends")
	public void userChangeTheCategoryToSearchForAnItemApexLegends(String string)  {
		selectByVisibleText(pom.retailOrderPage().allDepartmentDropdown, string);
		logger.info("Category changed to electronics successfully");
		;
	}


	@Then("User search for an item {string} Apex Legends")
	public void userSearchForAnItemApexLegends(String apexLegends)  {
		sendText(pom.retailOrderPage().searchInputField, apexLegends);
		logger.info("Item name was entered successfully");
		click(pom.retailOrderPage().searchBttn);
		logger.info("Search button was clicked successfully");
		;
	}
	
    
	@When("User click on Apex Legends item")
	public void userClickOnApexLegendsItem()  {

		click(pom.retailOrderPage().apexLegendsItem);
		logger.info("Item Apex Legends was clicked successfully");
		;
	}


	@When("User select quantity {string} on Apex Legends")
	public void userSelectQuantityOnApexLegends(String string) {

		selectByVisibleText(pom.retailOrderPage().qtyDropdown, string);
		logger.info("Apex Legends qty was changed successfully");
		
	}

	@Then("the cart icon quantity should change to {string} Apex Legends")
	public void theCartIconQuantityShouldChangeToApexLegends(String itemQtyInTheCart)  {
	
		Assert.assertEquals(itemQtyInTheCart, pom.retailOrderPage().cartItemQty.getText());
		logger.info("Item qty in the cart was validated successfully");
	
	}


	@Then("User click on Cart option for Apex Legends")
	public void userClickOnCartOptionForApexLegends() {

		click(pom.retailOrderPage().cartBttn);
		logger.info("Cart Button was clicked successfully");



	}
	@Then("User click on Proceed to Checkout button")
	public void userClickOnProceedToCheckoutButton() {

		click(pom.retailOrderPage().proceedToCheckoutBttn);
		logger.info("Proceed to check out button was clicked successfully");
	}


	@Then("User click on Place Your Order")
	public void userClickOnPlaceYourOrder() {
		click(pom.retailOrderPage().placeOrderBttn);
		logger.info("Place your order button was clicked successfully");
	}
	@Then("a message should be displayed {string} Apex Legends")
	public void aMessageShouldBeDisplayedOrderPlacedThanks(String string) {

		waitTillPresence(pom.retailOrderPage().orderPlacedSuccessfullyMssg);

		String acctualMessage = pom.retailOrderPage().orderPlacedSuccessfullyMssg.getText();

		Assert.assertEquals(string,acctualMessage);
		logger.info("Order Placed Successfully");
	}

	//cancel order

	@When("User click on Orders section")
	public void userClickOnOrdersSection() {
		click(pom.retailOrderPage().OrderLink);
		logger.info("Order link was clicked successfully");

	}
	@When("User click on first order in list")
	public void userClickOnFirstOrderInList() {

		List<WebElement> listOfOrder = pom.retailOrderPage().listOfOrders;
		for(int i = 0; i < listOfOrder.size(); i++) {
			if(listOfOrder.get(i).getText().equalsIgnoreCase("Hide Details")) {
				
			}else if(listOfOrder.get(i).getText().equalsIgnoreCase("Show Details")) {
				click(pom.retailOrderPage().listOfOrders.get(i));
			}
		}
		logger.info("First order in the list of clicked");
	}
	@When("User click on Cancel The Order button")
	public void userClickOnCancelTheOrderButton() {

		List<WebElement> cancelBttns = pom.retailOrderPage().cancelOrderBttn;
		click(cancelBttns.get(0));

		logger.info("Order Cancel button was clicked");

	}
	@When("User select the cancelation Reason {string}")
	public void userSelectTheCancelationReason(String string) {

		selectByVisibleText(pom.retailOrderPage().reasonForCancelation, string);
		logger.info("Cancelation reason was selected");

	}
	@When("User click on Cancel Order button")
	public void userClickOnCancelOrderButton() {
		click(pom.retailOrderPage().cancelationSubmitBttn);
		logger.info("Cancel Submit Button was clicked successfully");

	}
	@Then("a cancelation message should be displayed {string}")
	public void aCancelationMessageShouldBeDisplayed(String string) {

		waitTillPresence(pom.retailOrderPage().orderCancelledSuccessMssg);

		Assert.assertEquals(string, pom.retailOrderPage().orderCancelledSuccessMssg.getText());
		logger.info("Cancelation success message was verified successfully");

	}
//	Add Extra
	
	@Then("User search for item named {string}")
	public void userSearchForItemNamed(String CleaningGel) {
		sendText(pom.retailOrderPage().searchInputField, CleaningGel);
		logger.info("Item name was entered successfully");
		click(pom.retailOrderPage().searchBttn);
		logger.info("Search button was clicked successfully");
	}
	@Then("User click on item Cleaning")
	public void userClickOnItemCleaning() {
	    click(pom.retailOrderPage().CleaningGel);
	    logger.info("Cleaning Gel added successfully");
	}
	@Then("User click on Cart option for Cleaning Gel for Cr")
	public void userClickOnCartOptionForXleaningGelForCar() {

		click(pom.retailOrderPage().cartBttn);
		logger.info("Cart Button was clicked successfully");

	}
	@When("User click add item to Cart button")
	public void userClickAddItemToCartButton(){
		click(pom.retailOrderPage().addToCartBttn);
		logger.info("Add item successfully");
	}
	@Then("User click on Cart option")
	public void userClickOnCartOption() {
	click(pom.retailOrderPage().CartButton);
	logger.info("successfully added");



	}
	@Then("User click on Proceed for Checking out button")
	public void userClickOnProceedToCheckingOutButton() {

		click(pom.retailOrderPage().proceedToCheckoutBttn);
		logger.info("Proceed to check out button was clicked successfully");
	}


	@Then("User click on Place the Order")
	public void userClickOnPlaceTheOrder() {
		click(pom.retailOrderPage().placeOrderBttn);
		logger.info("Place your order button was clicked successfully");
	}
	
	//return Order

	@When("User click on Orders section for return")
	public void userClickOnOrdersSectionForReturn() {
		click(pom.retailOrderPage().OrderLink);
		logger.info("clicked successfully");


	}
	@When("User click on the first order in list")
	public void userClickOnTheFirstOrderInList() {
		List<WebElement> listOfOrder = pom.retailOrderPage().listOfOrders;
		for(int i = 0; i < listOfOrder.size(); i++) {
			if(listOfOrder.get(i).getText().equalsIgnoreCase("Hide Details")) {
				
			}else if(listOfOrder.get(i).getText().equalsIgnoreCase("Show Details")) {
				click(pom.retailOrderPage().listOfOrders.get(i));
			}
		}
		logger.info("First order in the list of clicked");
	}
	@When("User click on Return Items button")
	public void userClickOnReturnItemsButton() {
		click(pom.retailOrderPage().returnBtn);


	}
	@When("User select the Return Reason {string}")
	public void userSelectTheReturnReason(String string) {

		selectByVisibleText(pom.retailOrderPage().reasonForCancelation, string);
		logger.info("Cancelation reason was selected");



	}
	@When("User select the drop off service {string}")
	public void userSelectTheDropOffService(String string) {

		selectByVisibleText(pom.retailOrderPage().dropOff, string);
		logger.info("Dropp Off was selected");

	}
	@When("User click on Return Order button")
	public void userClickOnReturnOrderButton() {

		click(pom.retailOrderPage().orderSubmitBtn);

		logger.info("Return Order button was clicked");



	}
	@Then("a cancelation message should  display {string}")
	public void aCancelationMessageShouldDisplay(String string) {


		String acctualMessage = pom.retailOrderPage().returnMesg.getText();

		Assert.assertEquals(string,acctualMessage);
		logger.info("Return was successfull");


	
	}
	
	
	//Review
	@When("User click on Orders section for review")
	public void userClickOnOrdersSectionForReview() {
		
		click(pom.retailOrderPage().OrderLink);
		logger.info("Order link was clicked successfully");
	}
	@When("User click on first order in the list")
	public void userClickOnFirstOrderInTheList() {
		Actions act = new Actions(getDriver());
		List<WebElement> listOfOrder = pom.retailOrderPage().listOfOrders;
		for(int i = 0; i < listOfOrder.size(); i++) {
			if(listOfOrder.get(i).getText().equalsIgnoreCase("Hide Details")) {
				act.doubleClick(pom.retailOrderPage().listOfOrders.get(i)).perform();
				
			}else if(listOfOrder.get(i).getText().equalsIgnoreCase("Show Details")) {
				click(pom.retailOrderPage().listOfOrders.get(i));
			}
		}
		logger.info("First order in the list of clicked");

	}
	@When("User click on Review button")
	public void userClickOnReviewButton() {
		
		click(pom.retailOrderPage().reviewBtn);

	}
	@When("User write Review headline {string} and {string}")
	public void userWriteReviewHeadlineAnd(String string, String string2) {
		
		sendText(pom.retailOrderPage().headlineInput, string);
		sendText(pom.retailOrderPage().descriptionInput, string2);
		

	}
	@When("User click Add your Review button")
	public void userClickAddYourReviewButton() {
		
		click(pom.retailOrderPage().reviewSubmitBtn);
		

	}
	@Then("a review message should be displayed {string}")
	public void aReviewMessageShouldBeDisplayed(String string) {
		waitTillPresence(pom.retailOrderPage().successMesg);

		Assert.assertEquals(string, pom.retailOrderPage().successMesg.getText());
		logger.info(string);

	}




}