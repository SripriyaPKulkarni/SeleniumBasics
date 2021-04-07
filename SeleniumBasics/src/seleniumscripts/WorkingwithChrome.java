package seleniumscripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingwithChrome {

	WebDriver driver;
	
	String url="https://test.qatechhub.com/";
	
	public void  initializedriver(){
		
		System.setProperty("webdriver.chrome.driver", "C://Users/Sri Priya P Kulkarni/Softwares/chromedriver.exe");

		driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get(url);
	}
	
	public void closebrowser(){
		
		//to close current focussed window
		//driver.close();
		
		//to close all the browser instances
		driver.quit();
	}
	
	public static void main(String[] args) {
		WorkingwithChrome wc=new WorkingwithChrome();
		
		wc.initializedriver();
		wc.closebrowser();
	}

}
