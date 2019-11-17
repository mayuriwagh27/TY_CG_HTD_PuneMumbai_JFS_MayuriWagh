package com.capgemini.selenium.stepdefinition;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStepDefinition1 {
	ChromeDriver driver = new ChromeDriver();

	static {
		System.setProperty("webdriver.chrome.driver", "./src/main/resources/chromedriver.exe");
	}

	@Given("^the user has loaded the application in the browser$")
	public void the_user_has_loaded_the_application_in_the_browser() throws Throwable {
		driver.get("https://demo.actiTime.com");
	}
	@When("^the user enters \"([^\"]*)\" in the username textbox$")
	public void the_user_enters_in_the_username_textbox(String arg1) throws Throwable {
		driver.findElement(By.id("username")).sendKeys(arg1);

	}

	@When("^the user enters \"([^\"]*)\" int the password textbox$")
	public void the_user_enters_int_the_password_textbox(String arg1) throws Throwable {
		driver.findElement(By.name("pwd")).sendKeys(arg1);

	}

	@When("^the user click on the login button$")
	public void the_user_click_on_the_login_button() throws Throwable {
		driver.findElement(By.xpath("//div[text ( )=  'Login ' ]")).click();
		Thread.sleep(1000);
	}

	@Then("^the dashboard page must be displayed$")
	public void the_dashboard_page_must_be_displayed() throws Throwable {
		String expected="actiTIME - Enter Time-Track";
		String actual = driver.getTitle();
		Assert.assertEquals(actual, expected );
		Thread.sleep(2000);
		driver.close();
	}

	

}
