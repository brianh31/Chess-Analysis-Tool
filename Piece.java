package com.chessanalysis;

public class Piece {
    private final PieceType type;
    private final String color;

    public Piece(PieceType type, String color) {
        this.type = type;
        this.color = color;
    }

    public PieceType getType() {
        return type;
    }

    public String getColor() {
        return color;
    }

    public char getSymbol() {
        switch (type) {
            case PAWN: return color.equals("white") ? 'P' : 'p';
            case ROOK: return color.equals("white") ? 'R' : 'r';
            // Add symbols for other pieces
            default: return '.';
        }
    }
}
