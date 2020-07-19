package test.com.myProjects;

import com.myProjects.*;
import org.junit.Test;

import static junit.framework.TestCase.assertTrue;

public class testPiecesEnum {
    @Test
    public void testChessPieceKing(){
        Pieces piece= Pieces.KING;
        assertTrue(piece.getChessPiece() instanceof King);
    }

    @Test
    public void testChessPieceQueen(){
        Pieces piece= Pieces.QUEEN;
        assertTrue(piece.getChessPiece() instanceof Queen);
    }

    @Test
    public void testChessPieceRook(){
        Pieces piece= Pieces.ROOK;
        assertTrue(piece.getChessPiece() instanceof Rook);
    }

    @Test
    public void testChessPieceHorse(){
        Pieces piece= Pieces.HORSE;
        assertTrue(piece.getChessPiece() instanceof Horse);
    }

    @Test
    public void testChessPieceBishop(){
        Pieces piece= Pieces.BISHOP;
        assertTrue(piece.getChessPiece() instanceof Bishop);
    }

    @Test
    public void testChessPiecePawn(){
        Pieces piece= Pieces.PAWN;
        assertTrue(piece.getChessPiece() instanceof Pawn);
    }
}
