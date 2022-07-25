package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSS1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Mahesh\\chromedriver_win32\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector("i.hm-icon ")).click();
		Thread.sleep(2000);
		driver.findElement(By.partialLinkText("Kindle E-readers & Books")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Kindle")).click();
		Thread.sleep(2000);
		String title=driver.findElement(By.cssSelector("Span#productTitle")).getText();
		System.out.println(title);
		if(title.contains("Kindle"))
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("Fail");
		}
		driver.close();
		}
	  
	
	}
