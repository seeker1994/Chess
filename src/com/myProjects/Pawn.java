package com.myProjects;

import java.util.ArrayList;
import java.util.List;

public class Pawn extends  ChessPiece{

    public List<String> nextPossibleMoves(){
        List<String> nextPossibleMoves= new ArrayList<>();
        int template[][]= {{1,0}};
        Cell currentPos= this.getCurrentPos();
        for(int i=0;i<1;i++){
            Cell nextCell= currentPos.nextCell(template[i][0], template[i][1]);
            if(nextCell!=null)
                nextPossibleMoves.add(nextCell.boardRep());
        }
        return nextPossibleMoves;
    }
}
