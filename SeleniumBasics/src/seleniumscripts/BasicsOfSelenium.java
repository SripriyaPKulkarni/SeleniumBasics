package seleniumscripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicsOfSelenium {

	WebDriver d;

	String url = "http://qatechhub.com";

	public void initializedriver() {

		System.setProperty("webdriver.chrome.driver", "C://Users/Sri Priya P Kulkarni/Softwares/chromedriver.exe");

		d = new ChromeDriver();

		d.manage().window().maximize();

		d.get(url);
	}

	public void checktitle() {

		String title = d.getTitle();
		if (title.equals("QA Automation Tools Trainings and Tutorials | QA Tech Hub")) {
			System.out.println("Pass");
		} else {
			System.out.println("Fail");
		}
	}

	public void closebrowser() {

		// to close current focussed window
		d.close();
	}
	public void facebookpage(){
		d.get("https://www.facebook.com");
		
		d.navigate().back();
	
	}
	public void navigate(){
		System.out.println(d.getCurrentUrl());
		d.navigate().forward();
		
	}
	public static void main(String[] args) {
		BasicsOfSelenium bs=new BasicsOfSelenium();
		
		//Open the Chrome browser.

		//Maximize the browser window.

		//Navigate to “http://qatechhub.com”.
		bs.initializedriver();

		//Write a method to print PASS if the title of the page matches with “QA Automation Tools Trainings and Tutorials | QA Tech Hub” else FAIL.
        bs.checktitle();
        
        bs.closebrowser();
        
		//Navigate to the Facebook page (https://www.facebook.com)

		//Navigate back to the QA Tech Hub website.
        
      

		//Print the URL of the current page.

		//Navigate forward.

		//Reload the page.
        bs.navigate();

		//Close the Browser.
        bs.closebrowser();

		//Fullscreen
	}

}
