package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Appreciation_Page {
    public Appreciation_Page() {
        PageFactory.initElements(Driver.getDriver(), this);

    }

    @FindBy(xpath = "//*[@id=\"feed-add-post-form-link-text\"]")
    public WebElement moreButton;


    @FindBy(xpath = "(//span[.='Appreciation'])[1]")
    public WebElement appreciatonBtn;

    @FindBy(xpath = "//span[@class='feed-add-post-form-but feed-add-file'][1]")
    public WebElement uploadIcon;
/*
    @FindBy(xpath = "//*[@id=\"diskuf-selectdialog-j6vqwIf\"]/div[2]/table/tbody/tr[3]/td[3]/span/span/span[1]/span/span/span[1]")
    public WebElement filesAndImagesUpload;

 */

    @FindBy(xpath = "//span[@title='Link']//i")
    public WebElement link_icon;

    @FindBy(id = "linkidPostFormLHE_blogPostForm-text")
    public WebElement writeText;

    @FindBy(id = "linkidPostFormLHE_blogPostForm-href")
    public WebElement insertLink;

    @FindBy(xpath = "(//input[@type='button'])[1]")
    public WebElement saveButton;

    @FindBy(xpath = "(//a[.='Google'])")
    public WebElement checkLink;

    @FindBy(xpath = "//span[@title='Quote text']")
    public WebElement quoteAdd;


    @FindBy(xpath = "//blockquote[@class='bxhtmled-quote']")
    public WebElement typeQuote;

    @FindBy(xpath = "//blockquote[@class='bxhtmled-quote']")
    public WebElement createdText;

    @FindBy(id = "bx-b-mention-blogPostForm")
    public WebElement mention_button;

    @FindBy(id = "destLastTab_mention66572396")
    public WebElement recentBtn;

    @FindBy(xpath = "//a[@class='bx-finder-box-tab bx-lm-tab-department']")
    public WebElement options;

    @FindBy(xpath = "//div[.=\"hr78@cybertekschool.com\"]")
    public WebElement addUser;

    @FindBy(xpath = "//span[@class='bxhtmled-metion']")
    public WebElement addedUser;

    @FindBy(id = "bx-b-tag-input-blogPostForm")
    public WebElement tagBtn;

    @FindBy(id = "TAGS_blogPostForm67abSn")
    public WebElement inputTagLine;

    @FindBy(xpath = "//span[@class='popup-window-button']")
    public WebElement clickAddTaggBtn;

    @FindBy(xpath = "//span[@class='feed-add-post-tags']")
    public WebElement addedTag;

    @FindBy(id = "blog-submit-button-save")
    public WebElement sendAppreciation;

    @FindBy(id = "feed-add-post-form-link-text")
    public WebElement assertSent;


}
