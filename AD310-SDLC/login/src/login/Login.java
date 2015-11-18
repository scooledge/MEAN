/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package login;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * @author Cooledge
 */
public class Login extends Application {
    
    @Override
    public void start(Stage primaryStage) {
          primaryStage.setTitle("Crouching Tiger Hidden Battleship");
        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(25, 25, 25, 25));
        
        Text scenetitle = new Text("BattleShip");
        //scenetitle.setFont(Font.font("Tahoma", FontWeight.BOLD, 20));
        scenetitle.setId("welcome-text");
        grid.add(scenetitle, 0, 0, 2, 1);

        Label player1 = new Label("Player 1:");
        grid.add(player1, 0, 1);

        TextField userTextField = new TextField();
        grid.add(userTextField, 1, 1);

        Label player2 = new Label("Player 2:");
        grid.add(player2, 0, 2);

        TextField pwBox = new TextField();
        grid.add(pwBox, 1, 2);
        
        
        Button btn = new Button("let's play!");
        HBox hbBtn = new HBox(10);
        hbBtn.setAlignment(Pos.BOTTOM_RIGHT);
        hbBtn.getChildren().add(btn);
        grid.add(hbBtn, 1, 4);
        
        
       final Text actiontarget = new Text();
        grid.add(actiontarget, 1, 6);
        
        
        btn.setOnAction(new EventHandler<ActionEvent>() {
 
    @Override
    public void handle(ActionEvent e) {
        //actiontarget.setFill(Color.FIREBRICK);
        actiontarget.setId("actiontarget");
        actiontarget.setText("It's go time!");
        
    }
});
        
        Scene scene = new Scene(grid, 500, 350);
        primaryStage.setScene(scene);
        scene.getStylesheets().add
            (Login.class.getResource("login.css").toExternalForm());
        primaryStage.show();
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
        
    }
    
}
