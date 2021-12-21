package com.example.selenium.steps;


import com.example.selenium.pages.HomePage;
import com.example.selenium.pages.LoginPage;
import io.cucumber.java.en.And;
import org.springframework.beans.factory.annotation.Autowired;

public class LoginStep {
    @Autowired
    private HomePage homePage;

    @Autowired
    private LoginPage loginPage;

    @And("^I sing in as (.*) on coinmarketcap$")
    public void iSingInAsUserOnCoinmarketcap(String user) {
        homePage.pressLoginButton();
        loginPage.loginWithCredentials(user,"test@123SS");

    }
}
