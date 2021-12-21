package com.example.selenium.pages;

import com.example.selenium.laucher.Hook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class HomePage implements BasePage {

    @Autowired
    private Hook hook;

    @Autowired
    Actions actions=new Actions(hook.getDriver());

    @FindBy(how = How.XPATH, using = "//div[@class='h7vnx2-1 bFzXgL']/table/tbody")
    private WebElement cryptoCurrenciesTable;


    @FindBy(how = How.XPATH, using = "//button[text()=\"Log In\"]")
    private WebElement logInButton;

    @FindBy(how = How.XPATH, using = "//div[@class='h7vnx2-1 bFzXgL']/table/tbody/tr")
    private WebElement tableRows;

    @FindBy(how = How.XPATH, using = "//div[@class=\"avatar-img \"]")
    private WebElement avatarImage;

    @FindBy(how = How.XPATH, using = "//span[text()=\"Watchlist\"]")
    private WebElement watchList;


   /* This method clicks start icon to add number of cryptocurrency in watchlist as per count provided in parameter
      Parameter
      *numberOfStarsToClick - number of cryptocurrency to select
   */
    public void clickStarWatchList(Integer numberOfStarsToClick){
        List<WebElement> stars= cryptoCurrenciesTable.findElements(By.className("icon-Star"));
            while (numberOfStarsToClick != 0) {
                stars.get(numberOfStarsToClick).click();
                --numberOfStarsToClick;
            }

    }

    public void pressLoginButton(){
        logInButton.click();
    }

    public int getRows() {
       return cryptoCurrenciesTable.findElements(By.tagName("tr")).size();
    }

    public void mouseHoverAvatarImage()
    {
        //Dragged and dropped.
        actions.moveToElement(avatarImage).build().perform();
    }

    public void openWatchListToNewTab()
    {
        actions.keyDown(Keys.LEFT_CONTROL)
                .click(watchList)
                .keyUp(Keys.LEFT_CONTROL)
                .build()
                .perform();
    }
}