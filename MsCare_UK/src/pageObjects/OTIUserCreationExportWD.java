/**
 * 
 */
package pageObjects;
import java.util.concurrent.TimeUnit;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.fail;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
/**
 * @author Monicca2502
 *
 */
public class OTIUserCreationExportWD {

	

	  private WebDriver driver;
	  private String baseUrl;
	  private boolean acceptNextAlert = true;
	  private StringBuffer verificationErrors = new StringBuffer();

	  @BeforeTest
	  public void setUp() throws Exception {
	    System.setProperty("webdriver.geckodriver.driver","C:/Users/Monicca2502/Downloads/geckodriver-v0.19.1-win64/geckodriver.exe");
		  driver = new FirefoxDriver();
	    //baseUrl = "https://ss.uat.eu.atlantisontrack.com/";
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  }

	  @Test
	  public void testNewUserCreationOTIIrelandValidDataWD() throws Exception {
	    driver.get(baseUrl + "/?ReturnUrl=%2f");
	    driver.findElement(By.id("username")).clear();
	    driver.findElement(By.id("username")).sendKeys("mwairagade");
	    driver.findElement(By.id("inputPassword")).clear();
	    driver.findElement(By.id("inputPassword")).sendKeys("Welcome2018");
	    driver.findElement(By.name("rememberme")).click();
	    driver.findElement(By.name("submit")).click();
	    assertEquals("Contact Centre", driver.findElement(By.cssSelector("h1")).getText());
	    driver.findElement(By.cssSelector("h5")).click();
	    new Select(driver.findElement(By.id("ProgrammeName"))).selectByVisibleText("Teva MS Care Ireland");
	    driver.findElement(By.cssSelector("div.span4 > form.form-inline > div.input-append > button.btn")).click();
	    driver.findElement(By.name("Fields[0].value.Value")).clear();
	    driver.findElement(By.name("Fields[0].value.Value")).sendKeys("monicca.wairagade+03jan@gmail.com");
	    new Select(driver.findElement(By.name("Fields[1].value.Value"))).selectByVisibleText("Mrs.");
	    driver.findElement(By.name("Fields[2].value.Value")).clear();
	    driver.findElement(By.name("Fields[2].value.Value")).sendKeys("testuserir1");
	    driver.findElement(By.name("Fields[3].value.Value")).clear();
	    driver.findElement(By.name("Fields[3].value.Value")).sendKeys("testuserir1");
	    driver.findElement(By.name("Fields[4].value.Value")).clear();
	    driver.findElement(By.name("Fields[4].value.Value")).sendKeys("testuserir1");
	    driver.findElement(By.name("Fields[4].value.Value")).clear();
	    driver.findElement(By.name("Fields[4].value.Value")).sendKeys("");
	    driver.findElement(By.name("Fields[5].value.Value")).clear();
	    driver.findElement(By.name("Fields[5].value.Value")).sendKeys("+447735211328");
	    new Select(driver.findElement(By.name("Fields[8].value.Value"))).selectByVisibleText("Active");
	    new Select(driver.findElement(By.name("Fields[9].value.Value"))).selectByVisibleText("Active");
	    new Select(driver.findElement(By.name("Fields[35].value.Value"))).selectByVisibleText("Online");
	    new Select(driver.findElement(By.name("Fields[36].value.Value"))).selectByVisibleText("SMS");
	    driver.findElement(By.name("Fields[33].value.Value")).click();
	    driver.findElement(By.id("IsTest")).click();
	    new Select(driver.findElement(By.id("EnrolmentMethodId"))).selectByVisibleText("Web");
	    driver.findElement(By.id("add-patient-button")).click();
	    assertEquals("Patient - TSCIEPT000227 - testuserir1 testuserir1", driver.findElement(By.cssSelector("h1")).getText());
	    driver.findElement(By.linkText("Sign Out")).click();
	  }

	  @AfterTest
	  public void tearDown() throws Exception {
	    driver.quit();
	    String verificationErrorString = verificationErrors.toString();
	    if (!"".equals(verificationErrorString)) {
	      fail(verificationErrorString);
	    }
	  }
	

	
	
}
