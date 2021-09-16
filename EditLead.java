package Week2Day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLead {

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
		//driver.findElement(By.name("firstName")).sendKeys("Jananee");
		driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys("Jananee");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(5000);
		String textName = driver.findElement(By.xpath("//div[@class='x-grid3-hd-inner x-grid3-hd-firstName']/following::tr[1]/td[3]/div/a[1]")).getText();
		System.out.println("name: "+textName);
		driver.findElement(By.xpath("//div[@class='x-grid3-hd-inner x-grid3-hd-firstName']/following::tr[1]/td[3]/div/a[1]")).click();
		String viewTitle = driver.findElement(By.xpath("//div[text()='View Lead']")).getText();
		if(viewTitle.equals("View Lead"))
		 			 System.out.println("view Lead is verified");		 
		 else		 
			 System.out.println("Title not verified");
		driver.findElement(By.linkText("Edit")).click();
		driver.findElement(By.id("updateLeadForm_companyName")).clear();
		driver.findElement(By.id("updateLeadForm_companyName")).sendKeys("New Company name");
		driver.findElement(By.xpath("//input[@value='Update']")).click();
		String nameC = driver.findElement(By.xpath("//span[@id='viewLead_companyName_sp']")).getText();	
		 System.out.println("newcompanyName is : "+nameC);
		 
		 if(nameC.contains("New Company name"))
		 {
			 System.out.println("Company name is updated successfully");
		 }
		 else
		 {
			 System.out.println("Company name is not updated");
		 }
		 Thread.sleep(5000);
		 
	
	}
	

}
