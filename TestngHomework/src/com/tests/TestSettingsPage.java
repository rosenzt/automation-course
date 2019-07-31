package com.tests;

import com.pageobjects.SettingsPage;
import org.testng.annotations.Test;

import java.sql.Timestamp;

public class TestSettingsPage extends BaseTest {

    private Timestamp timestamp = new Timestamp(System.currentTimeMillis());
    private String newPageTitle = Long.toString(timestamp.getTime());

    @Test
    public void renamePageTitle(){
        SettingsPage settingsPage = new SettingsPage(driver);
        settingsPage.changePageTitle(newPageTitle);
    }

    @Test
    public void changeLanguage(){
        SettingsPage settingsPage = new SettingsPage(driver);
        settingsPage.changeLanguage("Russian");
    }
}
