package windowhandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindowHandle {
	
	WebDriver driver;

	String url = "https://www.w3schools.com/html/default.asp";

	public void initializedriver() {

		System.setProperty("webdriver.chrome.driver", "C://Users/Sri Priya P Kulkarni/Softwares/chromedriver.exe");

		driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get(url);
	}
	
	public void switchTonewWindow(){
		String parentwindow=driver.getWindowHandle();
		
		System.out.println(parentwindow);
		
		driver.findElement(By.className("w3-btn w3-margin-bottom")).click();
		
		String childwindow=driver.getWindowHandles().toArray()[1].toString();
		
		System.out.println(childwindow);
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MultipleWindowHandle multiplewindow=new MultipleWindowHandle();
		multiplewindow.initializedriver();
		multiplewindow.switchTonewWindow();
	}

}
