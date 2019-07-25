package com.tests;

import com.pageobjects.TaskListPage;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.sql.Timestamp;

public class TestSearchTask extends BaseTest{

    @Test
    void search() {
        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        String taskName = Long.toString(timestamp.getTime());

        TaskListPage taskListPage = new TaskListPage(driver);
        taskListPage.addSimpleTask(taskName);
        Assert.assertEquals(taskListPage.searchForTasks(taskName), 1);
    }
}
