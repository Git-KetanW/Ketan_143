package script;

import org.testng.annotations.Test;

import common.LogIn2;
import main.Logo_nop;

public class LogIn2_Script extends Logo_nop{
	@Test
	public static void LoggedIn_Scrp() {
		
		LogIn2.Registered();
		LogIn2.LoggedIn();
	}

}
