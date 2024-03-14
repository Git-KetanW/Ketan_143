package Startup;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Before_After {
  @BeforeMethod
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
  @AfterMethod
  public void LogOut() {
	  System.out.println("This is the Last Page");
  }
}
