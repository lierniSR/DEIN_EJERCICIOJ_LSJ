package es.liernisarraoa.dein_ejercicioj_lsj;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * Cooper
 * Esta aplicacion sirve para encender las luces de un coche y cambiar el color de ese coche
 * El coche es un MINI
 *
 * @author Lierni
 * @version 1.0
 */
public class Cooper extends Application {
    /**
     * Metodo que inicia la aplicación JavaFX.
     * Carga el archivo FXML, configura la escena y muestra la ventana principal.
     *
     * @param stage El escenario principal de la aplicación.
     * @throws IOException Si ocurre un error al cargar el archivo FXML.
     */
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Cooper.class.getResource("cooperLayout.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 600, 400);
        stage.setTitle("Cooper!");
        //Para poner el icono
        stage.getIcons().add(new Image(String.valueOf(Cooper.class.getResource("Imagenes/Cooper.png"))));
        //Para que no se pueda redimensionar
        stage.setResizable(false);
        stage.setScene(scene);
        stage.show();
    }

    /**
     * Metodo principal que lanza la aplicación JavaFX.
     *
     * @param args Argumentos de línea de comandos (no se utilizan en este caso).
     */
    public static void main(String[] args) {
        launch();
    }
}