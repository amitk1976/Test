package testNG;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class First_Class {
	@org.testng.annotations.AfterTest
	public void AfterTest(){
		System.out.println("Hi I am in After Test class and will be execuetd at the end");
	}
	@Test(groups = {"Amit"})
	public void first() {
		System.out.println("I am in first method");
	}
	
	@Test (dataProvider = "getData")
	public void second(String one, String to) {
		System.out.println("I am in second method");
		System.out.println(one + to);
	}
	
	
	@Test
	public void third() {
		System.out.println("I am in third method");
		
	}
	
	@DataProvider
	public Object getData(){
		Object[][] data = new Object[3][2];
		
		data[0][0] = "one";
		data[0][1] = "two";

		
		data[1][0] = "four";
		data[1][1] = "five";

		
		data[2][0] = "seven";
		data[2][1] = "eight";

		
		

		
		return data;
		
	}

}
