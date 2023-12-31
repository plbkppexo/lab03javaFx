module ku.cs {
    requires javafx.controls;
    requires javafx.fxml;
    requires bcrypt;

    opens ku.cs.lab03javafx to javafx.fxml;
    exports ku.cs.lab03javafx;
    exports ku.cs.controllers;
    opens ku.cs.controllers to javafx.fxml;
    exports ku.cs.models;
    opens ku.cs.models to javafx.base;
}