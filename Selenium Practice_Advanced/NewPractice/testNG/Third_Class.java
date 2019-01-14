package testNG;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeSuite;

public class Third_Class extends TestBase {
	
	@Test
	public void login() throws IOException{
		Login();
		
	}
		
	
	@Test
	public void seventh() {
		System.out.println("I am in seventh method");
	}
	
	@Test
	public void eightht() {
		System.out.println("I am in eightht method");
	}
	
	@Test
	public void nineth() {
		System.out.println("I am in nineth method");
	}

	
}
