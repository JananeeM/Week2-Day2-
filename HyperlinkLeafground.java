package Week2Day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HyperlinkLeafground {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("http://leafground.com/pages/Link.html");
		driver.findElement(By.linkText("Go to Home Page")).click();
		String text=driver.findElement(By.xpath("//h1[@class='wp-heading']")).getText();
		if(text.equals("Locators and Selenium Interactions"))
		System.out.println("Navigated to home page   "+text);
		else
			System.out.println("OOPS");
		driver.findElement(By.linkText("HyperLink")).click();
		driver.findElement(By.linkText("Verify am I broken?")).click();
		
	
		
		
	
	}

}
