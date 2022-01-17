package com.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src\\test\\java\\com\\fetaure"},
				 glue= {"com\\steps"}
				 ,monochrome = true
				// ,dryRun = true
						 ,tags= {"@newtour"}
				 
				 )
public class Runner {

}
