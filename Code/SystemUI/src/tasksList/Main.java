package tasksList;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


public class Main extends Application {
        private Scene TaskListScene;
        private Button sendTask, moveTop, move, deleteTask, createTask;
        private TextField sendTaskText, moveText, createUserTask;
        private VBox mainVBox;
        private HBox ButtonsBox;
        private BorderPane mainLayout;

        Task newTask = new Task("Clean table");
        Task newTask2 = new Task("Table 2");
        Task newTask3 = new Task("Table 3");
        Task newTask4 = new Task("Table 4");
        TaskController controller = new TaskController();
        User newUser = new User("Maaz");

        private static ListView<String> TaskList;
    public static void main(String[] args) {


        User newUser2 = new User("Bryan");
       // User newUser = new User(newTask,"Maaz");
       // TaskController controller = new TaskController();
       // controller.sendTask(newTask, newUser, newUser2);
        //newUser.userQueue.add(newTask);
        launch(args);

        TaskList = new ListView<String>();
      //  TaskList.getItems().add(newUser.userQueue.head.singleTask.getTaskCreator());
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Task List");
        TaskListScene = makeScene();
        primaryStage.setScene(TaskListScene);
        primaryStage.show();

        this.createTask.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                newUser.userQueue.add(new Task(createUserTask.getText()));
                newUser.userQueue.printQueue();
                Node temp = newUser.userQueue.head;
              //  while(temp != null)
              //  {
                    TaskList.getItems().add(temp.tail.singleTask.getTaskCreator());
               //     temp = temp.next;
             //   }
            }
        });
        this.deleteTask.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Node temp = newUser.userQueue.head;
                while(temp != null)
                {
                    if(temp.singleTask.getTaskCreator().equals(TaskList.getSelectionModel().getSelectedItem()))
                    {
                        controller.deleteTask(newUser,temp.singleTask);

                    }
                    temp = temp.next;
                }
                Node temp2 = newUser.userQueue.head;
                TaskList.getItems().clear();
                while(temp2 != null)
                {
                    TaskList.getItems().add(temp2.singleTask.getTaskCreator());
                   temp2 = temp2.next;
                }
                newUser.userQueue.printQueue();
            }
        });
    }
    private Scene makeScene()
    {
        newUser.userQueue.add(newTask);
        newUser.userQueue.add(newTask2);
        newUser.userQueue.add(newTask3);
        newUser.userQueue.add(newTask4);
        TaskList = new ListView<String>();
        newUser.userQueue.printQueue();
        Node temp =  newUser.userQueue.head;
        while(temp != null)
        {
            TaskList.getItems().add(temp.singleTask.getTaskCreator());
            temp = temp.next;
        }
        //TaskList.getItems().add(Integer.toString(newUser.userQueue.getLength()));
        TaskList.setEditable(false);
        createUserTask = new TextField();
        createTask = new Button("New Task");
        deleteTask = new Button("Delete");
        ButtonsBox = new HBox(10);
        ButtonsBox.getChildren().addAll(createTask,createUserTask, deleteTask);
        mainVBox = new VBox(20);
        mainVBox.getChildren().addAll(TaskList,ButtonsBox);
        mainVBox.setAlignment(Pos.CENTER);
        return new Scene(mainVBox, 600, 600);
    }
}
