package com.kuka.AutoTestMaven;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestBaidu {
	
  @Test
  public void openBaidu() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe"); // chromedriver path
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.baidu.com");
		driver.findElement(By.id("kw")).sendKeys("SCARA"); // find the element 'kw', and enter 'hello'
		driver.findElement(By.id("su")).click(); // click the 'search' button
		try {
			driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		Thread.sleep(3000);
		driver.quit();
  }
}
