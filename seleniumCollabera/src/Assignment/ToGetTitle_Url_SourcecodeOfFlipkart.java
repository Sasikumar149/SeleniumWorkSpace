package Assignment;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToGetTitle_Url_SourcecodeOfFlipkart {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver =new ChromeDriver();
		driver.get("http://www.flipkart.com");
		String title=driver.getTitle();
		System.out.println(title);
	    String urlOfFlipkart	=driver.getCurrentUrl();
	    System.out.println(urlOfFlipkart);
	    String sourcecodeOfFlipkart=driver.getPageSource();
		System.out.println(sourcecodeOfFlipkart);
		

	}

}
