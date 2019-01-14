import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calander {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\IEDriverServer_Win32_3.14.0\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		driver.get("https://www.path2usa.com/travel-companions");

		driver.findElement(By.id("travel_date")).click();

		List<WebElement> dates = driver.findElements(By.className("day"));
		int count = driver.findElements(By.className("day")).size();

		for (int i = 0; i < count; i++) {
			if (driver.findElements(By.className("day")).get(i).getText().equals("6")) {
				driver.findElements(By.className("day")).get(i).click();
				System.out.println("I am done");
				break;
			}

			driver.findElement(By.cssSelector("[class='datepicker-days'][class='datepicker-switch']")).click();
			System.out.println("I am done");
		}
	}
}
