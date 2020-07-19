package com.myProjects;

public class ChessPieceFactory {

    public static ChessPiece getChessPiece(String input){
        ChessPiece chessPiece = null;
        try {
            input = input.trim();
            String[] input_arr = input.split(" ");
            Pieces piece= Enum.valueOf(Pieces.class, input_arr[0].trim().toUpperCase());
            String pos= input_arr[1].trim().toUpperCase();
            chessPiece= piece.getChessPiece();
            chessPiece.setCurrentPos(pos);
        }
        catch(IllegalArgumentException exception){
            System.out.println("Invalid Chess Piece");
        }
        return chessPiece;
    }
}
