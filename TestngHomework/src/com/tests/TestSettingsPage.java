package com.tests;

import com.pageobjects.SettingsPage;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.sql.Timestamp;

public class TestSettingsPage extends BaseTest {

    private Timestamp timestamp = new Timestamp(System.currentTimeMillis());
    private String newPageTitle = Long.toString(timestamp.getTime());

    @Test
    public void test1renamePageTitle(){
        SettingsPage settingsPage = new SettingsPage(driver);
        Assert.assertTrue(settingsPage.changePageTitle(newPageTitle));
    }

    @Test
    public void test2changeLanguage(){
        SettingsPage settingsPage = new SettingsPage(driver);
        Assert.assertTrue(settingsPage.changeLanguage("Russian"));
    }
}
