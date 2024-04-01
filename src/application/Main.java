package application;

import boardgame.Board;
import boardgame.Position;
import chess.CheesExeption;
import chess.CheesPosition;
import chess.ChessMatch;
import chess.ChessPiece;

import java.util.InputMismatchException;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ChessMatch chessMatch = new ChessMatch();
        Scanner keyboard = new Scanner(System.in);

        while(true){
            try {
                UI.clearScreen();
                UI.printBoard(chessMatch.getPieces());
                System.out.println();
                System.out.println("Source: ");
                CheesPosition source = UI.readChessPosiiton(keyboard);

                System.out.println();
                System.out.println("Target: ");
                CheesPosition target = UI.readChessPosiiton(keyboard);

                ChessPiece capturedPiece = chessMatch.performChessMove(source, target);
            }catch (CheesExeption e){
                System.out.println(e.getMessage());
                keyboard.nextLine();
            }catch (InputMismatchException e){
                System.out.println(e.getMessage());
                keyboard.nextLine();
            }
        }
    }
}