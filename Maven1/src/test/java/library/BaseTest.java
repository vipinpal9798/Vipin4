package library;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest implements Constants{
	public WebDriver driver;
	@BeforeMethod
	public void launch() {
		System.setProperty(CHROME_KEY, CHROME_PATH);
		driver=new ChromeDriver();
	
	    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(TEST_URL);
	
	}
	@AfterMethod
	public void closeBrowser() {
		driver.quit();
	}
	
	

}

