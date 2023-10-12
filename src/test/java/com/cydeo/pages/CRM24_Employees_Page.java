package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CRM24_Employees_Page {

    public CRM24_Employees_Page(){

        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//*[@id=\"bx_left_menu_menu_company\"]/a/span")
    public WebElement employeesBtn;

    @FindBy(id = "pagetitle")
    public WebElement companyStructureMessage;

    @FindBy(xpath = "//*[@id=\"top_menu_id_company_1210526945\"]/a/span[2]/span[2]")
    public WebElement staffChangesBtn;

    @FindBy(id = "pagetitle")
    public WebElement StaffChangesMessage;

    @FindBy(xpath = "//a[text()='Send message']")
    public WebElement sendMessageBtn;

    @FindBy(xpath = "//*[@class='bx-messenger-input-search-create']")
    public WebElement sendMessageIcon;

    @FindBy(xpath = "//span[text()='Person-to-person chat']")
    public WebElement personToPersonChat;

    @FindBy(xpath = "//span[text()='Private chat']")
    public WebElement privateChat;

    @FindBy(xpath = "//span[text()='Public chat']")
    public WebElement publicChat;

    @FindBy(className = "bx-im-fullscreen-popup-back-link")
    public WebElement xCloseBtn;

    @FindBy(xpath = "//div[@class='bx-desktop bx-im-fullscreen-popup bx-im-fullscreen-popup-transparent bx-im-fullscreen-closed']")
    public WebElement checkClosingPupUp;
}
