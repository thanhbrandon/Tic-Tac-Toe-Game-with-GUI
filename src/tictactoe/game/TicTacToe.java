/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tictactoe.game;

import javax.swing.JOptionPane;

/**
 *
 * @author User
 */


public class TicTacToe {

    private char[][] board; 
    private char currentPlayerMark;
    private int xScore = 0;
    private int oScore = 0;
			
    public TicTacToe() {
        board = new char[3][3];
        currentPlayerMark = 'x';
        initializeBoard();
    }
	
	
    // Set/Reset the board back to all empty values.
    public void initializeBoard() {
		
        // Loop through rows
        for (int i = 0; i < 3; i++) {
			
            // Loop through columns
            for (int j = 0; j < 3; j++) {
                board[i][j] = '-';
            }
        }
    }
	
	
    // Print the current board (may be replaced by GUI implementation later)
    public void printBoard() {
        System.out.println("-------------");
		
        for (int i = 0; i < 3; i++) {
            System.out.print("| ");
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " | ");
            }
            System.out.println();
            System.out.println("-------------");
        }
    }
	
	
    // Loop through all cells of the board and if one is found to be empty (contains char '-') then return false.
    // Otherwise the board is full.
    public boolean isBoardFull() {
        boolean isFull = true;
		
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == '-') {
                    isFull = false;
                }
            }
        }
		
        return isFull;
    }
	
	
    // Returns true if there is a win, false otherwise.
    // This calls our other win check functions to check the entire board.
    public boolean checkForWin() {
        if (checkRowsForWin() || checkColumnsForWin() || checkDiagonalsForWin()) {
           System.out.println("We have a winner! Congrats!");
           JOptionPane.showMessageDialog( null, "We have a winner! Congrats!");
           if (currentPlayerMark == 'x'){
               xScore++;
               return true;
           } else {
               oScore++;
               return true;
           }
        }
        else if (this.isBoardFull()) {
           JOptionPane.showMessageDialog( null, "Appears we have a draw!");
           return true;
        }
        else {
            return false;
        }
        //JOptionPane.showMessageDialog( null, (checkRowsForWin() || checkColumnsForWin() || checkDiagonalsForWin()));
        //JOptionPane.showMessageDialog( null, (this.isBoardFull()));
        //JOptionPane.showMessageDialog( null, board[0][0] + board[0][1] + board[0][2]);
    }
	
	
    // Loop through rows and see if any are winners.
    private boolean checkRowsForWin() {
        for (int i = 0; i < 3; i++) {
            if (checkRowCol(board[i][0], board[i][1], board[i][2]) == true) {
                return true;
            }
        }
        return false;
    }
	
	
    // Loop through columns and see if any are winners.
    private boolean checkColumnsForWin() {
        for (int i = 0; i < 3; i++) {
            if (checkRowCol(board[0][i], board[1][i], board[2][i]) == true) {
                return true;
            }
        }
        return false;
    }
	
	
    // Check the two diagonals to see if either is a win. Return true if either wins.
    private boolean checkDiagonalsForWin() {
        return ((checkRowCol(board[0][0], board[1][1], board[2][2]) == true) || (checkRowCol(board[0][2], board[1][1], board[2][0]) == true));
    }
	
	
    // Check to see if all three values are the same (and not empty) indicating a win.
    private boolean checkRowCol(char c1, char c2, char c3) {
        return ((c1 != '-') && (c1 == c2) && (c2 == c3));
    }
	
	
    // Change player marks back and forth.
    public void changePlayer() {
        if (currentPlayerMark == 'x') {
            currentPlayerMark = 'o';
        }
        else {
            currentPlayerMark = 'x';
        }
    }
	
	
    // Places a mark at the cell specified by row and col with the mark of the current player.
    public boolean placeMark(int row, int col) {
		
        // Make sure that row and column are in bounds of the board.
        if ((row >= 0) && (row < 3)) {
            if ((col >= 0) && (col < 3)) {
                if (board[row][col] == '-') {
                    board[row][col] = currentPlayerMark;
                    return true;
                }
            }
        }
		
        return false;
    }
    
    public char getMark() {
        return currentPlayerMark;
    }
    
    public int getxScore() {
        return xScore;
    }
    
    public int getoScore() {
        return oScore;
    }
}
