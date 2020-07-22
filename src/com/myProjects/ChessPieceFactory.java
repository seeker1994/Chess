package com.myProjects;

public class ChessPieceFactory {

    public static ChessPiece getChessPiece(String input) {
        String DELIMITER= " ";
        int PIECE_NAME_INDEX=0, POS_INDEX=1;

        ChessPiece chessPiece = null;
        try {
            input = input.trim();
            String[] input_arr = input.split(DELIMITER);
            Cell currentCell = getCell(input_arr[POS_INDEX]);
            chessPiece= getPiece(input_arr[PIECE_NAME_INDEX]);
            chessPiece.setCurrentPos(currentCell);
        } catch (IllegalArgumentException exception) {
            System.out.println("Invalid Chess Piece or position");
        }
        return chessPiece;
    }

    private static ChessPiece getPiece(String name){
        return Enum.valueOf(Pieces.class, name.trim().toUpperCase()).getChessPiece();
    }

    private static Cell getCell(String pos){
        pos = pos.trim().toUpperCase();
        ChessRows row = Enum.valueOf(ChessRows.class, (pos.charAt(0) + ""));
        int column = Integer.parseInt(pos.charAt(1) + "");
        if(column<1 || column>8){
            throw new IllegalArgumentException();
        }
        return new Cell(row.getRow_no(), column);

    }
}
