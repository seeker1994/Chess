package com.myProjects;

import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try {
            System.out.println("***Chess Board Sample Cells***");

            System.out.println("H1\tH2\tH3\tH4\tH5\tH6\tH7\tH8");
            System.out.println("G1\tG2\tG3\tG4\tG5\tG6\tG7\tG8");
            System.out.println("F1\tF2\tF3\tF4\tF5\tF6\tF7\tF8");
            System.out.println("E1\tE2\tE3\tE4\tE5\tE6\tE7\tE8");
            System.out.println("D1\tD2\tD3\tD4\tD5\tD6\tD7\tD8");
            System.out.println("C1\tC2\tC3\tC4\tC5\tC6\tC7\tC8");
            System.out.println("B1\tB2\tB3\tB4\tB5\tB6\tB7\tB8");
            System.out.println("A1\tA2\tA3\tA4\tA5\tA6\tA7\tA8");

            System.out.println("******************************");
            System.out.println("Enter ChessPiece and current position Format- King D5");

            Scanner sc = new Scanner(System.in);
            String input = sc.nextLine();
            ChessPiece piece = ChessPieceFactory.getChessPiece(input);
            List<String> possiblesMoves= piece.nextPossibleMoves();
            StringBuilder availableMoves= new StringBuilder();
            for(String move: possiblesMoves){
                availableMoves.append(move);
                availableMoves.append(" ");
            }
            if(availableMoves.length()==0){
                System.out.println("No Moves Possible");
                return;
            }

            System.out.println(availableMoves.toString().trim());

        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

}