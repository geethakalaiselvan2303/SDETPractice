package mandatoryHomeWork.selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;

public class Day4 {
	
/*
 *  1. Launch https://login.salesforce.com/ 
	2. Login to Salesforce with your username and password
	3. Click on the App Launcher (dots)
	4. Click View All
	5. Type Content on the Search box
	6. Click the Content Link
	7. Click on Chatter Tab
	8. Verify the Chatter title on the page
	9. Click the Question tab
	10. Type Question 
	11. Type Details 
	12. Click Ask
	13. Confirm the question appears
	14. Close the browser
 */

	@Test
	public void day4() {
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
	        driver.findElement(By.xpath("(//input[@type='search'])[3]")).sendKeys("Content");
	        WebElement contentElement = driver.findElement(By.xpath("//p/mark[text()='Content']"));
	        JavascriptExecutor jse=(JavascriptExecutor) driver;
	        jse.executeScript("arguments[0].click();", contentElement);
	        WebElement chatter = driver.findElement(By.xpath("//a[@title='Chatter']"));
	        jse.executeScript("arguments[0].click();", chatter);
	        String expectedTitle ="Lightning Experience";
	        String actualTitle = driver.getTitle();
	        System.out.println("Page Title: " + actualTitle);
	        Assert.assertEquals(actualTitle, expectedTitle);
	        driver.findElement(By.xpath("//span[text()='Question']")).click();
	        driver.findElement(By.xpath("//*[contains(@class,'cuf-questionTitleField')]")).sendKeys("Selenium Practice day4");
	        driver.findElement(By.xpath("//button[contains(@title,'Ctrl+Enter')]")).click();
	        driver.findElement(By.xpath("//span[contains(text(),'Selenium Practice day4')]")).isDisplayed();
	        driver.close(); 
}


}
