package JustForFun;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindThatElement {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe/");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.mtlnovel.com/");
		
		Thread.sleep(1000);
		
		driver.findElement(null).sendKeys("Martial");
		}
		
		
	

}

