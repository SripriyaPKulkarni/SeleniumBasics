package mouseOperations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	WebDriver driver;

	String url = "https://jqueryui.com/droppable";

	public void initializedriver() {

		System.setProperty("webdriver.chrome.driver", "C://Users/Sri Priya P Kulkarni/Softwares/chromedriver.exe");

		driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get(url);
	}
	public void dragAndDrop(){
		
		//need to switch to frame
		WebElement frame=driver.findElement(By.className("demo-frame"));
		
		driver.switchTo().frame(frame);
		
		//dragand drop methods
		WebElement source=driver.findElement(By.id("draggable"));
		
		
		WebElement target=driver.findElement(By.id("droppable"));
		
		String colorbeforedrop=target.getCssValue("color");
		
		//every mouse operation is handled by Actions class
		
		Actions action=new Actions(driver);
		
		action.dragAndDrop(source, target).build().perform();
		
		String colorafterdrop=target.getCssValue("color");
		
		System.out.println("Before drag and drop" +colorbeforedrop);
		System.out.println("After drag and drop" +colorafterdrop);
		
	}
	public static void main(String[] args)
	{
		DragAndDrop d=new DragAndDrop();
		d.initializedriver();
		d.dragAndDrop();
	}

}
