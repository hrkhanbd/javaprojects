package testNGPractice;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class TNG_001 {
  @Test(priority=2, enabled=false)
  public void f() {
	  
	  System.out.println("f");
  }
 @Test(priority=3)
public void a() {
	  
	  System.out.println("a");
  }
  
@Test(priority=1)
public void z() {
	  
	  System.out.println("z");
}

  
  @BeforeMethod
  public void beforeMethod() {
	  
	  System.out.println("beforeMethod");
  }

  

  @BeforeClass
  public void beforeClass() {
	  System.out.println("beforeClass");
  }

  @AfterClass
  public void afterClass() {
	  
	  System.out.println("afterClass");
  }

  @BeforeTest
  public void beforeTest() {
	  
	  System.out.println("beforeTest");
  }
  
  @AfterMethod
  public void afterMethod() {
	  
	  System.out.println("afterMethod");
  }

  @AfterTest
  public void afterTest() {
	  
	  System.out.println("afterTest");
  }

  @BeforeSuite
  public void beforeSuite() {
	  
	  System.out.println("beforeSuite");
  }

  @AfterSuite
  public void afterSuite() {
	  
	  System.out.println("afterSuite");
  }

}
