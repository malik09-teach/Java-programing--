package student_Forms;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
    import javafx.fxml.FXML;
import javafx.scene.control.*;

public class StudentManagementController {
               @FXML private TextField nameField;
     @FXML private ToggleGroup genderGroup;
         @FXML private ComboBox<String> departmentComboBox;
       @FXML private ListView<Student> studentListView;
 
              private final ObservableList<Student> students = FXCollections.observableArrayList();

       @FXML
              public void initialize() {
        departmentComboBox.getItems().addAll(
                "Computer Science",
                     "Electrical Engineering",
                "Mechanical Engineering",
                    "Civil Engineering",
                      "Chemical Engineering",
                "computer science",
                   "it",
                "cyber security",
                    "non"
        );
        studentListView.setItems(students);
    }

    @FXML
    private void handleSubmit() {
        if (nameField.getText().isBlank()) {
            showAlert("name not empty *");
            return;
        }
        if (genderGroup.getSelectedToggle() == null) {
            showAlert("gender");
            return;
        }
        if (departmentComboBox.getValue() == null) {
            showAlert(" department");
            return;
        }

                 
               String name = nameField.getText().trim();
           String gen = genderGroup.getSelectedToggle().getUserData().toString();
                            String dep = departmentComboBox.getValue();
  
        students.add(new Student(name, gen, dep));
                handleClear();
    }

    @FXML
    private void handleClear() {
         nameField.clear();
             genderGroup.selectToggle(null);
                      departmentComboBox.getSelectionModel().clearSelection();
    }

    private void showAlert(String message) {
                   Alert alert = new Alert(Alert.AlertType.WARNING);
        alert.setTitle("Input Validation");
             alert.setHeaderText(null);
                  alert.setContentText(message);
         alert.showAndWait();
    }
}