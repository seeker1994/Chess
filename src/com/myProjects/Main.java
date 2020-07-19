package com.myProjects;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Enter ChessPiece and current position Format- King D5");
        Scanner sc= new Scanner(System.in);
        String input= sc.next();
        ChessPiece piece = ChessPieceFactory.getChessPiece(input);
    }

}
