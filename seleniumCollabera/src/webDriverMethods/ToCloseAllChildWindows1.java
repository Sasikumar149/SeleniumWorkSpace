package webDriverMethods;



import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToCloseAllChildWindows1 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe/");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.naukri.com/");
		
		String exceptedParentTitle = "Jobs - Recruitment - Job Search - Employment -Job Vacancies - Naukri.com";
		
		Set<String> ParentWindowsId = driver.getWindowHandles();
		for(String WindowId : ParentWindowsId) {
			driver.switchTo().window(WindowId);
			String ActualTitle = driver.getTitle();
			if(!exceptedParentTitle.equals(ActualTitle)); {
				driver.close();
				
			}
		}
	}
}
