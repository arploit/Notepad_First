package sample;

import com.sun.glass.events.MouseEvent;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Shape;
import javafx.stage.Stage;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.*;
import sample.Connection.*;

public class Controller {




@FXML
TextArea lable1;


@FXML
AnchorPane label;
    private Shape Rectangle;


    @FXML
private void newButtonClick(MouseEvent event){};






    public void textField() throws Exception{

            sample.Connection connection = new sample.Connection();

            Connection con = connection.getConnection();
            Statement st = con.createStatement();
            String query = "select * from notepad2 where nhmy = 3";
            ResultSet rs = st.executeQuery(query);
            rs.next();
            String name = rs.getNString("ndesc");
            rs.close();
            st.close();
            lable1.setShape(Rectangle);
            lable1.setText(name);
            lable1.setWrapText(true); 
            lable1.setEditable(false);




    }


    public void pressButton (ActionEvent event) {

        TextField[] tx = new TextField[10000];
        int i = 0 ;
        tx[i] = new TextField();

        label.getChildren().add(tx[i]);

         i = i+1;



    }

public void Note() throws IOException {


            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Note.fxml"));
            Parent root = (Parent) fxmlLoader.load();
            NoteController NoteController = fxmlLoader.getController();
            NoteController.ShowInformation(lable1.getText());
            Stage stage = new Stage();
            stage.setTitle("Note");
            stage.setScene(new Scene(root));
            stage.show();




    }




}
