import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadingFromTable {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\IEDriverServer_Win32_3.14.0\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.espncricinfo.com/series/18693/scorecard/1144994/australia-vs-india-2nd-test-india-in-aus-2018-19");
		driver.manage().window().maximize();
		
		//driver.findElement(By.xpath("//div[@class ='scorecard-section batsmen']/div/div[2]/div/a")).click();
		String name = driver.findElement(By.xpath("//div[@class ='scorecard-section batsmen']/div/div[2]/div/a")).getText();
		System.out.println(name);
	}

}
