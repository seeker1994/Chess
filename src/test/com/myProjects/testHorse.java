package test.com.myProjects;

import com.myProjects.ChessPiece;
import com.myProjects.ChessPieceFactory;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static junit.framework.TestCase.assertTrue;

public class testHorse {

    @Test
    public void testPossibleMovesForKing(){
        ChessPiece horse= ChessPieceFactory.getChessPiece("Horse D3");
        List<String> possibleMoves = new ArrayList<>();
        possibleMoves.add("B2"); possibleMoves.add("B4"); possibleMoves.add("F2");
        possibleMoves.add("F4"); possibleMoves.add("C1"); possibleMoves.add("E1");
        possibleMoves.add("C5"); possibleMoves.add("E5");
        List<String> expectedMoves= horse.nextPossibleMoves();
        assertTrue(expectedMoves.containsAll(possibleMoves));
    }
}
