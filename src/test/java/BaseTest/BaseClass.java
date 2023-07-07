package BaseTest;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class BaseClass {
	
	public static WebDriver dv;
	

	@BeforeTest
	public void BeforeTest() {
		
		dv = new FirefoxDriver();
		dv.manage().window().maximize();
		dv.get("http://qatechhub.com");		
				
	}
	
	@AfterTest
	public void AfterTest() {
		dv.close();
	}

}
