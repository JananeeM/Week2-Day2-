package Week2Day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RadioButtonLeafGround {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("http://leafground.com/pages/radio.html");
		driver.findElement(By.xpath("//input[@id='yes']")).click();
		boolean second =driver.findElement(By.xpath("//input[@value='1']")).isEnabled();
		if(second==true)
			System.out.println("Second Radio Button Is Enabled");
		else
			System.out.println("First Radio Button Is Enabled");

	}

}
