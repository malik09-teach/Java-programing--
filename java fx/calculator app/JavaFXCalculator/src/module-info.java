module JavaFXCalculator {
    requires javafx.controls;
    requires javafx.fxml;
	requires javafx.graphics;

    opens application to javafx.fxml;
    exports application;
}
