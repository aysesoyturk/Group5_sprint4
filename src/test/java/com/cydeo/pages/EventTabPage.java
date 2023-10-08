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
    @FindBy(xpath = "//*[@id=\"logo_24_text\"]/span[1]")
    public WebElement logo;

    @FindBy(xpath = "//*[@id=\"feed-add-post-form-tab-calendar\"]/span")
    public WebElement eventTab;

    @FindBy(id ="event-remindercal_3Jcl" )
    public WebElement reminderCheckBox;

    @FindBy(id = "event-remind_countcal_3Jcl")
    public WebElement timeTextBox;

    @FindBy(id="event-remind_typecal_3Jcl")
    public WebElement timeTypeDropDown;

    @FindBy(xpath = "//*[@id=\"event-locationcal_3Jcl\"]")
    public WebElement eventLocationDropDown;

    @FindBy(xpath = "//*[@id=\"feed-event-dest-cont\"]")
    public WebElement membersTypeLink;

    @FindBy(id="destDepartmentTab_calnAJEM3")
    public WebElement groupList;

    @FindBy(xpath = "//*[@id=\"bx-lm-box-last-content\"]/table/tr/td/div[2]/div[2]/div[1]/a/div[2]")
    public WebElement groupEmployeeList;

    @FindBy(xpath = "//*[@id=\"bx-lm-box-last-content\"]/table/tr/td/div[2]/div[2]/div[2]/a/span/div[2]")
    public WebElement realGroupAddAction;

    @FindBy(xpath = "//*[@id=\"BXSocNetLogDestination\"]/span")
    public WebElement closeButton;

    @FindBy(xpath = "//*[@id=\"calnAJEM3_last_UA\"]/div[3]/div")
    public WebElement addAllEmployee;

    @FindBy(xpath = "//*[@id=\"calnAJEM3_last_U491\"]/div[3]/div")
    public WebElement employeGerard;

    @FindBy(xpath = "//*[@id=\"calnAJEM3_last_DR229\"]/div[3]/div")
    public WebElement groupEmploee;

    @FindBy(xpath = "//*[@id=\"feed-cal-additional-show\"]/span[1]")
    public WebElement MoreLink;

    @FindBy(id = "feed-cal-additional-inner")
    public WebElement MoreList;

    @FindBy(id="blog-submit-button-save")
    public WebElement sendButton;

}
