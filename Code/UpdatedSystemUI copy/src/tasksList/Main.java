package tasksList;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.embed.swing.JFXPanel;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;
import tableLayout.Tabledisplay;


public class Main extends Application {
    private static ListView<String> TaskList;
    //Task newTask = new Task("Clean table");
    //Task newTask2 = new Task("Table 2");
    //Task newTask3 = new Task("Table 3");
    //Task newTask4 = new Task("Table 4");
    TaskController controller = new TaskController();
    //User newUser = Tabledisplay.getUser();
    private Scene TaskListScene;
    private Button sendTask, moveTop, move, deleteTask, createTask;
    private TextField sendTaskText, moveText, createUserTask, TableNumber;
    private VBox mainVBox;
    private HBox ButtonsBox;
    public Stage mainStage;
    public Text titleText;
    public Image background;

    private BorderPane mainLayout;
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
        background = new Image("/TaskBackground.png");
        mainStage = primaryStage;
        mainStage.setTitle("Task List");
        TaskListScene = makeScene();
        mainStage.setScene(TaskListScene);
        Platform.setImplicitExit(false);
        mainStage.show();
        primaryStage.setOnCloseRequest(t -> {
            Platform.exit();
        });

        this.createTask.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Tabledisplay.newUser.userQueue.add(new Task("Table: " + TableNumber.getText() + "--" + createUserTask.getText()));
                Tabledisplay.newUser.userQueue.printQueue();
                Node temp = Tabledisplay.newUser.userQueue.head;
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
                Node temp = Tabledisplay.newUser.userQueue.head;

                if(temp != null && TaskList.getSelectionModel().isEmpty())
                {
                    System.out.println("hi");
                    controller.deleteTask(Tabledisplay.newUser);//,Tabledisplay.newUser.userQueue.head.singleTask);
                    temp = temp.next;
                }
                    //if (temp != null && temp.singleTask.getTaskCreator().equals(TaskList.getSelectionModel().getSelectedItem())) {
                      //  controller.deleteTask(newUser, newUser.userQueue.head.singleTask);
                   // }
                    while (temp != null && !TaskList.getSelectionModel().isEmpty()) {
                        if (temp.singleTask.getTaskCreator().equals(TaskList.getSelectionModel().getSelectedItem())) {
                            controller.deleteTask(Tabledisplay.newUser, temp.singleTask);
                            break;
                        }
                        temp = temp.next;
                    }


                Node temp2 = Tabledisplay.newUser.userQueue.head;
                TaskList.getItems().clear();
                while(temp2 != null)
                {
                    TaskList.getItems().add(temp2.singleTask.getTaskCreator());
                    temp2 = temp2.next;
                }
                Tabledisplay.newUser.userQueue.printQueue();
            }
        });
    }

    private Scene makeScene() {
        //newUser.userQueue.add(newTask);
        //newUser.userQueue.add(newTask2);
        //newUser.userQueue.add(newTask3);
        //newUser.userQueue.add(newTask4);
        mainLayout = new BorderPane();
        titleText = new Text(Tabledisplay.newUser.getUserName() + "'s Task List");
        titleText.setFont(Font.font("Tahoma", FontWeight.BOLD, 45));
        titleText.setFill(Color.ANTIQUEWHITE);
        TaskList = new ListView<String>();
        Tabledisplay.newUser.userQueue.printQueue();
        Node temp = Tabledisplay.newUser.userQueue.head;
        while (temp != null) {
            TaskList.getItems().add(temp.singleTask.getTaskCreator());
            temp = temp.next;
        }
        //TaskList.getItems().add(Integer.toString(newUser.userQueue.getLength()));
        TaskList.setEditable(false);
       // TaskList.setPrefSize(200,200);
        //TaskList.setPadding(new Insets(5,1,10,10));
        TaskList.setMaxWidth(450);
        createUserTask = new TextField();
        TableNumber = new TextField();
        createTask = new Button("New Task");
        createTask.setFont(Font.font("tahoma",FontWeight.BOLD,15));
        deleteTask = new Button("Delete");
        deleteTask.setFont(Font.font("tahoma",FontWeight.BOLD,15));
        ButtonsBox = new HBox(10);
        TableNumber.setPromptText("Table #");
        createUserTask.setPromptText("Task");
        ButtonsBox.getChildren().addAll(createTask,TableNumber,createUserTask, deleteTask);
        mainVBox = new VBox(50);
        mainVBox.getChildren().addAll(titleText,TaskList, ButtonsBox);
        mainVBox.setAlignment(Pos.CENTER);
        mainLayout.setCenter(mainVBox);
        BackgroundSize bgSize = new BackgroundSize(700, 700, false, false, false, false);
        BackgroundImage bgImage = new BackgroundImage(background, null, null, BackgroundPosition.CENTER, bgSize);
        mainLayout.setBackground(new Background(bgImage));
        return new Scene(mainLayout, 600, 600);

    }
}