package test.com.myProjects;

import com.myProjects.ChessPiece;
import com.myProjects.ChessPieceFactory;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static junit.framework.TestCase.assertTrue;

public class testPawn {

    @Test
    public void testPossibleMovesForPawn(){
        ChessPiece pawn= ChessPieceFactory.getChessPiece("PAWN D3");
        List<String> possibleMoves = new ArrayList<>();
        possibleMoves.add("E3");
        List<String> actualMoves= pawn.nextPossibleMoves();
        assertTrue(actualMoves.containsAll(possibleMoves));
    }

    @Test
    public void testPossibleMovesForPawn_No_Moves(){
        ChessPiece pawn= ChessPieceFactory.getChessPiece("PAWN H8");
        List<String> actualMoves= pawn.nextPossibleMoves();
        assertTrue(actualMoves.isEmpty());
    }

}
