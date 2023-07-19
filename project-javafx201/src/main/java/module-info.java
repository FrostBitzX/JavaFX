module ku.cs.projectjavafx201 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ku.cs.projectjavafx201 to javafx.fxml;
    exports ku.cs.projectjavafx201;
    exports ku.cs.controllers;
    opens ku.cs.controllers to javafx.fxml;
}