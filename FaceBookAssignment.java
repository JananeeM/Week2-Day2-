package Week2Day2;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FaceBookAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://en-gb.facebook.com/");
		String title=driver.getTitle();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		System.out.println(title);
		driver.findElement(By.partialLinkText("Create New Account")).click();
		driver.findElementByXPath("//input[@class='inputtext _58mg _5dba _2ph-']").sendKeys("Jananee");
		driver.findElement(By.name("lastname")).sendKeys("Muthukumar");
		driver.findElement(By.name("reg_email__")).sendKeys("jananeegeetha@gmail.com");
		driver.findElementByXPath("//input[@name='reg_email_confirmation__']").sendKeys("jananeegeetha@gmail.com");
		driver.findElement(By.name("reg_passwd__")).sendKeys("1234AbCd");
		WebElement birthday = driver.findElement(By.id("day"));
		Select bday1=new Select(birthday);
		bday1.selectByValue("9");
		
		WebElement month = driver.findElement(By.name("birthday_month"));
		Select drop2=new Select(month);
		drop2.selectByValue("12");
		
		WebElement year = driver.findElement(By.name("birthday_year"));
		Select drop3=new Select(year);
		drop3.selectByVisibleText("1990");
		driver.findElementByXPath("//input[@name='sex']").click();
		
		
		
	}

}
