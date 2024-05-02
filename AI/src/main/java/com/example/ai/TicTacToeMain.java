package com.example.ai;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Control;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.scene.media.AudioClip;
import javafx.scene.paint.Color;
import javafx.util.Duration;

import java.nio.file.Paths;

public class TicTacToeMain {
    int letter = 1;
    int playerXScore = 0;
    int playerOScore = 0;
    String letterColor = "9DBC98";
    AudioClip clipX = new AudioClip(Paths.get("C:\\Users\\Sean Rommel E\\eclipse-workspace\\TicTac\\SFX\\button1.mp3").toUri().toString());
    AudioClip clipO = new AudioClip(Paths.get("C:\\Users\\Sean Rommel E\\eclipse-workspace\\TicTac\\SFX\\button2.mp3").toUri().toString());


    @FXML
    Pane gamePane;
    @FXML
    //Top Buttons
    protected static Button A31;
    @FXML
    private static Button A32;
    @FXML
    private static Button A33;

    //Middle Buttons
    @FXML
    private static Button A21;
    @FXML
    private static Button A22;
    @FXML
    private static Button A23;

    //Bottom Buttons
    @FXML
    private static Button A11;
    @FXML
    private static Button A12;
    @FXML
    private static Button A13;

    // Reset button
    @FXML
    private Button resetButton;
    @FXML
    private Label oScore;

    @FXML
    private Label xScore;

    @FXML
    private Label scoreLabel;

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


}