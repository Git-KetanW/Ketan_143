package Startup;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BeforeAfterTest {
	@BeforeTest
	  public void LogIn() {
		  System.out.println("This is first Page");
	  }
	  @Test
	  public void Ketan() {
		  System.out.println("Member of group");
	  }
	  @Test
	  public void Rohit() {
		  System.out.println("He is the Manager");
	  }
	  @Test
	  public void SetUp() {
		  System.out.println("Please SetUp the program");
	  }
	  @AfterTest
	  public void LogOut() {
		  System.out.println("This is the Last Page");
	  }
	}
