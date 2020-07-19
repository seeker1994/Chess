package com.myProjects;

public enum Pieces {

    KING(new King()),
    QUEEN(new Queen()),
    BISHOP(new Bishop()),
    HORSE(new Horse()),
    ROOK(new Rook()),
    PAWN(new Pawn());

    private ChessPiece chessPiece;

    public ChessPiece getChessPiece() {
        return this.chessPiece;
    }

    Pieces(ChessPiece chessPiece) {
        this.chessPiece= chessPiece;
    }



}

