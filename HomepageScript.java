package scriptsRepo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pageObjectRepo.HomepageObjects;
import reusablePageRepo.HomepageActions;



public class HomepageScript extends BaseTest {
	
	@BeforeMethod
	public void beforeMethod() {
		System.setProperty("webdriver.chrome.driver", "/Users/sureshbabui/Documents/workspace/chromedriver");
		driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.acmetools.com/");

	}
	
	@AfterMethod
	public void afterMethod() {
		driver.quit();
	}
	

	@Test
	public void Hellotest() throws InterruptedException {
		System.out.println("********");
		//HomepageActions.searchTerm();
		HomepageObjects.searchTextbox.sendKeys("Mobile");
		HomepageObjects.searchButton.click();

	}

}
