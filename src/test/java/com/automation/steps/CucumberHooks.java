package com.automation.steps;


import com.automation.webdriver.WebDriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class CucumberHooks {



    /*
    * Runs before each tests(features)
    * */

    @Before("ui")
    public void beforeEach(){
        WebDriverFactory.createDriver();
    }

    /*
    Runs before each tests(features) with tag '@ui' whether pass or fail*/
    @After("ui")
    public void afterEach(){
        WebDriverFactory.cleanUpDriver();
    }

}
