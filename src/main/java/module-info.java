module com.example.codeupproject {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.codeupproject to javafx.fxml;
    exports com.example.codeupproject;
}