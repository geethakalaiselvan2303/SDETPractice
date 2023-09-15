package mandatoryHomeWork.selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class JIRA_Selenium {

		@Test
		public void test() {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		driver.get("https://api-training.atlassian.net/");
		driver.findElement(By.id("username")).sendKeys("hari.radhakrishnan@testleaf.com");
		driver.findElement(By.xpath("//span[text()='Continue']")).click();
		driver.findElement(By.id("password")).sendKeys("India@123");
		driver.findElement(By.id("login-submit")).click();
		driver.findElement(By.xpath("//a[@class='sc-1p2gpiw-1 ktRddP']/span/following-sibling::div/p[text()='SDET-5']")).click();
		driver.findElement(By.xpath("//span[text()='Create']")).click();
		driver.findElement(By.id("summary-field")).sendKeys("Automation By Geetha");
		driver.findElement(By.xpath("//button[@data-testid='issue-create.common.ui.footer.create-button']")).click();
		driver.findElement(By.xpath("//span[text()='Backlog']")).click();
		driver.findElement(By.xpath("//input[@data-test-id='searchfield']")).sendKeys("Automation By Geetha");
		driver.findElement(By.xpath("(//*[text()='Automation By Geetha'])[2]")).isDisplayed();
		driver.quit();
}
}
