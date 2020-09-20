package net.rb.aap.sfpg;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import lombok.extern.java.Log;

@Log
public class TestBase {
	protected Adriver adriver;

	@BeforeClass
	@Parameters({ "browser" })
	public void setupADriver(final String browser) {
		adriver = new Adriver();
		adriver.setName("Hello Driver");
		log.info("create adriver");
	}
}
