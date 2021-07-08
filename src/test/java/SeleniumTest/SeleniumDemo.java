package SeleniumTest;
import java.lang.reflect.Method;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SeleniumDemo extends BaseTest {
	
	WebDriver driver;
	String baseUrl = "https://cc.healthrecoverysolutions.com/login";
	
	@BeforeClass
	public void loadBaseUrl() {
		
		driver.get(baseUrl);
	}
	
	@BeforeMethod
	public void beforeStep(){
		System.out.println(Thread.currentThread()
                .getStackTrace()[1]
                .getMethodName());
		
	}
	
	
	@Test
	public void incorrectPassword() {
		
		test.po.inputUsername("abc");
		test.po.inputPassword("pqr");
		test.po.clickSubmitButton();
		
		Assert.assertFalse(test.po.landsOnHomepage(),"User is able to login with incorrect Password");
		
		
	}
	
	@Test
	public void incorrectUsername() {
		
		test.po.inputUsername("abc");
		test.po.inputPassword("pqr");
		test.po.clickSubmitButton();
		Assert.assertFalse(test.po.landsOnHomepage(),"User is able to login with Incorrect Username");
		
		
	}
	
	@Test
	public void BlankUsernamePassword() {
		
		test.po.inputUsername("abc");
		test.po.inputPassword("pqr");
		test.po.clickSubmitButton();
		Assert.assertFalse(test.po.landsOnHomepage(),"User is able to login with Blank user and password");
		
		
	}
	
	@Test
	public void CorrectLoginCredentials() {
		
		test.po.inputUsername("abc");
		test.po.inputPassword("pqr");
		test.po.clickSubmitButton();
		Assert.assertTrue(test.po.landsOnHomepage(),"User is not able to login with correct credentials");
		
		
	}

}
