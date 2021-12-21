package com.example.selenium.steps;


import com.example.selenium.pages.HomePage;
import com.example.selenium.pages.LoginPage;
import io.cucumber.java.en.And;
import org.springframework.beans.factory.annotation.Autowired;
import sun.rmi.runtime.Log;

public class HistoricDataSteps {
    @Autowired
    private HomePage homePage;


    @And("^I navigate and record historical data of the (.*) to current date$")
    public void iNavigateAndRecordHistoricalDataOfTheCryptocurrenyToCurrentDate(String cryptocurrency) {
    }

    @And("^I verify data recorded in previous step with date filter$")
    public void iVerifyDataRecordedInPreviousStepWithDateFilter() {
    }
}
