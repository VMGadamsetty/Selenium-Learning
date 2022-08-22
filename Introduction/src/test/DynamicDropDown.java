package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class DynamicDropDown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Mahesh\\chromedriver_win32\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver;
		driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise");
		driver.manage().window().maximize();
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("//a[@value='BLR']")).click();
		Thread.sleep(2000);
		//driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();
		//other way find the dynamic dropdown without using the indexes is by parent and child realtionship the Xpath for that is as follows
		////div[@id='ctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA'] in this first part is parent and a white space and the actual xpath.
		driver.findElement(By.xpath("//div[@id='ctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']")).click();
		driver.findElement(By.cssSelector(".ui-datepicker-unselectable.ui-state-disabled.ui-datepicker-today")).click();
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
		System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));

         if(driver.findElement(By.id("Div1")).getAttribute("style").contains("0.5"))
         {
        	 System.out.println("Its enabled");
        	 Assert.assertTrue(true);
         }
         else
         {
        	 Assert.assertTrue(false);
         }

	}

}
