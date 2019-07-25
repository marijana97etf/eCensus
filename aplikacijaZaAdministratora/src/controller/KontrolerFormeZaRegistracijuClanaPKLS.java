package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import test.Pokreni_GUI_Aplikaciju;

import java.io.IOException;

public class KontrolerFormeZaRegistracijuClanaPKLS {
    public void back(ActionEvent actionEvent) throws IOException {
        Pokreni_GUI_Aplikaciju.getStage().setScene(new Scene(FXMLLoader.load(getClass().getResource("/view/FormaZaRadAdministratora.fxml"))));
    }

    @FXML
    TextField ime;
    @FXML
    TextField prezime;
    @FXML
    TextField jmbg;
    @FXML
    TextField username;
    @FXML
    PasswordField password;

    public void registruj(ActionEvent actionEvent) throws IOException {
        if("".equals(ime.getText())||
                "".equals(ime.getText())||
                "".equals(ime.getText())||
                "".equals(ime.getText())||
                "".equals(ime.getText()))
        {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setContentText("Unesite sve podatke u polja!");
            alert.showAndWait();
            return;
        }
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setContentText("Uspješno ste registrovali clana PKLS-a");
        ButtonType buttonType = alert.showAndWait().get();
        if(!buttonType.getText().equals("OK")) return;
        Parent root = FXMLLoader.load(getClass().getResource("/view/FormaZaRadAdministratora.fxml"));
        Pokreni_GUI_Aplikaciju.getStage().setScene(new Scene(root));
    }
}
