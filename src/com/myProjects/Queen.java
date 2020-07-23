package com.myProjects;

import java.util.ArrayList;
import java.util.List;

public class Queen extends ChessPiece{

    public List<String> nextPossibleMoves(){
        List<String> nextPossibleMoves= new ArrayList<>();
        int template[][]= {{-1, -1}, {-1, 1}, {1, -1}, {1, 1}, {-1, 0}, {1, 0}, {0, -1}, {0, 1}};
        Cell currentPos = this.getCurrentPos();
        int i, j;
        for (int loop = 0; loop < 8; loop++) {
            i = template[loop][0];
            j = template[loop][1];
            while (true) {
                Cell next = currentPos.nextCell(i, j);
                if (next != null) {
                    nextPossibleMoves.add(next.boardRep());
                    i = i + template[loop][0];
                    j = j + template[loop][1];
                } else {
                    break;
                }
            }
        }
        return nextPossibleMoves;
    }
}
