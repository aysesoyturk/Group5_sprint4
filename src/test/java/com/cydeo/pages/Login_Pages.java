package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Pages {
 public Login_Pages(){
     PageFactory.initElements(Driver.getDriver(), this);

    }

    @FindBy(xpath = "//*[@id='login-popup']/div[1]")
    public WebElement seeLoginPage;

    @FindBy(xpath = "//*[@name='USER_LOGIN']")
    public WebElement entersUsername;

    @FindBy(xpath = "//*[@name='USER_PASSWORD']")
    public WebElement entersPassword;

    @FindBy(xpath = "//*[@class='login-btn']")
    public WebElement loginButton;

    @FindBy(xpath = "//*[@id='pagetitle']")
    public WebElement ActivityStream;

    @FindBy(xpath = "//*[@id='user-block']")
    public WebElement userProfile;


    @FindBy(xpath = "//*[@id='popup-window-content-menu-popup-user-menu']/div/div/a[3]/span[2]")
    public WebElement logOut;


}

