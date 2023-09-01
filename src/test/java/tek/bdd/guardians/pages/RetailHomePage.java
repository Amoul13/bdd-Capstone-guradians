package tek.bdd.guardians.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tek.bdd.guardians.base.BaseSetup;

public class RetailHomePage extends BaseSetup {
	
public RetailHomePage () {
		
		PageFactory.initElements(getDriver(), this);
	}


@FindBy(xpath = "//button[@id='hamburgerBtn']//span")
public WebElement allSections;


@FindBy (xpath = "//div[@class = 'sidebar_content-item']")
public List<WebElement> sidebarOptions;
	

}