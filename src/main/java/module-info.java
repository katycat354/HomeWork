module com.example.part2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.part2 to javafx.fxml;
    exports com.example.part2;
}