package testng;

import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class NewTest {
	
  @BeforeMethod
  public void f1(){
	  System.out.println("I am before every method");
  }
  @AfterMethod
  public void f2(){
	  System.out.println("I am after every method");
  }
  @Test
  public void f() {
	  System.out.println("My Test case 1");
  }
}
