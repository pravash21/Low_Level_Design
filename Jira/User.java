package com.Jira;

import com.Jira.model.Task;
import com.Jira.model.TaskStatus;
import com.Jira.model.TaskType;

import java.util.ArrayList;

public class User {
    private String name;
    private ArrayList<Task> taskList;
    private ArrayList<Sprint> sprintList;

    public User(String name) {
        this.name = name;
        taskList = new ArrayList<>();
        sprintList = new ArrayList<>();
    }
    public Task createTask(TaskType taskType) {
        Task task = new Task();
        task.setTaskType(taskType);
        task.setUser(this);
        taskList.add(task);
        return task;
    }

    public Task createTask(String subtract) {
        Task task = new Task();
        task.setTaskType(TaskType.STORY);
        task.setUser(this);
        task.setSubtract(subtract);
        taskList.add(task);
        return task;
    }

    public Sprint createSprint(int begin, int end, String name) {
        Sprint sprint = new Sprint(begin, end, name);
        sprintList.add(sprint);
        return sprint;
    }

    public boolean addToSprint(Sprint sprint, Task task) {
        if(sprintList.contains(sprint)) {
            sprint.addTask(task);
            return  true;
        }
        return false;
    }
    public boolean removeFromSprint(Sprint sprint, Task task) {
        if(sprintList.contains(sprint)) {
            ArrayList<Task> tasks = sprint.getTasks();
            if(tasks.contains(task)) {
                sprint.eraseTask(task);
            }
            return  true;
        }
        return false;
    }

    public void printAllTasks() {
        for(Task task: taskList) {
            System.out.println(this.name + " " + task.getId());
        }
    }

    public boolean changeStatus(Task task, TaskStatus taskStatus) {
        for(Task t: taskList)
        {
            if(t.getId() == task.getId())
            {
                t.setTaskStatus(taskStatus);
                return true;
            }
        }
        return false;
    }

}
