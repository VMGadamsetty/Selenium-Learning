package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.WebElement;
public class Xpath1 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Mahesh\\chromedriver_win32\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		//JavascriptExecutor js = (JavascriptExecutor) driver;
		driver.findElement(By.xpath("//div[@id='consent_cookies_title']")).isDisplayed();
		Actions actions= new Actions(driver);
		WebElement element=driver.findElement(By.xpath("//button[@title='expandable section']//div[contains(text(),'Controlling cookies with browser settings')]"));
		actions.moveToElement(element).build().perform();
		//js.executeScript("window.scrollBy(0,1000");
		driver.findElement(By.xpath("//button[@id='u_0_e_Jm']")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Create new account")).click();
	    /*WebDriverWait wait=new WebDriverWait(driver , 10);
		wait.until(ExpectedConditions.textToBePresentInElement(By.xpath("//div[text()='Sign Up']"),"Sign Up"));*/
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Venkata");
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Gadamsetty");
		driver.findElement(By.xpath("//input[@aria-label='Mobile number or email']")).sendKeys("abc@gmail.com");

	}

}
