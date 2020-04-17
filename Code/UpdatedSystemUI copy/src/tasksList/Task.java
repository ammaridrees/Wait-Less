package tasksList;

public class Task {
    private static int count;
    private int taskID;
    private String taskCreator;
    private Float timeCreated;

    Task()
    {
       taskID = count;
       count++;
       taskCreator = "No Name";
    }
    Task(String name)
    {
        taskID = count;
        count++;
        taskCreator = name;
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