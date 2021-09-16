package Week2Day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateContact {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");
		String title=driver.getTitle();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		System.out.println(title);
		WebElement username=driver.findElement(By.id("username"));
		username.sendKeys("demosalesmanager");
		WebElement password=driver.findElement(By.id("password"));
		password.sendKeys("crmsfa");
		WebElement loginbutton=driver.findElement(By.className("decorativeSubmit"));
		loginbutton.click();
		WebElement crmsfa=driver.findElement(By.linkText("CRM/SFA"));
		crmsfa.click();
		driver.findElement(By.linkText("Create Contact")).click();
		driver.findElement(By.id("firstNameField")).sendKeys("Jananee");
		driver.findElement(By.id("lastNameField")).sendKeys("Muthukumar");
		driver.findElement(By.name("firstNameLocal")).sendKeys("Janu");
		driver.findElement(By.name("lastNameLocal")).sendKeys("Vinoth");
		driver.findElementByXPath("//input[@id='createContactForm_personalTitle']").sendKeys("Computerscience");
		driver.findElement(By.name("generalProfTitle")).sendKeys("TestLeaf Automation");
		driver.findElement(By.name("departmentName")).sendKeys("Automation Testing");
		driver.findElement(By.name("birthDate")).sendKeys("11/17/14");
		driver.findElement(By.name("description")).sendKeys("Welcome to the world of automation");
		driver.findElement(By.id("createContactForm_primaryEmail")).sendKeys("Jananee@testleaforg.com");
		
		WebElement state = driver.findElement(By.name("generalStateProvinceGeoId"));
		Select drop2=new Select(state);
		drop2.selectByVisibleText("New York");
		
		driver.findElement(By.className("smallSubmit")).click();
		driver.findElement(By.linkText("Edit")).click();
		driver.findElement(By.name("description")).clear();
		driver.findElement(By.name("importantNote")).sendKeys("Cleared description that has been inputted earlier");
		
		driver.findElementByXPath("//input[@value='Update']").click();
		
	}
	

}
