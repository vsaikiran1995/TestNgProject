package testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class BaseClass {
	
	@BeforeTest(alwaysRun=true)   // It will get execute only one time
	public void method3() {
		System.out.println("inside before test");
	}
	
	@BeforeMethod (alwaysRun=true)   //It will get execute 100 times if we have 100 test cases
	public void method1() {
		System.out.println("inside before method1");
	}
	
	@AfterMethod(alwaysRun=true)
	public void method2() {
		System.out.println("inside After method2");
	}
	
	@AfterTest(alwaysRun=true)
	public void method4() {
		System.out.println("inside after test");
	}
	

}
