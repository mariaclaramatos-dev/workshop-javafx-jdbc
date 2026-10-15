module org.example.workshopjavafxjdbc {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;
    requires java.desktop;

    opens org.example.workshopjavafxjdbc.gui to javafx.fxml;
    opens org.example.workshopjavafxjdbc to javafx.fxml;
    opens org.example.workshopjavafxjdbc.model.entities to javafx.base;

    exports org.example.workshopjavafxjdbc;
}