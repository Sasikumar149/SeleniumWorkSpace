package IdentifingTheElements;



import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClosingAllTheChildwindowsAndEnterTheValueOfTheFeature {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe/");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.mtlnovel.com/");
		
		
		driver.findElement(By.linkText("Library")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Login")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("Log in with Google")).click();
		Thread.sleep(1000);
		driver.findElement(By.name("identifier")).sendKeys("sasikumar@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("button[jsname='LgbsSe']")).click();//tag name[attribute name = 'attribute value']
		Thread.sleep(1000);
		
		
}
}