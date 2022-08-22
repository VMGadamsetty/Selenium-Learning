package test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class AssignmentWait {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Mahesh\\chromedriver_win32\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver;
		driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/loginpagePractise");
		driver.manage().window().maximize();
		String text=driver.findElement(By.cssSelector("div.form-group p")).getText();
		String[] splittedname =text.split(" ");
	    String id=splittedname[2].trim();
	    //String pass=splittedname[6].trim();
	    //System.out.println(splittedname[6].trim());
		driver.findElement(By.id("username")).sendKeys(id);
		driver.findElement(By.id("password")).sendKeys("learning");		
		Assert.assertFalse(driver.findElement(By.xpath("//input[@value='user']")).isSelected());
		driver.findElement(By.xpath("//input[@value='user']")).click();
		WebDriverWait w=new WebDriverWait(driver,7);
		w.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#okayBtn")));
		driver.findElement(By.cssSelector("#okayBtn")).click();
		WebElement staticdropdown=driver.findElement(By.cssSelector("select.form-control"));
		Select sel=new Select(staticdropdown);
		sel.selectByVisibleText("Consultant");
		Assert.assertFalse(driver.findElement(By.cssSelector("#terms")).isSelected());
		driver.findElement(By.cssSelector("#terms")).click();
		driver.findElement(By.cssSelector("#signInBtn")).click();
		w.until(ExpectedConditions.elementToBeClickable(By.partialLinkText("Checkout")));
		List<WebElement> products=driver.findElements(By.cssSelector(".btn.btn-info"));
		for(int i=0;i<products.size();i++)
		{
			products.get(i).click();
		}
		driver.findElement(By.partialLinkText("Checkout")).click();
		

	}

}
