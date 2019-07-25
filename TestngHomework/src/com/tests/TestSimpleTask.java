package com.tests;

import com.pageobjects.TaskListPage;
import org.testng.annotations.Test;

import java.sql.Timestamp;

public class TestSimpleTask extends BaseTest{

    @Test
    void addSimpleTask() {
        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        String taskName = Long.toString(timestamp.getTime());

        TaskListPage taskListPage = new TaskListPage(driver);
        taskListPage.addSimpleTask(taskName);
    }

}
