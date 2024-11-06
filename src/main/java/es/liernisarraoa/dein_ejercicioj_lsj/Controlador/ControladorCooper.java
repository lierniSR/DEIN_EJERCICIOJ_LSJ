package es.liernisarraoa.dein_ejercicioj_lsj.Controlador;

import es.liernisarraoa.dein_ejercicioj_lsj.Cooper;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;


/**
 * Controlador de Cooper
 * En los controladores suele estar el funcionamiento de la aplicacion, es decir los metodos de escuchadores o listeners.
 *
 * @author Lierni
 * @version 1.0
 */
public class ControladorCooper {
    private final Image igLuz = new Image(String.valueOf(Cooper.class.getResource("Imagenes/lucesOff.png")));

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
    @FXML
    public ImageView coche;

    public void cambiarRojo(ActionEvent actionEvent) {
        coche.setImage(new Image(String.valueOf(Cooper.class.getResource("Imagenes/coches/miniBlazingRed.png"))));
    }

    public void cambiarAzulElectrico(ActionEvent actionEvent) {
        coche.setImage(new Image(String.valueOf(Cooper.class.getResource("Imagenes/coches/miniElectricBlue.png"))));
    }

    public void cambiarAzulLuxury(ActionEvent actionEvent) {
        coche.setImage(new Image(String.valueOf(Cooper.class.getResource("Imagenes/coches/miniLapisluxuryBlue.png"))));
    }

    public void cambiarNegro(ActionEvent actionEvent) {
        coche.setImage(new Image(String.valueOf(Cooper.class.getResource("Imagenes/coches/miniMidnightBlack.png"))));
    }

    public void cambiarGris(ActionEvent actionEvent) {
        coche.setImage(new Image(String.valueOf(Cooper.class.getResource("Imagenes/coches/miniMoonwalkGrey.png"))));
    }

    public void cambiarBlanco(ActionEvent actionEvent) {
        coche.setImage(new Image(String.valueOf(Cooper.class.getResource("Imagenes/coches/miniPepperWhite.png"))));
    }

    public void cambiarGrisThunder(ActionEvent actionEvent) {
        coche.setImage(new Image(String.valueOf(Cooper.class.getResource("Imagenes/coches/miniThunderGray.png"))));
    }

    public void cambiarNaranja(ActionEvent actionEvent) {
        coche.setImage(new Image(String.valueOf(Cooper.class.getResource("Imagenes/coches/miniVolcaninOrange.png"))));
    }

    /**
     * Este metodo sirve para que el boton de arriba a la izquierda encianda y apague las luces del coche
     *
     * @param actionEvent
     */
    public void cambiarLuces(ActionEvent actionEvent) {
        if (imagenLuz.getImage().getUrl().equals(igLuz.getUrl())){
            imagenLuz.setImage(new Image(String.valueOf(Cooper.class.getResource("Imagenes/lucesOn.png"))));
            luces.setImage(new Image(String.valueOf(Cooper.class.getResource("Imagenes/autoLuz.png"))));
        } else {
            imagenLuz.setImage(new Image((String.valueOf(Cooper.class.getResource("Imagenes/lucesOff.png")))));
            luces.setImage(null);
        }
    }
}