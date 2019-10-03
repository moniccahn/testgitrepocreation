package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Homepage {

	public static WebDriver driver = null;
	
	public static void logo(){
		driver.findElement(By.xpath("html/body/div[1]/div[1]/div[1]/div[1]/a[1]/img"));
	}
	
	public static WebElement fromtxtbox(){
		driver.findElement(By.id("DestinationFrom1"));
		return();
	}

	public static void searchbtn(){
		driver.findElement(By.id("button_flight_search"));
	}

}
