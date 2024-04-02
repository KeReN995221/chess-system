package chess.piece;

import boardgame.Board;
import boardgame.Position;
import chess.ChessPiece;
import chess.Color;

public class Pawn extends ChessPiece {
    public Pawn(Board board, Color color) {
        super(board, color);
    }

    @Override
    public String toString(){
        return "P";
    }

    @Override
    public boolean[][] possibleMoves() {
        boolean[][] matrix = new boolean[getBoard().getRows()][getBoard().getColumns()];
        Position p = new Position(0,0);

        if(getColor() == Color.WHITE){
            p.setValues(position.getRow() - 1, position.getColum() );
            if(getBoard().positionExisits(p) && !getBoard().thereIsPiece(p)){
                matrix[p.getRow()][p.getColum()] = true;
            }
            p.setValues(position.getRow() - 2, position.getColum() );
            Position p2 = new Position(position.getRow() - 1, position.getColum());
            if(getBoard().positionExisits(p) && !getBoard().thereIsPiece(p) && getBoard().positionExisits(p2) && !getBoard().thereIsPiece(p2) && getMoveCount() == 0){
                matrix[p.getRow()][p.getColum()] = true;
            }
            p.setValues(position.getRow() - 1, position.getColum() - 1);
            if(getBoard().positionExisits(p) && isThereOpponentPiece(p)){
                matrix[p.getRow()][p.getColum()] = true;
            }
            p.setValues(position.getRow() - 1, position.getColum() + 1);
            if(getBoard().positionExisits(p) && isThereOpponentPiece(p)){
                matrix[p.getRow()][p.getColum()] = true;
            }


        }else{
            p.setValues(position.getRow() + 1, position.getColum() );
            if(getBoard().positionExisits(p) && !getBoard().thereIsPiece(p)){
                matrix[p.getRow()][p.getColum()] = true;
            }
            p.setValues(position.getRow() + 2, position.getColum() );
            Position p2 = new Position(position.getRow() + 1, position.getColum());
            if(getBoard().positionExisits(p) && !getBoard().thereIsPiece(p) && getBoard().positionExisits(p2) && !getBoard().thereIsPiece(p2) && getMoveCount() == 0){
                matrix[p.getRow()][p.getColum()] = true;
            }
            p.setValues(position.getRow() + 1, position.getColum() - 1);
            if(getBoard().positionExisits(p) && isThereOpponentPiece(p)){
                matrix[p.getRow()][p.getColum()] = true;
            }
            p.setValues(position.getRow() + 1, position.getColum() + 1);
            if(getBoard().positionExisits(p) && isThereOpponentPiece(p)){
                matrix[p.getRow()][p.getColum()] = true;
            }
        }
        return matrix;
    }
}
