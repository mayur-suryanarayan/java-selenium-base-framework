package org.selenium.framework.components;

import org.selenium.framework.BaseTest;

public class Operations extends BaseTest{

    public Operations goToHDFCBankWebSite(){
        String baseURL = "https://www.hdfcbank.com/";
        driver.get(baseURL);
        return this;
    }

    public Operations navigateToNetbankingLogin(){
        return this;
    }

    public Operations login(){
        return this;
    }
    
}