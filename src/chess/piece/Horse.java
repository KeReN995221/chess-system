package chess.piece;

import boardgame.Board;
import boardgame.Position;
import chess.ChessPiece;
import chess.Color;

public class Horse extends ChessPiece {
    public Horse(Board board, Color color) {
        super(board, color);
    }

    @Override
    public String toString(){
        return "H";
    }

    @Override
    public boolean[][] possibleMoves() {
        boolean[][] matrix = new boolean[getBoard().getRows()][getBoard().getColumns()];
        Position p = new Position(0,0);


        p.setValues(position.getRow() - 1, position.getColum() - 2);
        if(getBoard().positionExisits(p) && canMove(p)){
            matrix[p.getRow()][p.getColum()] = true;
        }


        p.setValues(position.getRow() - 2, position.getColum() - 1);
        if(getBoard().positionExisits(p) && canMove(p)){
            matrix[p.getRow()][p.getColum()] = true;
        }


        p.setValues(position.getRow() - 2, position.getColum() + 1);
        if(getBoard().positionExisits(p) && canMove(p)){
            matrix[p.getRow()][p.getColum()] = true;
        }


        p.setValues(position.getRow() - 1, position.getColum()  + 2);
        if(getBoard().positionExisits(p) && canMove(p)){
            matrix[p.getRow()][p.getColum()] = true;
        }


        p.setValues(position.getRow() + 1, position.getColum() + 2);
        if(getBoard().positionExisits(p) && canMove(p)){
            matrix[p.getRow()][p.getColum()] = true;
        }


        p.setValues(position.getRow() + 2, position.getColum() + 1);
        if(getBoard().positionExisits(p) && canMove(p)){
            matrix[p.getRow()][p.getColum()] = true;
        }


        p.setValues(position.getRow() + 2, position.getColum() - 1);
        if(getBoard().positionExisits(p) && canMove(p)){
            matrix[p.getRow()][p.getColum()] = true;
        }


        p.setValues(position.getRow() + 1, position.getColum() - 2);
        if(getBoard().positionExisits(p) && canMove(p)){
            matrix[p.getRow()][p.getColum()] = true;
        }

        return matrix;
    }

    private boolean canMove(Position position){
        ChessPiece p = (ChessPiece)getBoard().piece(position);
        return p == null || p.getColor() != getColor();
    }
}
