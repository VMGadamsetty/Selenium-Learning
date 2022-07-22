package test;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;


public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Mahesh\\chromedriver_win32\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver;
		driver=new ChromeDriver();
		/*driver.get("https://www.google.com");
		System.out.println(driver.getTitle());*/
		driver.get("https://www.rahulshettyacademy.com/");
		driver.manage().window().maximize();
		sleep(5000);
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.close();
	}

	private static void sleep(int i) {
		// TODO Auto-generated method stub
		
	}

}
