package Week2Day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SalesForceAssignment {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.salesforce.com/in/form/signup/freetrial-sales/?d=70130000000Enyk");
		String title=driver.getTitle();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		System.out.println(title);
		driver.findElementByXPath("//input[@name='UserFirstName']").sendKeys("Jananee");
		driver.findElementByXPath("//input[@name='UserLastName']").sendKeys("Muthukumar");
		driver.findElementByXPath("//input[@name='UserEmail']").sendKeys("abcdef@testleaf.com");
		
		WebElement job = driver.findElement(By.name("UserTitle"));
		Select drop1=new Select(job);
		drop1.selectByVisibleText("Sales Manager");
		
		driver.findElementByXPath("//input[@name='CompanyName']").sendKeys("TestLeaf Org");
		
		WebElement emp=driver.findElement(By.name("CompanyEmployees"));
		Select drop2=new Select(emp);
		drop2.selectByValue("75");
		
		driver.findElement(By.name("UserPhone")).sendKeys("9876543210");
		
		WebElement country=driver.findElement(By.name("CompanyCountry"));
		Select drop3=new Select(country);
		drop3.selectByValue("UM");
		country.sendKeys(Keys.TAB);
		//WebElement checkbox1=driver.findElement(By.className("checkbox-ui"));
		//WebElement checkbox1=driver.findElementByXPath("//div[@class='checkbox-ui']");
		//WebElement checkbox1=driver.findElementByXPath("//div[@class='checkboxInput section']");
		WebElement checkbox1 = driver.findElement(By.xpath("//div[@class='checkbox-ui'][1]"));
		checkbox1.click();
		Thread.sleep(20);
		
		//driver.close();
		
		
		
	}

}
