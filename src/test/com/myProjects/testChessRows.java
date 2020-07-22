package test.com.myProjects;

import com.myProjects.ChessRows;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class testChessRows {
    @Test
    public void testRowNumber() {
        ChessRows row = ChessRows.D;
        assertEquals(4, row.getRow_no());
    }
}
