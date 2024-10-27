package com.chessanalysis;

public class MoveValidator {
    public static boolean isValidMove(Board board, int fromRow, int fromCol, int toRow, int toCol) {
        Piece piece = board.getPiece(fromRow, fromCol);

        if (piece == null) return false;
        
        // Example logic for pawn movement
        if (piece.getType() == PieceType.PAWN) {
            int direction = piece.getColor().equals("white") ? -1 : 1;
            if (fromCol == toCol && (toRow - fromRow) == direction && board.getPiece(toRow, toCol) == null) {
                return true;
            }
            // Add more rules for capturing diagonally, etc.
        }
        // Add more validation logic for other pieces (rook, bishop, etc.)
        return false;
    }
}
