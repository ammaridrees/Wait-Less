package tasksList;

public class Task {
    private static int count;
    private int taskID;
    private String taskCreator;
    private Float timeCreated;

    Task() {
        taskID = count;
        count++;
        taskCreator = "No Name";
    }

    Task(String name) {
        taskID = count;
        count++;
        taskCreator = name;
    }

    public int getTaskID() {
        return taskID;
    }

    public void setTaskID(int ID) {
        taskID = ID;
    }

    public String getTaskCreator() {
        return taskCreator;
    }

    public void setTaskCreator(String creator) {
        taskCreator = creator;
    }

    public Float getTimeCreated() {
        return timeCreated;
    }

    public void setTimeCreated(Float time) {
        timeCreated = time;
    }

}
