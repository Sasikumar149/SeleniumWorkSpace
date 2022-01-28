package JustForFun;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToGetAttributeOfAnElement {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe/");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.lightnovelspot.com/search");
		
		String ActualValue = "123456";
		WebElement Element = driver.findElement(By.id("inputContent"));
		Element.clear();
		Element.sendKeys(ActualValue);
		String AttributeValue = Element.getAttribute("value");
		System.out.println(AttributeValue);
		if(ActualValue.equals(AttributeValue)) {
			System.out.println(AttributeValue);
		}
		
	
}
}
