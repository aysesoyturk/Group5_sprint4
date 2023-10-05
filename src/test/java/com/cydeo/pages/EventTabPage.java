package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.junit.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EventTabPage {
    public EventTabPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//*[@id=\"feed-add-post-form-tab-calendar\"]/span")
    public WebElement eventTab;

    @FindBy(id ="event-remindercal_3Jcl" )
    public WebElement reminderCheckBox;

    @FindBy(id = "event-remind_countcal_3Jcl")
    public WebElement timeTextBox;

    @FindBy(id="event-remind_typecal_3Jcl")
    public WebElement timeTypeDropDown;

    @FindBy(id = "event-locationcal_3Jcl")
    public WebElement eventLocationDropDown;

    @FindBy(id = "feed-event-dest-add-link")
    public WebElement membersTypeLink;

    @FindBy(xpath = "//*[@id=\"calnAJEM3_last_UA\"]/div[3]/div")
    public WebElement addAllEmployee;

    @FindBy(xpath = "//*[@id=\"calnAJEM3_last_U491\"]/div[3]/div")
    public WebElement employeGerard;

    @FindBy(xpath = "//*[@id=\"calnAJEM3_last_DR229\"]/div[3]/div")
    public WebElement groupEmploee;

    @FindBy(xpath = "//*[@id=\"feed-cal-additional-show\"]/span[1]")
    public WebElement MoreLink;

    @FindBy(id = "bx-im-external-recent-list")
    public WebElement MoreList;

    @FindBy(id="blog-submit-button-save")
    public WebElement sendButton;

}
