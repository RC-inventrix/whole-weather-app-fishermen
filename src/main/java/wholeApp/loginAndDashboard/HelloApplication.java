package wholeApp.loginAndDashboard;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("/fishermate/Login.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 600, 400);
        //scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());

        String css = this.getClass().getResource("/fishermate/application.css").toExternalForm();
        scene.getStylesheets().add(css);
        stage.initStyle(StageStyle.TRANSPARENT);
        stage.setTitle("Fisher Mate");
        stage.setResizable(false);
        stage.setScene(scene);
        stage.show();
    }



    public static void main(String[] args) {
        launch();
    }
}