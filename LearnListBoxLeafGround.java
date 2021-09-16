package Week2Day2;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnListBoxLeafGround {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("http://leafground.com/pages/Dropdown.html");
		WebElement drop1=driver.findElement(By.xpath("//select[@id='dropdown1']"));
		Select drop3=new Select(drop1);
		drop3.selectByIndex(1);
		
		
		WebElement drop2=driver.findElement(By.xpath("//select[@name='dropdown2']]"));
		Select drop4=new Select(drop2);
		drop4.getOptions();
		
		
		
		

	}

}
