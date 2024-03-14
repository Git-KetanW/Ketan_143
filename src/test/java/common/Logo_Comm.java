package common;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import script.Logo_script;

public class Logo_Comm extends Logo_script{
	@Test
	public static void Check() {
		
		driver.findElement(By.xpath("//img[@alt='nopCommerce']")).click();
		
	}


}
