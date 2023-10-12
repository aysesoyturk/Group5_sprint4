package com.cydeo.step_definitions;

import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ScrlTables {
    @Test
    public void tableScroll(){
        Driver.getDriver().get("https://datatables.net/examples/basic_init/scroll_y.html");
        BrowserUtils.waitFor(3);
        WebElement targetelement=Driver.getDriver().findElement(By.cssSelector("#example > tbody > tr:nth-child(35)"));
        Actions actions=new Actions(Driver.getDriver());

        actions.moveToElement(targetelement).click().perform();
    }
}
