package test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FindElements_LinkName_ID {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Mahesh\\chromedriver_win32\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver;
		driver=new ChromeDriver();
		driver.get("https://www.actitime.com/");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Try Free")).click();
		Thread.sleep(5000);
	    WebDriverWait wait=new WebDriverWait(driver , 10);
	    wait.until(ExpectedConditions.urlToBe("https://www.actitime.com/free-online-trial"));
	    //driver.findElement(By.xpath("/html//input[@id='First Name']")).sendKeys("De ZINNIA");
	    driver.findElement(By.id("First Name")).sendKeys("De ZINNIA");
	    driver.findElement(By.id("Last Name")).sendKeys("Learning");
	    driver.findElement(By.id("Email")).sendKeys("dezinnia@dezelearn.com");
	    driver.findElement(By.id("Company")).sendKeys("De ZINNIA");

	}

}