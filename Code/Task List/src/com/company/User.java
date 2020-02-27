package com.company;

public class User {
    Queue userQueue;
    static int countUsers = 0;
    private int userID;
    private String userPosition;
    private String userName;

    User(String name)
    {
        userQueue = new Queue();
        userID = countUsers;
        countUsers++;
        userName = name;
        userPosition = "Waiter";
    }
    User(Task newTask, String name)
    {
        userQueue = new Queue(newTask);
        userID = countUsers;
        countUsers++;
        userName = name;
        userPosition = "Waiter";
    }
    public int getUserID()
    {
        return this.userID;
    }
    public void setUserID(int ID)
    {
        this.userID = ID;
    }
    public String getUserPosition()
    {
        return this.userPosition;
    }
    public void setUserPosition(String position)
    {
        this.userPosition = position;
    }
    public String getUserName()
    {
        return this.userName;
    }
    public void setUserName(String name)
    {
        this.userName = name;
    }
}
