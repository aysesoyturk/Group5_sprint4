package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InteractWith_Employees_Pages {

    public InteractWith_Employees_Pages(){
        PageFactory.initElements(Driver.getDriver(),this);
    }



    @FindBy(xpath = "//*[@id=\"pagetitle\"]")
    public WebElement pageLogo;

    @FindBy(xpath = "//*[@id=\"blog-post-addc-add-452\"]")
    public WebElement clickCommentButton;

/*
    @FindBy(xpath = "//html//iframe")
    public WebElement writeCommentMessage;


    @FindBy(xpath = "(//button[@class='ui-btn ui-btn-sm ui-btn-primary'])[1]")
    public WebElement clickSendButton;


 */


    @FindBy(xpath = "//div[@class='feed-post-informers-cont']/span")
    public WebElement clickLikeButton;


    @FindBy(xpath = "//div[@class='feed-post-informers-cont']/span")
    public WebElement postLiked;



    @FindBy(xpath = "//*[@id=\"log_entry_follow_1626\"]/a")
    public WebElement clickFollowButton;



    @FindBy(xpath = "//*[@id=\"log_entry_follow_1626\"]/a")
    public WebElement clickUnfollowButton;



    /////////////////////////////////
    @FindBy(className = "bx-ilike-text")
    public WebElement likeReviewers;

    @FindBy(className = "bx-ilike-text")
    public WebElement verifyLikeButtonClickable;

    @FindBy(id= "record-BLOG_452-213-actions-reply")
    public WebElement replyReviewers;



///////////////////




    @FindBy(xpath = "//*[@id=\"bpc_BLOG_452-212\"]")
    public WebElement clickReviewersProfileName;


    @FindBy(xpath = "//*[@id=\"content-table\"]/table/tbody/tr[1]/td/div/div[1]/div/div/div[1]/a")
    public WebElement visitReviewersProfile;







/*
 When Users write the comment message
    When Users click the SEND button
 */















}
