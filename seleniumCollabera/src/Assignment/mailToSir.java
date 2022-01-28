package Assignment;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class mailToSir {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe/");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.get("https://www.rediff.com/");
		driver.findElement(By.linkText("Sign in")).click();
		driver.findElement(By.id("login1")).sendKeys("sasikumar@rediffmail.com");
		driver.findElement(By.id("password")).sendKeys("8639890891@aA");
		driver.findElement(By.name("proceed")).click();
		
		driver.findElement(By.xpath("//b[text() = 'Write mail']")).click();
		driver.findElement(By.id("TO_IDcmp2")).sendKeys("sasikumar@rediffmail.com");
		driver.findElement(By.xpath("//input[@class=\"rd_inp_sub rd_subject_datacmp2\"]")).sendKeys("sasikumar");
		Thread.sleep(2000);
		
		//
		
		WebElement iframeIcon = driver.findElement(By.xpath("//iframe[@title=\"Rich Text Editor, rdMailEditorcmp2\"]"));
		String ParentWindowId = driver.getWindowHandle();
		driver.switchTo().frame(iframeIcon);
		WebElement BodyIcon = driver.findElement(By.xpath("//body[@class=\"cke_editable cke_editable_themed cke_contents_ltr cke_show_borders\"]"));
		BodyIcon.sendKeys("Interesting Assignment");
		driver.switchTo().window(ParentWindowId);
		
		
		//
		driver.findElement(By.linkText("Send")).click();
		WebElement refershButtonicon = driver.findElement(By.xpath("//cite[@title=\"Refresh Inbox\"]"));
		refershButtonicon.click();
		Thread.sleep(1000);
		refershButtonicon.click();
		Thread.sleep(1000);
		refershButtonicon.click();
		Thread.sleep(1000);
		refershButtonicon.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[@subject=\"sasikumar\"]")).click();
		driver.findElement(By.xpath("//span[@class=\"rd_fil_del\"]")).click();
		driver.findElement(By.xpath("//button[@id=\"jqi_state0_buttonOk\"]")).click();
		
		
		
		
		
		
		

	}

}
