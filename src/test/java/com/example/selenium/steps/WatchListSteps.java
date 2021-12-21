package com.example.selenium.steps;


import com.example.selenium.pages.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.springframework.beans.factory.annotation.Autowired;

public class WatchListSteps {

    @Autowired
    private HomePage homePage;

    @And("^I open the watchlist in a different browser tab$")
    public void iOpenTheWatchlistInADifferentBrowserTab() {
        homePage.mouseHoverAvatarImage();
        homePage.openWatchListToNewTab();
    }

    @Then("^I verify all the options selected are added to the watchlist$")
    public void iVerifyAllTheOptionsSelectedAreAddedToTheWatchlist() {
    }
}
