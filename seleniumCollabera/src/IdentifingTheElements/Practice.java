package IdentifingTheElements;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe/");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://translate.google.com/");
		
		driver.findElement(By.cssSelector("a[href=\"https://www.google.co.in/intl/en/about/products?tab=Th\"]")).click();
		driver.findElement(By.xpath(null))
}
}