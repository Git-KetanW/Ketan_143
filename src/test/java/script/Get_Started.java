package script;

import org.testng.annotations.Test;

import common.GetStarted;
import main.Logo_nop;

public class Get_Started extends Logo_nop{
	@Test
	public void GetStarted_Verification() {
		
		GetStarted.getStarted();
		GetStarted.Cart();
	}

}
