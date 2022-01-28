package webDriverMethods;

import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;
public class ToSwitchToWindows {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe/");
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.navigate().to("https://www.naukri.com");
	Set<String> allWindowsIds = driver.getWindowHandles();
	String expectedWindowsTitle = "ICICI";//where the driver control is present that page "ID" will be obtained.
	
	for(String windowId : allWindowsIds) {
		driver.switchTo().window(windowId);
		String actualWindowTitle = driver.getTitle();
		if(expectedWindowsTitle.equals(actualWindowTitle));{
			driver.manage().window().maximize();
			driver.close();
			
		}
		
		}
	
	

}
}
