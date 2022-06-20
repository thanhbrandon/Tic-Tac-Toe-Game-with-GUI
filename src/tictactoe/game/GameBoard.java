/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tictactoe.game;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javax.swing.*; // Needed for Swing classes
import java.awt.*; // Needed for GridLayout class
import java.awt.event.*; // Needed for ActionListener Interface
import javafx.application.Platform;
/**
This class demonstrates the GridLayout manager.
*/

public class GameBoard extends JFrame
{
private final int WINDOW_WIDTH = 1000; // Window width
private final int WINDOW_HEIGHT = 600; // Window height
TicTacToe game = new TicTacToe();
/**
Constructor
*/

public GameBoard()
{
// Set the title bar text.
setTitle("Grid Layout");
ImageIcon xIcon = new ImageIcon(new ImageIcon("x.jpg").getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT));
ImageIcon oIcon = new ImageIcon(new ImageIcon("o.jpg").getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT));

// Set the size of the window.
setSize(WINDOW_WIDTH, WINDOW_HEIGHT);

// Specify an action for the close button.
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

// Add a GridLayout manager to the content pane.
setLayout(new GridLayout(3, 5));

// Create 11 buttons and 4 labels.
JButton button1 = new JButton("");
JButton button2 = new JButton("");
JButton button3 = new JButton("");
JLabel label4 = new JLabel("Player X", JLabel.CENTER);
JLabel label5 = new JLabel("Score", JLabel.CENTER);
JButton button6 = new JButton("");
JButton button7 = new JButton("");
JButton button8 = new JButton("");
JLabel label9 = new JLabel("Player O", JLabel.CENTER);
JLabel label10 = new JLabel("Score", JLabel.CENTER);
JButton button11 = new JButton("");
JButton button12 = new JButton("");
JButton button13 = new JButton("");
JButton button14 = new JButton("Reset");
JButton button15 = new JButton("Exit");



// Add button functionality to each button
button14.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
             // Calls the reset method to clear the board
            reset(label5, label10, button1, button2, button3 , button6,  button7,  button8, button11, button12,   button13);
         }});
button15.addActionListener(new quitAction()); // Calls the quitAction Method when this button is pressed
button1.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            button1.setEnabled(false); // Makes the button unpressable when pressed once
            char mark = game.getMark(); // Gets the player mark
            //button1.setText(mark + ""); // Marks the button with an X or O
            setMark(button1,mark,  xIcon,  oIcon);
            game.placeMark(0,0); // Places the mark into the array that checks if there is a winner
            if (game.checkForWin() == true){ // Checks if there is a winner if there is the board is reset
                reset(label5, label10, button1, button2, button3 , button6,  button7,  button8, button11, button12,   button13);
            };
            game.changePlayer(); // Changes the Player mark to the other player mark
         }});
button2.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            button2.setEnabled(false);
            char mark = game.getMark();
            setMark(button2,mark,  xIcon,  oIcon);
            game.placeMark(0,1);
            if (game.checkForWin() == true){
                reset(label5, label10, button1, button2, button3 , button6,  button7,  button8, button11, button12,   button13);
            };
            game.changePlayer();
         }});
button3.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            button3.setEnabled(false);
            char mark = game.getMark();
            setMark(button3,mark,  xIcon,  oIcon);
            game.placeMark(0,2);
            if (game.checkForWin() == true){
                reset(label5, label10, button1, button2, button3 , button6,  button7,  button8, button11, button12,   button13);
            };
            game.changePlayer();
         }});
button6.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            button6.setEnabled(false);
            char mark = game.getMark();
            setMark(button6,mark,  xIcon,  oIcon);
            game.placeMark(1,0);
            if (game.checkForWin() == true){
                reset(label5, label10, button1, button2, button3 , button6,  button7,  button8, button11, button12,   button13);
            };
            game.changePlayer();
         }});
button7.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            button7.setEnabled(false);
            char mark = game.getMark();
            setMark(button7,mark,  xIcon,  oIcon);
            game.placeMark(1,1);
            if (game.checkForWin() == true){
                reset(label5, label10, button1, button2, button3 , button6,  button7,  button8, button11, button12,   button13);
            };
            game.changePlayer();
         }});
button8.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            button8.setEnabled(false);
            char mark = game.getMark();
            setMark(button8,mark,  xIcon,  oIcon);
            game.placeMark(1,2);
            if (game.checkForWin() == true){
                reset(label5, label10, button1, button2, button3 , button6,  button7,  button8, button11, button12,   button13);
            };
            game.changePlayer();
         }});
button11.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            button11.setEnabled(false);
            char mark = game.getMark();
            setMark(button11,mark,  xIcon,  oIcon);
            game.placeMark(2,0);
            if (game.checkForWin() == true){
                reset(label5, label10, button1, button2, button3 , button6,  button7,  button8, button11, button12,   button13);
            };
            game.changePlayer();
         }});
button12.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            button12.setEnabled(false);
            char mark = game.getMark();
            setMark(button12,mark,  xIcon,  oIcon);
            game.placeMark(2,1);
            if (game.checkForWin() == true){
                reset(label5, label10, button1, button2, button3 , button6,  button7,  button8, button11, button12,   button13);
            };
            game.changePlayer();
         }});
button13.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            button13.setEnabled(false);
            char mark = game.getMark();
            setMark(button13,mark,  xIcon,  oIcon);
            game.placeMark(2,2);
            if (game.checkForWin() == true){
                reset(label5, label10, button1, button2, button3 , button6,  button7,  button8, button11, button12,   button13);
            };
            game.changePlayer();
         }});
// Add the 11 buttons and 4 labels to the content pane.
add(button1); // Goes into row 1, column 1
add(button2); // Goes into row 1, column 2
add(button3); // Goes into row 1, column 3
add(label4); // Goes into row 2, column 1
add(label5); // Goes into row 2, column 2
add(button6); // Goes into row 2, column 3
add(button7); // Goes into row 1, column 1
add(button8); // Goes into row 1, column 2
add(label9); // Goes into row 1, column 3
add(label10); // Goes into row 2, column 1
add(button11); // Goes into row 2, column 2
add(button12); // Goes into row 2, column 3
add(button13); // Goes into row 2, column 1
add(button14); // Goes into row 2, column 2
add(button15); // Goes into row 2, column 3



// Display the window.
setVisible(true);
}
boolean currentPlayer = true;
public void setMark(JButton button, char mark, Icon xIcon, Icon yIcon){
    if (mark == 'x') {
        button.setIcon(xIcon);
    }
    else {
        button.setIcon(yIcon);
    }
}
//JButton label5, JButton label10, JButton button1,JButton button2,JButton button3 ,JButton button6, JButton button7, JButton button8,JButton button11,JButton button12,  JButton button13
public void reset(JLabel label5, JLabel label10, JButton button1,JButton button2,JButton button3 ,
        JButton button6, JButton button7, JButton button8,JButton button11,JButton button12,  JButton button13) {
    
    game.printBoard();
    game.initializeBoard();
    
    // Updates the scoreboard
    label5.setText(game.getxScore() + "");
    label10.setText(game.getoScore() + "");
    
    // Clears the current marks on the buttons
    button1.setIcon(null);
    button2.setIcon(null);
    button3.setIcon(null);
    button6.setIcon(null);
    button7.setIcon(null);
    button8.setIcon(null);
    button11.setIcon(null);
    button12.setIcon(null);
    button13.setIcon(null);
    
    // Makes all the buttons pressable again
    button1.setEnabled(true);
    button2.setEnabled(true);
    button3.setEnabled(true);
    button6.setEnabled(true);
    button7.setEnabled(true);
    button8.setEnabled(true);
    button11.setEnabled(true);
    button12.setEnabled(true);
    button13.setEnabled(true);
}
private class quitAction implements ActionListener
{
/**
The actionPerformed method executes when the user
clicks on the Calculate button.
@param e The event object.
*/

    public void actionPerformed(ActionEvent e )
    {
        // Closes the program
        System.exit(0);
    }
}
}





