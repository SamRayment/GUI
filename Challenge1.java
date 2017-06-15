import javafx.application.Platform;
import javafx.embed.swing.JFXPanel;
import javafx.stage.Stage;
import javafx.scene.*;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.event.ActionEvent;

public class Challenge1
{
    public static void main(String args[]){
        launchFX();
    }
    
    private static void launchFX(){
        new JFXPanel();
        Platform.runLater(() -> initialiseGUI());
    }
    
    private static void initialiseGUI(){
        Stage stage = new Stage ();
        stage.setTitle("My first GUI");
        stage.setResizable(false);
        Pane rootPane = new Pane();
        stage.setScene(new Scene(rootPane));
        stage.setWidth(1024);
        stage.setHeight(760);
        stage.show();
        
        Button btn = new Button();
        btn.setText("Try Me");
        btn.setLayoutX(490);
        btn.setLayoutY(340);
        btn.setOnAction((ActionEvent ae) -> printHello());
        rootPane.getChildren().add(btn);
    }
    
    private static void printHello(){
        System.out.println("You are cool!");
    }
    }

