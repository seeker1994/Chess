package test.com.myProjects;

import com.myProjects.ChessPiece;
import com.myProjects.ChessPieceFactory;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static junit.framework.TestCase.assertTrue;

public class testRook {

    @Test
    public void testShouldGiveCorrectBishopMoves(){
        ChessPiece bishop= ChessPieceFactory.getChessPiece("ROOK D3");
        List<String> possibleMoves = new ArrayList<>();
        possibleMoves.add("C3"); possibleMoves.add("B3"); possibleMoves.add("A3");
        possibleMoves.add("E3"); possibleMoves.add("F3"); possibleMoves.add("G3");
        possibleMoves.add("H3"); possibleMoves.add("D2"); possibleMoves.add("D1");
        possibleMoves.add("D4"); possibleMoves.add("D5"); possibleMoves.add("D6");
        possibleMoves.add("D7"); possibleMoves.add("D8");
        List<String> expectedMoves= bishop.nextPossibleMoves();
        assertTrue(expectedMoves.containsAll(possibleMoves));
    }


    @Test
    public void testShouldGiveCorrectBishopMoves_h8(){
        ChessPiece rook= ChessPieceFactory.getChessPiece("ROOK H8");
        List<String> possibleMoves = new ArrayList<>();
        possibleMoves.add("H7"); possibleMoves.add("H6"); possibleMoves.add("H5");
        possibleMoves.add("H4"); possibleMoves.add("H3"); possibleMoves.add("H2");
        possibleMoves.add("H1");
        List<String> expectedMoves= rook.nextPossibleMoves();
        assertTrue(expectedMoves.containsAll(possibleMoves));
    }

}
