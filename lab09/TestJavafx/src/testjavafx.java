import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class testjavafx extends Application{
    Stage window;
    Scene scene1,scene2;

    @Override
    public void start(Stage primaryStage) {
        window = primaryStage;
        Label label = new Label("test javafx");
        Button button1 = new Button();
        Button button2 = new Button();
        button1.setText("sang trang 2");
        button2.setText("quay lại trang 1");
        button1.setOnAction(evt -> window.setScene(scene2));
        button2.setOnAction(evt -> window.setScene(scene1));
        HBox layout1 = new HBox(); 
        StackPane layout2 = new StackPane(); 
        layout1.getChildren().addAll(label,button1); 
        layout2.getChildren().add(button2); 
        scene1 = new Scene(layout1, 300, 100); 
        scene2 = new Scene(layout2, 300, 100); 
        window.setScene(scene1);
        window.setTitle("chuyển trang");
        window.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}