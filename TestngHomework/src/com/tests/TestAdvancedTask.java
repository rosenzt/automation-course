package com.tests;

import com.pageobjects.AdvancedTaskPage;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.sql.Timestamp;

public class TestAdvancedTask extends BaseTest{

    @Test
    void addAdvancedTask(){
        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        String taskName = Long.toString(timestamp.getTime());

        AdvancedTaskPage advancedTaskPage = new AdvancedTaskPage(driver);
        Assert.assertEquals(advancedTaskPage.addAdvancedTask("+1", "7/31/20", taskName, taskName, taskName), 1);
    }

}
