package com.juaracoding.cucumber;

import com.juaracoding.cucumber.pages.LoginPage;
import com.juaracoding.cucumber.utils.Constants;
import com.relevantcodes.extentreports.ExtentTest;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class TestLogin {

    public WebDriver driver;
    public ExtentTest extentTest;
    public LoginPage loginPage = new LoginPage();
    public TestLogin(){
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }

    @When("User input valid email")
    public void user_input_valid_email(){
        loginPage.setInputEmail("mriswandahasan22@gmail.com");
        Hooks.delay(Constants.DETIK);
    }
    @And("User input valid password")
    public void user_input_valid_password(){
        loginPage.setInputPassword("akupastiSukses22");
        Hooks.delay(Constants.DETIK);
    }
    @And("User click button login")
    public void user_click_button_login(){
        loginPage.setCheckBoxLiatPassword();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window, scroll(0,50)");
        Hooks.delay(Constants.DETIK);
        loginPage.setBtnMasuk();
    }
    @Then("User go to page home")
    public void user_go_to_page_home(){
        Assert.assertEquals(loginPage.setLogoUniqlo(),"");
    }
}
