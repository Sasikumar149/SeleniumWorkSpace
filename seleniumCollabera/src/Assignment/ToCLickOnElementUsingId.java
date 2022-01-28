package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToCLickOnElementUsingId {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe/");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.mtlnovel.com/");
	
		driver.findElement(By.id("m-lang-btn")).click();
		

}
}
