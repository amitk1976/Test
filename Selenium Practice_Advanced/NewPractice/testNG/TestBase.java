package testNG;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class TestBase {

		public void Login() throws IOException{
	Properties prop = new Properties();
	FileInputStream fis = new FileInputStream(
			"D:\\Eclipse_Workspace\\Selenium Practice_Advanced\\NewPractice\\testNG\\first.properties");
	prop.load(fis);

	WebDriver driver = null;

	if(prop.getProperty("browser").equals("chrome"))
	{

		System.setProperty("webdriver.chrome.driver", "D:\\IEDriverServer_Win32_3.14.0\\chromedriver.exe");
		driver = new ChromeDriver();
	}else if(prop.getProperty("browser").equals("ie"))
	{

		System.setProperty("webdriver.ie.driver", "D:\\IEDriverServer_Win32_3.14.0\\IEDriverServer.exe");
		driver = new InternetExplorerDriver();
	}

	System.out.println(prop.getProperty("username"));driver.get(prop.getProperty("url"));

}

}
