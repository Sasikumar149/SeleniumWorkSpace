package webDriverMethods;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToGetTheHeightAndWedithOfTheWindows {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe/");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com");
		
		
		
		Dimension dimension = driver.manage().window().getSize();
		int height = dimension.getHeight();
		int width = dimension.getWidth();
		System.out.println("Height :"+height+"and Width"+width);
		

	}

}
