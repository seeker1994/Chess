package test.com.myProjects;

import com.myProjects.ChessPiece;
import com.myProjects.ChessPieceFactory;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static junit.framework.TestCase.assertTrue;

public class testHorse {

    @Test
    public void testPossibleMovesForKing(){
        ChessPiece horse= ChessPieceFactory.getChessPiece("Horse D3");
        List<String> possibleMoves = new ArrayList<>();
        Collections.addAll(possibleMoves,"B2","B4","F2","F4","C1","E1","C5","E5");
        List<String> actualMoves= horse.nextPossibleMoves();
        assertTrue(actualMoves.containsAll(possibleMoves));
    }
}
