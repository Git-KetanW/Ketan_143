package common;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import script.Modules_Verify;

public class Modules extends Modules_Verify {
	@Test
	public static void Product() {
		Actions act=new Actions(driver);
		WebElement products=driver.findElement(By.xpath("//span[text()='Product']"));
		act.moveToElement(products).perform();
	}
	@Test
	public static void  Download() {
		Actions act=new Actions(driver);
		WebElement down = driver.findElement(By.xpath("//span[text()='Downloads']"));
		act.moveToElement(down).perform();
	}
	@Test
	public static void Support_Service() {
		Actions act=new Actions(driver);
		WebElement supser = driver.findElement(By.xpath("//span[text()='Support & services']"));
		act.moveToElement(supser).perform();
	}
	@Test
	public static void Partner() {
		Actions act=new Actions(driver);
		WebElement part = driver.findElement(By.xpath("//span[text()='Partners']"));
		act.moveToElement(part).click().build().perform();
	}
	@Test
	public static void Language() {
		Actions act=new Actions(driver);
		WebElement lang = driver.findElement(By.xpath("//span[text()='English']"));
		WebElement deut = driver.findElement(By.xpath("//span[text()='Deutsch']"));
		act.moveToElement(lang).moveToElement(deut).click().build().perform();
	}
	

}
