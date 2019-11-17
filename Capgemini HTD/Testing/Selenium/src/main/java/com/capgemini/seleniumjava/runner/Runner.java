package com.capgemini.seleniumjava.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;
@RunWith(Cucumber.class)
@CucumberOptions(features = "Features", glue = {"com.capgemini.selenium.stepdefinition"})
public class Runner  {

}
