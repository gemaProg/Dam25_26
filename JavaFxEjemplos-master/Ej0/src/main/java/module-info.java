module com.example.ej0 {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;


    opens com.example.ej0 to javafx.fxml;
    exports com.example.ej0;
}