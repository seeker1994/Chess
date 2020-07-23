package test.com.myProjects;

import com.myProjects.ChessPiece;
import com.myProjects.ChessPieceFactory;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static junit.framework.TestCase.assertTrue;

public class testRook {

    @Test
    public void testShouldGiveCorrectBishopMoves(){
        ChessPiece bishop= ChessPieceFactory.getChessPiece("ROOK D3");
        List<String> possibleMoves = new ArrayList<>();
        Collections.addAll(possibleMoves,"C3","B3","A3","E3","F3","G3","H3","D2","D1","D4","D5",
                "D6","D7","D8");
        List<String> actualMoves= bishop.nextPossibleMoves();
        assertTrue(actualMoves.containsAll(possibleMoves));
    }


    @Test
    public void testShouldGiveCorrectBishopMoves_h8(){
        ChessPiece rook= ChessPieceFactory.getChessPiece("ROOK H8");
        List<String> possibleMoves = new ArrayList<>();
        Collections.addAll(possibleMoves,"H7","H6","H5" ,"H4","H3","H2" ,"H1");
        List<String> actualMoves= rook.nextPossibleMoves();
        assertTrue(actualMoves.containsAll(possibleMoves));
    }

}
