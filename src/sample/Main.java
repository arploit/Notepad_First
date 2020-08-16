package sample;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.TilePane;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Shape;
import javafx.stage.Stage;
import java.sql.*;
import javax.naming.Name;
import javax.swing.*;
import java.awt.*;

public class Main extends   Application  {


    @Override
    public void start(Stage primaryStage) throws Exception{
        Stage windows = primaryStage;
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Hello World");
        windows.setScene(new Scene(root, 323 ,529 ));
        windows.show();
    }


    public static void main(String[] args){

       launch(args);
    }
}
