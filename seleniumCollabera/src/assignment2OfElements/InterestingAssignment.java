package assignment2OfElements;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InterestingAssignment {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe/");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://www.zomato.com/");
		TakesScreenshot ts =(TakesScreenshot)driver;
		File tempFile = ts.getScreenshotAs(OutputType.FILE);
		System.out.println(tempFile);
		
		File destFile = new File("./errorShots/ScreenShot1.png");
		
		 
		
//		tempFile.renameTo(destFile);
		

	}

}
