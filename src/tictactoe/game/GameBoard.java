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


// Set the size of the window.
setSize(WINDOW_WIDTH, WINDOW_HEIGHT);

// Specify an action for the close button.
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

// Add a GridLayout manager to the content pane.
setLayout(new GridLayout(3, 5));

// Create six buttons.
JButton button1 = new JButton("Button 1");
JButton button2 = new JButton("Button 2");
JButton button3 = new JButton("Button 3");
JLabel label4 = new JLabel("Player X");
JLabel label5 = new JLabel("Score");
JButton button6 = new JButton("Button 6");
JButton button7 = new JButton("Button 7");
JButton button8 = new JButton("Button 8");
JLabel label9 = new JLabel("Player O");
JLabel label10 = new JLabel("Score");
JButton button11 = new JButton("Button 11");
JButton button12 = new JButton("Button 12");
JButton button13 = new JButton("Button 13");
JButton button14 = new JButton("Reset");
JButton button15 = new JButton("Exit");


// Add button functionality
button1.addActionListener(new gameAction());
button15.addActionListener(new quitAction());
button1.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            char mark = game.getMark();
            button1.setText(mark + "");
            game.placeMark(0,0);
            game.checkForWin();
            game.changePlayer();
         }});
button2.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            char mark = game.getMark();
            button2.setText(mark + "");
            game.placeMark(0,1);
            game.checkForWin();
            game.changePlayer();
         }});
button3.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            char mark = game.getMark();
            button3.setText(mark + "");
            game.placeMark(0,3);
            game.checkForWin();
            game.changePlayer();
         }});
button6.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            char mark = game.getMark();
            button6.setText(mark + "");
            game.checkForWin();
            game.changePlayer();
         }});
button7.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            char mark = game.getMark();
            button7.setText(mark + "");
            game.checkForWin();
            game.changePlayer();
         }});
button8.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            char mark = game.getMark();
            button8.setText(mark + "");
            game.checkForWin();
            game.changePlayer();
         }});
button11.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            char mark = game.getMark();
            button11.setText(mark + "");
            game.checkForWin();
            game.changePlayer();
         }});
button12.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            char mark = game.getMark();
            button12.setText(mark + "");
            game.checkForWin();
            game.changePlayer();
         }});
button13.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            char mark = game.getMark();
            button13.setText(mark + "");
            game.checkForWin();
            game.changePlayer();
         }});
// Add the six buttons to the content pane.
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
private class gameAction implements ActionListener
{
/**
The actionPerformed method executes when the user
clicks on the Calculate button.
@param e The event object.
*/

    public void actionPerformed(ActionEvent e )
    {
        String actionCommand = e.getActionCommand();
        if (actionCommand.equals("Button 1")){
            
        }
    }
}
private class resetAction implements ActionListener
{
/**
The actionPerformed method executes when the user
clicks on the Calculate button.
@param e The event object.
*/

    public void actionPerformed(ActionEvent e )
    {
        String actionCommand = e.getActionCommand();
        if (actionCommand.equals("Button 1")){
            game.checkForWin();
            game.printBoard();
        }
    }
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
        System.exit(0);
    }
}
}



