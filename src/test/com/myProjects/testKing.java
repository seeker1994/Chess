package test.com.myProjects;

import com.myProjects.ChessPiece;
import com.myProjects.ChessPieceFactory;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static junit.framework.TestCase.assertTrue;

public class testKing {

    @Test
     public void testPossibleMovesForKing(){
        ChessPiece king= ChessPieceFactory.getChessPiece("KING D3");
        List<String> possibleMoves = new ArrayList<>();
        possibleMoves.add("C2"); possibleMoves.add("C3"); possibleMoves.add("C4");
        possibleMoves.add("D2"); possibleMoves.add("D4"); possibleMoves.add("E2");
        possibleMoves.add("E3"); possibleMoves.add("E4");
        List<String> expectedMoves= king.nextPossibleMoves();
        assertTrue(expectedMoves.containsAll(possibleMoves));
    }

}
