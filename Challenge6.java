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
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Challenge6
{
    public static TextField textFieldRank; //Declares a text field under the identifier "textFieldRank"
    public static TextField textFieldUni; //Declares a text field under the identifier "textFieldUni"
    public static TextField textFieldCountry; //Declares a text field under the identifier "textFieldCountry"
    
    public static void main(String args[]){
        launchFX(); //Starts javarfx
    }
    
    private static void launchFX(){
        new JFXPanel();
        Platform.runLater(() -> initialiseGUI());
    }
    
    private static void initialiseGUI(){
        Stage stage = new Stage(); //Creates a new stage under the identifier "stage"
        stage.setTitle("Top Universities by Sam");
        stage.setResizable(false); //The stage size is set so it cannot be changed
        Pane rootPane = new Pane(); //Creates a new pane under the identifier "rootPane"
        stage.setScene(new Scene(rootPane)); //The pane is sets in the stage
        stage.setWidth(1024); 
        stage.setHeight(768); 
        stage.setOnCloseRequest((WindowEvent we)->terminate()); //If the GUI is closed then goes to the method terminate()
        stage.show();
        
        Image image = new Image("Pigeon.jpg"); //Creates a new image under the identifier "image", using the image "Pigeon.jpg"
        ImageView iv1 = new ImageView(); //Creates a new imageView under the identifier "iv1"
        iv1.setImage(image); //Sets the image of iv1 as the image the photo in image
        iv1.setLayoutX(180);
        iv1.setLayoutY(180);
        iv1.setFitWidth(500);
        iv1.setPreserveRatio(true);
        rootPane.getChildren().add(iv1);  //Adds the image to the stage
        
        Label label = new Label(); //Creates a new label under the identifier "label"
        label.setText("Enter details of top university");
        textFieldRank.setLayoutX(50);
        textFieldRank.setLayoutY(50);
        rootPane.getChildren().add(label); //Adds the label to the stage
        
        textFieldRank = new TextField(); //Creates a new text field under the identifier "textFieldRank"
        textFieldRank.setLayoutX(50);
        textFieldRank.setLayoutY(100);
        textFieldRank.setPrefWidth(400);
        textFieldRank.setPromptText("Enter Ranking");
        rootPane.getChildren().add(textFieldRank); //Adds the text field to the stage
        
        textFieldUni = new TextField(); //Creates a new text field under the identifier "textFieldUni"
        textFieldUni.setLayoutX(50);
        textFieldUni.setLayoutY(150);
        textFieldUni.setPrefWidth(400);
        textFieldUni.setPromptText("Enter University");
        rootPane.getChildren().add(textFieldUni); //Adds the text field to the stage
        
        textFieldCountry = new TextField(); //Creates a new text field under the identifier "textFieldCountry"
        textFieldCountry.setLayoutX(50); //Sets dimensions
        textFieldCountry.setLayoutY(200);
        textFieldCountry.setPrefWidth(400);
        textFieldCountry.setPromptText("Enter Country"); //Text appears in text field
        rootPane.getChildren().add(textFieldCountry); //Adds the text field to the stage
        
        Button btn = new Button();  //Creates a new button under the identifier "btn"
        btn.setText("Click Me!");
        btn.setLayoutX(50);
        btn.setLayoutY(250);
        btn.setOnAction((ActionEvent ae) -> printMessage()); //When button is clicked, goes to this class
        rootPane.getChildren().add(btn); //Adds the button to the stage
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