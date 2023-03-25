package com.juaracoding.cucumber;

import com.juaracoding.cucumber.pages.RegisterPage;
import com.juaracoding.cucumber.utils.Constants;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class TestRegister {

    public static WebDriver driver;
    public static ExtentTest extentTest;
    public static RegisterPage registerPage = new RegisterPage();

    public TestRegister(){
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }

    @Given("User open browser and url")
    public void user_open_browser_and_url(){
        driver.get(Constants.URL);
        extentTest.log(LogStatus.PASS,"User open browser and url");
    }

    @When("User enter valid email")
    public void user_enter_valid_email(){
        registerPage.setInputEmail("assip@gmail.com");
        extentTest.log(LogStatus.PASS,"User enter valid email");
    }
    @And("User enter valid password")
    public void user_enter_valid_password(){
        registerPage.setInputPassword("Aku1CintaKamu@");
        extentTest.log(LogStatus.PASS,"User enter valid password");
    }
    @And("User click button showpassword")
    public void user_click_button_showpassword(){
        registerPage.setBtnShowPassword();
        extentTest.log(LogStatus.PASS,"User click button showpassword");
    }
    @And("User enter valid codepost")
    public void user_enter_valid_codepost(){
        registerPage.setInputCodePost("44123");
        extentTest.log(LogStatus.PASS,"User enter valid codepost");
    }
    @And("User enter birthdate")
    public void User_enter_birthdate(){
        registerPage.setInputTanggalLahir("22/03/1999");
        extentTest.log(LogStatus.PASS,"User enter birthdate");
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window, scroll(0,550)");
    }
    @And("User enter gender")
    public void user_enter_gender(){
        registerPage.setBtnJenisKelamin();
        extentTest.log(LogStatus.PASS,"User enter gender");
    }
    @And("User click button agreement")
    public void user_click_button_agreement(){
        registerPage.setBtnAgreement();
        extentTest.log(LogStatus.PASS,"User click button agreement");
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window, scroll(0,750)");
    }
    @And("User click button register")
    public void user_click_button_register(){
        registerPage.setBtnRegister();
        extentTest.log(LogStatus.PASS,"User click button register");
    }
    @Then("User go to page sendcode")
    public void user_go_to_page_sendcode(){
        Assert.assertEquals(registerPage.getTitleSendCode(),"TINJAU");
        Assert.assertEquals(registerPage.getCaution(),"Pastikan Anda dapat menerima email dari \"noreply-enews@mail.id.uniqlo.com\" terlebih dahulu.");
        extentTest.log(LogStatus.PASS,"User go to page Dashboard");
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window, scroll(0,150)");
        registerPage.setBtnKirimKode();
        Hooks.delay(Constants.DETIK);
    }
}
