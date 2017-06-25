package com.example.dipanshkhandelwal.chess.Pieces;

import com.example.dipanshkhandelwal.chess.Coordinates;
import com.example.dipanshkhandelwal.chess.Position;

import java.util.ArrayList;

/**
 * Created by DIPANSH KHANDELWAL on 03-06-2017
 */

public class Bishop extends Piece{

    public Bishop(boolean white) {
        super(white);
    }

    @Override
    public ArrayList<Coordinates> AllowedMoves(Coordinates coordinates , Position[][] board){
        ArrayList<Coordinates> allowedMoves = new ArrayList<>();
        Coordinates c;

        for(int i=1 ; i<8 ; i++){
            if((coordinates.getX()+i)<8 && (coordinates.getY()+i)<8){
                if(board[coordinates.getX()+i][coordinates.getY()+i].getPiece() == null){
                    c = new Coordinates(coordinates.getX()+i , coordinates.getY()+i);
                    allowedMoves.add(c);
                }else{
                    if(board[coordinates.getX()+i][coordinates.getY()+i].getPiece().isWhite() != board[coordinates.getX()][coordinates.getY()].getPiece().isWhite()){
                        c = new Coordinates(coordinates.getX()+i , coordinates.getY()+i);
                        allowedMoves.add(c);
                    }
                    break;
                }
            }
        }

        for(int i=1 ; i<8 ; i++){
            if((coordinates.getX()-i)>=0 && (coordinates.getY()+i)<8){
                if(board[coordinates.getX()-i][coordinates.getY()+i].getPiece() == null){
                    c = new Coordinates(coordinates.getX()-i , coordinates.getY()+i);
                    allowedMoves.add(c);
                }else{
                    if(board[coordinates.getX()-i][coordinates.getY()+i].getPiece().isWhite() != board[coordinates.getX()][coordinates.getY()].getPiece().isWhite()){
                        c = new Coordinates(coordinates.getX()-i , coordinates.getY()+i);
                        allowedMoves.add(c);
                    }
                    break;
                }

            }
        }

        for(int i=1 ; i<8 ; i++){
            if((coordinates.getX()-i)>=0 && (coordinates.getY()-i)>=0){
                if(board[coordinates.getX()-i][coordinates.getY()-i].getPiece() == null){
                    c = new Coordinates(coordinates.getX()-i , coordinates.getY()-i);
                    allowedMoves.add(c);
                }else{
                    if(board[coordinates.getX()-i][coordinates.getY()-i].getPiece().isWhite() != board[coordinates.getX()][coordinates.getY()].getPiece().isWhite()){
                        c = new Coordinates(coordinates.getX()-i , coordinates.getY()-i);
                        allowedMoves.add(c);
                    }
                    break;
                }

            }
        }

        for(int i=1 ; i<8 ; i++){
            if((coordinates.getX()+i)<8 && (coordinates.getY()-i)>=0){
                if(board[coordinates.getX()+i][coordinates.getY()-i].getPiece() == null){
                    c = new Coordinates(coordinates.getX()+i , coordinates.getY()-i);
                    allowedMoves.add(c);
                }else{
                    if(board[coordinates.getX()+i][coordinates.getY()-i].getPiece().isWhite() != board[coordinates.getX()][coordinates.getY()].getPiece().isWhite()){
                        c = new Coordinates(coordinates.getX()+i , coordinates.getY()-i);
                        allowedMoves.add(c);
                    }
                    break;
                }

            }
        }
        return allowedMoves;
    }

}
