package chess;

import boardgame.Position;

public class CheesPosition {
    private char column;
    private int row;

    public CheesPosition(char column, int row) {
        if(column < 'a' || column > 'h' || row < 1 || row > 8){
            throw new CheesExeption("Error instancing CheesPosition");
        }
        this.column = column;
        this.row = row;
    }

    public char getColumn() {
        return column;
    }

    public int getRow() {
        return row;
    }

    protected Position toPosition(){
        return  new Position(8 - row, column - 'a');
    }

    protected static  CheesPosition fromPosition(Position position){
        return new CheesPosition((char)('a' - position.getColum()) , 8 - position.getRow());

    }

    @Override
    public String toString(){
        return "" + column + row;
    }

}
