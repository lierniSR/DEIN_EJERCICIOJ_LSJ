package es.liernisarraoa.dein_ejercicioj_lsj.Controlador;

import es.liernisarraoa.dein_ejercicioj_lsj.Cooper;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;


public class ControladorCooper {
    private Image imagen = new Image(String.valueOf(Cooper.class.getResource("Imagenes/lucesOff.png")));

    @FXML
    public Button colorGris;
    @FXML
    public Button colorBlanco;
    @FXML
    public Button colorGrisThunder;
    @FXML
    public Button colorNaranja;
    @FXML
    public Button lucesBtn;
    @FXML
    public Button colorRojo;
    @FXML
    public Button azulElectrico;
    @FXML
    public Button azulLuxury;
    @FXML
    public Button colorNegro;
    @FXML
    public ImageView luces;
    @FXML
    public ImageView imagenLuz;
    @FXML
    public ImageView imagenNaranja;
    @FXML
    public ImageView imagenThunder;
    @FXML
    public ImageView imagenBlanco;
    @FXML
    public ImageView imagenGris;
    @FXML
    public ImageView imagenNegro;
    @FXML
    public ImageView imagenAzulLuxury;
    @FXML
    public ImageView imagenAzulElectrico;
    @FXML
    public ImageView imagenRojo;

    public void cambiarRojo(ActionEvent actionEvent) {
    }

    public void cambiarAzulElectrico(ActionEvent actionEvent) {
    }

    public void cambiarAzulLuxury(ActionEvent actionEvent) {
    }

    public void cambiarNegro(ActionEvent actionEvent) {
    }

    public void cambiarGris(ActionEvent actionEvent) {
    }

    public void cambiarBlanco(ActionEvent actionEvent) {
    }

    public void cambiarGrisThunder(ActionEvent actionEvent) {
    }

    public void cambiarNaranja(ActionEvent actionEvent) {
    }

    public void cambiarLuces(ActionEvent actionEvent) {
        if (imagenLuz.getImage().getUrl().equals(imagen.getUrl())){
            imagenLuz.setImage(new Image(String.valueOf(Cooper.class.getResource("Imagenes/lucesOn.png"))));
            luces.setImage(new Image(String.valueOf(Cooper.class.getResource("Imagenes/autoLuz.png"))));
        } else {
            imagenLuz.setImage(new Image((String.valueOf(Cooper.class.getResource("Imagenes/lucesOff.png")))));
            luces.setImage(null);
        }
    }
}