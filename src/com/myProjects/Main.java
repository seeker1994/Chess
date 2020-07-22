package com.myProjects;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try {
            System.out.println("Enter ChessPiece and current position Format- King D5");
            Scanner sc = new Scanner(System.in);
            String input = sc.nextLine();
            ChessPiece piece = ChessPieceFactory.getChessPiece(input);
            System.out.println(piece.nextPossibleMoves());
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

}