package Week2Day2;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead {

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
		//WebElement loginbutton=driver.findElement(By.)
		WebElement loginbutton=driver.findElement(By.className("decorativeSubmit"));
		loginbutton.click();
		WebElement crmsfa=driver.findElement(By.linkText("CRM/SFA"));
		crmsfa.click();
		WebElement createlead=driver.findElement(By.linkText("Create Lead"));
		createlead.click();
		WebElement companyName=driver.findElement(By.id("createLeadForm_companyName"));
		companyName.sendKeys("TestLeaf");
		WebElement firstName=driver.findElement(By.id("createLeadForm_firstName"));
		firstName.sendKeys("Jananee");
		WebElement lastName=driver.findElement(By.id("createLeadForm_lastName"));
		lastName.sendKeys("Muthukumar");
		WebElement firstLocal=driver.findElement(By.id("createLeadForm_firstNameLocal"));
		firstLocal.sendKeys("Janu");
		WebElement lastLocal=driver.findElement(By.id("createLeadForm_lastNameLocal"));
		lastLocal.sendKeys("Dhanyasree");
		WebElement birthday=driver.findElement(By.id("createLeadForm_birthDate"));
		birthday.sendKeys("11/17/2014");
		WebElement salutation=driver.findElement(By.id("createLeadForm_personalTitle"));
		salutation.sendKeys("VDS");
		WebElement department=driver.findElement(By.id("createLeadForm_departmentName"));
		department.sendKeys("ComputerScience");
		WebElement annualRevenue=driver.findElement(By.id("createLeadForm_annualRevenue"));
		annualRevenue.sendKeys("12309988");
		WebElement noOfEmp=driver.findElement(By.id("createLeadForm_numberEmployees"));
		noOfEmp.sendKeys("10000");
		driver.findElement(By.id("createLeadForm_sicCode")).sendKeys("123");
		driver.findElement(By.id("createLeadForm_tickerSymbol")).sendKeys("YES");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Selenium Automation for create lead");
		driver.findElement(By.id("createLeadForm_importantNote")).sendKeys("Important note Selenium Automation for create lead");
		WebElement countryCode=driver.findElement(By.id("createLeadForm_primaryPhoneCountryCode"));
		countryCode.clear();
		countryCode.sendKeys("4");
		driver.findElement(By.id("createLeadForm_primaryPhoneAreaCode")).sendKeys("123");
		driver.findElement(By.id("createLeadForm_primaryPhoneExtension")).sendKeys("98765");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("abcdef@gmail.com");
		driver.findElement(By.id("createLeadForm_primaryPhoneAskForName")).sendKeys("Jananee");
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("9876543210");
		
		driver.findElement(By.id("createLeadForm_primaryWebUrl")).sendKeys("www.testleaf.com");
		
		driver.findElement(By.id("createLeadForm_generalToName")).sendKeys("V.Dhanyasree");
		driver.findElement(By.id("createLeadForm_generalAttnName")).sendKeys("V.Jananee");
		
		driver.findElement(By.id("createLeadForm_generalAddress1")).sendKeys("123 willington road");
		driver.findElement(By.id("createLeadForm_generalAddress2")).sendKeys("Orange County");
		driver.findElement(By.id("createLeadForm_generalCity")).sendKeys("washington");
		driver.findElement(By.id("createLeadForm_generalPostalCode")).sendKeys("98764");
		driver.findElement(By.id("createLeadForm_generalPostalCodeExt")).sendKeys("535353");
		driver.findElement(By.id("createLeadForm_generalPostalCodeExt")).sendKeys("535353");
		driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId")).sendKeys("Alabama");
		driver.findElement(By.className("smallSubmit")).click();
		
	}
	

}
