package test.com.myProjects;

import com.myProjects.ChessPiece;
import com.myProjects.ChessPieceFactory;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static junit.framework.TestCase.assertTrue;

public class testKing {

    @Test
     public void testPossibleMovesForKing(){
        ChessPiece king= ChessPieceFactory.getChessPiece("KING D3");
        List<String> possibleMoves = new ArrayList<>();
        Collections.addAll(possibleMoves, "C2", "C3", "C4", "D2", "D4", "E2", "E3", "E4");
        List<String> expectedMoves= king.nextPossibleMoves();
        assertTrue(expectedMoves.containsAll(possibleMoves));
    }

}
