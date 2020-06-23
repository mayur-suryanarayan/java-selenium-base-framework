package org.selenium.framework.reporter;

public class Reporter {

    public Reporter(){
        // instantiate log4j here
        // instantiate reporter html format here
    }
    
    public boolean takeFullPageScreenshot(){ return false; }

    public boolean takeScreenshot() { return false; }

    public boolean report(String status, String message){ return false; }

}