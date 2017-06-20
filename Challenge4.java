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
    public static TextField textFieldCountry; 
    
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
        textFieldRank.setLayoutX(50);
        textFieldRank.setLayoutY(50);
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
        
        textFieldCountry = new TextField(); 
        textFieldCountry.setLayoutX(50); 
        textFieldCountry.setLayoutY(200);
        textFieldCountry.setPrefWidth(400);
        textFieldCountry.setPromptText("Enter Country"); 
        rootPane.getChildren().add(textFieldCountry); 
        
        Button btn = new Button(); 
        btn.setText("Click Me!");
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
        String message = textFieldRank.getText()+", "+textFieldUni.getText()+", "+textFieldCountry.getText();
        System.out.println(message);
    }
}
