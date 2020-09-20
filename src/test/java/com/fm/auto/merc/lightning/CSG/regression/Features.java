package com.fm.auto.merc.lightning.CSG.regression;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import lombok.extern.java.Log;
import net.rb.aap.sfpg.lightning.CSG.CsgTest;

@Log
public class Features extends CsgTest {
	@Parameters({"username"})
    @BeforeClass(groups = {"regression", "STPR-11309"}, description = "Login and switch to CustomerHub Lightning console application")
    public void login(@Optional("sfdcadminautomationscript@rbaenv.com.full24") final String username) {
		log.info("three");
		log.info(loginPage.getAdriver().getName() + " :: username :" + username);
	}

	@Test(groups={"regression"}, description = "A simple test")
	public void verifySomething(){
		log.info("four");
		Assert.assertEquals(1,1, "really 1 != 1??");
	}
}
