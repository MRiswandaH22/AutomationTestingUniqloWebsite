package com.juaracoding.cucumber.drivers.strategis;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Chrome implements DriverStrategy {

    public WebDriver setStrategy(){
        System.setProperty("webdriver.chrome.driver", "C:\\juaracoding\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.setExperimentalOption("useAutomationExtension", false);
        options.addArguments("--no-sanbox");
        return new ChromeDriver(options);
    }
}
