/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tictactoe.game;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javax.swing.*; // Needed for Swing classes
/**
 *
 * @author User
 */

public class TicTacToeGame {

    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
                // TODO code application logic here
                // Create game and initialize it.
        // First player will be 'x'
        TicTacToe game = new TicTacToe();

        // Player 'x' places a mark in the top right corner row 0, column 2
        // These values are based on a zero index array, so you may need to simply take in a row 1 and subtract 1 from it if you want that.
        game.placeMark(0,2);
        // Lets print the board
        game.printBoard();

        // Did we have a winner?


        // No winner or draw, switch players to 'o'
        game.changePlayer();
        // Repeat steps again for placing mark and checking game status...
        
        
        new GameBoard();
    }
    
}
