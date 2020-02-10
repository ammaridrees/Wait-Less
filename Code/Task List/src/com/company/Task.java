package com.company;

public class Task {
    private int taskID;
    private String taskCreator;
    private Float timeCreated;

    Task()
    {
       taskID = 0;
    }
    public void setTaskID(int ID)
    {
        taskID = ID;
    }
    public int getTaskID()
    {
        return taskID;
    }
    public void setTaskCreator(String creator)
    {
        taskCreator = creator;
    }
    public String getTaskCreator()
    {
        return taskCreator;
    }

    public void setTimeCreated(Float time)
    {
        timeCreated = time;
    }
    public Float getTimeCreated()
    {
        return timeCreated;
    }

}
