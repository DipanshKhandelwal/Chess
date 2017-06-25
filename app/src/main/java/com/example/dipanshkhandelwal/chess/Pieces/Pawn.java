package com.example.dipanshkhandelwal.chess.Pieces;

import com.example.dipanshkhandelwal.chess.Coordinates;
import com.example.dipanshkhandelwal.chess.Position;

import java.util.ArrayList;

/**
 * Created by DIPANSH KHANDELWAL on 03-06-2017
 */

public class Pawn extends Piece{

    public Pawn(boolean white) {
        super(white);
    }

    @Override
    public ArrayList<Coordinates> AllowedMoves(Coordinates coordinates , Position[][] board){

        ArrayList<Coordinates> allowedMoves = new ArrayList<>();
        allowedMoves.clear();
        Coordinates c;

        if(board[coordinates.getX()][coordinates.getY()].getPiece().isWhite()){

            if(coordinates.getX()<8 && coordinates.getX()>=0 && (coordinates.getY()-1)<8 && (coordinates.getY()-1)>=0){
                if(board[coordinates.getX()][coordinates.getY()-1].getPiece()==null){
                    c=new Coordinates(coordinates.getX() , coordinates.getY() - 1);
                    allowedMoves.add(c);

                    if((coordinates.getY() == 6) && (board[coordinates.getX()][coordinates.getY() - 2].getPiece() == null)){
                        c = new Coordinates(coordinates.getX(), coordinates.getY() - 2);
                        allowedMoves.add(c);
                    }
                }
            }

            if((coordinates.getX()+1)<8 && (coordinates.getX()+1)>=0 && (coordinates.getY()-1)<8 && (coordinates.getY()-1)>=0) {
                if (board[coordinates.getX() + 1][coordinates.getY() - 1].getPiece() != null) {
                    if(board[coordinates.getX() + 1][coordinates.getY() - 1].getPiece().isWhite() != board[coordinates.getX()][coordinates.getY()].getPiece().isWhite()){
                        c = new Coordinates(coordinates.getX() + 1, coordinates.getY() - 1);
                        allowedMoves.add(c);
                    }
                }

            }

            if((coordinates.getX()-1)<8 && (coordinates.getX()-1)>=0 && (coordinates.getY()-1)<8 && (coordinates.getY()-1)>=0) {
                if (board[coordinates.getX() - 1][coordinates.getY() - 1].getPiece() != null) {
                    if(board[coordinates.getX() - 1][coordinates.getY() - 1].getPiece().isWhite() != board[coordinates.getX()][coordinates.getY()].getPiece().isWhite()){
                        c = new Coordinates(coordinates.getX() - 1, coordinates.getY() - 1);
                        allowedMoves.add(c);
                    }
                }
            }

        }else{

            if((coordinates.getX())<8 && (coordinates.getX())>=0 && (coordinates.getY()+1)<8 && (coordinates.getY()+1)>=0) {
                if (board[coordinates.getX()][coordinates.getY() + 1].getPiece() == null) {
                    c = new Coordinates(coordinates.getX(), coordinates.getY() + 1);
                    allowedMoves.add(c);

                    if(coordinates.getY() == 1 && (board[coordinates.getX()][coordinates.getY() + 2].getPiece() == null)){
                        c = new Coordinates(coordinates.getX(), coordinates.getY() + 2);
                        allowedMoves.add(c);
                    }
                }
            }

            if((coordinates.getX()+1)<8 && (coordinates.getX()+1)>=0 && (coordinates.getY()+1)<8 && (coordinates.getY()+1)>=0) {
                if (board[coordinates.getX() + 1][coordinates.getY() + 1].getPiece() != null) {
                    if(board[coordinates.getX() + 1][coordinates.getY() + 1].getPiece().isWhite() != board[coordinates.getX()][coordinates.getY()].getPiece().isWhite()){
                        c = new Coordinates(coordinates.getX() + 1, coordinates.getY() + 1);
                        allowedMoves.add(c);
                    }
                }
            }

            if((coordinates.getX()-1)<8 && (coordinates.getX()-1)>=0 && (coordinates.getY()+1)<8 && (coordinates.getY()+1)>=0) {
                if (board[coordinates.getX() - 1][coordinates.getY() + 1].getPiece() != null) {
                    if(board[coordinates.getX() - 1][coordinates.getY() + 1].getPiece().isWhite() != board[coordinates.getX()][coordinates.getY()].getPiece().isWhite()){
                        c = new Coordinates(coordinates.getX() - 1, coordinates.getY() + 1);
                        allowedMoves.add(c);
                    }
                }
            }

        }
        //check locations at board
        //work on the coordinates and return the allowed moves
        return allowedMoves;
    }
}
