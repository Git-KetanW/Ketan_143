package common;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import script.LogIn2_Script;

public class LogIn2 extends LogIn2_Script{
	// 
	@Test
	public static void Registered() {
		
		driver.findElement(By.linkText("Register")).click();
		
		// choose gender
		driver.findElement(By.id("gender-male")).click();
		
		//personal details
		driver.findElement(By.id("FirstName")).sendKeys("Ketan");
		driver.findElement(By.id("LastName")).sendKeys("Walde");
		
		//Email & Set-Password
		driver.findElement(By.id("Email")).sendKeys("johnmac@somthing.com");
		driver.findElement(By.id("Password")).sendKeys("Test@143");
		driver.findElement(By.id("ConfirmPassword")).sendKeys("Test@143");
		
		//Submit
		driver.findElement(By.id("register-button")).click();
	}
	@Test
	public static void LoggedIn() {
		
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.id("Email")).sendKeys("ketanranatesting@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("Test@143");
		driver.findElement(By.xpath("//button[text()='Log in']")).click();
	}
}
