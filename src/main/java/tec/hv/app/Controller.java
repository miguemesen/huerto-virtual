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

import java.util.ArrayList;
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

    ArrayList<PlantCreator> plantas;

    public void setPlantas(ArrayList<PlantCreator> plantas) {
        this.plantas = plantas;
    }

    // Puntaje
    public Label scoreLabel;

    public void bajarPuntos(int puntosPorBajar) {
        System.out.println("Entra");
        int puntaje = Integer.parseInt(scoreLabel.getText());
        int nuevoPuntaje = puntaje-puntosPorBajar;
        scoreLabel.setText(String.valueOf(nuevoPuntaje));
    }


    // METODOS PLANTA UNO
    
    public void echarAgua_PLANTA_UNO(ActionEvent actionEvent) {
        alertaAgua_PLANTA_UNO.setVisible(false);
        plantas.get(0).regar(true);
    }
    
    public void quitarPlaga_PLANTA_UNO(ActionEvent actionEvent) {
        insecto1_PLANTA_UNO.setVisible(false);
        insecto2_PLANTA_UNO.setVisible(false);
        insecto3_PLANTA_UNO.setVisible(false);
        alertaPlaga_PLANTA_UNO.setVisible(false);
        plantas.get(0).eliminarPlaga(true);
    }

    public void echarAbono_PLANTA_UNO(ActionEvent actionEvent) {
        alertaAbono_PLANTA_UNO.setVisible(false);
        plantas.get(0).abonar(true);
    }

    public void cosechar_PLANTA_UNO(ActionEvent actionEvent) {
        orchid1_PLANTA_UNO.setVisible(false);
        orchid2_PLANTA_UNO.setVisible(false);
        orchid3_PLANTA_UNO.setVisible(false);
        tomato1_PLANTA_UNO.setVisible(false);
        tomato2_PLANTA_UNO.setVisible(false);
        tomato3_PLANTA_UNO.setVisible(false);
        alertaCosecha_PLANTA_UNO.setVisible(false);
        plantas.get(0).cosechar(true);
    }

    public void activarPlaga_PLANTA_UNO() {
        insecto1_PLANTA_UNO.setVisible(true);
        insecto2_PLANTA_UNO.setVisible(true);
        insecto3_PLANTA_UNO.setVisible(true);
        alertaPlaga_PLANTA_UNO.setVisible(true);
    }




    // METODOS PLANTA DOS

    public void echarAgua_PLANTA_DOS(ActionEvent actionEvent) {
        alertaAgua_PLANTA_DOS.setVisible(false);
        plantas.get(1).regar(true);
    }

    public void quitarPlaga_PLANTA_DOS(ActionEvent actionEvent) {
        
    	insecto1_PLANTA_DOS.setVisible(false);
        insecto2_PLANTA_DOS.setVisible(false);
        insecto3_PLANTA_DOS.setVisible(false);
        alertaPlaga_PLANTA_DOS.setVisible(false);
        plantas.get(1).eliminarPlaga(true);
        
    }

    public void echarAbono_PLANTA_DOS(ActionEvent actionEvent) {
        alertaAbono_PLANTA_DOS.setVisible(false);
        plantas.get(1).abonar(true);
    }

    public void cosechar_PLANTA_DOS(ActionEvent actionEvent) {
        orchid1_PLANTA_DOS.setVisible(false);
        orchid2_PLANTA_DOS.setVisible(false);
        orchid3_PLANTA_DOS.setVisible(false);
        tomato1_PLANTA_DOS.setVisible(false);
        tomato2_PLANTA_DOS.setVisible(false);
        tomato3_PLANTA_DOS.setVisible(false);
        alertaCosecha_PLANTA_DOS.setVisible(false);
        plantas.get(1).cosechar(true);
    }

    public void activarPlaga_PLANTA_DOS() {
        insecto1_PLANTA_DOS.setVisible(true);
        insecto2_PLANTA_DOS.setVisible(true);
        insecto3_PLANTA_DOS.setVisible(true);
        alertaPlaga_PLANTA_DOS.setVisible(true);
    }





    // METODOS PLANTA TRES
    public void echarAgua_PLANTA_TRES(ActionEvent actionEvent) {
        alertaAgua_PLANTA_TRES.setVisible(false);
        plantas.get(2).regar(true);
    }

    public void quitarPlaga_PLANTA_TRES(ActionEvent actionEvent) {
        insecto1_PLANTA_TRES.setVisible(false);
        insecto2_PLANTA_TRES.setVisible(false);
        insecto3_PLANTA_TRES.setVisible(false);
        alertaPlaga_PLANTA_TRES.setVisible(false);
        plantas.get(2).eliminarPlaga(true);
    }

    public void echarAbono_PLANTA_TRES(ActionEvent actionEvent) {
        alertaAbono_PLANTA_TRES.setVisible(false);
        plantas.get(2).abonar(true);
    }

    public void cosechar_PLANTA_TRES(ActionEvent actionEvent) {
        orchid1_PLANTA_TRES.setVisible(false);
        orchid2_PLANTA_TRES.setVisible(false);
        orchid3_PLANTA_TRES.setVisible(false);
        tomato1_PLANTA_TRES.setVisible(false);
        tomato2_PLANTA_TRES.setVisible(false);
        tomato3_PLANTA_TRES.setVisible(false);
        alertaCosecha_PLANTA_TRES.setVisible(false);
        plantas.get(2).cosechar(true);
    }

    public void activarPlaga_PLANTA_TRES() {
        insecto1_PLANTA_TRES.setVisible(true);
        insecto2_PLANTA_TRES.setVisible(true);
        insecto3_PLANTA_TRES.setVisible(true);
        alertaPlaga_PLANTA_TRES.setVisible(true);
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

    public void alertaAbono(int posicion){
        if (posicion == 0){
            alertaAbono_PLANTA_UNO.setVisible(true);
        }
        if (posicion == 1){
            alertaAbono_PLANTA_DOS.setVisible(true);
        }
        if (posicion == 2){
            alertaAbono_PLANTA_TRES.setVisible(true);
        }
    }

    public void alertaRiego(int posicion){
        if (posicion == 0){
            alertaAgua_PLANTA_UNO.setVisible(true);
        }
        if (posicion == 1){
            alertaAgua_PLANTA_DOS.setVisible(true);
        }
        if (posicion == 2){
            alertaAgua_PLANTA_TRES.setVisible(true);
        }
    }


    // Muestra la alerta de cosecha y sus respectivos frutos
   public void mostrarCosecha(int poscion, String tipo){
	  
		System.out.println(poscion+" "+tipo);
       
	   switch (poscion){
	   			
            case 0: // Posicion 1
                if (tipo.equals("Ornamental")){ // Orquidea
                	orchid1_PLANTA_UNO.setVisible(true);
                    orchid2_PLANTA_UNO.setVisible(true);
                    orchid3_PLANTA_UNO.setVisible(true);
                    alertaCosecha_PLANTA_UNO.setVisible(true);
                }
                
                if (tipo.equals("CicloLargo")){ // Tomate
                    tomato1_PLANTA_UNO.setVisible(true);
                    tomato2_PLANTA_UNO.setVisible(true);
                    tomato3_PLANTA_UNO.setVisible(true);
                    alertaCosecha_PLANTA_UNO.setVisible(true);
                }
                
                if (tipo.equals("CicloCorto")){ // Brocoli
                	alertaCosecha_PLANTA_UNO.setVisible(true);
                }
                
                break;

            case 1: // Posicion 2
                if (tipo.equals("Ornamental")){ // Orquidea
                    orchid1_PLANTA_DOS.setVisible(true);
                    orchid2_PLANTA_DOS.setVisible(true);
                    orchid3_PLANTA_DOS.setVisible(true);
                    alertaCosecha_PLANTA_DOS.setVisible(true);
                }
                if (tipo.equals("CicloLargo")){ // Tomate
                    tomato1_PLANTA_DOS.setVisible(true);
                    tomato2_PLANTA_DOS.setVisible(true);
                    tomato3_PLANTA_DOS.setVisible(true);
                    alertaCosecha_PLANTA_DOS.setVisible(true);
                }
                if (tipo.equals("CicloCorto")){ // Brocoli
                    alertaCosecha_PLANTA_DOS.setVisible(true);
                }
                break;

            case 2: // Posicion 3
                if (tipo == "Ornamental"){ // Orquidea
                    orchid1_PLANTA_TRES.setVisible(true);
                    orchid2_PLANTA_TRES.setVisible(true);
                    orchid3_PLANTA_TRES.setVisible(true);
                    alertaCosecha_PLANTA_TRES.setVisible(true);
                }
                if (tipo.equals("CicloLargo")){ // Tomate
                	
                    tomato1_PLANTA_TRES.setVisible(true);
                    tomato2_PLANTA_TRES.setVisible(true);
                    tomato3_PLANTA_TRES.setVisible(true);
                    alertaCosecha_PLANTA_TRES.setVisible(true);
                }
                if (tipo.equals("CicloCorto")){ // Brocoli
                    alertaCosecha_PLANTA_TRES.setVisible(true);
                }
                break;
        }
    }




}
