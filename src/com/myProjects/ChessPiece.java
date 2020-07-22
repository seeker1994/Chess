package com.myProjects;

import java.util.ArrayList;
import java.util.List;

public class ChessPiece {
    private Cell currentPos;

    public Cell getCurrentPos() {
        return currentPos;
    }

    public void setCurrentPos(Cell currentPos) {
        this.currentPos = currentPos;
    }

    public List<String> nextPossibleMoves() {
        return new ArrayList<String>();
    }
}
