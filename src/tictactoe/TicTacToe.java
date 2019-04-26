
package tictactoe;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ToggleButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.image.Image;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author Muamer Dzanko
 */
public class TicTacToe extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        VBox root = new VBox(10);
        String playerString= new String();
        
        GridPane gridPane = new GridPane();
        root.setAlignment(Pos.CENTER);
        
        Image image;
        image = new Image(getClass().getResourceAsStream("Null.png"));
        
        ToggleGroup toggleGroup=new ToggleGroup();
        
        ToggleButton tb1 = new ToggleButton();
        ToggleButton tb2 = new ToggleButton();
        ToggleButton tb3 = new ToggleButton();
        ToggleButton tb4 = new ToggleButton();
        ToggleButton tb5 = new ToggleButton();
        ToggleButton tb6 = new ToggleButton();
        ToggleButton tb7 = new ToggleButton();
        ToggleButton tb8 = new ToggleButton();
        ToggleButton tb9 = new ToggleButton();
        
        
        
        
        
        gridPane.setAlignment(Pos.CENTER);
        gridPane.setGridLinesVisible(true);
        gridPane.addRow(0, tb1,tb2,tb3);
        gridPane.addRow(1, tb4,tb5,tb6);
        gridPane.addRow(2, tb7,tb8,tb9);
        gridPane.setVgap(1);
        gridPane.setHgap(1);
        gridPane.setMinSize(300, 300);
        gridPane.setMaxSize(300, 300);
        
        Label player = new Label(playerString);
        root.getChildren().addAll(player,gridPane);
        
        player.setId(playerString);
        
        Scene scene = new Scene(root);
        scene.getStylesheets().add(getClass().getResource("CssFile.css").toExternalForm());
        primaryStage.setScene(scene);
        primaryStage.setTitle("X i Ox igra");
        primaryStage.show();
        

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
