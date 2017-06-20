import javafx.application.Platform;
import javafx.embed.swing.JFXPanel;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;
import javafx.scene.*;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.event.ActionEvent;

public class Challenge4
{
    public static TextField textFieldRank;
    public static TextField textFieldUni;
    public static TextField textFieldCoun;
    
    public static void main(String args[]){
        launchFX();
    }
    
    private static void launchFX(){
        new JFXPanel();
        Platform.runLater(() -> initialiseGUI());
    }
    
    private static void initialiseGUI(){
        Stage stage = new Stage();
        stage.setTitle("Top Universities by Sam");
        stage.setResizable(false);
        Pane rootPane = new Pane();
        stage.setScene(new Scene(rootPane));
        stage.setWidth(1024);
        stage.setHeight(768);
        stage.setOnCloseRequest((WindowEvent we)->terminate());
        stage.show();

        Label label = new Label();
        label.setText("Enter details of top university");
        label.setLayoutX(50);
        label.setLayoutY(50);
        rootPane.getChildren().add(label);
        
        textFieldRank = new TextField();
        textFieldRank.setLayoutX(50);
        textFieldRank.setLayoutY(100);
        textFieldRank.setPrefWidth(400);
        textFieldRank.setPromptText("Enter Ranking");
        rootPane.getChildren().add(textFieldRank);
        
        textFieldUni = new TextField();
        textFieldUni.setLayoutX(50);
        textFieldUni.setLayoutY(150);
        textFieldUni.setPrefWidth(400);
        textFieldUni.setPromptText("Enter University");
        rootPane.getChildren().add(textFieldUni);
        
        textFieldCoun = new TextField();
        textFieldCoun.setLayoutX(50);
        textFieldCoun.setLayoutY(200);
        textFieldCoun.setPrefWidth(400);
        textFieldCoun.setPromptText("Enter Country");
        rootPane.getChildren().add(textFieldCoun);
        
        Button btn = new Button();
        btn.setText("Enter");
        btn.setLayoutX(50);
        btn.setLayoutY(250);
        btn.setOnAction((ActionEvent ae) -> printMessage());
        rootPane.getChildren().add(btn);
    }
    
    private static void terminate(){
        System.out.println("bye, bye!");
        System.exit(0);
    }
    
    private static void printMessage(){
        String message = textFieldRank.getText()+", "+textFieldUni.getText()+", "+textFieldCoun.getText();
        System.out.println(message);
    }
}