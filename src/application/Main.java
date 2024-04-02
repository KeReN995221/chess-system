package application;

import boardgame.Board;
import boardgame.Position;
import chess.CheesExeption;
import chess.CheesPosition;
import chess.ChessMatch;
import chess.ChessPiece;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ChessMatch chessMatch = new ChessMatch();
        Scanner keyboard = new Scanner(System.in);
        List<ChessPiece> captured = new ArrayList<>();

        while(!chessMatch.getCheckMate()){
           try {
                UI.clearScreen();
                UI.printMatch(chessMatch, captured);
                System.out.println();
                System.out.print("Source: ");
                CheesPosition source = UI.readChessPosiiton(keyboard);

                boolean[][] posibleMoves = chessMatch.possibleMoves(source);
                UI.clearScreen();
                UI.printBoard(chessMatch.getPieces(), posibleMoves);

                System.out.println();
                System.out.print("Target: ");
                CheesPosition target = UI.readChessPosiiton(keyboard);

                ChessPiece capturedPiece = chessMatch.performChessMove(source, target);

                if(capturedPiece != null){
                    captured.add(capturedPiece);
                }
           }catch (CheesExeption e){
                System.out.println(e.getMessage());
                keyboard.nextLine();
           }catch (InputMismatchException e){
                System.out.println(e.getMessage());
                keyboard.nextLine();
           }
        }
        UI.clearScreen();
        UI.printMatch(chessMatch, captured);
    }
}