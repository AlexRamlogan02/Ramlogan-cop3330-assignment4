module ucf.assignments.ramlogancop3330assignment {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires validatorfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires eu.hansolo.tilesfx;

    opens ucf.assignments.ramlogancop3330assignment4 to javafx.fxml;
    exports ucf.assignments.ramlogancop3330assignment4;
}