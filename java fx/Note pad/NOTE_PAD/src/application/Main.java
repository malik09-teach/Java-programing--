package application;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;


public class Main extends Application {
	
	
	 TextArea tx;
	 
	@Override
	public void start(Stage primaryStage) {
		try {
			
		    tx=new TextArea ();
			 tx.setPrefColumnCount(100);
			 tx.setPrefRowCount(50);
			 Button bt=new Button ();
			 bt.setText("save");
			FlowPane fp =new FlowPane (bt);
			
			 
	
			Scene scene = new Scene(fp,400,400);
			//scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
