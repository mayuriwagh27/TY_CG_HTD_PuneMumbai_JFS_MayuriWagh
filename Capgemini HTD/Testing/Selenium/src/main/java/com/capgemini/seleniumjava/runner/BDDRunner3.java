package com.capgemini.seleniumjava.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "Features", glue = {"com.capgemini.selenium.stepdefinition"})
public class BDDRunner3 {

}
