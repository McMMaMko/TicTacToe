package tictactoe;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.beans.value.ObservableValue;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ToggleButton;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

/**
 *
 * @author Muamer Dzanko
 */
public class TicTacToe extends Application {

    //Label and player default start
    String playerString = "Player1";
    Label player = new Label(playerString);

    @Override
    public void start(Stage primaryStage) {
        //defining vbox and grid and button and od
        VBox root = new VBox(10);

        player.setId(playerString);
        GridPane gridPane = new GridPane();
        root.setAlignment(Pos.CENTER);

        Button bt1 = new Button("Reset");

        //Toggle button settings
        ToggleButton tb1 = new ToggleButton();
        ToggleButton tb2 = new ToggleButton();
        ToggleButton tb3 = new ToggleButton();
        ToggleButton tb4 = new ToggleButton();
        ToggleButton tb5 = new ToggleButton();
        ToggleButton tb6 = new ToggleButton();
        ToggleButton tb7 = new ToggleButton();
        ToggleButton tb8 = new ToggleButton();
        ToggleButton tb9 = new ToggleButton();

        //Setting tooglebutton ID's
        tb1.setId("0");
        tb2.setId("0");
        tb3.setId("0");
        tb4.setId("0");
        tb5.setId("0");
        tb6.setId("0");
        tb7.setId("0");
        tb8.setId("0");
        tb9.setId("0");

        

        //Grid pane settings
        gridPane.setAlignment(Pos.CENTER);
        gridPane.setGridLinesVisible(true);
        gridPane.addRow(0, tb1, tb2, tb3);
        gridPane.addRow(1, tb4, tb5, tb6);
        gridPane.addRow(2, tb7, tb8, tb9);
        gridPane.setVgap(1);
        gridPane.setHgap(1);
        gridPane.setMinSize(300, 300);
        gridPane.setMaxSize(300, 300);

        root.getChildren().addAll(player, gridPane, bt1);

        // On click listeners
        tb1.selectedProperty().addListener((ObservableValue<? extends Boolean> observable, Boolean oldValue, Boolean newValue) -> {
            playerString = checkPlayer(playerString, tb1);
            player.setText(playerString);
            player.setId(playerString);
            VictoryChecker(tb1, tb2, tb3, tb4, tb5, tb6, tb7, tb8, tb9, primaryStage);
        });

        tb2.selectedProperty().addListener((ObservableValue<? extends Boolean> observable, Boolean oldValue, Boolean newValue) -> {
            playerString = checkPlayer(playerString, tb2);
            player.setText(playerString);
            player.setId(playerString);
            VictoryChecker(tb1, tb2, tb3, tb4, tb5, tb6, tb7, tb8, tb9, primaryStage);
        });

        tb3.selectedProperty().addListener((ObservableValue<? extends Boolean> observable, Boolean oldValue, Boolean newValue) -> {
            playerString = checkPlayer(playerString, tb3);
            player.setText(playerString);
            player.setId(playerString);
            VictoryChecker(tb1, tb2, tb3, tb4, tb5, tb6, tb7, tb8, tb9, primaryStage);
        });

        tb4.selectedProperty().addListener((ObservableValue<? extends Boolean> observable, Boolean oldValue, Boolean newValue) -> {
            playerString = checkPlayer(playerString, tb4);
            player.setText(playerString);
            player.setId(playerString);
            VictoryChecker(tb1, tb2, tb3, tb4, tb5, tb6, tb7, tb8, tb9, primaryStage);
        });

        tb5.selectedProperty().addListener((ObservableValue<? extends Boolean> observable, Boolean oldValue, Boolean newValue) -> {
            playerString = checkPlayer(playerString, tb5);
            player.setText(playerString);
            player.setId(playerString);
            VictoryChecker(tb1, tb2, tb3, tb4, tb5, tb6, tb7, tb8, tb9, primaryStage);
        });

        tb6.selectedProperty().addListener((ObservableValue<? extends Boolean> observable, Boolean oldValue, Boolean newValue) -> {
            playerString = checkPlayer(playerString, tb6);
            player.setText(playerString);
            player.setId(playerString);
            VictoryChecker(tb1, tb2, tb3, tb4, tb5, tb6, tb7, tb8, tb9, primaryStage);
        });

        tb7.selectedProperty().addListener((ObservableValue<? extends Boolean> observable, Boolean oldValue, Boolean newValue) -> {
            playerString = checkPlayer(playerString, tb7);
            player.setText(playerString);
            player.setId(playerString);
            VictoryChecker(tb1, tb2, tb3, tb4, tb5, tb6, tb7, tb8, tb9, primaryStage);
        });

        tb8.selectedProperty().addListener((ObservableValue<? extends Boolean> observable, Boolean oldValue, Boolean newValue) -> {
            playerString = checkPlayer(playerString, tb8);
            player.setText(playerString);
            player.setId(playerString);
            VictoryChecker(tb1, tb2, tb3, tb4, tb5, tb6, tb7, tb8, tb9, primaryStage);
        });

        tb9.selectedProperty().addListener((ObservableValue<? extends Boolean> observable, Boolean oldValue, Boolean newValue) -> {
            playerString = checkPlayer(playerString, tb9);
            player.setText(playerString);
            player.setId(playerString);
            VictoryChecker(tb1, tb2, tb3, tb4, tb5, tb6, tb7, tb8, tb9, primaryStage);
        });

        //reset button
        bt1.setOnAction((event) -> {
            primaryStage.close();
            Platform.runLater(() -> new TicTacToe().start(new Stage()));
        });

        //scene settings and importing
        Scene scene = new Scene(root);
        scene.getStylesheets().add(getClass().getResource("CssFile.css").toExternalForm());
        primaryStage.setScene(scene);
        primaryStage.setTitle("X i Ox igra");
        primaryStage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }

    //player chaanging function
    public static String checkPlayer(String Player, ToggleButton tb) {
        if (Player.equals("Player1")) {

            tb.setId("1");
            tb.setText("X");
            tb.setDisable(true);
            Player = "Player2";
            return Player;
        } else {

            tb.setId("2");
            tb.setText("O");
            tb.setDisable(true);
            Player = "Player1";
            return Player;
        }

    }
    
    //Victory setting and new window popup
    public static void VictoryChecker(ToggleButton t1 ,ToggleButton t2 ,ToggleButton t3 ,ToggleButton t4 ,
            ToggleButton t5 ,ToggleButton t6,ToggleButton t7,ToggleButton t8,ToggleButton t9,Stage priStage){
        
        
        if ((t1.getId().equals("1")&&t2.getId().equals("1")&&t3.getId().equals("1"))||
           (t4.getId().equals("1")&&t5.getId().equals("1")&&t6.getId().equals("1"))||
           (t7.getId().equals("1")&&t8.getId().equals("1")&&t9.getId().equals("1"))||
           (t1.getId().equals("1")&&t4.getId().equals("1")&&t7.getId().equals("1"))||
           (t2.getId().equals("1")&&t5.getId().equals("1")&&t8.getId().equals("1"))||
           (t3.getId().equals("1")&&t6.getId().equals("1")&&t9.getId().equals("1"))||
           (t1.getId().equals("1")&&t5.getId().equals("1")&&t9.getId().equals("1"))||
           (t3.getId().equals("1")&&t5.getId().equals("1")&&t7.getId().equals("1")))
                
        {
            
            
            Label v1Label = new Label("Pobjeda Player 1");

            StackPane newWindowStackPane = new StackPane();
            newWindowStackPane.getChildren().add(v1Label);

            Scene sceneTwo = new Scene(newWindowStackPane, 230, 100);

            // New window 
            Stage newWindow = new Stage();
            newWindow.setTitle("Second Stage");
            newWindow.setScene(sceneTwo);
            
            // Specifies the modality for new window.
            newWindow.initModality(Modality.WINDOW_MODAL);
 
            // Specifies the owner Window (parent) for new window
            newWindow.initOwner(priStage);
 
            // Set position of second window, related to primary window.
            newWindow.setX(priStage.getX() + 200);
            newWindow.setY(priStage.getY() + 100);
 
            newWindow.show();

        }if ((t1.getId().equals("2")&&t2.getId().equals("2")&&t3.getId().equals("2"))||
           (t4.getId().equals("2")&&t5.getId().equals("2")&&t6.getId().equals("2"))||
           (t7.getId().equals("2")&&t8.getId().equals("2")&&t9.getId().equals("2"))||
           (t1.getId().equals("2")&&t4.getId().equals("2")&&t7.getId().equals("2"))||
           (t2.getId().equals("2")&&t5.getId().equals("2")&&t8.getId().equals("2"))||
           (t3.getId().equals("2")&&t6.getId().equals("2")&&t9.getId().equals("2"))||
           (t1.getId().equals("2")&&t5.getId().equals("2")&&t9.getId().equals("2"))||
           (t3.getId().equals("2")&&t5.getId().equals("2")&&t7.getId().equals("2")))
                
        {
            
            
            Label v1Label = new Label("Pobjeda Player 2");

            StackPane newWindowStackPane = new StackPane();
            newWindowStackPane.getChildren().add(v1Label);

            Scene sceneTwo = new Scene(newWindowStackPane, 230, 100);

            // New window 
            Stage newWindow = new Stage();
            newWindow.setTitle("Second Stage");
            newWindow.setScene(sceneTwo);
            
            // Specifies the modality for new window.
            newWindow.initModality(Modality.WINDOW_MODAL);
 
            // Specifies the owner Window (parent) for new window
            newWindow.initOwner(priStage);
 
            // Set position of second window, related to primary window.
            newWindow.setX(priStage.getX() + 200);
            newWindow.setY(priStage.getY() + 100);
 
            newWindow.show();

        }
    }

}
