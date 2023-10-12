package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class EmployeePage extends BasePage{

    public EmployeePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy (xpath = "//*[@class='webform-small-button-text']")
    public WebElement addDepartment;

    @FindBy (xpath = "//*[@id='NAME']")
    public WebElement departmentName;

    @FindBy (xpath= "//a[@title='Automation']")
    public WebElement departmentsTable;

    @FindBy (xpath = "//*[@class='popup-window-button popup-window-button-accept']")
    public WebElement addButton;

    @FindBy (xpath = "//*[@name='company_search_FIO']")
    public WebElement searchBox;

    @FindBy (xpath = "//a[.='adam adam']")
    public WebElement employeeName;

    @FindBy (css = ".employee-name")
    public List<WebElement> employeeNames;

    @FindBy (xpath = "(//span[normalize-space()='More...'])[2]")
    public WebElement more;

    @FindBy (xpath = "//*[@class='menu-popup-item-text']")
    public WebElement exportToExcell;

    @FindBy (xpath = "//*[@class='webform-small-button-text']/..")
    public WebElement messageButton;

    @FindBy (xpath = "//*[@class='bx-messenger-textarea-input']")
    public WebElement writeMessage;

    @FindBy (xpath = "//span[.='hello']")
    public WebElement message;

    @FindBy (xpath = "(//div[@class='bx-user-name'])[1]//a")
    public WebElement oneOfTheEmployee;





    public static WebElement getSubModule(String subModule){

        String locator="(//span[normalize-space()='"+subModule+"'])[2]";
        WebElement element = Driver.getDriver().findElement(By.xpath(locator));
        return element;
    }

    public static void clickMethod(String method){

        String locator="(//span[normalize-space()='"+method+"'])";
        Driver.getDriver().findElement(By.xpath(locator)).click();

    }

    //a[.='B']
    public static void clickLetter(String letter){

        String locator="//a[.='"+letter+"']";
        Driver.getDriver().findElement(By.xpath(locator)).click();

    }

}
