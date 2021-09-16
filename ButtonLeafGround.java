package Week2Day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ButtonLeafGround {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("http://leafground.com/pages/Button.html");
		driver.findElement(By.id("home")).click();
		System.out.println("Title"+driver.getTitle());
		System.out.println("Get url"+driver.getCurrentUrl());
		driver.findElement(By.linkText("Button")).click();
		int loc = driver.findElement(By.id("position")).getLocation().getY();
		System.out.println("Position is :"+loc);
		
		String bg = driver.findElement(By.id("color")).getCssValue("background-color");
		System.out.println("Background color Of the given element "+bg);
		System.out.println("Height"+driver.findElement(By.id("size")).getSize().getHeight());
		System.out.println("Width"+driver.findElement(By.id("size")).getSize().getWidth());

	}

}
