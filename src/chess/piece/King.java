package chess.piece;

import boardgame.Board;
import boardgame.Position;
import chess.ChessPiece;
import chess.Color;

public class King extends ChessPiece {
    @Override
    public boolean[][] possibleMoves() {
        boolean[][] matrix = new boolean[getBoard().getRows()][getBoard().getColumns()];
        Position p = new Position(0,0);

        //above
        p.setValues(position.getRow() - 1, position.getColum());
        if(getBoard().positionExisits(p) && canMove(p)){
            matrix[p.getRow()][p.getColum()] = true;
        }

        //below
        p.setValues(position.getRow() + 1, position.getColum());
        if(getBoard().positionExisits(p) && canMove(p)){
            matrix[p.getRow()][p.getColum()] = true;
        }

        //left
        p.setValues(position.getRow(), position.getColum() - 1);
        if(getBoard().positionExisits(p) && canMove(p)){
            matrix[p.getRow()][p.getColum()] = true;
        }

        //right
        p.setValues(position.getRow(), position.getColum()  + 1);
        if(getBoard().positionExisits(p) && canMove(p)){
            matrix[p.getRow()][p.getColum()] = true;
        }

        //nortwest
        p.setValues(position.getRow() - 1, position.getColum() - 1);
        if(getBoard().positionExisits(p) && canMove(p)){
            matrix[p.getRow()][p.getColum()] = true;
        }

        //ne
        p.setValues(position.getRow() - 1, position.getColum() + 1);
        if(getBoard().positionExisits(p) && canMove(p)){
            matrix[p.getRow()][p.getColum()] = true;
        }

        //sw
        p.setValues(position.getRow() + 1, position.getColum() - 1);
        if(getBoard().positionExisits(p) && canMove(p)){
            matrix[p.getRow()][p.getColum()] = true;
        }

        //sw
        p.setValues(position.getRow() + 1, position.getColum() + 1);
        if(getBoard().positionExisits(p) && canMove(p)){
            matrix[p.getRow()][p.getColum()] = true;
        }

        return matrix;
    }

    private boolean canMove(Position position){
        ChessPiece p = (ChessPiece)getBoard().piece(position);
        return p == null || p.getColor() != getColor();
    }

    public King(Board board, Color color) {
        super(board, color);
    }

    @Override
    public String  toString(){
        return "K";
    }

}
