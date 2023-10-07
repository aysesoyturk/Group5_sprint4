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

}
