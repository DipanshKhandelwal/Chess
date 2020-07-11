package com.chess.sergio.utils;

public class FenUtils {
    public static String removeJump(String fen){
        return fen.replaceAll("/",":");
    }

    public static String addJump(String fen){
        return fen.replaceAll(":","/");
    }

}
