module es.liernisarraoa.dein_ejercicioj_lsj {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.ikonli.javafx;

    opens es.liernisarraoa.dein_ejercicioj_lsj to javafx.fxml;
    exports es.liernisarraoa.dein_ejercicioj_lsj;
    exports es.liernisarraoa.dein_ejercicioj_lsj.Controlador;
    opens es.liernisarraoa.dein_ejercicioj_lsj.Controlador to javafx.fxml;
}