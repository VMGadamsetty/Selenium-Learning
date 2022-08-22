package test;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentWH {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Mahesh\\chromedriver_win32\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver;
		driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com");
		driver.manage().window().maximize();
		//driver.findElement(By.partialLinkText("Multiple")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Multiple')]")).click();
		driver.findElement(By.cssSelector("div#content a")).click();
		Set<String> window=driver.getWindowHandles();
		Iterator<String> It=window.iterator();
		String parentId=It.next();
		String childId=It.next();
		driver.switchTo().window(childId);
		System.out.println(driver.findElement(By.cssSelector("div.example h3")).getText());
		driver.switchTo().window(parentId);
		System.out.println(driver.findElement(By.xpath("//h3[contains(text(),'Opening')]")).getText());
		
		

	}

}
