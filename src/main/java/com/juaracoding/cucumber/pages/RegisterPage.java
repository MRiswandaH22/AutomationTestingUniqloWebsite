package com.juaracoding.cucumber.pages;

import com.juaracoding.cucumber.drivers.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {

    private WebDriver driver;
    public RegisterPage(){
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//span[normalize-space()='Buat akun']")
    WebElement txtJudulRegister;
    @FindBy(xpath = "//input[@name='email']")
    WebElement inputEmail;
    @FindBy(xpath = "//input[@name='password']")
    WebElement inputPassword;
    @FindBy(xpath = "//label[@for='showPassword']")
    WebElement btnShowPassword;
    @FindBy(xpath = "//input[@name='postalCode']")
    WebElement inputCodePost;
    @FindBy(xpath = "//input[@name='birthday']")
    WebElement inputTanggalLahir;
    @FindBy(xpath = "//label[@for='fr-radio-2']")
    WebElement inputJenisKelamin;
    @FindBy(xpath = "//label[@for='fr-checkbox-6']")
    WebElement btnAgreement;
    @FindBy(xpath = "//button[@data-test='daftar-button']")
    WebElement btnRegister;

    @FindBy(xpath = "//span[normalize-space()='Tinjau']")
    WebElement txtJudulSendKodeVerifikasi;


    public String getTitleSendCode(){
        return txtJudulSendKodeVerifikasi.getText();
    }

    public void setInputEmail(String username){
        this.inputEmail.sendKeys(username);
    }
    public void setInputPassword(String password){
        this.inputPassword.sendKeys(password);
    }
    public void setBtnShowPassword(){
        btnShowPassword.click();
    }
    public void setInputCodePost(String kodePos){
        this.inputCodePost.sendKeys(kodePos);
    }
    public void setInputTanggalLahir(String tanggalLahir){
        this.inputTanggalLahir.sendKeys(tanggalLahir);
    }
    public void setBtnJenisKelamin(){
        inputJenisKelamin.click();
    }
    public void setBtnAgreement(){
        btnAgreement.click();
    }
    public void setBtnRegister(){
        btnRegister.click();
    }

}
