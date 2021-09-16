package Week2Day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DuplicateLead1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");
		String title=driver.getTitle();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		System.out.println(title);
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.xpath("//span[text()='Email']")).click();
		driver.findElement(By.xpath("//input[@name='emailAddress']")).sendKeys("abcdef@gmail.com");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(3000);
		String name = driver.findElement(By.xpath("//div[@class='x-grid3-hd-inner x-grid3-hd-firstName']/following::tr[1]/td[3]/div/a[1]")).getText();
		System.out.println("name: "+name);
		driver.findElement(By.xpath("//div[@class='x-grid3-hd-inner x-grid3-hd-firstName']/following::tr[1]/td[3]/div/a[1]")).click();
		driver.findElement(By.linkText("Duplicate Lead")).click();
		String titleLead=driver.findElementByXPath("//div[@id='sectionHeaderTitle_leads']").getText();
		if(titleLead.equals("Duplicate Lead"))
		{
			System.out.println("Duplicate Title Is Verified");
		}
		else
			System.out.println("Title Is Not Same");
		 driver.findElement(By.className("smallSubmit")).click();
		 String firstNameCheck = driver.findElement(By.xpath("//span[@id='viewLead_firstName_sp']")).getText();	
		 System.out.println("Duplicate name Created is : "+firstNameCheck);
		 if(name.equals(firstNameCheck))
		 {
			 System.out.println("The duplicated lead name is same As The Original name");
		 }
		 else
		 {
			 System.out.println("Lead names are different Check again");
		 }
		
		 Thread.sleep(5000);
		
	}

}

