package ToMoveTheCursor;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class saaavnHovering {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe/");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.get("https://trello.com/login");
		WebElement mainElement = driver.findElement(By.xpath("//div[@class=\"o-layout o-layout--middle o-layout--flush\"]"));
		
		Actions actions = new Actions(driver);
		actions.moveToElement(mainElement).perform();
		

	}

}
