package tasksList;

public class User {
    static int countUsers = 0;
    Queue userQueue;
    private int userID;
    private String userPosition;
    private String userName;

    public User(String name) {
        userQueue = new Queue();
        userID = countUsers;
        countUsers++;
        userName = name;
        userPosition = "Waiter";
    }

    public User(Task newTask, String name) {
        userQueue = new Queue(newTask);
        userID = countUsers;
        countUsers++;
        userName = name;
        userPosition = "Waiter";
    }

    public int getUserID() {
        return this.userID;
    }

    public void setUserID(int ID) {
        this.userID = ID;
    }

    public String getUserPosition() {
        return this.userPosition;
    }

    public void setUserPosition(String position) {
        this.userPosition = position;
    }

    public String getUserName() {
        return this.userName;
    }

    public void setUserName(String name) {
        this.userName = name;
    }
}
