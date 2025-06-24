package wholeApp.mainApp;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.util.Objects;

public class MainApp extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("/fxml/interface.fxml"))); // your FXML file
        primaryStage.setTitle("Weather Safety Advisor");
        primaryStage.setScene(new Scene(root, 600, 400)); // set size according to your layout
        primaryStage.show();
    }

    public static void main(String[] args)
    {
        WeatherDataUpdater.updateWeatherData();
        launch(args);
    }
}
