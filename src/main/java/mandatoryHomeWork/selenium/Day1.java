package mandatoryHomeWork.selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Day1 {

	public static void main(String[] args) {
			ChromeOptions option  = new ChromeOptions();
			option.addArguments("--disable-notifications");
	        ChromeDriver driver=new ChromeDriver(option);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("https://login.salesforce.com/");
        driver.findElement(By.id("username")).sendKeys("hari.radhakrishnan@qeagle.com");   
        driver.findElement(By.id("password")).sendKeys("Leaf$1234");
        driver.findElement(By.id("Login")).click();
        driver.findElement(By.xpath("//button[contains(@class,'salesforceIdentityAppLauncherHeader')]")).click();
        driver.findElement(By.xpath("//span/p[text()='Sales']")).click();
        WebElement element = driver.findElement(By.xpath("//a[@title='Accounts']"));
     JavascriptExecutor jse=(JavascriptExecutor) driver;
      jse.executeScript("arguments[0].click();", element);
      
      driver.findElement(By.xpath("//a[@title='Accounts']")).click();
        driver.quit();
	}
}
