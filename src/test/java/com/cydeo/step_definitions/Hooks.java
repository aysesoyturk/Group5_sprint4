package com.cydeo.step_definitions;

import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import org.junit.After;
import org.junit.Before;

public class Hooks {
    @Before
    public void setup(){
        Driver.getDriver().get(ConfigurationReader.getProperty("environment"));

    }
    @After
    public void teardown(){
        Driver.closeDriver();
    }

}
