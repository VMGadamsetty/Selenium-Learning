package test;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FindElements_Name {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Mahesh\\chromedriver_win32\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		driver.findElement(By.name("field-keywords")).sendKeys("Barbie Dolls");
		driver.findElement(By.id("nav-search-submit-button")).click();
		Thread.sleep(1000);
		driver.findElement(By.partialLinkText("Barbie Fantasy")).click();
		Thread.sleep(1000);
		String productTitle=driver.findElement(By.id("productTitle")).getText();
		//String productPrice=driver.findElement(By.className("a-price-whole")).getText();
		String productPrice=driver.findElement(By.xpath("//span[contains(@class,'priceToPay')][@data-a-size='xl']/span[@class='a-offscreen']")).getAttribute("innerText");
		System.out.println("ProductTitle:" + productTitle);
		System.out.println("ProductPrice:" + productPrice);
		
		

	}

}
