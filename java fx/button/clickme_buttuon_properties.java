package buttons; 

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage; 
import javafx.scene.paint.Color;
public class clickme_buttuon_properties extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        Button bt = new Button("Click Me");
        
        bt.setTextFill(Color.DARKBLUE);
        
        FlowPane fp = new FlowPane();
        fp.getChildren().add(bt);
        
        Scene sc = new Scene(fp, 400, 400);

        stage.setTitle("Button App");
        stage.setScene(sc);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}




















/*
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Tooltip;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class clickme_buttuon_properties extends Application { // Fixed class name

    @Override
    public void start(Stage stage) {
        Button bt = new Button("_CLICK ME");
       FlowPane fp = new FlowPane();
        fp.getChildren().add(bt);
        Scene scene = new Scene( fp,400, 400);
      
    //   bt.setTextFill(javafx.scene.paint.Color.DARKGREY);
      
      // bt.setMnemonicParsing(true);
        
        
        Tooltip tp=new Tooltip("Click this Button to Save Data");
        bt.setTooltip(tp);
        
    //    bt.setStyle("-fx-border-color:yellow;-fx-background-color:light blue");
       // b.setStyle("-fx-border-color:yellow;-fx-background-color:red
      //  Alert a=new Alert(AlertType.INFORMATION,"Button is Clicked");
       
     //  bt.setOnAction(e->a.show());
        
        
        //  bt.setOnAction(e-> {
         //   System.out.println("Button clicked!");
           // bt.setText("Clicked!");
        //});
        // Load CSS if available
  /*      try {
            scene.getStylesheets().add(getClass().getResource("blank_border.css").toExternalForm());
        } catch (NullPointerException e) {
            System.out.println("CSS file missing. Running without styles.");
        }

        stage.setTitle("Button App");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}




package buttons;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class clickme_buttuon_properties extends Application { // Fixed class name (removed extra 't')

    @Override
    public void start(Stage stage) throws Exception{
        // Create the button
        Button bt = new Button("CLICK ME");
        
        // Create a layout (FlowPane) and add the button
        FlowPane fp = new FlowPane();
        fp.getChildren().add(bt);
        
        // Create the scene with the layout
        Scene scene = new Scene(fp, 400, 400); // Added dimensions to the scene
        
        // Load CSS (ensure the file exists in the correct directory)
        scene.getStylesheets().add(getClass().getResource("blank_border.css").toExternalForm());
        
        // Configure the stage
        stage.setTitle("Button App");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}





package buttons;
import javafx.scene.control.Button;
import javafx.application.Application;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;
import javafx.scene.*;


public class clickme_buttuon_properties extends Application  {

	@Override
	public void start(Stage stage) {
		
		
		BorderPane root = new BorderPane(); 
		Scene scene = new Scene(root,400,400);
		scene.getStylesheets().add(getClass().getResource("blank_border.css").toExternalForm());

		Button bt=new Button ("CLICK ME");
		FlowPane fp=new FlowPane();
		fp.getChildren().add(bt);
		Scene sc=new Scene (fp);
		stage.setScene(sc);
	 stage.show();
	
	}
	
	
	
	
	
	public static void main(String []args) {
		launch (args);
	}
}
*/