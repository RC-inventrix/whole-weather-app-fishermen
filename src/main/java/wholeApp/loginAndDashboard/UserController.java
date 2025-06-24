package wholeApp.loginAndDashboard;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.AnchorPane;
import javafx.scene.Node;
import java.io.IOException;
public class UserController {
    @FXML
    private AnchorPane interfaceContainer;

    @FXML
    public void initialize() {
        try {
            // Load interface.fxml
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/interface.fxml"));

            // Optional: Get the controller if you need to pass data to it
            // MainApp controller = loader.getController();

            Node loadedInterface = loader.load();

            // Add it to the container
            interfaceContainer.getChildren().setAll(loadedInterface);

            // Optionally bind size
            AnchorPane.setTopAnchor(loadedInterface, 0.0);
            AnchorPane.setBottomAnchor(loadedInterface, 0.0);
            AnchorPane.setLeftAnchor(loadedInterface, 0.0);
            AnchorPane.setRightAnchor(loadedInterface, 0.0);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
