module org.example.workshopjavafxjdbc {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;
    requires java.desktop;

    opens org.example.workshopjavafxjdbc to javafx.fxml;
    exports org.example.workshopjavafxjdbc;
}