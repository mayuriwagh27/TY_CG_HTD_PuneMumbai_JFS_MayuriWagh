package com.capgemini.seleniumjava.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {
	
	static {
		System.setProperty("webdriver.chrome.driver", "./src/main/resources/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.seleniumhq.org/");
		driver.manage().window().maximize();
		driver.navigate().to("https://www.google/com/");
		driver.navigate().back();
		String title = driver.getTitle();
		System.out.println(title);
		driver.close();

	}

}
