package Startup;


import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class BeforeAfterClass {
	
  @BeforeClass
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
  @AfterClass
  public void LogOut() {
	  System.out.println("This is the Last Page");
  }
}
