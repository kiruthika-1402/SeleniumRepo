package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {

	public static void main(String[] args) {

       ChromeDriver driver = new ChromeDriver();
       
       driver.get("https://www.facebook.com/");
       
       driver.manage().window().maximize();
       
       driver.findElement(By.id("email")).sendKeys("kiruthika chidambaram");
       
       driver.findElement(By.id("pass")).sendKeys("lolykl511");
       
       driver.findElement(By.name("login")).click();
       
      
       
       
       
       
       
       
       
//       driver.close();
       
       

	}

}
