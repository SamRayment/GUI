import javafx.application.Platform;
import javafx.embed.swing.JFXPanel;
import javafx.stage.Stage;
import javafx.scene.*;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.event.ActionEvent;

public class Challenge2
{
    public static TextField textFieldMessage;
    
    public static void main(String args[]){
        launchFX();
    }
    
    private static void launchFX(){
        new JFXPanel();
        Platform.runLater(() -> initialiseGUI());
    }
    
    private static void initialiseGUI(){
        Stage stage = new Stage();
        stage.setTitle("Hello World");
        stage.setResizable(false);
        Pane rootPane = new Pane();
        stage.setScene(new Scene(rootPane));
        stage.setWidth(1024);
        stage.setHeight(768);
        stage.show();
        
        textFieldMessage = new TextField();
        textFieldMessage.setLayoutX(400);
        textFieldMessage.setLayoutY(250);
        textFieldMessage.setPrefWidth(200);
        textFieldMessage.setPromptText("Enter your message");
        rootPane.getChildren().add(textFieldMessage);
        
        Button btn = new Button();
        btn.setText("Click Me!");
        btn.setLayoutX(350);
        btn.setLayoutY(50);
        btn.setOnAction((ActionEvent ae) -> printMessage());
        rootPane.getChildren().add(btn);
    }
    
    private static void printMessage(){
        String message = textFieldMessage.getText();
        System.out.println(message);
    }
}
