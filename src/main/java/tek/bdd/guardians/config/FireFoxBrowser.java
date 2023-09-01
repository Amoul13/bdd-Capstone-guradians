package tek.bdd.guardians.config;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FireFoxBrowser implements Browser{

	@SuppressWarnings("deprecation")
	@Override
	public WebDriver openBrowser(String url) {
		WebDriverManager.firefoxdriver().setup();
        FirefoxOptions options = new FirefoxOptions();
        options.setHeadless(true);
        WebDriver driver = new FirefoxDriver();
        driver.get(url);
        return driver;
	}

}
