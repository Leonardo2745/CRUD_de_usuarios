module com.ladc.crud_de_usuarios {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires net.synedra.validatorfx;
    requires org.kordamp.bootstrapfx.core;

    opens com.ladc.crud_de_usuarios to javafx.fxml;
    exports com.ladc.crud_de_usuarios;
    exports com.ladc.crud_de_usuarios.controller;
    opens com.ladc.crud_de_usuarios.controller to javafx.fxml;
}