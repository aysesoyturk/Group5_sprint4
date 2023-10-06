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
    @FindBy(xpath = "//*[@id=\"destDepartmentTab_destination4148723\"]/text()")
    public WebElement employeDepartmentsBtn;
    @FindBy(xpath = "//*[@id=\"bx-lm-box-last-content\"]/table/tr/td/div[2]/div[2]/div[4]/a/span/div[1]")
    public WebElement employeDepartmentsAddBtn1;
    @FindBy(xpath = "//*[@id=\"bx-lm-box-last-content\"]/table/tr/td/div[2]/div[2]/div[96]/a/span/div[2]")
    public WebElement employeDepartmentsAddBtn2;
    @FindBy(xpath = "//*[@id=\"bx-lm-box-last-content\"]/table/tr/td/div[2]/div[2]/div[116]/a/span/div[2]")
    public WebElement employeDepartmentsAddBtn3;
    @FindBy(xpath = "//*[@id=\"bx-b-link-blogPostForm\"]/span")
    public WebElement linkIcon;
    @FindBy(xpath = "//*[@id=\"undefined\"]")
    public WebElement saveBtn;
    @FindBy(xpath = "//*[@id=\"bx-b-mention-blogPostForm\"]")
    public WebElement addMentinonIcon;
    @FindBy(xpath = "//*[@id=\"post-buttons-bottom\"]/span[7]")
    public WebElement recordVideoIcon;
    @FindBy(xpath = "//*[@id=\"popup-window-content-bx-popup-videomessage-popup\"]")
    public WebElement recordText;
    @FindBy(xpath = "//*[@id=\"bx-popup-videomessage-popup\"]/div[3]/span[1]")
    public WebElement allowBtn;
    @FindBy(xpath = "//*[@id=\"feed-add-post-content-important\"]/div/div/div/span[1]")
    public WebElement showBtn;
    @FindBy(xpath = "//*[@id=\"js-post-expire-date-wrapper\"]")
    public WebElement timeBtn;
    @FindBy(xpath = "//*[@id=\"lhe_button_title_blogPostForm\"]")
    public WebElement topicIcon;


}


