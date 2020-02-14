package application;



import javafx.application.Application;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.scene.text.TextFlow;
import javafx.stage.Stage;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ToolBar;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			final Button[] buttons = new Button[]{
		            new Button("T1"),
		            new Button("T2"),
		            new Button("T3"),
		            new Button("T4"),
		            new Button("T5"),
		            new Button("T6"),new Button("T7"),new Button("T8"),new Button("T9"),
		    };
			for (Button b : buttons) {
				//b.setStyle("-fx-background-color: #DEB887; ");
		         b.setStyle("-fx-background-radius: 0");
		        }
			final ToolBar toolbar = new ToolBar();
		    toolbar.getItems().addAll(buttons);

			Scene scene = new Scene(toolbar,400,400);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	public void createTables() {
		
	}
	public static void main(String[] args) {
		launch(args);
	}
}
/*public class Main extends Application{

    @Override
    public void start(Stage stage) {
        //AnchorPane root = new AnchorPane();
        final StackPane stack = new StackPane();
        Group root = new Group(stack);
        Scene scene = new Scene(root);
        stage.setScene(scene);

        int columns = 5, rows = 5 , horizontal = 50, vertical = 50;
        Rectangle rect = null;
        for(int i = 0; i < columns; ++i)
        {//Iterate through columns
            for(int j = 0; j < rows; ++j)
            {//Iterate through rows
//              Color choice = chooseColor(rectColors);
                //Method that chooses a color

                rect = new Rectangle(horizontal*j, vertical*i, horizontal, vertical);
                //Create a new rectangle(PosY,PosX,width,height)

                rect.setStroke(Color.RED);
                //Give rectangles an outline so I can see rectangles
                TextFlow flow = new TextFlow();
                final Text text = new Text("T1");
                final Text text2 = new Text("T2");
                text.setFill(Color.GREEN);
  		        text.setStyle("-fx-font-weight: bold");
  		        flow.getChildren().addAll(text, text2);
  		      
                root.getChildren().addAll(rect,flow);
                //Add Rectangle to board

            }
        }
        //scene.setRoot(root);
        //stage.show()
        stage.setScene(scene);
		stage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }
}*/
