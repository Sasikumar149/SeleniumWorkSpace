package JustForFun;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToGetTextOfAnElement {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe/");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		
		String expectedText = "Administrator:";
		WebElement PleaseVerifyYourself = driver.findElement(By.id("adminCredentialsHeader"));
		String StoringOfGetText = PleaseVerifyYourself.getText();
		if(expectedText.equals(StoringOfGetText)) {
			System.out.println(StoringOfGetText);
		}
	
		
		
		
		
}
}
