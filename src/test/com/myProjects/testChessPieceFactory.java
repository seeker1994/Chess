package test.com.myProjects;

import com.myProjects.*;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertNull;

public class testChessPieceFactory {
    @Test
    public void shouldReturnValidChesspieceOnValidInput(){
        String input = "ROOK D5";
        ChessPiece chessPiece= ChessPieceFactory.getChessPiece(input);
        assertTrue(chessPiece instanceof Rook);
        assertEquals(chessPiece.getCurrentPos().getRow(), 4);
        assertEquals(chessPiece.getCurrentPos().getColumn(), 5);
    }

    @Test
    public void shouldRaiseExeptionForInValidInput(){
        String input = "invalid piece D5";
        ChessPiece chessPiece= ChessPieceFactory.getChessPiece(input);
        assertNull(chessPiece);
    }
}
