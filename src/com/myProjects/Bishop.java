package com.myProjects;

import java.util.ArrayList;
import java.util.List;

public class Bishop extends ChessPiece {

    public List<String> nextPossibleMoves() {
        List<String> nextPossibleMoves = new ArrayList<>();
        Cell currentPos = this.getCurrentPos();
        int template[][] = {{-1, -1}, {-1, 1}, {1, -1}, {1, 1}};
        int i, j;
        for (int loop = 0; loop < 4; loop++) {
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
