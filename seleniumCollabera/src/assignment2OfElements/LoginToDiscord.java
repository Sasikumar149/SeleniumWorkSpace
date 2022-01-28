package assignment2OfElements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginToDiscord {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe/");
		WebDriver driver = new ChromeDriver();
		driver.get("https://discord.com/login?brand_id=96508&locale_id=1&return_to=https%3A%2F%2Fsupport.discord.com%2Fhc%2Fen-us%2Fcommunity%2Fposts%2F360056220432-Login&service=zendesk&timestamp=1642047625");
		

	}

}
