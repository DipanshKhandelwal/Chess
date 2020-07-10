package com.chess.sergio.board;

import android.app.AlertDialog;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.chess.sergio.R;
import com.github.bhlangonijr.chesslib.Board;
import com.github.bhlangonijr.chesslib.File;
import com.github.bhlangonijr.chesslib.Piece;
import com.github.bhlangonijr.chesslib.Rank;
import com.github.bhlangonijr.chesslib.Side;
import com.github.bhlangonijr.chesslib.Square;
import com.github.bhlangonijr.chesslib.move.Move;


import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    public Boolean AnythingSelected = false;

    private Square oldPosition;
    private Square clickedPosition;

    public TextView[][] DisplayBoard = new TextView[8][8];
    public TextView[][] DisplayBoardBackground = new TextView[8][8];

    public LinearLayout pawn_choices;


    Board board;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        board = new Board();
        // Making notification bar transparent
        if (Build.VERSION.SDK_INT >= 21) {
            getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LAYOUT_STABLE | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN);
        }
        setContentView(R.layout.activity_main);

        AnythingSelected = false;

        setupBoard();
    }
    private void setupBoard() {
        DisplayBoard[0][0] = (TextView) findViewById(R.id.R00);
        DisplayBoardBackground[0][0] = (TextView) findViewById(R.id.R000);
        DisplayBoard[1][0] = (TextView) findViewById(R.id.R10);
        DisplayBoardBackground[1][0] = (TextView) findViewById(R.id.R010);
        DisplayBoard[2][0] = (TextView) findViewById(R.id.R20);
        DisplayBoardBackground[2][0] = (TextView) findViewById(R.id.R020);
        DisplayBoard[3][0] = (TextView) findViewById(R.id.R30);
        DisplayBoardBackground[3][0] = (TextView) findViewById(R.id.R030);
        DisplayBoard[4][0] = (TextView) findViewById(R.id.R40);
        DisplayBoardBackground[4][0] = (TextView) findViewById(R.id.R040);
        DisplayBoard[5][0] = (TextView) findViewById(R.id.R50);
        DisplayBoardBackground[5][0] = (TextView) findViewById(R.id.R050);
        DisplayBoard[6][0] = (TextView) findViewById(R.id.R60);
        DisplayBoardBackground[6][0] = (TextView) findViewById(R.id.R060);
        DisplayBoard[7][0] = (TextView) findViewById(R.id.R70);
        DisplayBoardBackground[7][0] = (TextView) findViewById(R.id.R070);

        DisplayBoard[0][1] = (TextView) findViewById(R.id.R01);
        DisplayBoardBackground[0][1] = (TextView) findViewById(R.id.R001);
        DisplayBoard[1][1] = (TextView) findViewById(R.id.R11);
        DisplayBoardBackground[1][1] = (TextView) findViewById(R.id.R011);
        DisplayBoard[2][1] = (TextView) findViewById(R.id.R21);
        DisplayBoardBackground[2][1] = (TextView) findViewById(R.id.R021);
        DisplayBoard[3][1] = (TextView) findViewById(R.id.R31);
        DisplayBoardBackground[3][1] = (TextView) findViewById(R.id.R031);
        DisplayBoard[4][1] = (TextView) findViewById(R.id.R41);
        DisplayBoardBackground[4][1] = (TextView) findViewById(R.id.R041);
        DisplayBoard[5][1] = (TextView) findViewById(R.id.R51);
        DisplayBoardBackground[5][1] = (TextView) findViewById(R.id.R051);
        DisplayBoard[6][1] = (TextView) findViewById(R.id.R61);
        DisplayBoardBackground[6][1] = (TextView) findViewById(R.id.R061);
        DisplayBoard[7][1] = (TextView) findViewById(R.id.R71);
        DisplayBoardBackground[7][1] = (TextView) findViewById(R.id.R071);

        DisplayBoard[0][2] = (TextView) findViewById(R.id.R02);
        DisplayBoardBackground[0][2] = (TextView) findViewById(R.id.R002);
        DisplayBoard[1][2] = (TextView) findViewById(R.id.R12);
        DisplayBoardBackground[1][2] = (TextView) findViewById(R.id.R012);
        DisplayBoard[2][2] = (TextView) findViewById(R.id.R22);
        DisplayBoardBackground[2][2] = (TextView) findViewById(R.id.R022);
        DisplayBoard[3][2] = (TextView) findViewById(R.id.R32);
        DisplayBoardBackground[3][2] = (TextView) findViewById(R.id.R032);
        DisplayBoard[4][2] = (TextView) findViewById(R.id.R42);
        DisplayBoardBackground[4][2] = (TextView) findViewById(R.id.R042);
        DisplayBoard[5][2] = (TextView) findViewById(R.id.R52);
        DisplayBoardBackground[5][2] = (TextView) findViewById(R.id.R052);
        DisplayBoard[6][2] = (TextView) findViewById(R.id.R62);
        DisplayBoardBackground[6][2] = (TextView) findViewById(R.id.R062);
        DisplayBoard[7][2] = (TextView) findViewById(R.id.R72);
        DisplayBoardBackground[7][2] = (TextView) findViewById(R.id.R072);

        DisplayBoard[0][3] = (TextView) findViewById(R.id.R03);
        DisplayBoardBackground[0][3] = (TextView) findViewById(R.id.R003);
        DisplayBoard[1][3] = (TextView) findViewById(R.id.R13);
        DisplayBoardBackground[1][3] = (TextView) findViewById(R.id.R013);
        DisplayBoard[2][3] = (TextView) findViewById(R.id.R23);
        DisplayBoardBackground[2][3] = (TextView) findViewById(R.id.R023);
        DisplayBoard[3][3] = (TextView) findViewById(R.id.R33);
        DisplayBoardBackground[3][3] = (TextView) findViewById(R.id.R033);
        DisplayBoard[4][3] = (TextView) findViewById(R.id.R43);
        DisplayBoardBackground[4][3] = (TextView) findViewById(R.id.R043);
        DisplayBoard[5][3] = (TextView) findViewById(R.id.R53);
        DisplayBoardBackground[5][3] = (TextView) findViewById(R.id.R053);
        DisplayBoard[6][3] = (TextView) findViewById(R.id.R63);
        DisplayBoardBackground[6][3] = (TextView) findViewById(R.id.R063);
        DisplayBoard[7][3] = (TextView) findViewById(R.id.R73);
        DisplayBoardBackground[7][3] = (TextView) findViewById(R.id.R073);

        DisplayBoard[0][4] = (TextView) findViewById(R.id.R04);
        DisplayBoardBackground[0][4] = (TextView) findViewById(R.id.R004);
        DisplayBoard[1][4] = (TextView) findViewById(R.id.R14);
        DisplayBoardBackground[1][4] = (TextView) findViewById(R.id.R014);
        DisplayBoard[2][4] = (TextView) findViewById(R.id.R24);
        DisplayBoardBackground[2][4] = (TextView) findViewById(R.id.R024);
        DisplayBoard[3][4] = (TextView) findViewById(R.id.R34);
        DisplayBoardBackground[3][4] = (TextView) findViewById(R.id.R034);
        DisplayBoard[4][4] = (TextView) findViewById(R.id.R44);
        DisplayBoardBackground[4][4] = (TextView) findViewById(R.id.R044);
        DisplayBoard[5][4] = (TextView) findViewById(R.id.R54);
        DisplayBoardBackground[5][4] = (TextView) findViewById(R.id.R054);
        DisplayBoard[6][4] = (TextView) findViewById(R.id.R64);
        DisplayBoardBackground[6][4] = (TextView) findViewById(R.id.R064);
        DisplayBoard[7][4] = (TextView) findViewById(R.id.R74);
        DisplayBoardBackground[7][4] = (TextView) findViewById(R.id.R074);

        DisplayBoard[0][5] = (TextView) findViewById(R.id.R05);
        DisplayBoardBackground[0][5] = (TextView) findViewById(R.id.R005);
        DisplayBoard[1][5] = (TextView) findViewById(R.id.R15);
        DisplayBoardBackground[1][5] = (TextView) findViewById(R.id.R015);
        DisplayBoard[2][5] = (TextView) findViewById(R.id.R25);
        DisplayBoardBackground[2][5] = (TextView) findViewById(R.id.R025);
        DisplayBoard[3][5] = (TextView) findViewById(R.id.R35);
        DisplayBoardBackground[3][5] = (TextView) findViewById(R.id.R035);
        DisplayBoard[4][5] = (TextView) findViewById(R.id.R45);
        DisplayBoardBackground[4][5] = (TextView) findViewById(R.id.R045);
        DisplayBoard[5][5] = (TextView) findViewById(R.id.R55);
        DisplayBoardBackground[5][5] = (TextView) findViewById(R.id.R055);
        DisplayBoard[6][5] = (TextView) findViewById(R.id.R65);
        DisplayBoardBackground[6][5] = (TextView) findViewById(R.id.R065);
        DisplayBoard[7][5] = (TextView) findViewById(R.id.R75);
        DisplayBoardBackground[7][5] = (TextView) findViewById(R.id.R075);

        DisplayBoard[0][6] = (TextView) findViewById(R.id.R06);
        DisplayBoardBackground[0][6] = (TextView) findViewById(R.id.R006);
        DisplayBoard[1][6] = (TextView) findViewById(R.id.R16);
        DisplayBoardBackground[1][6] = (TextView) findViewById(R.id.R016);
        DisplayBoard[2][6] = (TextView) findViewById(R.id.R26);
        DisplayBoardBackground[2][6] = (TextView) findViewById(R.id.R026);
        DisplayBoard[3][6] = (TextView) findViewById(R.id.R36);
        DisplayBoardBackground[3][6] = (TextView) findViewById(R.id.R036);
        DisplayBoard[4][6] = (TextView) findViewById(R.id.R46);
        DisplayBoardBackground[4][6] = (TextView) findViewById(R.id.R046);
        DisplayBoard[5][6] = (TextView) findViewById(R.id.R56);
        DisplayBoardBackground[5][6] = (TextView) findViewById(R.id.R056);
        DisplayBoard[6][6] = (TextView) findViewById(R.id.R66);
        DisplayBoardBackground[6][6] = (TextView) findViewById(R.id.R066);
        DisplayBoard[7][6] = (TextView) findViewById(R.id.R76);
        DisplayBoardBackground[7][6] = (TextView) findViewById(R.id.R076);

        DisplayBoard[0][7] = (TextView) findViewById(R.id.R07);
        DisplayBoardBackground[0][7] = (TextView) findViewById(R.id.R007);
        DisplayBoard[1][7] = (TextView) findViewById(R.id.R17);
        DisplayBoardBackground[1][7] = (TextView) findViewById(R.id.R017);
        DisplayBoard[2][7] = (TextView) findViewById(R.id.R27);
        DisplayBoardBackground[2][7] = (TextView) findViewById(R.id.R027);
        DisplayBoard[3][7] = (TextView) findViewById(R.id.R37);
        DisplayBoardBackground[3][7] = (TextView) findViewById(R.id.R037);
        DisplayBoard[4][7] = (TextView) findViewById(R.id.R47);
        DisplayBoardBackground[4][7] = (TextView) findViewById(R.id.R047);
        DisplayBoard[5][7] = (TextView) findViewById(R.id.R57);
        DisplayBoardBackground[5][7] = (TextView) findViewById(R.id.R057);
        DisplayBoard[6][7] = (TextView) findViewById(R.id.R67);
        DisplayBoardBackground[6][7] = (TextView) findViewById(R.id.R067);
        DisplayBoard[7][7] = (TextView) findViewById(R.id.R77);
        DisplayBoardBackground[7][7] = (TextView) findViewById(R.id.R077);

        refreshBoard();
    }

        private void refreshBoard() {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {

                Square square = getSquare(i, j);
                Piece piece = board.getPiece(square);

                switch (piece) {
                    case WHITE_KING:
                        DisplayBoard[i][j].setBackgroundResource(R.drawable.wking);
                        break;
                    case BLACK_KING:
                        DisplayBoard[i][j].setBackgroundResource(R.drawable.bking);
                        break;

                    case WHITE_QUEEN:
                        DisplayBoard[i][j].setBackgroundResource(R.drawable.wqueen);
                        break;
                    case BLACK_QUEEN:
                        DisplayBoard[i][j].setBackgroundResource(R.drawable.bqueen);
                        break;
                    case WHITE_ROOK:
                        DisplayBoard[i][j].setBackgroundResource(R.drawable.wrook);
                        break;
                    case BLACK_ROOK:
                        DisplayBoard[i][j].setBackgroundResource(R.drawable.brook);
                        break;
                    case WHITE_BISHOP:
                        DisplayBoard[i][j].setBackgroundResource(R.drawable.wbishop);
                        break;
                    case BLACK_BISHOP:
                        DisplayBoard[i][j].setBackgroundResource(R.drawable.bbishop);
                        break;
                    case WHITE_KNIGHT:
                        DisplayBoard[i][j].setBackgroundResource(R.drawable.wknight);
                        break;
                    case BLACK_KNIGHT:
                        DisplayBoard[i][j].setBackgroundResource(R.drawable.bknight);
                        break;
                    case WHITE_PAWN:
                        DisplayBoard[i][j].setBackgroundResource(R.drawable.wpawn);
                        break;
                    case BLACK_PAWN:
                        DisplayBoard[i][j].setBackgroundResource(R.drawable.bpawn);
                        break;

                    default:

                }
        }
    }

}

    private Square getSquare(int f, int r) {
        Rank[] ranks = {Rank.RANK_1, Rank.RANK_2, Rank.RANK_3, Rank.RANK_4, Rank.RANK_5, Rank.RANK_6, Rank.RANK_7, Rank.RANK_8};
        File[] files = {File.FILE_A, File.FILE_B, File.FILE_C, File.FILE_D, File.FILE_E, File.FILE_F, File.FILE_G, File.FILE_H};
        Rank rank = ranks[r];
        File file = files[f];
        return Square.encode(rank, file);
    }

    @Override
    public void onClick(View v) {

        oldPosition = clickedPosition;
        switch (v.getId()) {
            case R.id.R00:
                clickedPosition = getSquare(0, 0);
                break;
            case R.id.R10:
                clickedPosition = getSquare(1, 0);
                break;
            case R.id.R20:
                clickedPosition = getSquare(1, 0);
                break;
            case R.id.R30:
                clickedPosition = getSquare(1, 0);
                break;
            case R.id.R40:
                clickedPosition = getSquare(1, 0);
                break;
            case R.id.R50:
                clickedPosition = getSquare(1, 0);
                break;
            case R.id.R60:
                clickedPosition = getSquare(1, 0);
                break;
            case R.id.R70:
                clickedPosition = getSquare(1, 0);
                break;

            case R.id.R01:
                clickedPosition = getSquare(1, 0);
                break;
            case R.id.R11:
                clickedPosition = getSquare(1, 0);
                break;
            case R.id.R21:
                clickedPosition = getSquare(1, 0);
                break;
            case R.id.R31:
                clickedPosition = getSquare(1, 0);
                break;
            case R.id.R41:
                clickedPosition = getSquare(1, 0);
                break;
            case R.id.R51:
                clickedPosition = getSquare(1, 0);
                break;
            case R.id.R61:
                clickedPosition = getSquare(1, 0);
                break;
            case R.id.R71:
                clickedPosition = getSquare(1, 0);
                break;

            case R.id.R02:
                clickedPosition = getSquare(1, 0);
                break;
            case R.id.R12:
                clickedPosition = getSquare(1, 0);
                break;
            case R.id.R22:
                clickedPosition = getSquare(1, 0);
                break;
            case R.id.R32:
                clickedPosition = getSquare(1, 0);
                break;
            case R.id.R42:
                clickedPosition = getSquare(1, 0);
                break;
            case R.id.R52:
                clickedPosition = getSquare(1, 0);
                break;
            case R.id.R62:
                clickedPosition = getSquare(1, 0);
                break;
            case R.id.R72:
                clickedPosition = getSquare(1, 0);
                break;

            case R.id.R03:
                clickedPosition = getSquare(1, 0);
                break;
            case R.id.R13:
                clickedPosition = getSquare(1, 0);
                break;
            case R.id.R23:
                clickedPosition = getSquare(1, 0);
                break;
            case R.id.R33:
                clickedPosition = getSquare(1, 0);
                break;
            case R.id.R43:
                clickedPosition = getSquare(1, 0);
                break;
            case R.id.R53:
                clickedPosition = getSquare(1, 0);
                break;
            case R.id.R63:
                clickedPosition = getSquare(1, 0);
                break;
            case R.id.R73:
                clickedPosition = getSquare(1, 0);
                break;

            case R.id.R04:
                clickedPosition = getSquare(1, 0);
                break;
            case R.id.R14:
                clickedPosition = getSquare(1, 0);
                break;
            case R.id.R24:
                clickedPosition = getSquare(1, 0);
                break;
            case R.id.R34:
                clickedPosition = getSquare(1, 0);
                break;
            case R.id.R44:
                clickedPosition = getSquare(1, 0);
                break;
            case R.id.R54:
                clickedPosition = getSquare(1, 0);
                break;
            case R.id.R64:
                clickedPosition = getSquare(1, 0);
                break;
            case R.id.R74:
                clickedPosition = getSquare(1, 0);
                break;

            case R.id.R05:
                clickedPosition = getSquare(1, 0);
                break;
            case R.id.R15:
                clickedPosition = getSquare(1, 0);
                break;
            case R.id.R25:
                clickedPosition = getSquare(1, 0);
                break;
            case R.id.R35:
                clickedPosition = getSquare(1, 0);
                break;
            case R.id.R45:
                clickedPosition = getSquare(1, 0);
                break;
            case R.id.R55:
                clickedPosition = getSquare(1, 0);
                break;
            case R.id.R65:
                clickedPosition = getSquare(1, 0);
                break;
            case R.id.R75:
                clickedPosition = getSquare(1, 0);
                break;

            case R.id.R06:
                clickedPosition = getSquare(1, 0);
                break;
            case R.id.R16:
                clickedPosition = getSquare(1, 0);
                break;
            case R.id.R26:
                clickedPosition = getSquare(1, 0);
                break;
            case R.id.R36:
                clickedPosition = getSquare(1, 0);
                break;
            case R.id.R46:
                clickedPosition = getSquare(1, 0);
                break;
            case R.id.R56:
                clickedPosition = getSquare(1, 0);
                break;
            case R.id.R66:
                clickedPosition = getSquare(1, 0);
                break;
            case R.id.R76:
                clickedPosition = getSquare(1, 0);
                break;

            case R.id.R07:
                clickedPosition = getSquare(1, 0);
                break;
            case R.id.R17:
                clickedPosition = getSquare(1, 0);
                break;
            case R.id.R27:
                clickedPosition = getSquare(1, 0);
                break;
            case R.id.R37:
                clickedPosition = getSquare(1, 0);
                break;
            case R.id.R47:
                clickedPosition = getSquare(1, 0);
                break;
            case R.id.R57:
                clickedPosition = getSquare(1, 0);
                break;
            case R.id.R67:
                clickedPosition = getSquare(1, 0);
                break;
            case R.id.R77:
                clickedPosition = getSquare(1, 0);
                break;
        }

        if (AnythingSelected) {
            Move move = new Move(oldPosition,clickedPosition);
            if (board.isMoveLegal(move,true)){
                board.doMove(move);
                refreshBoard();
            }else{
                new AlertDialog.Builder(MainActivity.this).setTitle( "Error" ).setMessage("Movimiento Ilegal").create().show();
            }

        }
    }

    public void undo(View v) {

        if (board.getMoveCounter()>0){
            board.undoMove();
            refreshBoard();
        }else{
            new AlertDialog.Builder(MainActivity.this).setTitle( "Error" ).setMessage("No hay movimientos anteriores").create().show();
        }

    }

    public void piece(View v){
        int x = v.getId();
        switch (x){
            case R.id.white_queen :
                if(clickedPosition!=null){
                    board.setPiece(Piece.WHITE_KING,clickedPosition);
                }else{
                    new AlertDialog.Builder(MainActivity.this).setTitle( "Error" ).setMessage("No has elegido posición").create().show();
                }
                break;

        }
    }

}