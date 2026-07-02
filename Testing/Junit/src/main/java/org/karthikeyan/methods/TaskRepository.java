package org.karthikeyan.methods;

import java.util.ArrayList;
import java.util.List;

public class TaskRepository {
    List<String> tasks;
    String task;
    TaskRepository(){
        tasks = new ArrayList<>();
    }

    public void setTask(String task){
        this.task = task;
    }

    public boolean addTask(String task){
        if(task == null || task.trim().isEmpty()) {
            throw new IllegalArgumentException("String should not be empty");
        }
        setTask(task);
        String existingTask = tasks.stream().filter(str -> str.equals(task)).findFirst().orElse(null);
        if(existingTask == null){
            tasks.add(task);
            System.out.println("Task Added Successfully");
            return true;
        }
        return false;
    }

    public boolean removeTask(String task){
        String existingTask = tasks.stream().filter(str -> str.equals(task)).findFirst().orElse(null);
        if(existingTask == null) return false;
        tasks.remove(existingTask);
        System.out.println("Task Removed Successfully");
        return true;
    }

    public int getTaskCount(){
        return tasks.size();
    }

    public void clearAll(){
        tasks.clear();
    }

//    public boolean compareing(String s2){
//        return this.task.equals(s2);
//    }
}
