package IdentifingTheElements;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class IdentifingTheElementsUsingLocators {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe/");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		
//		driver.findElement(By.id("username")).sendKeys("sasikumar");
		driver.findElement(By.linkText("<label id=\"keepLoggedInLabel\" for=\"keepLoggedInCheckBox\" style=\"cursor: default;\">Keep me logged in</label>")).sendKeys("AjayZen");
		
		

	}

}
