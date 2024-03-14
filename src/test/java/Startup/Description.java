package Startup;

import org.testng.annotations.Test;

public class Description {
	@Test(priority=0,description="Use Your valid Creditials")
	  public void LogIn() {
		  System.out.println("This is first Page");
	  }
	  @Test(priority=3)
	  public void Ketan() {
		  System.out.println("Member of group");
	  }
	  @Test(priority=1)
	  public void Rohit() {
		  System.out.println("He is the Manager");
	  }
	  @Test(priority=2)
	  public void SetUp() {
		  System.out.println("Please SetUp the program");
	  }
	  @Test(priority=4)
	  public void LogOut() {
		  System.out.println("This is the Last Page");
	  }
	}
