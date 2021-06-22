package tec.hv.app;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.util.Objects;

public class Controller {

    // PLANTA UNO
    public ImageView alertaCosecha_PLANTA_UNO;
    public ImageView orchid3_PLANTA_UNO;
    public ImageView plantaNormal_PLANTA_UNO;
    public ImageView orchid1_PLANTA_UNO;
    public ImageView orchid2_PLANTA_UNO;
    public ImageView tomato1_PLANTA_UNO;
    public ImageView tomato2_PLANTA_UNO;
    public ImageView insecto1_PLANTA_UNO;
    public ImageView insecto2_PLANTA_UNO;
    public ImageView insecto3_PLANTA_UNO;
    public ImageView alertaAgua_PLANTA_UNO;
    public ImageView alertaAbono_PLANTA_UNO;
    public ImageView alertaPlaga_PLANTA_UNO;
    public ImageView tomato3_PLANTA_UNO;
    public ImageView plantaBrocoli_PLANTA_UNO;

    // PLANTA DOS
    public ImageView plantaNormal_PLANTA_DOS;
    public ImageView orchid1_PLANTA_DOS;
    public ImageView orchid2_PLANTA_DOS;
    public ImageView orchid3_PLANTA_DOS;
    public ImageView tomato1_PLANTA_DOS;
    public ImageView tomato2_PLANTA_DOS;
    public ImageView insecto1_PLANTA_DOS;
    public ImageView insecto2_PLANTA_DOS;
    public ImageView insecto3_PLANTA_DOS;
    public ImageView alertaAgua_PLANTA_DOS;
    public ImageView alertaAbono_PLANTA_DOS;
    public ImageView alertaCosecha_PLANTA_DOS;
    public ImageView alertaPlaga_PLANTA_DOS;
    public ImageView tomato3_PLANTA_DOS;
    public ImageView plantaBrocoli_PLANTA_DOS;


    // PLANTA TRES
    public ImageView plantaBrocoli_PLANTA_TRES;
    public ImageView plantaNormal_PLANTA_TRES;
    public ImageView orchid1_PLANTA_TRES;
    public ImageView orchid2_PLANTA_TRES;
    public ImageView orchid3_PLANTA_TRES;
    public ImageView tomato1_PLANTA_TRES;
    public ImageView tomato2_PLANTA_TRES;
    public ImageView insecto1_PLANTA_TRES;
    public ImageView insecto2_PLANTA_TRES;
    public ImageView insecto3_PLANTA_TRES;
    public ImageView alertaAgua_PLANTA_TRES;
    public ImageView alertaAbono_PLANTA_TRES;
    public ImageView alertaCosecha_PLANTA_TRES;
    public ImageView alertaPlaga_PLANTA_TRES;
    public ImageView tomato3_PLANTA_TRES;
    public Button gameOverButton;


    // Puntaje
    public Label scoreLabel;
    public Button bajarPuntosButton;

    public void bajarPuntos(ActionEvent actionEvent) {
        System.out.println("Entra");
        int puntaje = Integer.parseInt(scoreLabel.getText());
        int nuevoPuntaje = puntaje-15;
        scoreLabel.setText(String.valueOf(nuevoPuntaje));
    }


    // METODOS PLANTA UNO
   
    public void echarUno() {
    	 alertaAgua_PLANTA_UNO.setVisible(false);
    }
    
    public void echarAgua_PLANTA_UNO(ActionEvent actionEvent) {
        alertaAgua_PLANTA_UNO.setVisible(false);
    }
    
    public void quitarPlaga_PLANTA_UNO(ActionEvent actionEvent) {
        insecto1_PLANTA_UNO.setVisible(false);
        insecto2_PLANTA_UNO.setVisible(false);
        insecto3_PLANTA_UNO.setVisible(false);
        alertaPlaga_PLANTA_UNO.setVisible(false);

    }

    public void echarAbono_PLANTA_UNO(ActionEvent actionEvent) {
        alertaAbono_PLANTA_UNO.setVisible(false);
    }

    public void cosechar_PLANTA_UNO(ActionEvent actionEvent) {
        orchid1_PLANTA_UNO.setVisible(false);
        orchid2_PLANTA_UNO.setVisible(false);
        orchid3_PLANTA_UNO.setVisible(false);
        tomato1_PLANTA_UNO.setVisible(false);
        tomato2_PLANTA_UNO.setVisible(false);
        tomato3_PLANTA_UNO.setVisible(false);
        alertaCosecha_PLANTA_UNO.setVisible(false);
    }

    public void activarPlaga_PLANTA_UNO(ActionEvent actionEvent) {
        insecto1_PLANTA_UNO.setVisible(true);
        insecto2_PLANTA_UNO.setVisible(true);
        insecto3_PLANTA_UNO.setVisible(true);
        alertaPlaga_PLANTA_UNO.setVisible(true);
    }

    public void activarTomate_PLANTA_UNO(ActionEvent actionEvent) {
        tomato1_PLANTA_UNO.setVisible(true);
        tomato2_PLANTA_UNO.setVisible(true);
        tomato3_PLANTA_UNO.setVisible(true);
        alertaCosecha_PLANTA_UNO.setVisible(true);
    }

    public void activarOrquidea_PLANTA_UNO(ActionEvent actionEvent) {
        orchid1_PLANTA_UNO.setVisible(true);
        orchid2_PLANTA_UNO.setVisible(true);
        orchid3_PLANTA_UNO.setVisible(true);
        alertaCosecha_PLANTA_UNO.setVisible(true);
    }

    public void alertaPlaga_PLANTA_UNO(ActionEvent actionEvent) {
        alertaPlaga_PLANTA_UNO.setVisible(true);
    }

    public void alertaAbono_PLANTA_UNO(ActionEvent actionEvent) {
        alertaAbono_PLANTA_UNO.setVisible(true);
    }

    public void alertaCosecha_PLANTA_UNO(ActionEvent actionEvent) {
        alertaCosecha_PLANTA_UNO.setVisible(true);
    }

    public void alertaAgua_PLANTA_UNO(ActionEvent actionEvent) {
        alertaAgua_PLANTA_UNO.setVisible(true);
    }

    public void plantaBrocoli_PLANTA_UNO(ActionEvent actionEvent) {
        plantaBrocoli_PLANTA_UNO.setVisible(true);
        plantaNormal_PLANTA_UNO.setVisible(false);
    }

    public void plantaNormal_PLANTA_UNO(ActionEvent actionEvent) {
        plantaBrocoli_PLANTA_UNO.setVisible(false);
        plantaNormal_PLANTA_UNO.setVisible(true);
    }



    // METODOS PLANTA DOS

    public void echarAgua_PLANTA_DOS(ActionEvent actionEvent) {
        alertaAgua_PLANTA_DOS.setVisible(false);
    }

    public void quitarPlaga_PLANTA_DOS(ActionEvent actionEvent) {
        insecto1_PLANTA_DOS.setVisible(false);
        insecto2_PLANTA_DOS.setVisible(false);
        insecto3_PLANTA_DOS.setVisible(false);
        alertaPlaga_PLANTA_DOS.setVisible(false);
    }

    public void echarAbono_PLANTA_DOS(ActionEvent actionEvent) {
        alertaAbono_PLANTA_DOS.setVisible(false);
    }

    public void cosechar_PLANTA_DOS(ActionEvent actionEvent) {
        orchid1_PLANTA_DOS.setVisible(false);
        orchid2_PLANTA_DOS.setVisible(false);
        orchid3_PLANTA_DOS.setVisible(false);
        tomato1_PLANTA_DOS.setVisible(false);
        tomato2_PLANTA_DOS.setVisible(false);
        tomato3_PLANTA_DOS.setVisible(false);
        alertaCosecha_PLANTA_DOS.setVisible(false);
    }

    public void activarPlaga_PLANTA_DOS(ActionEvent actionEvent) {
        insecto1_PLANTA_DOS.setVisible(true);
        insecto2_PLANTA_DOS.setVisible(true);
        insecto3_PLANTA_DOS.setVisible(true);
        alertaPlaga_PLANTA_DOS.setVisible(true);
    }

    public void activarTomate_PLANTA_DOS(ActionEvent actionEvent) {
        tomato1_PLANTA_DOS.setVisible(true);
        tomato2_PLANTA_DOS.setVisible(true);
        tomato3_PLANTA_DOS.setVisible(true);
        alertaCosecha_PLANTA_DOS.setVisible(true);
    }

    public void activarOrquidea_PLANTA_DOS(ActionEvent actionEvent) {
        orchid1_PLANTA_DOS.setVisible(true);
        orchid2_PLANTA_DOS.setVisible(true);
        orchid3_PLANTA_DOS.setVisible(true);
        alertaCosecha_PLANTA_DOS.setVisible(true);
    }

    public void alertaPlaga_PLANTA_DOS(ActionEvent actionEvent) {
        alertaPlaga_PLANTA_DOS.setVisible(true);
    }

    public void alertaAbono_PLANTA_DOS(ActionEvent actionEvent) {
        alertaAbono_PLANTA_DOS.setVisible(true);
    }

    public void alertaCosecha_PLANTA_DOS(ActionEvent actionEvent) {
        alertaCosecha_PLANTA_DOS.setVisible(true);
    }

    public void alertaAgua_PLANTA_DOS(ActionEvent actionEvent) {
        alertaAgua_PLANTA_DOS.setVisible(true);
    }

    public void plantaBrocoli_PLANTA_DOS(ActionEvent actionEvent) {
        plantaBrocoli_PLANTA_DOS.setVisible(true);
        plantaNormal_PLANTA_DOS.setVisible(false);
    }

    public void plantaNormal_PLANTA_DOS(ActionEvent actionEvent) {
        plantaBrocoli_PLANTA_DOS.setVisible(false);
        plantaNormal_PLANTA_DOS.setVisible(true);
    }


    // METODOS PLANTA TRES
    public void echarAgua_PLANTA_TRES(ActionEvent actionEvent) {
        alertaAgua_PLANTA_TRES.setVisible(false);
    }

    public void quitarPlaga_PLANTA_TRES(ActionEvent actionEvent) {
        insecto1_PLANTA_TRES.setVisible(false);
        insecto2_PLANTA_TRES.setVisible(false);
        insecto3_PLANTA_TRES.setVisible(false);
        alertaPlaga_PLANTA_TRES.setVisible(false);
    }

    public void echarAbono_PLANTA_TRES(ActionEvent actionEvent) {
        alertaAbono_PLANTA_TRES.setVisible(false);
    }

    public void cosechar_PLANTA_TRES(ActionEvent actionEvent) {
        orchid1_PLANTA_TRES.setVisible(false);
        orchid2_PLANTA_TRES.setVisible(false);
        orchid3_PLANTA_TRES.setVisible(false);
        tomato1_PLANTA_TRES.setVisible(false);
        tomato2_PLANTA_TRES.setVisible(false);
        tomato3_PLANTA_TRES.setVisible(false);
        alertaCosecha_PLANTA_TRES.setVisible(false);
    }

    public void activarPlaga_PLANTA_TRES(ActionEvent actionEvent) {
        insecto1_PLANTA_TRES.setVisible(true);
        insecto2_PLANTA_TRES.setVisible(true);
        insecto3_PLANTA_TRES.setVisible(true);
        alertaPlaga_PLANTA_TRES.setVisible(true);
    }

    public void activarTomate_PLANTA_TRES(ActionEvent actionEvent) {
        tomato1_PLANTA_TRES.setVisible(true);
        tomato2_PLANTA_TRES.setVisible(true);
        tomato3_PLANTA_TRES.setVisible(true);
        alertaCosecha_PLANTA_TRES.setVisible(true);
    }

    public void activarOrquidea_PLANTA_TRES(ActionEvent actionEvent) {
        orchid1_PLANTA_TRES.setVisible(true);
        orchid2_PLANTA_TRES.setVisible(true);
        orchid3_PLANTA_TRES.setVisible(true);
        alertaCosecha_PLANTA_TRES.setVisible(true);
    }

    public void alertaPlaga_PLANTA_TRES(ActionEvent actionEvent) {
        alertaPlaga_PLANTA_TRES.setVisible(true);
    }

    public void alertaAbono_PLANTA_TRES(ActionEvent actionEvent) {
        alertaAbono_PLANTA_TRES.setVisible(true);
    }

    public void alertaCosecha_PLANTA_TRES(ActionEvent actionEvent) {
        alertaCosecha_PLANTA_TRES.setVisible(true);
    }

    public void alertaAgua_PLANTA_TRES(ActionEvent actionEvent) {
        alertaAgua_PLANTA_TRES.setVisible(true);
    }

    public void plantaBrocoli_PLANTA_TRES(ActionEvent actionEvent) {
        plantaBrocoli_PLANTA_TRES.setVisible(true);
        plantaNormal_PLANTA_TRES.setVisible(false);
    }

    public void plantaNormal_PLANTA_TRES(ActionEvent actionEvent) {
        plantaBrocoli_PLANTA_TRES.setVisible(false);
        plantaNormal_PLANTA_TRES.setVisible(true);
    }

    public void gameOver(ActionEvent actionEvent) {
        try {
            Stage stage = (Stage) gameOverButton.getScene().getWindow();
            stage.close();
            Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getClassLoader().getResource("startScreen.fxml")));
            Stage mainMenuStage = new Stage();
            mainMenuStage.setResizable(false);
            mainMenuStage.setTitle("Huerta virtual");
            Scene scene = new Scene(root, 713, 400);
            mainMenuStage.setScene(scene);
            mainMenuStage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
