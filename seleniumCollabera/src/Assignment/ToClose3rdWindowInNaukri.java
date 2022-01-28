package Assignment;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToClose3rdWindowInNaukri {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver =new ChromeDriver();
		driver.get("https://www.naukri.com");
		Thread.sleep(2000);
		
		
		Set<String> allWindowIds = driver.getWindowHandles();
		String expectedTitle="ICICI";
		Thread.sleep(2000);
	
		for(String childsWindowIds : allWindowIds) {
			driver.switchTo().window(childsWindowIds);
			String a = driver.getTitle();
			Thread.sleep(2000);
		    if(expectedTitle.equals(a)) {
		    driver.close();
		
	}}

}
}
