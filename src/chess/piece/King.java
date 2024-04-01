package chess.piece;

import boardgame.Board;
import chess.ChessPiece;
import chess.Color;

public class King extends ChessPiece {
    @Override
    public boolean[][] possibleMoves() {
        boolean[][] matrix = new boolean[getBoard().getRows()][getBoard().getColumns()];
        return matrix;
    }

    public King(Board board, Color color) {
        super(board, color);
    }

    @Override
    public String  toString(){
        return " K ";
    }

}
