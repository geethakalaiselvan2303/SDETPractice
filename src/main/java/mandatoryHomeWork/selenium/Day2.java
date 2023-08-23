package mandatoryHomeWork.selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;


public class Day2 {

	
		/*  Day_2 Assignment
			=============
			"Test Steps to Create New Dashboard:
			1. Login to https://login.salesforce.com
			Username :hari.radhakrishnan@qeagle.com
			Password :Leaf$1234
			2. Click on the toggle menu button from the left corner
			3. Click View All and click Dashboards from App Launcher
			4. Click on the New Dashboard option
			5. Enter Name as 'Salesforce Automation by Your Name ' and Click on Create.
			6. Click on Save.
	 */
	@Test
	public void day2() {
			ChromeOptions option  = new ChromeOptions();
			option.addArguments("--disable-notifications");
		    WebDriver driver=new ChromeDriver(option);
	        driver.manage().window().maximize();
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	        driver.get("https://login.salesforce.com/");
	        driver.findElement(By.id("username")).sendKeys("hari.radhakrishnan@qeagle.com");   
	        driver.findElement(By.id("password")).sendKeys("Leaf$1234");
	        driver.findElement(By.id("Login")).click();
	        driver.findElement(By.xpath("//button[contains(@class,'salesforceIdentityAppLauncherHeader')]")).click();
	        driver.findElement(By.xpath("//button[text()='View All']")).click();
	        driver.findElement(By.xpath("(//input[@type='search'])[3]")).sendKeys("Dashboards");
	        WebElement dashboardElement = driver.findElement(By.xpath("//a[@data-label='Dashboards']"));
	        JavascriptExecutor jse=(JavascriptExecutor) driver;
	        jse.executeScript("arguments[0].click();", dashboardElement);
	       // driver.findElement(By.xpath("//a[@data-label='Dashboards']")).click();
	        driver.findElement(By.xpath("//div[@title='New Dashboard']")).click();
	        WebElement frame = driver.findElement(By.xpath("//iframe[@title='dashboard']"));
	        driver.switchTo().frame(frame);
	        driver.findElement(By.xpath("//input[@id='dashboardNameInput']")).sendKeys("Geetha Dashboard");
	        driver.findElement(By.id("submitBtn")).click(); //clicne t=>server
	        driver.close(); //client
	        
	        
	        
	}

}
