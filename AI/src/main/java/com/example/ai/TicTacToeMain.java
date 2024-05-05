package com.example.ai;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.scene.media.AudioClip;

import java.nio.file.Paths;

public class TicTacToeMain {
    int letter = 1;
    int playerXScore = 0;
    int playerOScore = 0;
    String letterColor = "9DBC98";
    AudioClip clipX = new AudioClip(Paths.get("C:\\Users\\Sean Rommel E\\eclipse-workspace\\TicTac\\SFX\\button1.mp3").toUri().toString());
    AudioClip clipO = new AudioClip(Paths.get("C:\\Users\\Sean Rommel E\\eclipse-workspace\\TicTac\\SFX\\button2.mp3").toUri().toString());

    protected int turn = 0;

    @FXML
    protected Pane gamePane;
    @FXML
    //Top Buttons
    protected Button A31;
    @FXML
    protected Button A32;
    @FXML
    protected Button A33;

    //Middle Buttons
    @FXML
    protected Button A21;
    @FXML
    protected Button A22;
    @FXML
    protected Button A23;

    //Bottom Buttons
    @FXML
    protected Button A11;
    @FXML
    protected Button A12;
    @FXML
    protected Button A13;

    // Reset button
    @FXML
    protected Button resetButton;
    @FXML
    protected Label oScore;

    @FXML
    protected Label xScore;

    @FXML
    protected Label scoreLabel;

    // Winning combinations
    // A31       A32         A33
    // TopLeft TopMiddle TopRight
    // A21          A22     A23
    // MiddleLeft Middle MiddleRight
    // A11          A12         A13
    // BottomLeft BottomMiddle BottomRight
    //
    protected Button[] C1 = {A11, A12, A13};
    protected Button[] C2 = {A21,A22,A23};
    protected Button[] C3 = {A31,A32,A33};
    protected Button[] C4 = {A11,A21,A31};
    protected Button[] C5 = {A12,A22,A32};
    protected Button[] C6 = {A13,A23,A33};
    protected Button[] C7 = {A11,A22,A33};
    protected Button[] C8 = {A13,A22,A31};

    protected Button[][] poss = {C1,C2,C3,C4,C5,C6,C7,C8};






    public void buttonClick(){

        for(int i = 0; i < C1.length; i++){
            C1[i].setText("hi");

        }
    }
    public void checkWinner(){


    }
    public Button getA11(){
        return A11;
    }



}