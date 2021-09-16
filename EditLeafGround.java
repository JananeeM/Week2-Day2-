package Week2Day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLeafGround {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("http://leafground.com/pages/Edit.html");
		driver.findElement(By.id("email")).sendKeys("jananeegeetha@gmail.com");
		driver.findElement(By.xpath("//input[@value='Append ']")).sendKeys("Appending text");
		String text=driver.findElement(By.xpath("//input[@name='username']")).getAttribute("value");
		System.out.println("Default Text Entered is :"+text);
		driver.findElement(By.xpath("//input[@value='Clear me!!']")).clear();
		boolean enabled=driver.findElement(By.xpath("(//input[@type='text'])[5]")).isEnabled();
		if(enabled==true)
			System.out.println("Field is Enabled");
		else
			System.out.println("Field is not Enabled");
		
		}
	}


