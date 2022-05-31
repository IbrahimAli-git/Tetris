package com.codegym.task.task22.task2213;

public class Tetris {
    private Field field;
    private GamePiece gamePiece;
    static Tetris game;

    public static void main(String[] args) {
        game = new Tetris();
        game.run();
    }

    public void run(){

    }

    public void step(){

    }

    public Field getField() {
        return field;
    }

    public void setField(Field field) {
        this.field = field;
    }

    public GamePiece getGamePiece() {
        return gamePiece;
    }

    public void setGamePiece(GamePiece gamePiece) {
        this.gamePiece = gamePiece;
    }
}
