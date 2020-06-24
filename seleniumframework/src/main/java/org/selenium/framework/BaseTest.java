package org.selenium.framework;

import org.openqa.selenium.WebDriver;
import org.selenium.framework.config.Environment;
import org.selenium.framework.drivermanager.DriverManager;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;


public class BaseTest {

    protected WebDriver driver;

    @BeforeTest
    public void setupTest(){
        Environment environment = new Environment();
        environment.setArchitecture("64");
        environment.setBrowser("chrome");
        DriverManager drivermanager = new DriverManager(environment);
        driver = drivermanager.getDriver(environment);
    }
    

    @AfterTest
    public void teardown(){
        if (driver != null) {
            driver.close();
            driver.quit();
        }
    }
}