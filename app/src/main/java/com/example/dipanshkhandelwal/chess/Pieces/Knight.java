package com.example.dipanshkhandelwal.chess.Pieces;

import com.example.dipanshkhandelwal.chess.Coordinates;
import com.example.dipanshkhandelwal.chess.Position;

import java.util.ArrayList;

/**
 * Created by DIPANSH KHANDELWAL on 03-06-2017
 */

public class Knight extends Piece{

    public Knight(boolean white) {
        super(white);
    }

    @Override
    public ArrayList<Coordinates> AllowedMoves(Coordinates coordinates , Position[][] board){
        ArrayList<Coordinates> allowedMoves = new ArrayList<>();
        allowedMoves.clear();
        Coordinates c;

        if (coordinates.getX()+2 <8 && coordinates.getY()-1 >=0){
            if(board[coordinates.getX()+2][coordinates.getY()-1].getPiece() ==null){
                c = new Coordinates(coordinates.getX()+2 , coordinates.getY()-1);
                allowedMoves.add(c);
            }else{
                if(board[coordinates.getX()+2][coordinates.getY()-1].getPiece().isWhite() != board[coordinates.getX()][coordinates.getY()].getPiece().isWhite()){
                    c = new Coordinates(coordinates.getX()+2 , coordinates.getY()-1);
                    allowedMoves.add(c);
                }
            }
        }

        if (coordinates.getX()+1 <8 && coordinates.getY()-2 >=0){
            if(board[coordinates.getX()+1][coordinates.getY()-2].getPiece() ==null){
                c = new Coordinates(coordinates.getX()+1 , coordinates.getY()-2);
                allowedMoves.add(c);
            }else{
                if(board[coordinates.getX()+1][coordinates.getY()-2].getPiece().isWhite() != board[coordinates.getX()][coordinates.getY()].getPiece().isWhite()){
                    c = new Coordinates(coordinates.getX()+1 , coordinates.getY()-2);
                    allowedMoves.add(c);
                }
            }
        }

        if (coordinates.getX()-2 >= 0 && coordinates.getY()-1 >=0){
            if(board[coordinates.getX()-2][coordinates.getY()-1].getPiece() ==null){
                c = new Coordinates(coordinates.getX()-2 , coordinates.getY()-1);
                allowedMoves.add(c);
            }else{
                if(board[coordinates.getX()-2][coordinates.getY()-1].getPiece().isWhite() != board[coordinates.getX()][coordinates.getY()].getPiece().isWhite()){
                    c = new Coordinates(coordinates.getX()-2 , coordinates.getY()-1);
                    allowedMoves.add(c);
                }
            }
        }

        if (coordinates.getX()-1 >=0  && coordinates.getY()-2 >=0){
            if(board[coordinates.getX()-1][coordinates.getY()-2].getPiece() ==null){
                c = new Coordinates(coordinates.getX()-1 , coordinates.getY()-2);
                allowedMoves.add(c);
            }else{
                if(board[coordinates.getX()-1][coordinates.getY()-2].getPiece().isWhite() != board[coordinates.getX()][coordinates.getY()].getPiece().isWhite()){
                    c = new Coordinates(coordinates.getX()-1 , coordinates.getY()-2);
                    allowedMoves.add(c);
                }
            }
        }

        if (coordinates.getX()+2 <8 && coordinates.getY()+1 <8){
            if(board[coordinates.getX()+2][coordinates.getY()+1].getPiece() ==null){
                c = new Coordinates(coordinates.getX()+2 , coordinates.getY()+1);
                allowedMoves.add(c);
            }else{
                if(board[coordinates.getX()+2][coordinates.getY()+1].getPiece().isWhite() != board[coordinates.getX()][coordinates.getY()].getPiece().isWhite()){
                    c = new Coordinates(coordinates.getX()+2 , coordinates.getY()+1);
                    allowedMoves.add(c);
                }
            }
        }

        if (coordinates.getX()+1 <8 && coordinates.getY()+2 <8){
            if(board[coordinates.getX()+1][coordinates.getY()+2].getPiece() ==null){
                c = new Coordinates(coordinates.getX()+1 , coordinates.getY()+2);
                allowedMoves.add(c);
            }else{
                if(board[coordinates.getX()+1][coordinates.getY()+2].getPiece().isWhite() != board[coordinates.getX()][coordinates.getY()].getPiece().isWhite()){
                    c = new Coordinates(coordinates.getX()+1 , coordinates.getY()+2);
                    allowedMoves.add(c);
                }
            }
        }

        if (coordinates.getX()-2 >=0 && coordinates.getY()+1 <8){
            if(board[coordinates.getX()-2][coordinates.getY()+1].getPiece() ==null){
                c = new Coordinates(coordinates.getX()-2 , coordinates.getY()+1);
                allowedMoves.add(c);
            }else{
                if(board[coordinates.getX()-2][coordinates.getY()+1].getPiece().isWhite() != board[coordinates.getX()][coordinates.getY()].getPiece().isWhite()){
                    c = new Coordinates(coordinates.getX()-2 , coordinates.getY()+1);
                    allowedMoves.add(c);
                }
            }
        }

        if (coordinates.getX()-1 >=0 && coordinates.getY()+2 <8){
            if(board[coordinates.getX()-1][coordinates.getY()+2].getPiece() ==null){
                c = new Coordinates(coordinates.getX()-1 , coordinates.getY()+2);
                allowedMoves.add(c);
            }else{
                if(board[coordinates.getX()-1][coordinates.getY()+2].getPiece().isWhite() != board[coordinates.getX()][coordinates.getY()].getPiece().isWhite()){
                    c = new Coordinates(coordinates.getX()-1 , coordinates.getY()+2);
                    allowedMoves.add(c);
                }
            }
        }

        return allowedMoves;
    }
}
