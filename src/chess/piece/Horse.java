package chess.piece;

import boardgame.Board;
import chess.ChessPiece;
import chess.Color;

public class Horse extends ChessPiece {
    public Horse(Board board, Color color) {
        super(board, color);
    }

    @Override
    public String toString(){
        return " H ";
    }

}
