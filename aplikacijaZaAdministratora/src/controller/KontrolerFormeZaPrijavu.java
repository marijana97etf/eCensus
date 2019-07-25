package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.util.Pair;
import test.Pokreni_GUI_Aplikaciju;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class KontrolerFormeZaPrijavu implements Initializable {

    private Stage currentStage;

    @FXML
    TextField username;
    @FXML
    PasswordField password;

    public void login(ActionEvent actionEvent) throws IOException {


        currentStage = Pokreni_GUI_Aplikaciju.getStage();

        if(username.getText().equals("admin")&& password.getText().equals("admin"))
        {
            Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
            alert.setContentText("Uspješno ste se prijavili kao administrator.");
            ButtonType buttonType = alert.showAndWait().get();
            if(!buttonType.getText().equals("OK")) return;
            Parent root = FXMLLoader.load(getClass().getResource("/view/FormaZaRadAdministratora.fxml"));
            currentStage.setScene(new Scene(root));
        }
        else if(username.getText().equals("pkls") && password.getText().equals("pkls"))
        {
            // TODO: Forma za clana PKLS-a
        }
        else
        {
            Alert alert2 = new Alert(Alert.AlertType.ERROR);
            alert2.setContentText("Nepostojeci nalog, upišite važeće podatke.");
            alert2.show();
        }


    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}
