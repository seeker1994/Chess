package com.myProjects;

public enum ChessRows {
    A(1), B(2), C(3),D(4), E(5), F(6),G(7), H(8);

    private int row_no;

    ChessRows(int row_no){
        this.row_no= row_no;
    }

    public int getRow_no() {
        return row_no;
    }
}
