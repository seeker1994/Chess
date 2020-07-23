package test.com.myProjects;

import com.myProjects.ChessPiece;
import com.myProjects.ChessPieceFactory;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static junit.framework.TestCase.assertTrue;

public class testQueen {

    @Test
    public void testShouldGiveCorrectBishopMoves(){
        ChessPiece queen= ChessPieceFactory.getChessPiece("QUEEN A1");
        List<String> possibleMoves = new ArrayList<>();
        Collections.addAll(possibleMoves, "B2", "C3", "D4", "E5", "F6", "G7", "H8", "B1", "C1", "D1",
                "E1", "F1", "G1", "H1", "A2", "A3", "A4", "A5", "A6", "A7", "A8");
        List<String> expectedMoves= queen.nextPossibleMoves();
        assertTrue(expectedMoves.containsAll(possibleMoves));
    }
}
