package test.com.myProjects;

import com.myProjects.Cell;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertNull;

public class testCell {

    @Test
    public void shouldReturnCorrectBoardRep(){
        String expectedCell= "A2";
        Cell cell= new Cell(1, 2);
        String actualCellName= cell.boardRep();
        assertEquals(expectedCell, actualCellName);
    }

    @Test
    public void shouldReturnUpdatedCell(){
        Cell cell= new Cell(1, 2);
        Cell actualCell= cell.nextCell(2,1);
        assertEquals(2, actualCell.getRow());
        assertEquals(3, actualCell.getColumn());
    }

    @Test
    public void shouldReturnNullIfThereIsNoNextCell(){
        Cell cell= new Cell(1, 2);
        Cell actualCell= cell.nextCell(12,11);
        assertNull(actualCell);
    }
}
