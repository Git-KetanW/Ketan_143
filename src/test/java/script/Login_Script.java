package script;

import org.testng.annotations.Test;

import common.LogIn;
import main.Logo_nop;

public class Login_Script extends Logo_nop{
	@Test
	public void Login_Verification() {
		
		LogIn.Register();
		LogIn.Passcode();
		LogIn.Account_Details();
	}

}
