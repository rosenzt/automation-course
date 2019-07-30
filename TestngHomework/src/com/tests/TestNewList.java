package com.tests;

import com.pageobjects.TaskListPage;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.sql.Timestamp;

public class TestNewList extends BaseTest{

    private Timestamp timestamp = new Timestamp(System.currentTimeMillis());
    private String newListName = Long.toString(timestamp.getTime());

    @Test
    void testNewList() {
        TaskListPage taskListPage = new TaskListPage(driver);
        taskListPage.createNewList(newListName);
        taskListPage.selectList(newListName);
        taskListPage.addSimpleTask(Long.toString(timestamp.getTime()));
        sleep(1000);
        taskListPage.addSimpleTask(Long.toString(timestamp.getTime()));
        sleep(1000);
        Assert.assertEquals(taskListPage.howManyTasks(), 2);
    }
}
