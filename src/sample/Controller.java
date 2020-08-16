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
import javafx.stage.Stage;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.*;

public class Controller {




@FXML
TextField lable1;


@FXML
AnchorPane label;


@FXML
private void newButtonClick(MouseEvent event){};


int i = 0;



    public void textField() throws Exception{
        if(i == 0 ) {

            String url = "jdbc:mysql://localhost:3306/default";
            String uname = "root";
            String upass = "root@123";
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(url, uname, upass);
            Statement st = con.createStatement();
            String query = "select * from notepad2 where nhmy = 3";
            ResultSet rs = st.executeQuery(query);
            rs.next();
            String name = rs.getNString("ndesc");
            rs.close();
            st.close();
            lable1.setText(name);
        } i++;


            lable1.setEditable(false);




    }


    public void pressButton (ActionEvent event) throws Exception{

        TextField tx[] = new TextField[10000];
        int i = 0 ;
        tx[i] = new TextField();

        label.getChildren().add(tx[i]);

         i = i+1;



    }

public void Note() throws IOException {


            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Note.fxml"));
            Parent root = null;
            root = (Parent) fxmlLoader.load();
            Stage stage = new Stage();
            stage.setTitle("Note");
            stage.setScene(new Scene(root));
            stage.show();




    }




}
