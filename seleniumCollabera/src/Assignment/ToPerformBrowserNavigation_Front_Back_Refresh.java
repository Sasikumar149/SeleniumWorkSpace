package Assignment;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToPerformBrowserNavigation_Front_Back_Refresh {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver =new ChromeDriver();
		driver.get("https://www.flipkart.com");
	    Thread.sleep(2000);
	    driver.get("https://www.zomato.com");
	    Thread.sleep(2000);
	    driver.navigate().back();
	    driver.manage().window().fullscreen();
	    Thread.sleep(2000);
	    driver.navigate().forward();
	    driver.manage().window().maximize();
	    Thread.sleep(2000);
	    driver.navigate().refresh();
	}

}
