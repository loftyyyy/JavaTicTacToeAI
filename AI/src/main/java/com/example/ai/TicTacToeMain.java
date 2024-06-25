package com.example.ai;

import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.scene.media.AudioClip;

import javax.net.ssl.SSLContext;
import java.nio.file.Paths;
import java.util.*;

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
    protected List<Button> C1 = new ArrayList<>();

    protected List<Button> C2 = new ArrayList<>();
    protected List<Button> C3 = new ArrayList<>();
    protected List<Button> C4 = new ArrayList<>();
    protected List<Button> C5 = new ArrayList<>();
    protected List<Button> C6 = new ArrayList<>();
    protected List<Button> C7 = new ArrayList<>();
    protected List<Button> C8 = new ArrayList<>();

    protected List<Button> test = new ArrayList<>();
    protected List<Button> inA11 = new ArrayList<>();
    protected List<Button> inA12 = new ArrayList<>();
    protected List<Button> inA13 = new ArrayList<>();
    protected List<Button> inA21 = new ArrayList<>();
    protected List<Button> inA22 = new ArrayList<>();
    protected List<Button> inA23 = new ArrayList<>();
    protected List<Button> inA31 = new ArrayList<>();
    protected List<Button> inA32 = new ArrayList<>();
    protected List<Button> inA33 = new ArrayList<>();


    protected  List<Button> inEverything = new ArrayList<>();
//    protected Button[] C2 = {A21,A22,A23};
//    protected Button[] C3 = {A31,A32,A33};
//    protected Button[] C4 = {A11,A21,A31};
//    protected Button[] C5 = {A12,A22,A32};
//    protected Button[] C6 = {A13,A23,A33};
//    protected Button[] C7 = {A11,A22,A33};
//    protected Button[] C8 = {A13,A22,A31};







    enum Cell{A11, A12, A13, A21, A22, A23, A31, A32, A33}
    enum Combination {C1, C2, C3, C4, C5, C6, C7, C8};

    protected Map<Cell, Set<Combination>> cellToCombination = new HashMap<>();
    public void buttonClick(ActionEvent e){
//        Button btn = (Button) e.getSource();
//        btn.setText("h");
        for(Map.Entry<Cell, Set<Combination>> entry : cellToCombination.entrySet()){
            Cell cell = entry.getKey();
            Set<Combination> combinations = entry.getValue();

            // Do something with the cell and combinations
            System.out.println("Cell: " + cell + ", Combinations: " + combinations);

        }



    }
    public void checkWinner(){
        for(Button btn : test){
            System.out.println(btn.getText());
        }


    }
    public Button getA11(){
        return A11;
    }

    @FXML
    private void initialize(){
        cellToCombination.put(Cell.A11, Set.of(Combination.C1, Combination.C4, Combination.C7));

        C1.add(A11);
        C1.add(A12);
        C1.add(A13);

        C2.add(A21);
        C2.add(A22);
        C2.add(A23);

        C3.add(A31);
        C3.add(A32);
        C3.add(A33);

        C4.add(A11);
        C4.add(A21);
        C4.add(A31);

        C5.add(A12);
        C5.add(A22);
        C5.add(A32);

        C6.add(A13);
        C6.add(A23);
        C6.add(A33);

        C7.add(A11);
        C7.add(A22);
        C7.add(A33);

        C8.add(A13);
        C8.add(A22);
        C8.add(A31);

        test.addAll(C1);
        test.addAll(C2);
        test.addAll(C3);
        test.addAll(C4);
        test.addAll(C5);
        test.addAll(C6);
        test.addAll(C7);
        test.addAll(C8);

        inA11.addAll(C1);
        inA11.addAll(C4);
        inA11.addAll(C7);

        inA12.addAll(C1);
        inA12.addAll(C5);

        inA13.addAll(C1);
        inA13.addAll(C6);
        inA13.addAll(C8);

        inA21.addAll(C2);
        inA21.addAll(C4);

        inA22.addAll(C2);
        inA22.addAll(C5);
        inA22.addAll(C7);
        inA22.addAll(C8);

        inA23.addAll(C2);
        inA23.addAll(C6);

        inA31.addAll(C3);
        inA31.addAll(C4);
        inA31.addAll(C8);

        inA32.addAll(C3);
        inA32.addAll(C5);

        inA33.addAll(C3);
        inA33.addAll(C6);
        inA33.addAll(C7);

        inEverything.addAll(inA11);
        inEverything.addAll(inA12);
        inEverything.addAll(inA13);
        inEverything.addAll(inA21);
        inEverything.addAll(inA22);
        inEverything.addAll(inA23);
        inEverything.addAll(inA31);
        inEverything.addAll(inA32);
        inEverything.addAll(inA33);

//    protected Button[] C5 = {A12,A22,A32};
//    protected Button[] C6 = {A13,A23,A33};
//    protected Button[] C7 = {A11,A22,A33};
//    protected Button[] C8 = {A13,A22,A31};
    }




}