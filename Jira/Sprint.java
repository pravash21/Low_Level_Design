package com.Jira;

import com.Jira.model.Task;

import java.util.ArrayList;

public class Sprint {
    private int begin, end;
    private String name;
    private ArrayList<Task> tasks;

    public Sprint(int begin, int end, String name) {
        this.begin = begin;
        this.end = end;
        this.name = name;
        tasks  = new ArrayList<>();
    }

    public void addTask(Task task) {
        tasks.add(task);
    }


    void printDetails() {
        System.out.println("Sprint " + this.name +" begins at " + this.begin +" ends at " + this.end);
    }

	final ArrayList<Task> getTasks() {
        return tasks;
    }

    void eraseTask(Task task) {
        tasks.remove(task);
    }
}
