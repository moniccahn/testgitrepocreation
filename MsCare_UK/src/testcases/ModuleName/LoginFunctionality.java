/**
 * 
 */
package testcases.ModuleName;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

/**
 * @author Monicca2502
 *
 */
public class LoginFunctionality {

	public WebDriver driver;
	@BeforeTest
	public void before(){
		System.setProperty("webdriver.gecko.driver","C:/Users/Monicca2502/Downloads/geckodriver-v0.19.1-win64/geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	@Test
	public void test(){
			driver.get("http://www.gmail.com");
			driver.findElement(By.id("identifierId")).click();
			driver.findElement(By.id("identifierId")).clear();
			driver.findElement(By.id("identifierId")).sendKeys("nileshwairagade@gmail.com");
			driver.findElement(By.name("password")).click();
			driver.findElement(By.name("password")).clear();
			driver.findElement(By.name("password")).sendKeys("123456");
			driver.findElement(By.xpath("//*[@id='passwordNext']/content/span")).click();
			
			assertEquals("Wrong password. Try again or click Forgot password to reset it.",driver.findElement(By.xpath("//*[@id='password']/div[2]/div[2]")).getText());
			
		}
	@AfterTest
	public void after(){
		driver.quit();
	}
}
