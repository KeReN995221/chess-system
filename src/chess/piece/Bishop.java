package chess.piece;

import boardgame.Board;
import boardgame.Position;
import chess.ChessPiece;
import chess.Color;

public class Bishop extends ChessPiece {
    public Bishop(Board board, Color color) {
        super(board, color);
    }

    @Override
    public String toString(){
        return "B";
    }

    @Override
    public boolean[][] possibleMoves() {
        boolean[][] matrix = new boolean[getBoard().getRows()][getBoard().getColumns()];
        Position p = new Position(0,0);

        // nw
        p.setValues(position.getRow() - 1, position.getColum() - 1);
        while (getBoard().positionExisits(p) && !getBoard().thereIsPiece(p)){
            matrix[p.getRow()][p.getColum()] = true;
            p.setValues(p.getRow() - 1, p.getColum() - 1);
        }
        if (getBoard().positionExisits(p) && isThereOpponentPiece(p)){
            matrix[p.getRow()][p.getColum()] = true;
        }

        // ne
        p.setValues(position.getRow() - 1, position.getColum() + 1);
        while (getBoard().positionExisits(p) && !getBoard().thereIsPiece(p)){
            matrix[p.getRow()][p.getColum()] = true;
            p.setValues(p.getRow() - 1, p.getColum() + 1);
        }
        if (getBoard().positionExisits(p) && isThereOpponentPiece(p)){
            matrix[p.getRow()][p.getColum()] = true;
        }

        // se
        p.setValues(position.getRow() + 1, position.getColum() + 1);
        while (getBoard().positionExisits(p) && !getBoard().thereIsPiece(p)){
            matrix[p.getRow()][p.getColum()] = true;
            p.setValues(p.getRow() + 1, p.getColum() + 1);
        }
        if (getBoard().positionExisits(p) && isThereOpponentPiece(p)){
            matrix[p.getRow()][p.getColum()] = true;
        }

        // se
        p.setValues(position.getRow() + 1, position.getColum() - 1 );
        while (getBoard().positionExisits(p) && !getBoard().thereIsPiece(p)){
            matrix[p.getRow()][p.getColum()] = true;
            p.setValues(p.getRow() + 1, p.getColum() - 1);
        }
        if (getBoard().positionExisits(p) && isThereOpponentPiece(p)){
            matrix[p.getRow()][p.getColum()] = true;
        }

        return matrix;
    }
}
