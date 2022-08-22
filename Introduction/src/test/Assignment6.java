package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Mahesh\\chromedriver_win32\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver;
		driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		//driver.findElement(By.id("checkBoxOption2")).click(); do this in a different way so that we can say text collected is the selected one.
		//String cBoxName=driver.findElement(By.xpath("//div[4]/fieldset/label[2]")).getText();
		//Though the above one is correct the below xpath is with less indexs.
		driver.findElement(By.xpath("//*[@id='checkbox-example']/fieldset/label[2]/input")).click();
		String cBoxName=driver.findElement(By.xpath("//*[@id='checkbox-example']/fieldset/label[2]")).getText();
		
		System.out.println(cBoxName);
		WebElement dropDown=driver.findElement(By.id("dropdown-class-example"));
		dropDown.click();
		Select DpDw=new Select(dropDown);
		DpDw.selectByVisibleText(cBoxName);
		driver.findElement(By.id("name")).sendKeys(cBoxName);
		driver.findElement(By.id("alertbtn")).click();
		String alText=driver.switchTo().alert().getText();
		if(alText.contains(cBoxName))
		{
			System.out.println("Text successfully identified");
			driver.switchTo().alert().accept();
		}
		else
		{
			System.out.println("Something went wrong");
		}
		
		driver.close();		
		}
	
	}


