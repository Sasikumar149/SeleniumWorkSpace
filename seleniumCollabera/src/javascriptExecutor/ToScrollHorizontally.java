package javascriptExecutor;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToScrollHorizontally {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe/");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.get("https://www.naukri.com/");
		WebElement TextElement = driver.findElement(By.xpath("//a[@href=\"https://www.naukri.com/allcompanies?searchType=premiumLogo&title=Featured+companies+actively+hiring&branding=%257B%2522pagename%2522%253A%2522ni-desktop-premium-viewAll%2522%257D&pageNo=1&qcount=20\"]"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		Thread.sleep(3000);
		js.executeScript("arguments[0].scrollIntoView(true);",TextElement);
	

	}

}
