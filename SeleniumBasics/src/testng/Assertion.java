package testng;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Assertion {

	WebDriver driver;

	String url = "http://qatechhub.com";

	@BeforeTest
	public void initializedriver() {

		System.setProperty("webdriver.chrome.driver", "C://Users/Sri Priya P Kulkarni/Softwares/chromedriver.exe");

		driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get(url);
	}
	@Test
	public void verifyTitle(){
		String expectedtitle="QA Automation Tools Trainings and Tutorials | QA Tech Hub";
		
		String actualtitle=driver.getTitle();
		
		AssertJUnit.assertEquals(actualtitle, expectedtitle);
	}
	
	@AfterTest
	public void closebrowser() {

		// to close current focussed window
		driver.close();
	}
}
