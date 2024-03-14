package script;

import org.testng.annotations.Test;

import common.Logo_Comm;
import main.Logo_nop;

public class Logo_script extends Logo_nop {
	@Test
	public void verify() {
		
		Logo_Comm.Check();
	}

}
