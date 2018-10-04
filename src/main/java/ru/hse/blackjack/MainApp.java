package ru.hse.blackjack;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import ru.hse.blackjack.controller.Controller;
import ru.hse.blackjack.core.BlackJack;

import static java.lang.Thread.sleep;

/**
 * This class runs the application.
 */
public class MainApp extends Application {
    private static String hostName;
    private static int port;

    /**
     * Runs the application on local server.
     *
     * @param args are the hostname of the local server and the port on which server will be running.
     */
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        String fxmlFile = "/fxml/main_stage.fxml";
        FXMLLoader loader = new FXMLLoader(getClass().getResource(fxmlFile));
        Parent root = loader.load();
        Controller controller = loader.getController();
        controller.setBlackJack(new BlackJack());
        stage.setTitle("FTP");
        stage.setScene(new Scene(root));
        stage.setMinHeight(350);
        stage.show();
    }
}