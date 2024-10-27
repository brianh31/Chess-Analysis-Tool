package com.chessanalysis;

public class Board {
    private final Piece[][] board = new Piece[8][8];

    public void initializeBoard() {
        // Setting up initial pieces for a standard chess game
        for (int i = 0; i < 8; i++) {
            board[1][i] = new Piece(PieceType.PAWN, "black");
            board[6][i] = new Piece(PieceType.PAWN, "white");
        }
        // Example for rooks
        board[0][0] = new Piece(PieceType.ROOK, "black");
        board[0][7] = new Piece(PieceType.ROOK, "black");
        board[7][0] = new Piece(PieceType.ROOK, "white");
        board[7][7] = new Piece(PieceType.ROOK, "white");
        // Add more pieces as needed (knights, bishops, queens, etc.)
    }

    public void displayBoard() {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (board[i][j] == null) {
                    System.out.print(". ");
                } else {
                    System.out.print(board[i][j].getSymbol() + " ");
                }
            }
            System.out.println();
        }
    }

    public Piece getPiece(int row, int col) {
        return board[row][col];
    }

    public void movePiece(int fromRow, int fromCol, int toRow, int toCol) {
        board[toRow][toCol] = board[fromRow][fromCol];
        board[fromRow][fromCol] = null;
    }
}
