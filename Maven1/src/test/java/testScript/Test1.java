package testScript;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import library.BaseTest;
import pom.FacebookGooglePo;
import pom.GooglePagePo;

public class Test1 extends BaseTest {
	@Test
	public void FacebookTest() {
		
		try{
		GooglePagePo googlePo=new GooglePagePo(driver);
		googlePo.googleSrch("Facebook");
		FacebookGooglePo fbGoPo=new FacebookGooglePo(driver);
		Reporter.log("Total no. of Links = "+fbGoPo.allLinksSize(),true);
		fbGoPo.fbSrchResLink().click();
		String eTitle="Facebook – log in or sign up";
		fbGoPo.checkTitle(eTitle);
		String aTitle = driver.getTitle();
		Assert.assertEquals(aTitle, eTitle);
	} catch (Exception e) 
	{
		Reporter.log("Exception generated", true);
		Assert.fail();
	}
}
	}


