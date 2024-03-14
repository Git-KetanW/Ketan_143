package common;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import script.Get_Started;

public class GetStarted extends Get_Started{
	@Test
	public static void getStarted() {
		driver.findElement(By.xpath("//a[text()='Get started']")).click();
		driver.navigate().back();
	}
	@Test
	public static void Cart() {
		driver.findElement(By.xpath("(//li[@class='navigation-top-menu-item'])[43]")).click();
	}

}
