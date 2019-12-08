package com.javarush.task.task11.task1122;

/* 
Помощь шахматной школе
*/

public class Solution {
    public static void main(String[] args) {
    }

    public class ChessFigure {
        int xMove;
        int yMove;
        public ChessFigure (int xMove, int yMove) {
            this.xMove = xMove;
            this.yMove = yMove;
        }
        void chessMove(int x, int y) {
            this.xMove = x;
            this.yMove = y;
        }
    }
    public class King extends ChessFigure{
        public King(int xMove, int yMove) {
            super(xMove, yMove);
        }
    }

    public class Queen extends ChessFigure{
        public Queen (int xMove, int yMove) {
            super(xMove, yMove);
        }
    }

    public class Rook extends ChessFigure{
        public Rook(int xMove, int yMove) {
            super(xMove, yMove);
        }
    }

    public class Knight extends ChessFigure{
        public Knight(int xMove, int yMove) {
            super(xMove, yMove);
        }
    }

    public class Bishop extends ChessFigure{
        public Bishop(int xMove, int yMove) {
            super(xMove, yMove);
        }
    }

    public class Pawn extends ChessFigure{
        public Pawn(int xMove, int yMove) {
            super(xMove, yMove);
        }
    }
}
