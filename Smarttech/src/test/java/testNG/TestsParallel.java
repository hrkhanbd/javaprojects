package testNG;

import org.testng.annotations.Test;

public class TestsParallel {
  @Test
  public void test1() {
	  
	  System.out.println("I am test 1: " + Thread.currentThread().getId());
  }
  
  @Test
  public void test2() {
	  
	  System.out.println("I am test 2: " + Thread.currentThread().getId());
  }
  
  @Test
  public void test3() {
	  
	  System.out.println("I am test 3: " + Thread.currentThread().getId());
  }
}
