package test.com.myProjects;

import com.myProjects.ChessPiece;
import com.myProjects.ChessPieceFactory;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static junit.framework.TestCase.assertTrue;
public class testBishop {
    @Test
    public void testShouldGiveCorrectBishopMoves(){
        ChessPiece bishop= ChessPieceFactory.getChessPiece("BISHOP D3");
        List<String> possibleMoves = new ArrayList<>();
        Collections.addAll(possibleMoves, "C2", "B1", "C4", "B5", "A6", "E2", "F1", "E4", "F5", "G6", "H7");
        List<String> expectedMoves= bishop.nextPossibleMoves();
        assertTrue(expectedMoves.containsAll(possibleMoves));
    }

    @Test
    public void testShouldGiveCorrectBishopMoves2(){
        ChessPiece bishop= ChessPieceFactory.getChessPiece("BISHOP A1");
        List<String> possibleMoves = new ArrayList<>();
        Collections.addAll(possibleMoves,"B2","C3","D4","E5","F6","G7","H8");
        List<String> expectedMoves= bishop.nextPossibleMoves();
        assertTrue(expectedMoves.containsAll(possibleMoves));
    }

}
