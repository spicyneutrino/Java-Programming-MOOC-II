package buttonandtextfield;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class ButtonAndTextFieldApplication {

    public void start(Stage window) {

        FlowPane componentGroup = new FlowPane();

        Button button = new Button("this is a button");

        TextField field = new TextField();

        componentGroup.getChildren().add(button);
        componentGroup.getChildren().add(field);


        Scene view = new Scene(componentGroup);
        window.setScene(view);

         window.show();
    }

    public static void main(String[] args) {
        //launch this class itself
        launch(ButtonAndTextFieldApplication.class);
    }
}
