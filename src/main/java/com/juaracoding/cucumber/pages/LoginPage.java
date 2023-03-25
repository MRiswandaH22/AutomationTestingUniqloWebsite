package com.juaracoding.cucumber.pages;

import com.juaracoding.cucumber.drivers.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.SplittableRandom;

public class LoginPage {

    private WebDriver driver;

    public LoginPage(){
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//a[@class='block-anchor fr-link--active']")
    WebElement logoUniqlo;
    @FindBy(xpath = "//label[@for='fr-checkbox-1']")
    WebElement checkBoxLiatPassword;
    @FindBy(xpath = "//input[@type='email']")
    WebElement inputEmail;
    @FindBy(xpath = "//input[@type='password']")
    WebElement inputPassword;
    @FindBy(xpath = "//a[@data-test='login-button']")
    WebElement btnMasuk;

    public boolean setLogoUniqlo(){
        return logoUniqlo.isDisplayed();
    }
    public void setCheckBoxLiatPassword(){
        checkBoxLiatPassword.click();
    }
    public void setInputEmail(String email){
        this.inputEmail.sendKeys(email);
    }

    public void setInputPassword(String password){
        this.inputPassword.sendKeys(password);
    }

    public void setBtnMasuk(){
        btnMasuk.click();
    }
}
