package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableInCricbuzz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		System.setProperty("webdriver.chrome.driver","C:\\Mahesh\\chromedriver_win32\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver;
		driver=new ChromeDriver();
		driver.get("http://www.cricbuzz.com/live-cricket-scorecard/18970/pak-vs-sl-2nd-t20i-pakistan-v-sri-lanka-in-uae-2017");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		WebElement frames=driver.findElement(By.cssSelector("iframe[title*='Iframe']"));
		driver.switchTo().frame(frames);
		System.out.println(driver.findElement(By.cssSelector(".message-component.message-row")).getText());
		driver.findElement(By.cssSelector("button[title='Accept']")).click();
		driver.switchTo().defaultContent();
		WebElement table=driver.findElement(By.cssSelector("div[class='cb-col cb-col-100 cb-ltst-wgt-hdr']"));
		int rowcount= table.findElements(By.cssSelector("cb-col cb-col-100 cb-scrd-itms")).size();
		int count=table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).size();

		for(int i=0;i<count-2;i++)
		{
		String value=table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).get(i).getText();
		int valueinteger=  Integer.parseInt(value);
	    sum=sum+valueinteger;//103
		}
		//System.out.println(sum);

		String Extras=driver.findElement(By.xpath("//div[text()='Extras']/following-sibling::div")).getText();
		int extrasValue=Integer.parseInt(Extras);
		int TotalSumValue=sum+extrasValue;
		System.out.println(TotalSumValue);


		String ActualTotal=driver.findElement(By.xpath("//div[text()='Total']/following-sibling::div")).getText();
		int ActualTotalVAlue=Integer.parseInt(ActualTotal);
		if(ActualTotalVAlue==TotalSumValue)
		{
		System.out.println("Count Matches");
		}
		else
		{
		System.out.println("count fails");
		}
		driver.close();
		}
       
	}

