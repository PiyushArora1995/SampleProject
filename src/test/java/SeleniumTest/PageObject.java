package SeleniumTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PageObject {
	
	WebDriver driver;

	public PageObject(WebDriver driver) {
		this.driver = driver;
		
	}
	
	
	By Username = By.xpath("//input[@id=\"loginEmail\"]");
	By Password = By.xpath("//input[@id=\"password\"]");
	By Submit = By.xpath("//button[@id=\"loginSubmitButton\"]");
	By LoggedInPage = By.xpath("//button[@id=\"somexpath\"]");

	public void inputUsername(String user) {
		
		driver.findElement(Username).click();
		driver.findElement(Username).sendKeys(user);
		
	}
	
	
	public void inputPassword(String pass) {
		
		driver.findElement(Password).click();
		driver.findElement(Password).sendKeys(pass);
		
	}


	public void clickSubmitButton() {
		driver.findElement(Submit).click();
		
	}


	public boolean landsOnHomepage() {
		
		return driver.findElement(LoggedInPage).isDisplayed();
	}
	
	

}
