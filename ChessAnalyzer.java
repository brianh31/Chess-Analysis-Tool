package com.chessanalysis;

import java.util.Scanner;

public class ChessAnalyzer {
    public static void main(String[] args) {
        Board board = new Board();
        board.initializeBoard();
        board.displayBoard();

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Enter move (format: row1 col1 row2 col2): ");
            int fromRow = scanner.nextInt();
            int fromCol = scanner.nextInt();
            int toRow = scanner.nextInt();
            int toCol = scanner.nextInt();

            if (MoveValidator.isValidMove(board, fromRow, fromCol, toRow, toCol)) {
                board.movePiece(fromRow, fromCol, toRow, toCol);
                board.displayBoard();
            } else {
                System.out.println("Invalid move! Try again.");
            }
        }
    }
}
