package org.example.chess;

import org.example.boardgame.BoardException;

public class ChessException extends BoardException {
    private static final long serailVersionUID = 1L;

    public ChessException(String msg){
        super(msg);
    }

}
