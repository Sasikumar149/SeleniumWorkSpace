package Assignment;

import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToCloseAllChildWindows {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver =new ChromeDriver();
		driver.get("https://www.naukri.com");
	    String parentId=driver.getWindowHandle();
	    Set<String> allWindowIds = driver.getWindowHandles();
	    allWindowIds.remove(parentId);
	    for(String childWindowIds:allWindowIds) {
	    	driver.switchTo().window(childWindowIds);
	    	driver.close();
	    }
	}

}
