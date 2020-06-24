package org.selenium.framework.drivermanager;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.selenium.framework.config.Environment;

public class DriverManager {

    public DriverManager(Environment environment){
        
        WebDriverManager wdm = null;
        
        switch (environment.getBrowser()){
            case "chrome":
                wdm = WebDriverManager.chromedriver();
                
                break;
        
                case "firefox":
                wdm = WebDriverManager.firefoxdriver();
                break;
            
            case  "edge":
                wdm = WebDriverManager.edgedriver();
                break;

            case "internetexplorer":
                wdm = WebDriverManager.iedriver();
                break;
            
            case "opera":
                wdm = WebDriverManager.operadriver();
                break;

        }

        if(environment.getArchitecture().equals("32")){
            wdm.arch32();
        }else{
            wdm.arch64();
        }

        wdm.setup();
    }

    public WebDriver getDriver(Environment environment){ 

        WebDriver driver = null;

        switch (environment.getBrowser()){
            case "chrome":
                driver = new ChromeDriver();
                break;
        
            case "firefox":
                driver = new FirefoxDriver();
                break;
            
            case  "edge":
                driver = new EdgeDriver();
                break;

            case "internetexplorer":
                driver = new InternetExplorerDriver();
                break;
            
            case "opera":
                driver = new OperaDriver();
                break;

            case "safari":
                driver = new SafariDriver();
                break;

        }

        driver.manage().window().maximize();
        return driver; 
    }
    
}