package tasksList;

public class TaskController{

    public void sendTask(Task taskSend, User employee1, User employee2 )
    {
        employee2.userQueue.add(taskSend);
        deleteTask(employee1, taskSend);
    }
    public void deleteTask(User employee)
    {
        employee.userQueue.dequeue();
    }
    public void deleteTask(User employee,Task taskDelete )
    {
        employee.userQueue.dequeue(taskDelete);
    }
    public void moveTop(User employee, Task priority)
    {
        employee.userQueue.move(priority, 0);
    }
    public Task getTask(User employee, int taskID)
    {
        return new Task();
    }
    public void moveUp(User employee, Task moveTask, int move)
    {
        employee.userQueue.move(moveTask,move);

    }
    public void moveDown(User employee, Task moveTask, int move)
    {
        employee.userQueue.move(moveTask,move);
    }
}