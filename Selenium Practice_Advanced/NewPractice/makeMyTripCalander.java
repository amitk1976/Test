import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class makeMyTripCalander{
	public static void main (String[] args){
		System.setProperty("webdriver.chrome.driver", "D:\\IEDriverServer_Win32_3.14.0\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		
		driver.get("https://www.makemytrip.com/flights/");
		driver.findElement(By.id("hp-widget__depart")).click();
		driver.findElement(By.xpath("//div[@class='dateFilter hasDatepicker']/div/div/table/tbody/tr[4]/td[4]/a")).click();
	}
	
}