package testcases.ModuleName;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BeforeAfter {
	public static WebDriver driver;
	@BeforeTest
	public static void before(){
		System.setProperty("webdriver.gecko.driver","C:/Users/Monicca2502/Downloads/geckodriver-v0.19.1-win64/geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	
	@AfterTest
	public static void after(){
		driver.quit();
	}
}
