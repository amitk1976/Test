package testNG;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Second_Class {
	@Test
	public void fourth() {
		System.out.println("I am in fourth method");
	}
	
	@org.testng.annotations.BeforeMethod
	public void BeforeMethod(){
		System.out.println("Hi i am before method of second class");
	}
	
	@org.testng.annotations.AfterMethod
	public void AfterMethod(){
		System.out.println("Hi i am in after method of seond class");
	}
	
	@Parameters({"url"})
	@Test(groups = {"Amit"})
	public void fifth(String url) {
		System.out.println("I am in fifth method");
		System.out.println(url);
	}
	
	@Test
	public void sixth() {
		System.out.println("I am in sixth method");
	}
	@org.testng.annotations.BeforeTest
	public void BeforeTest(){
		System.out.println("I am before test and will be printed before all the classes");
	}
	



}
