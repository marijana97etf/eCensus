package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import test.Pokreni_GUI_Aplikaciju;

import java.io.IOException;

public class KontrolerFormeZaRadAdministratoraAgencije {

    public void Logout(ActionEvent actionEvent) throws IOException {
        Pokreni_GUI_Aplikaciju.getStage().setScene(new Scene(FXMLLoader.load(getClass().getResource("/view/FormaZaPrijavu.fxml"))));
    }

    public void registrujClanaPKLS(ActionEvent actionEvent) throws IOException {
        Pokreni_GUI_Aplikaciju.getStage().setScene(new Scene(FXMLLoader.load(getClass().getResource("/view/FormaZaRegistracijuClanaPKLS.fxml"))));
    }
}
