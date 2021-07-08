package SeleniumTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class BaseTest {
	
	BaseTest test;
	PageObject po;
	private WebDriver driver;
	
	public BaseTest() {
	test = new BaseTest();
	}
	
	
	@BeforeSuite
	public void setUp() {
		DriverInitial();
		pageObjectInit();
	}

	private void pageObjectInit() {
		
		po = new PageObject(this.driver);
		
	}

	private WebDriver DriverInitial() {
		System.out.println(System.getProperty(("user.dir")));
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"resources/Drivers/chromedriver.exe");
		return new ChromeDriver();
		
	}
	
	
	@AfterSuite
	public void tearDown() {
		if(driver!=null) {
			driver.quit();
		}
	}

}
