package buttonandlabel;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;


public class ButtonAndLabelApplication extends Application{


    public void start(Stage window) {
        Button button  = new Button("Button");
        FlowPane componentGroup = new FlowPane();

        Label text = new Label("text");

        componentGroup.getChildren().add(button);
        componentGroup.getChildren().add(text);

        Scene scene = new Scene(componentGroup);

        window.setScene(scene);
        window.show();
    }

    public static void main(String[] args) {
        //launch this class itself
        launch(ButtonAndLabelApplication.class);
    }

}
