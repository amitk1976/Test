import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class moveToChildWindows {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\IEDriverServer_Win32_3.14.0\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://accounts.google.com/signin");
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		
		driver.findElement(By.xpath("//*[@id='initialView']/footer/ul/li[2]/a")).click();
		System.out.println(driver.getTitle());
		
		Set<String> id = driver.getWindowHandles();
		Iterator<String> itr = id.iterator();
		
		String parentWindow = itr.next();
		String childWindow = itr.next();
		
		driver.switchTo().window(childWindow);
		System.out.println(driver.getTitle());		
		driver.findElement(By.xpath("//*[@id='yDmH0d']/c-wiz/div/div/div[2]/div[1]/c-wiz/div/ul/li[1]/ul/li[2]/a")).click();
		driver.switchTo().window(parentWindow);
		System.out.println(driver.getTitle());	
		
		driver.switchTo().window(childWindow);
		System.out.println(driver.getTitle());	
	}
}
