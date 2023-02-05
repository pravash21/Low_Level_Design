package com.Jira.model;

import com.Jira.User;

import java.util.ArrayList;

public class SubTask {
    private static int uniqueId = 1;
    private int id;
    private String subtract;
    User user;
    TaskType taskType;
    TaskStatus taskStatus;
    public SubTask() {
        this.id = uniqueId++;
        this.taskStatus = TaskStatus.OPEN;
    }

    public int getId() {
        return id;
    }

    public void setSubtract(String subtract) {
        this.subtract = subtract;
    }

    public void setSubTaskStatus(TaskStatus taskStatus) {
        this.taskStatus = taskStatus;
    }

    public void setSubTaskType(TaskType taskType) {
        this.taskType = taskType;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
