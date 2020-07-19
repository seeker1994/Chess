package com.myProjects;

import java.util.ArrayList;
import java.util.List;

public class ChessPiece {
    private String currentPos;

    public String getCurrentPos() {
        return currentPos;
    }

    public void setCurrentPos(String currentPos) {
        this.currentPos = currentPos;
    }

    private List<String> nextPossibleMoves(){
        return new ArrayList<String>();
    }
}
