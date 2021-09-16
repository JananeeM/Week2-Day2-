package Week2Day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CheckBoxLeafGround {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("http://leafground.com/pages/checkbox.html");
		driver.findElement(By.xpath("(//input[@type='checkbox'])[1]")).click();
		boolean enable=driver.findElement(By.xpath("(//input[@type='checkbox'])[6]")).isEnabled();
		if(enable==true)
		{
			System.out.println("The check box is enabled");
		}
		else
			System.out.println("CheckBox Not enabled");
		boolean deselect1=driver.findElement(By.xpath("(//input[@type='checkbox'])[7]")).isEnabled();
		if(deselect1==false)
			System.out.println("First Option not enabled");
		else
			driver.findElement(By.xpath("(//input[@type='checkbox'])[7]")).click();
	
		
			
			

	}

}
