package chess.piece;

import boardgame.Board;
import boardgame.Position;
import chess.ChessPiece;
import chess.Color;

public class Rook extends ChessPiece {
    public Rook(Board board, Color color) {
        super(board, color);
    }
    @Override
    public String toString(){
        return "R";
    }

    @Override
    public boolean[][] possibleMoves() {
        boolean[][] matrix = new boolean[getBoard().getRows()][getBoard().getColumns()];
        Position p = new Position(0,0);

        // above
        p.setValues(position.getRow() - 1, position.getColum());
        while (getBoard().positionExisits(p) && !getBoard().thereIsPiece(p)){
            matrix[p.getRow()][p.getColum()] = true;
            p.setRow(p.getRow() - 1);
        }
        if (getBoard().positionExisits(p) && isThereOpponentPiece(p)){
            matrix[p.getRow()][p.getColum()] = true;
        }

        // left
        p.setValues(position.getRow(), position.getColum() - 1);
        while (getBoard().positionExisits(p) && !getBoard().thereIsPiece(p)){
            matrix[p.getRow()][p.getColum()] = true;
            p.setColum(p.getColum() - 1);
        }
        if (getBoard().positionExisits(p) && isThereOpponentPiece(p)){
            matrix[p.getRow()][p.getColum()] = true;
        }

        // right
        p.setValues(position.getRow(), position.getColum() + 1);
        while (getBoard().positionExisits(p) && !getBoard().thereIsPiece(p)){
            matrix[p.getRow()][p.getColum()] = true;
            p.setColum(p.getColum() + 1);
        }
        if (getBoard().positionExisits(p) && isThereOpponentPiece(p)){
            matrix[p.getRow()][p.getColum()] = true;
        }

        // below
        p.setValues(position.getRow() + 1, position.getColum());
        while (getBoard().positionExisits(p) && !getBoard().thereIsPiece(p)){
            matrix[p.getRow()][p.getColum()] = true;
            p.setRow(p.getRow() + 1);
        }
        if (getBoard().positionExisits(p) && isThereOpponentPiece(p)){
            matrix[p.getRow()][p.getColum()] = true;
        }

        return matrix;
    }

}
