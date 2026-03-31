package student_Forms;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
  import javafx.scene.Parent;
import javafx.scene.Scene;
     import javafx.stage.Stage;



       public class start extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
              public void start(Stage stg) throws Exception {
      
             FXMLLoader loader = new FXMLLoader(getClass().getResource("/student_management.fxml"));
        Parent rt = loader.load();
               stg.setTitle("Student Management System");
                stg.setScene(new Scene(rt, 600, 400));
            stg.show();
    }
}