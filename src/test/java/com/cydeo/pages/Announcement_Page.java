package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Announcement_Page {
    public Announcement_Page() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//*[@id=\"feed-add-post-form-link-text\"]")
    public WebElement moreBtn;
    @FindBy(xpath = "//*[@id=\"popup-window-content-menu-popup-feed-add-post-form-popup\"]/div/div/span[3]/span[2]")
    public WebElement announcementBtn;
    @FindBy(xpath = "//*[@id=\"feed-add-post-destination-container\"]")
    public WebElement toArea;

    @FindBy(xpath = "//*[@id='popup-window-content-BXSocNetLogDestination']/div/div[1]/a[2]")
    public WebElement employeDepartmentsBtn;
    @FindBy(xpath = "//*[@id=\"bx-lm-box-last-content\"]/table/tr/td/div[2]/div[2]/div[135]/a/div[2]")
    public WebElement itdepartment;
    @FindBy(xpath = "//*[@id=\"bx-lm-box-last-content\"]/table/tr/td/div[2]/div[2]/div[136]/a/span/div[2]")
    public WebElement itdepartmentBtn;
    @FindBy(xpath = "//*[@id=\"bx-lm-box-last-content\"]/table/tr/td/div[2]/div[2]/div[137]/a/div[2]")
    public WebElement managerdepartment;
    @FindBy(xpath = "//*[@id=\"bx-lm-box-last-content\"]/table/tr/td/div[2]/div[2]/div[138]/a/span/div[2]")
    public WebElement managerdepartmentBtn;
    @FindBy(xpath = "//*[@id=\"bx-b-link-blogPostForm\"]/span")
    public WebElement linkIcon;
    @FindBy(id = "linkidPostFormLHE_blogPostForm-text")
    public WebElement linkText;
    @FindBy(xpath = "//*[@id=\"linkidPostFormLHE_blogPostForm-href\"]")
    public WebElement linkUrl;
    @FindBy(xpath = "//*[@id=\"undefined\"]")
    public WebElement saveBtn;
    @FindBy(xpath = "/html/body/a")
    public WebElement saveBtnDisplay;
    @FindBy(xpath = "//*[@id=\"bx-b-mention-blogPostForm\"]")
    public WebElement addMentinonIcon;
    @FindBy(xpath = "//*[@id=\"feed-add-post-destination-container\"]")
    public WebElement addMentinon;
    @FindBy(xpath = "//*[@id=\"post-buttons-bottom\"]/span[7]")
    public WebElement recordVideoIcon;
    @FindBy(xpath = "//*[@id=\"popup-window-content-bx-popup-videomessage-popup\"]")
    public WebElement recordText;
    @FindBy(xpath = "//*[@id=\"bx-popup-videomessage-popup\"]/div[3]/span[1]")
    public WebElement allowBtn;
    @FindBy(xpath = "//*[@id=\"feed-add-post-content-important\"]/div/div/div/span[1]")
    public WebElement showBtn;
    @FindBy(xpath = "//*[@id=\"feed-add-post-content-important\"]/div/div/div/span[1]")
    public WebElement timeBtn;
    @FindBy(xpath = "//*[@id=\"js-post-expire-date-wrapper\"]/span[1]")
    public WebElement always;
    @FindBy(xpath = "//*[@id=\"popup-window-content-menu-popup-feed-add-post-form-popup42\"]/div/div/span[3]/span[2]")
    public WebElement twoDays;
    @FindBy(xpath = "//*[@id=\"lhe_button_title_blogPostForm\"]")
    public WebElement topicIcon;
    @FindBy(xpath = "//*[@id=\"POST_TITLE\"]")
    public WebElement topic;
    @FindBy(xpath = "//body[@style='min-height: 184px;']")
    public WebElement topicArea;
    @FindBy(xpath = "//*[@id=\"blog-submit-button-save\"]/text()")
    public WebElement send;

    @FindBy(xpath = "//*[@id=\"blog-submit-button-save\"]")
    public WebElement announcementSend;
}


