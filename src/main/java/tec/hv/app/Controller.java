package tec.hv.app;

import javafx.event.ActionEvent;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;

public class Controller {
    public ImageView alertaCosecha;
    public ImageView orchid3;
    public ImageView plantaNormal;
    public ImageView orchid1;
    public ImageView orchid2;
    public ImageView tomato1;
    public ImageView tomato2;
    public ImageView insecto1;
    public ImageView insecto2;
    public ImageView insecto3;
    public ImageView alertaAgua;
    public ImageView alertaAbono;
    public ImageView alertaPlaga;
    public ImageView tomato3;

    public void echarAgua(ActionEvent actionEvent) {
        alertaAgua.setVisible(false);
    }

    public void quitarPlaga(ActionEvent actionEvent) {
        insecto1.setVisible(false);
        insecto2.setVisible(false);
        insecto3.setVisible(false);
        alertaPlaga.setVisible(false);
    }

    public void echarAbono(ActionEvent actionEvent) {
        alertaAbono.setVisible(false);
    }

    public void cosechar(ActionEvent actionEvent) {
        orchid1.setVisible(false);
        orchid2.setVisible(false);
        orchid3.setVisible(false);
        tomato1.setVisible(false);
        tomato2.setVisible(false);
        tomato3.setVisible(false);
        alertaCosecha.setVisible(false);
    }

    public void activarPlaga(ActionEvent actionEvent) {
        insecto1.setVisible(true);
        insecto2.setVisible(true);
        insecto3.setVisible(true);
        alertaPlaga.setVisible(true);
    }

    public void activarTomate(ActionEvent actionEvent) {
        tomato1.setVisible(true);
        tomato2.setVisible(true);
        tomato3.setVisible(true);
        alertaCosecha.setVisible(true);
    }

    public void activarOrquidea(ActionEvent actionEvent) {
        orchid1.setVisible(true);
        orchid2.setVisible(true);
        orchid3.setVisible(true);
        alertaCosecha.setVisible(true);
    }

    public void alertaPlaga(ActionEvent actionEvent) {
        alertaPlaga.setVisible(true);
    }

    public void alertaAbono(ActionEvent actionEvent) {
        alertaAbono.setVisible(true);
    }

    public void alertaCosecha(ActionEvent actionEvent) {
        alertaCosecha.setVisible(true);
    }

    public void alertaAgua(ActionEvent actionEvent) {
        alertaAgua.setVisible(true);
    }
}
