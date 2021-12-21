package com.example.selenium.pages;

import com.example.selenium.laucher.Hook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class LoginPage implements BasePage {

    @Autowired
    private Hook hook;

    @FindBy(how = How.XPATH, using = "//input[@type=\"email\"]")
    private WebElement emailInput;


    @FindBy(how = How.XPATH, using = "//input[@type=\"password\"]")
    private WebElement passwordInput;

    @FindBy(how = How.XPATH, using = "//div[@class=\"sc-1htht4q-0 lhjLrT\"]/div/button[text()=\"Log In\"]")
    private WebElement logInButton;

    @FindBy(how = How.XPATH, using = "//div[@_id=\"shim\"]")
    private WebElement puzzleDraggbleImage;

    @FindBy(how = How.XPATH, using = "//div[@_id=\"im\"]")
    private WebElement puzzleBackgroundImage;


    public void loginWithCredentials(String email,String password){

        emailInput.sendKeys(email);
        passwordInput.sendKeys(password);
        logInButton.click();
      //  solvePuzzle();
    }

    public void solvePuzzle(){
        Actions act=new Actions(hook.getDriver());
        //Dragged and dropped.
        act.dragAndDrop(puzzleDraggbleImage, puzzleBackgroundImage).build().perform();
    }
}