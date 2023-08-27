package mandatoryHomeWork.selenium;

import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.cucumber.java.After;

public class PlainScripts {
	
	public static WebDriver driver;
	@BeforeMethod
	public void login() {
		ChromeOptions option  = new ChromeOptions();
		option.addArguments("--disable-notifications");
        driver=new ChromeDriver(option);
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	    driver.get("https://login.salesforce.com/");
	    driver.findElement(By.id("username")).sendKeys("geethakalaiselvan2303@gmail.com");   
	    driver.findElement(By.id("password")).sendKeys("Unicorn@123");
	    driver.findElement(By.id("Login")).click();
	    driver.findElement(By.xpath("//button[contains(@class,'salesforceIdentityAppLauncherHeader')]")).click();
        driver.findElement(By.xpath("//button[text()='View All']")).click();
	    driver.findElement(By.xpath("(//input[@type='search'])[3]")).sendKeys("Opportunities");
	   
	}
	@AfterMethod
	void logOut() {
		driver.quit();
	}
	
	@Test(priority = 1)
	public void CreateNewOpportunity() {
		driver.findElement(By.xpath("//mark[text()='Opportunities']")).click();
		driver.findElement(By.xpath("//div[@title='New']")).click();
		driver.findElement(By.xpath("//input[@name='Name']")).sendKeys("Salesforce Automation by Geetha");
		String formatDate="dd/MM/yyyy";
		Date currentDate=new Date();
		SimpleDateFormat formatter=new SimpleDateFormat(formatDate);
		String formattedDate = formatter.format(currentDate);
		driver.findElement(By.xpath("//input[@name='CloseDate']")).sendKeys(formattedDate);
		driver.findElement(By.xpath("(//*[text()='Stage'])[2]/following-sibling::div/lightning-base-combobox/div/div/button")).click();
		driver.findElement(By.xpath("//span[@title='Needs Analysis']")).click();
		driver.findElement(By.xpath("//button[@name='SaveEdit']")).click();
	}
	
	@Test(priority = 2)
	public void CreateOpportunitywithoutmandatoryfields() {
	 driver.findElement(By.xpath("//mark[text()='Opportunities']")).click();
		driver.findElement(By.xpath("//div[@title='New']")).click();
		driver.findElement(By.xpath("//input[@name='Amount']")).sendKeys("1234");
		driver.findElement(By.xpath("//*[@class='slds-textarea']")).sendKeys("testingGeetha");
		driver.findElement(By.xpath("//button[@name='SaveEdit']")).click();
		driver.findElement(By.xpath("//*[text()='Review the following fields']")).isDisplayed();
		
	}
	
	@Test(priority = 3,dependsOnMethods ="SeleniumMarathon.PlainScripts.CreateNewOpportunity")
	public void EditOpportunity() {
		driver.findElement(By.xpath("//mark[text()='Opportunities']")).click();
		driver.findElement(By.xpath("//a[contains(@title,'Geetha')]/following::td[6]/span/div/a")).click();
		driver.findElement(By.xpath("//a[@title='Edit']")).click();
		String formatDate="yyyy-MM-dd";
		Date currentDate=new Date();
		SimpleDateFormat formatter=new SimpleDateFormat(formatDate);
		String formattedDate = formatter.format(currentDate);
		String yearMonthDay=formattedDate.substring(0, 7);
		String dayOfMonth =formattedDate.substring(8, formattedDate.length()) ;
		int parseInt = Integer.parseInt(dayOfMonth);
		String dateValue=Integer.toString(parseInt+1);
        String xpathExpression = "//table/tbody/tr/td[@data-value='" + yearMonthDay + "-" + dateValue + "']";
		driver.findElement(By.xpath("//input[@name='CloseDate']")).click();
		driver.findElement(By.xpath(xpathExpression)).click();
		driver.findElement(By.xpath("//button[@name='SaveEdit']")).click();
		driver.findElement(By.xpath("//span[@data-aura-class='forceActionsText']")).isDisplayed();
	}
	
	@Test(priority = 4,dependsOnMethods ="SeleniumMarathon.PlainScripts.CreateNewOpportunity")
	public void DeleteOppurtunity() {
		driver.findElement(By.xpath("//mark[text()='Opportunities']")).click();
		driver.findElement(By.xpath("//a[contains(@title,'Geetha')]/following::td[6]/span/div/a")).click();
		driver.findElement(By.xpath("//a[@title='Delete']")).click();
		driver.findElement(By.xpath("//div[text()='Are you sure you want to delete this opportunity?']")).isDisplayed();
		driver.findElement(By.xpath("//span[text()='Delete']")).click();
		driver.findElement(By.xpath("//span[@data-aura-class='forceActionsText']")).isDisplayed();
	}
	
	@Test(priority = 5)
	public void VerifyOpportunitiesSortOrderByCloseDate() {
		List<Integer> list=new ArrayList<Integer>();
		driver.findElement(By.xpath("//mark[text()='Opportunities']")).click();
		List<WebElement> findElements = driver.findElements(By.xpath("//span[@data-aura-class='uiOutputDate']"));
		for (WebElement ele : findElements) {
			String text = ele.getText();
			String substring = text.substring(0, 2);
			list.add(Integer.parseInt(substring));
		}
		List<Integer> sortedList = new ArrayList<Integer>(list);
	    Collections.sort(sortedList, Collections.reverseOrder());
	    Assert.assertEquals(list, sortedList, "Opportunities are not sorted by close date in descending order");
	}
	}


