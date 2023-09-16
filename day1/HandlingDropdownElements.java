package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingDropdownElements {
	
	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		
		// To launch Url
		
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		// To maximize
		
		driver.manage().window().maximize();
		
		// To find locator and insert the values in the textbox
		
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		
		driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
		
		// To find locator and click login
		
		driver.findElement(By.className("decorativeSubmit")).click();
		
		driver.findElement(By.partialLinkText("CRM")).click();
		
		driver.findElement(By.className("x-panel-tr")).click();
		
		driver.findElement(By.linkText("Leads")).click();
		
		driver.findElement(By.linkText("Create Lead")).click();
		
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Kiruthika");
		
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Chidambaram");
		
		WebElement select = driver.findElement(By.id("createLeadForm_dataSourceId"));
		
		// Create object for select class
		
		Select option = new Select(select);
		
		option.selectByIndex(4);
		
		WebElement select1 = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		
		Select option1 = new Select(select1);
		
		option1.selectByVisibleText("Automobile");
		
		WebElement select2 = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
		
		Select option2 = new Select(select2);
		
		option2.selectByValue("OWN_CCORP");
		
		driver.findElement(By.name("submitButton")).click();
		
		// To Close
		
		driver.close();
		
		
		
		
	}

}
