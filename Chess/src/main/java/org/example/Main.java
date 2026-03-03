package org.example;

import org.example.boardgame.Board;
import org.example.boardgame.Position;
import org.example.chess.ChessMatch;
import org.example.chess.ChessPiece;
import org.example.chess.ChessPosition;

import java.sql.SQLOutput;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {

        Scanner sc = new Scanner(System.in);
      ChessMatch chessMatch = new ChessMatch();

      while (true){
          UI.printBoard(chessMatch.getPieces());
          System.out.println();
          System.out.print("Source: ");
          ChessPosition source = UI.readChessPosition(sc);

          System.out.println();
          System.out.print("Target: ");
          ChessPosition target = UI.readChessPosition(sc);

          ChessPiece apturedPiece = chessMatch.performChessMove(source, target);
        }
    }
}
