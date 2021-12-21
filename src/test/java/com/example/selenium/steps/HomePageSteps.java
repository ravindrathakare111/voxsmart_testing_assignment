package com.example.selenium.steps;


import com.example.selenium.pages.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.springframework.beans.factory.annotation.Autowired;

public class HomePageSteps {
    @Autowired
    private HomePage homePage;

    @Then("^I verify (\\d+) results are displayed on page (\\d+)$")
    public void iVerifyResult_countResultsAreDisplayedOnPagePage_no(int resultCount,int pageNo) {
        Assert.assertEquals("Unexpected result count of cyrptocurrencies",resultCount,homePage.getRows());
    }

    @And("^I select between (\\d+) random cryptocurrencies and add to watchlist$")
    public void selectBetweenAndRandomCryptocurrenciesAndAddToWatchlist(int numberOfCurrency) {
        homePage.clickStarWatchList(numberOfCurrency);
    }
}
