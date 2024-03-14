package script;

import org.testng.annotations.Test;

import common.Modules;
import main.Logo_nop;

public class Modules_Verify extends Logo_nop{
	@Test
	public void Module_Verification() {
		
		Modules.Product();
		Modules.Download();
		Modules.Support_Service();
		Modules.Partner();
		Modules.Language();
	}

}
