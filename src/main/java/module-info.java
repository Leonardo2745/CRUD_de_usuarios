module com.ladc.crud_de_usuarios {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;

    requires java.dotenv;
    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires net.synedra.validatorfx;
    requires org.kordamp.bootstrapfx.core;

    opens com.ladc.crud_de_usuarios to javafx.fxml;
    opens com.ladc.crud_de_usuarios.controller to javafx.fxml;
    opens com.ladc.crud_de_usuarios.model to javafx.base;

    exports com.ladc.crud_de_usuarios;
}