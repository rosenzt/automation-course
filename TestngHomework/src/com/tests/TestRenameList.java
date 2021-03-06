package com.tests;

import com.pageobjects.TaskListPage;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.sql.Timestamp;

public class TestRenameList extends BaseTest {

    private Timestamp timestamp = new Timestamp(System.currentTimeMillis());
    private String newListName = Long.toString(timestamp.getTime());

    @Test
    public void renameList() {
        TaskListPage taskListPage = new TaskListPage(driver);
        Assert.assertTrue(taskListPage.renameList(newListName));
    }
}
