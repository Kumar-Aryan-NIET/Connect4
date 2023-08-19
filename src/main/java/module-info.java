module com.example.connect4 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.KumarAryan.connect4 to javafx.fxml;
    exports com.KumarAryan.connect4;
}