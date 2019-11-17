package com.capgemini.seleniumjava.test;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GetWindowHandle {
	static {
		System.setProperty("webdriver.chrome.driver", "./src/main/resources/chromedriver.exe");
	}
	public static void main(String[] args) {
WebDriver driver = new ChromeDriver();
/*driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
WebDriverWait wait = new WebDriverWait(driver , 10);
wait.until(ExpectedConditions.titleContains("google"));*/
driver.get("https://www.google.com");
String wh = driver.getWindowHandle();
System.out.println(wh);


driver.get("https://naukri.com");
Set<String> whs = driver.getWindowHandles();
System.out.println("number of windows : "+ whs.size());
System.out.println(whs);
driver.close();
	}

}
