package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class UpdatedDropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Mahesh\\chromedriver_win32\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver;
		driver=new ChromeDriver();
//		WebDriverWait wait=new WebDriverWait(driver ,40);
		//Actions act = new Actions(driver);
		driver.get("https://rahulshettyacademy.com/dropdownsPractise");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		System.out.println(driver.findElement(By.cssSelector("input[id$='SeniorCitizenDiscount']")).isSelected());
		driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click();
		System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(5000);
		System.out.println(driver.findElements(By.cssSelector("input[type='Checkbox']")).size());
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		/*int i=1;
		while(i<5)
		{
			driver.findElement(By.id("hrefIncAdt")).click();
			i++;
		}*/
		for (int i=1;i<5;i++)
		{
          //act.moveToElement(driver.findElement(By.id("hrefIncAdt"))).click().build().perform();
			driver.findElement(By.id("hrefIncAdt")).click();
			Thread.sleep(1000);
		}
		driver.findElement(By.id("btnclosepaxoption")).click();
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(),"5 Adult");

	}

}
