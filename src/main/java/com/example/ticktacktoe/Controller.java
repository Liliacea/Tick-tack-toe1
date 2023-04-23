package com.example.ticktacktoe;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class Controller {
  private boolean setPlayer = true;
  int [][] ticTac = new int[3][3];
    int countX = 0;
    int countO = 0;


    @FXML
    private Label ResultLabel;
    @FXML
    private Button first;
    @FXML
    private Button second;
    @FXML
    private Button third;
    @FXML
    private Button fourth;
    @FXML
    private Button fifth;
    @FXML
    private Button sixth;
    @FXML
    private Button seventh;
    @FXML
    private Button eigth;
    @FXML
    private Button ninth;

   /* @FXML
    private void initialize(){
        for (int i = 0; i < ticTac.length; i++) {
            for (int j = 0; j < ticTac.length; j++) {
                ticTac[i][j] = "0";
            }

        }


    }

    */

    @FXML
    private void firstButtonAction(ActionEvent actionEvent) {
        if (setPlayer == true){
            first.setText("X");
            setPlayer = false;
            ticTac[2][0] = 1;
        } else {
            first.setText("O");
            setPlayer = true;
            ticTac[2][0] = -1;
        }
        check();





    }
    @FXML
    private void secondButtonAction(ActionEvent actionEvent){
        if (setPlayer == true){
           second.setText("X");
            setPlayer = false;
            ticTac[2][1] = 1;
        } else {
            second.setText("O");
            setPlayer = true;
            ticTac[2][1] = -1;
        }
        check();


    }
    @FXML
    private void thirdButtonAction(ActionEvent actionEvent){
        if (setPlayer == true){
            third.setText("X");
            setPlayer = false;
            ticTac[2][2] = 1;
        } else {
            third.setText("O");
            setPlayer = true;
            ticTac[2][2] = -1;
        }
        check();


    }
    @FXML
    private void forthButtonAction(ActionEvent actionEvent){
        if (setPlayer == true){
            fourth.setText("X");
            setPlayer = false;
            ticTac[1][0] = 1;
        } else {
            fourth.setText("O");
            setPlayer = true;
            ticTac[1][0] = -1;
        }
        check();


    }
    @FXML
    private void fifthButtonAction(ActionEvent actionEvent){
        if (setPlayer == true){
            fifth.setText("X");
            setPlayer = false;
            ticTac[1][1] = 1;
        } else {
            fifth.setText("O");
            setPlayer = true;
            ticTac[1][1] = -1;
        }
        check();


    }
    @FXML
    private void sixthButtonAction(ActionEvent actionEvent){
        if (setPlayer == true){
            sixth.setText("X");
            setPlayer = false;
            ticTac[1][2] = 1;
        } else {
            sixth.setText("O");
            setPlayer = true;
            ticTac[1][2] = -1;
        }
        check();


    }
    @FXML
    private void seventhButtonAction(ActionEvent actionEvent){
        if (setPlayer == true){
            seventh.setText("X");
            setPlayer = false;
            ticTac[0][0] = 1;
        } else {
           seventh.setText("O");
            setPlayer = true;
            ticTac[0][0] = -1;
        }
        check();


    }
    @FXML
    private void eigthButtonAction(ActionEvent actionEvent){
        if (setPlayer == true){
            eigth.setText("X");
            setPlayer = false;
            ticTac[0][1] = 1;
        } else {
            eigth.setText("O");
            setPlayer = true;
            ticTac[0][1] = -1;
        }
        check();


    }
    @FXML
    private void ninthButtonAction(ActionEvent actionEvent){
        if (setPlayer == true){
            ninth.setText("X");
            setPlayer = false;
            ticTac[0][2] = 1;
        } else {
            ninth.setText("O");
            setPlayer = true;
            ticTac[0][2] = -1;
        }
        check();


    }

    private void check(){

        for (int i = 0; i < ticTac.length; i++) {
            for (int j = 0; j < ticTac.length; j++) {
                if(i==j&&ticTac[i][j]==1){
                    countX++;
                    ticTac[i][j]=0;
                } else if (i==j&&ticTac[i][j]==-1){
                    countO++;
                    ticTac[i][j]=0;
                }

            }

        }
        if(countO==ticTac.length){
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Нолики победили");
            alert.setContentText("Попробуйте еще раз");
            alert.show();
            return;
        }
        if(countX==ticTac.length){
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Крестики победили");
            alert.setContentText("Попробуйте еще раз");
            alert.show();
            return;
        }
    }
}