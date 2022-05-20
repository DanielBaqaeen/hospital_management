module softwaredev {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens com.example.softwaredev to javafx.fxml;
    exports com.example.softwaredev;
}