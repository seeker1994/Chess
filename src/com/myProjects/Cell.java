package com.myProjects;

public class Cell {
    int row, column;

    public Cell(int row, int column){
        this.row= row;
        this.column= column;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getColumn() {
        return column;
    }

    public void setColumn(int column) {
        this.column = column;
    }

    public Cell nextCell(int row, int column){
        int newRow = this.row+row;
        int newCol = this.column+column;
        if(newRow>=1 && newRow<=8 && newCol>=1 && newCol<=8)
            return new Cell(newRow, newCol);
        return null;

    }
    public String boardRep(){
        char rowName= (char)(this.row-1+(int)'A');
        return rowName+""+this.column;
    }
}
