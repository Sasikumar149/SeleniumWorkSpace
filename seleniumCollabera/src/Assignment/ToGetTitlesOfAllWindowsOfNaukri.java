package Assignment;

import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToGetTitlesOfAllWindowsOfNaukri {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver =new ChromeDriver();
		driver.get("https://www.naukri.com");
	    String titles=	driver.getTitle();
		System.out.println(titles);
		String parentWindowId=driver.getWindowHandle();
		Set<String> allWindowIds = driver.getWindowHandles();
		allWindowIds.remove(parentWindowId);
		for(String childsWindowIds:allWindowIds) {
			driver.switchTo().window(childsWindowIds);
			String a=driver.getTitle();
			System.out.println(a);
			

	}

}
}
