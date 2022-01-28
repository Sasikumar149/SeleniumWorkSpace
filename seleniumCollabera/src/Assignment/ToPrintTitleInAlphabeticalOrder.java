package Assignment;

import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToPrintTitleInAlphabeticalOrder {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver =new ChromeDriver();
		driver.get("https://www.naukri.com");
		
	    Set<String> allWindowIds = driver.getWindowHandles();
	    for(String a: allWindowIds) {
	    driver.switchTo().window(a);
	    String b=driver.getTitle();
		
	}}

}