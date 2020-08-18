package sample;

import com.sun.glass.events.MouseEvent;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.*;

public class NoteController {

@FXML
TextArea MainTextArea;

@FXML
Button  SaveButton;



    public void ShowInformation(String text){
        MainTextArea.setWrapText(true);
        MainTextArea.setText(text);
    }

    public void SaveButton(ActionEvent event) throws Exception{
        sample.Connection connection = new Connection();
        java.sql.Connection con = connection.getConnection();
        Statement st = con.createStatement();
        String query = "update notepad2 set ndesc ='"+MainTextArea.getText() +"' where nhmy = 3";
        int rs = st.executeUpdate(query);
        System.out.println("update query return this int " +rs);
        st.close();
        ((Stage)(((Button)event.getSource()).getScene().getWindow())).close();



    }

}
