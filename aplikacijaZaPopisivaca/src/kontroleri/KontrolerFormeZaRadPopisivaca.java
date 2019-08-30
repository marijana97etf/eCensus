package kontroleri;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import main.Main;

import java.io.File;
import java.io.IOException;

public class KontrolerFormeZaRadPopisivaca {

    @FXML
    private void popisiStanovnikaButtonAction() {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("/forme" + File.separator + "FormaZaPopisivanjeStanovnika.fxml"));
            Main.primaryStage.setScene(new Scene(root));
            Main.primaryStage.setResizable(true);
            Main.primaryStage.setMaximized(true);
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }

    @FXML
    private void popisiDomacinstvoButtonAction() {
    }

    @FXML
    private void pregledajSacuvanePopisniceButtonAction() {
    }

    @FXML
    private void pregledajMapuPopisnogKrugaButtonAction() {
    }

    @FXML
    private void promijeniJezikButonAction() {
    }

    @FXML
    private void promijeniPismoButtonAction() {
    }
}
