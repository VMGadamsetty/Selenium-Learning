package test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class LearnLocators {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Mahesh\\chromedriver_win32\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver;
		driver=new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.manage().window().maximize();
		driver.findElement(By.id("inputUsername")).sendKeys("MaheshBabu");
		driver.findElement(By.name("inputPassword")).sendKeys("Hello1234");
		driver.findElement(By.className("signInBtn")).click();
		Thread.sleep(2000);
		String error=driver.findElement(By.cssSelector("p.error")).getText();
		System.out.println(error);
		driver.findElement(By.linkText("Forgot your password?")).click();
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("MaheshBabu");
		driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("babu.gv012@gmail.com");
		driver.findElement(By.xpath("//input[@type='text'][2]")).clear();	
		driver.findElement(By.cssSelector("input[type='text']:nth-child(3)")).sendKeys("Mahesh.babu@gmail.com");
		driver.findElement(By.xpath("//form/input[3]")).sendKeys("9848986458");
		driver.findElement(By.cssSelector("button.reset-pwd-btn")).click();
		System.out.println(driver.findElement(By.cssSelector("form p")).getText());
		driver.findElement(By.xpath("//div[@class='forgot-pwd-btn-conainer']/button[1]")).click();
		driver.findElement(By.cssSelector("#inputUsername")).sendKeys("MaheshBabu");
		driver.findElement(By.cssSelector("input[type*='Pass']")).sendKeys("rahulshettyacademy");
		Thread.sleep(1000);
		driver.findElement(By.id("chkboxOne")).click();
		driver.findElement(By.xpath("//button[contains(@class,'submit')]")).click();
		Thread.sleep(2000);
		System.out.println(driver.findElement(By.tagName("p")).getText());
		Assert.assertEquals(driver.findElement(By.tagName("p")).getText(), "You are successfully logged in.");
		
		
		//driver.close();

	}

}
