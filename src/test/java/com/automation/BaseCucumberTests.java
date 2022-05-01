package com.automation;


import org.junit.platform.suite.api.*;

@Suite
@IncludeEngines("cucumber")
@SelectDirectories("C:/SpringBoot/src/test/resources/featurefiles")
public class BaseCucumberTests {

}
