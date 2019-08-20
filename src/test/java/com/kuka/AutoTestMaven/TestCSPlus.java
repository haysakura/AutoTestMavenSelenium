package com.kuka.AutoTestMaven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestCSPlus {
	
	WebDriver driver;
	
	@BeforeTest
	public void init()
	{
		System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe"); // chromedriver path
		driver = new ChromeDriver();
	}
	
	@Test
	public void TestLoginLogout() throws InterruptedException
	{
		driver.get("http://192.168.56.101:1207/rs");
		Thread.sleep(1500);
		driver.findElement(By.id("mat-input-0")).sendKeys("admin");
		driver.findElement(By.id("mat-input-1")).sendKeys("ADMIN");
		driver.findElement(By.cssSelector("button[type='submit']")).click();		
		Thread.sleep(3000);
//		driver.findElement(By.cssSelector("button[aria-describedby='cdk-describedby-message-6']")).click();
		driver.findElement(By.cssSelector("mat-icon[class$='mat-icon-no-color']")).click();
		Thread.sleep(1000);
//		driver.quit();
		Thread.sleep(3000);
	}
	
	@Test
	public void openPage() throws InterruptedException
	{
		driver.get("http://192.168.56.101:1207/rs");
		Thread.sleep(1500);
	}
	
	@AfterTest
	public void end()
	{
		driver.quit();
		System.out.println("This is the end of the NG test!");
	}
}
