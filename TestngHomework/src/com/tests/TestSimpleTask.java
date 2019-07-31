package com.tests;

import com.pageobjects.TaskListPage;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.sql.Timestamp;

public class TestSimpleTask extends BaseTest{

    @Test
    void AaddSimpleTask() {
        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        String taskName = Long.toString(timestamp.getTime());

        TaskListPage taskListPage = new TaskListPage(driver);
        taskListPage.addSimpleTask(taskName);
    }

    @Test
    void BaddAndRemoveTasks(){
        TaskListPage taskListPage = new TaskListPage(driver);
        Assert.assertTrue(taskListPage.addAndRemoveTasks(5));
    }

}
