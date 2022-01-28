package ToMoveTheCursor;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HoveringTheCursor {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe/");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.get("https://easy.com/");
		WebElement hiddenElement = driver.findElement(By.id("menu-item-22"));
		
		Actions actions = new Actions(driver);
		actions.moveToElement(hiddenElement).perform();
		driver.findElement(By.linkText("the easy story")).click();
	}

}
