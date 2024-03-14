package main;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Logo_nop {
	public static WebDriver driver;
	public static String Link1 = "https://www.nopcommerce.com/en/demo";
	public static String Link2 = "https://demo.nopcommerce.com/";
	@BeforeMethod
	public void Launch() {
		WebDriverManager.edgedriver().setup();
		driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get(Link2);
	
	}
		
	
	@AfterMethod
	public void Close() {
		driver.quit();
	}

}
