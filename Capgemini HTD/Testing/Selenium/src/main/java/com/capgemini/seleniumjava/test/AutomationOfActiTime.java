package com.capgemini.seleniumjava.test;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomationOfActiTime {

	static {
		System.setProperty("webdriver.chrome.driver", "./src/main/resources/chromedriver.exe");
	}
	@Test
	public void testOne() throws InterruptedException {
		// Open the browser
		ChromeDriver driver = new ChromeDriver();
		// enter the url
		driver.get("https://demo.actiTime.com");
		//enter valid username
				driver.findElement(By.id("username")).sendKeys("admin");
				//enter valid password
				driver.findElement(By.name("pwd")).sendKeys("manager");
				//click on login
				driver.findElement(By.xpath("//div[text ( )=  'Login ' ]")).click();
				Thread.sleep(1000);
				
				String expected="actiTIME - Enter Time-Track";
				String actual = driver.getTitle();
				
				Assert.assertEquals(actual, expected );
				Thread.sleep(2000);
				driver.close();
	}
}