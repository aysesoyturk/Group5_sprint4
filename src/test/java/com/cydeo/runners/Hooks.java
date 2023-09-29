package com.cydeo.runners;

import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
    @Before
    public void setup(){
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));

    }
    @After
    public void teardown(){
        Driver.closeDriver();
    }

}
