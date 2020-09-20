package net.rb.aap.sfpg.lightning.CSG;

import org.testng.annotations.BeforeClass;

import lombok.extern.java.Log;
import net.rb.aap.sfpg.TestBase;
import net.rb.qa.pages.LoginPage;

@Log
public class CsgTest extends TestBase {
	protected LoginPage loginPage;
	@BeforeClass
	public void classSetup() {
		log.info("two");
		loginPage = new LoginPage(adriver);
	}
}
