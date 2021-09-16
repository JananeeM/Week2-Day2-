package Week2Day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DeleteLead {

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
		driver.findElement(By.linkText("Phone")).click();
		driver.findElement(By.name("phoneCountryCode")).clear();
		driver.findElement(By.name("phoneNumber")).sendKeys("9876543210");
		//driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		 Thread.sleep(2000);
		 String idLead = driver.findElement(By.xpath("//td[1]/div[@class='x-grid3-hd-inner x-grid3-hd-partyId']/following::tr[1]/td[1]/div/a[1]")).getText(); 
		 System.out.println(idLead);
		 driver.findElement(By.xpath("//td[1]/div[@class='x-grid3-hd-inner x-grid3-hd-partyId']/following::tr[1]/td[1]/div/a[1]")).click();
		 driver.findElement(By.linkText("Delete")).click();
		 driver.findElement(By.linkText("Find Leads")).click();
		 driver.findElement(By.name("id")).sendKeys(idLead);
		 driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		 WebElement result = driver.findElement(By.xpath("//div[contains(text(),'No records')]"));
		 boolean result1=result.isDisplayed();
		 if(result1==true)
		 {
			 System.out.println("No Leads are found in the given id");
		 }
		 else
		 {
			 System.out.println("Lead Id is found and it is not deleted");
		 }
		 Thread.sleep(2000);
		driver.close();

	}

}
