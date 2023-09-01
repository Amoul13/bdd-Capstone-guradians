package tek.bdd.guardians.steps;

import java.util.List;


import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;
import tek.bdd.guardians.pages.POMFactory;
import tek.bdd.guardians.utilities.CommonUtility;

public class RetailHomeSteps extends CommonUtility {
	
	POMFactory pom = new POMFactory();




@When("User clicks on All section")
public void userClicksOnAllSection()  {
	
	click(pom.retailHome().allSections);
	
}
@Then("the following options are present in the Shop by Department sidebar")
public void theFollowingOptionsArePresentInTheShopByDepartmentSidebar(io.cucumber.datatable.DataTable dataTable) {
	
	List<String> expectedOptions = dataTable.row(0); // Get the first row as a list of strings

    for (String option : expectedOptions) {
        By optionLocator = By.xpath("//div[@class='sidebar__content']//span[text()='" + option + "']");
        WebElement optionElement = waitTillPresence(optionLocator);
        Assert.assertEquals(optionElement.getText(),option );
        logger.info("Option " + option + " is displayed");
    }
}


@When("User on {string}")
	public void userOn(String department) {
		List<WebElement> departments = pom.retailHome().sidebarOptions;
		for(int i = 0; i < departments.size(); i++) {
			if(departments.get(i).getText().equalsIgnoreCase(department)) {
				departments.get(i).click();
				break;
			}
		}
    
}
@Then("below options are present in department")
public void belowOptionsArePresentInDepartment(DataTable dataTable) throws InterruptedException {

	List<List<String>> departmentOptions = dataTable.asLists(String.class);
	List<WebElement> options = pom.retailHome().sidebarOptions;
	
	for(int i = 1; i < departmentOptions.get(0).size(); i++) { //get() is key 
		for(WebElement elements : options) {
			if(elements.getText().equalsIgnoreCase(departmentOptions.get(0).get(i))) {
				Assert.assertTrue(elements.isDisplayed());
				logger.info("The option " + elements.getText() + " is present");
			}
		}
	}
	
}
}