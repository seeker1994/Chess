package test.com.myProjects;

import com.myProjects.ChessPiece;
import com.myProjects.ChessPieceFactory;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static junit.framework.TestCase.assertTrue;
public class testBishop {
    @Test
    public void testShouldGiveCorrectBishopMoves(){
        ChessPiece bishop= ChessPieceFactory.getChessPiece("BISHOP D3");
        List<String> possibleMoves = new ArrayList<>();
        possibleMoves.add("C2"); possibleMoves.add("B1"); possibleMoves.add("C4");
        possibleMoves.add("B5"); possibleMoves.add("A6"); possibleMoves.add("E2");
        possibleMoves.add("F1"); possibleMoves.add("E4"); possibleMoves.add("F5");
        possibleMoves.add("G6"); possibleMoves.add("H7");
        List<String> expectedMoves= bishop.nextPossibleMoves();
        assertTrue(expectedMoves.containsAll(possibleMoves));
    }

    @Test
    public void testShouldGiveCorrectBishopMoves2(){
        ChessPiece bishop= ChessPieceFactory.getChessPiece("BISHOP A1");
        List<String> possibleMoves = new ArrayList<>();
        possibleMoves.add("B2"); possibleMoves.add("C3"); possibleMoves.add("D4");
        possibleMoves.add("E5"); possibleMoves.add("F6"); possibleMoves.add("G7");
        possibleMoves.add("H8");
        List<String> expectedMoves= bishop.nextPossibleMoves();
        assertTrue(expectedMoves.containsAll(possibleMoves));
    }

}
