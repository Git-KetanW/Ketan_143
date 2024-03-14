package common;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import script.Login_Script;

public class LogIn extends Login_Script{
	@Test
	public static void Register() {
		Actions act=new Actions(driver);
		WebElement My = driver.findElement(By.xpath("(//li[@class='navigation-top-menu-item'])[44]"));
		act.moveToElement(My).perform();
		driver.findElement(By.xpath("//span[text()='Register']")).click();
		
		//Human Verification
		WebElement frame = driver.findElement(By.xpath("//iframe[@title='Widget containing a Cloudflare security challenge']"));

		driver.switchTo().frame(frame); //the below check-box is under iframe
		
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(15));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Verify you are human']")));
		driver.findElement(By.xpath("//span[text()='Verify you are human']")).click();
		
		//Registration page
		
		driver.findElement(By.id("FirstName")).sendKeys("John");
		driver.findElement(By.id("LastName")).sendKeys("Mac");
		driver.findElement(By.id("Email")).sendKeys("johnmac@somthing.com");
		driver.findElement(By.id("ConfirmEmail")).sendKeys("johnmac@somthing.com");
		driver.findElement(By.id("Username")).sendKeys("JohnMac143");
		driver.findElement(By.id("check-availability-button")).click();
		
		//Select City
		WebElement city = driver.findElement(By.id("CountryId"));
		Select sel=new Select(city);
		sel.selectByVisibleText("Australia");
		
		WebElement zone = driver.findElement(By.id("TimeZoneId"));
		Select zon=new Select(zone);
		zon.selectByValue("Easter Island Standard Time");
	}
		@Test
		public static void Passcode() {
			//passcode
			driver.findElement(By.id("Password")).sendKeys("Mac@143");
			driver.findElement(By.id("ConfirmPassword")).sendKeys("Mac@143");
	}
		@Test
		public static void Account_Details() {
			WebElement mycomp = driver.findElement(By.id("Details_CompanyIndustryId"));
			Select Comp= new Select(mycomp);
			Comp.selectByValue("3");
			
			WebElement Role = driver.findElement(By.id("Details_CompanyRoleId"));
			Select rol=new Select(Role);
			rol.selectByIndex(1);
			
			WebElement Size = driver.findElement(By.id("Details_CompanySizeId"));
			Select siz=new Select(Size);
			siz.selectByVisibleText("More than 15");
			
			//Submit Button
			driver.findElement(By.id("Details_CompanyWebsiteUrl")).sendKeys("MacOnlineshop.com");
			driver.findElement(By.id("register-button")).click();
		}

}
