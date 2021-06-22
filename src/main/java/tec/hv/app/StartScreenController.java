package tec.hv.app;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.util.Objects;

public class StartScreenController {
    public Button startButton;

    public void empezarJuego(ActionEvent actionEvent) {
        try {
            Stage stage = (Stage) startButton.getScene().getWindow();
            stage.close();

            FXMLLoader loader = new FXMLLoader(getClass().getResource("/huerta.fxml"));
            Parent root = loader.load();


            Stage gameStage = new Stage();
            gameStage.setTitle("Huerta virtual");
            gameStage.setResizable(false);
            Scene scene = new Scene(root, 1136, 650);
            gameStage.setScene(scene);
            gameStage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
