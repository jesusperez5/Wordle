module com.odeene.trabajo {
    requires javafx.fxml;
    requires javafx.controls;


    opens com.odeene.trabajo to javafx.fxml;
    exports com.odeene.trabajo;
    exports com.odeene.trabajo.controller;
    opens com.odeene.trabajo.controller to javafx.fxml;
}