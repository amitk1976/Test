import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class limitingWebDriver {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\IEDriverServer_Win32_3.14.0\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("http://www.qaclickacademy.com/");
		driver.findElement(By.xpath("//*[@id='homepage']/header/div[2]/div/nav/ul/li[5]/a")).click();
		System.out.println("Count of links on Complete page : " + driver.findElements(By.tagName("a")).size());

		WebElement fd = driver.findElement(By.xpath("//*[@id='gf-BIG']"));
		System.out.println("Count of links on Footer Section : "+fd.findElements(By.tagName("a")).size());

		WebElement cd = fd.findElement(By.xpath("//*[@id='gf-BIG']/table/tbody/tr/td[1]/ul"));
		System.out.println("Count of links on colum of Footer Section : "+cd.findElements(By.tagName("a")).size());

		int count = cd.findElements(By.tagName("a")).size();

		for (int i = 1; i < count; i++) {

			cd.findElements(By.tagName("a")).get(i).sendKeys(Keys.chord(Keys.CONTROL, Keys.ENTER));

		}

		Set<String> ids = driver.getWindowHandles();
		Iterator<String> itr = ids.iterator();
		int i = 1;
		while (itr.hasNext()) {
			String wi = itr.next();
			driver.switchTo().window(wi);
			System.out.println("Title of Window number : " + i+ " - "+ driver.getTitle());
			i ++;

		}
		driver.quit();
	}

}
