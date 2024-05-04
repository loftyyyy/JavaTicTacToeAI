package com.example.ai;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.scene.media.AudioClip;

import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;

public class TicTacToeMain {
    int letter = 1;
    int playerXScore = 0;
    int playerOScore = 0;
    String letterColor = "9DBC98";
    AudioClip clipX = new AudioClip(Paths.get("C:\\Users\\Sean Rommel E\\eclipse-workspace\\TicTac\\SFX\\button1.mp3").toUri().toString());
    AudioClip clipO = new AudioClip(Paths.get("C:\\Users\\Sean Rommel E\\eclipse-workspace\\TicTac\\SFX\\button2.mp3").toUri().toString());


    @FXML
    protected static Pane gamePane;
    @FXML
    //Top Buttons
    protected static Button A31;
    @FXML
    protected static Button A32;
    @FXML
    protected static Button A33;

    //Middle Buttons
    @FXML
    protected static Button A21;
    @FXML
    protected static Button A22;
    @FXML
    protected static Button A23;

    //Bottom Buttons
    @FXML
    protected static Button A11;
    @FXML
    protected static Button A12;
    @FXML
    protected static Button A13;

    // Reset button
    @FXML
    protected static Button resetButton;
    @FXML
    protected static Label oScore;

    @FXML
    protected static Label xScore;

    @FXML
    protected static Label scoreLabel;

    // Winning combinations
    // A31       A32         A33
    // TopLeft TopMiddle TopRight
    // A21          A22     A23
    // MiddleLeft Middle MiddleRight
    // A11          A12         A13
    // BottomLeft BottomMiddle BottomRight
    //
    public static Button[] C1 = {A11, A12, A13};
    public static Button[] C2 = {A21,A22,A23};
    public static Button[] C3 = {A31,A32,A33};
    public static Button[] C4 = {A11,A21,A31};
    public static Button[] C5 = {A12,A22,A32};
    public static Button[] C6 = {A13,A23,A33};
    public static Button[] C7 = {A11,A22,A33};
    public static Button[] C8 = {A13,A22,A31};

    public static Map<String, Button[][]> buttonMaps = new HashMap<String, Button[][]>();




    public static void main(String[] args){
        buttonMaps.put("A11", new Button[][]{C1, C4, C7});
        buttonMaps.put("A12", new Button[][]{C1, C5});
        buttonMaps.put("A13", new Button[][]{C1, C6, C8});
        buttonMaps.put("A21", new Button[][]{C2, C4});
        buttonMaps.put("A22", new Button[][]{C2, C5, C7, C8});
        buttonMaps.put("A23", new Button[][]{C2, C6});
        buttonMaps.put("A31", new Button[][]{C3, C4, C8});
        buttonMaps.put("A32", new Button[][]{C3, C5});
        buttonMaps.put("A33", new Button[][]{C3, C6, C7});
    }



}