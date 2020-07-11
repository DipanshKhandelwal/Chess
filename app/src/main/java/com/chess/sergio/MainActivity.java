package com.chess.sergio;

import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.chess.sergio.R;
import com.github.bhlangonijr.chesslib.Board;
import com.github.bhlangonijr.chesslib.File;
import com.github.bhlangonijr.chesslib.Piece;
import com.github.bhlangonijr.chesslib.PieceType;
import com.github.bhlangonijr.chesslib.Rank;
import com.github.bhlangonijr.chesslib.Square;
import com.github.bhlangonijr.chesslib.move.Move;
import com.tapadoo.alerter.Alerter;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    public Boolean AnythingSelected = false;

    private Square oldPosition;
    private Square clickedPosition;

    public TextView[][] displayBoard = new TextView[8][8];
    public TextView[][] displayBoardBackground = new TextView[8][8];


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
        displayBoard[0][7] = (TextView) findViewById(R.id.R00);
        displayBoardBackground[0][7] = (TextView) findViewById(R.id.R000);
        displayBoard[1][7] = (TextView) findViewById(R.id.R10);
        displayBoardBackground[1][7] = (TextView) findViewById(R.id.R010);
        displayBoard[2][7] = (TextView) findViewById(R.id.R20);
        displayBoardBackground[2][7] = (TextView) findViewById(R.id.R020);
        displayBoard[3][7] = (TextView) findViewById(R.id.R30);
        displayBoardBackground[3][7] = (TextView) findViewById(R.id.R030);
        displayBoard[4][7] = (TextView) findViewById(R.id.R40);
        displayBoardBackground[4][7] = (TextView) findViewById(R.id.R040);
        displayBoard[5][7] = (TextView) findViewById(R.id.R50);
        displayBoardBackground[5][7] = (TextView) findViewById(R.id.R050);
        displayBoard[6][7] = (TextView) findViewById(R.id.R60);
        displayBoardBackground[6][7] = (TextView) findViewById(R.id.R060);
        displayBoard[7][7] = (TextView) findViewById(R.id.R70);
        displayBoardBackground[7][7] = (TextView) findViewById(R.id.R070);

        displayBoard[0][6] = (TextView) findViewById(R.id.R01);
        displayBoardBackground[0][6] = (TextView) findViewById(R.id.R001);
        displayBoard[1][6] = (TextView) findViewById(R.id.R11);
        displayBoardBackground[1][6] = (TextView) findViewById(R.id.R011);
        displayBoard[2][6] = (TextView) findViewById(R.id.R21);
        displayBoardBackground[2][6] = (TextView) findViewById(R.id.R021);
        displayBoard[3][6] = (TextView) findViewById(R.id.R31);
        displayBoardBackground[3][6] = (TextView) findViewById(R.id.R031);
        displayBoard[4][6] = (TextView) findViewById(R.id.R41);
        displayBoardBackground[4][6] = (TextView) findViewById(R.id.R041);
        displayBoard[5][6] = (TextView) findViewById(R.id.R51);
        displayBoardBackground[5][6] = (TextView) findViewById(R.id.R051);
        displayBoard[6][6] = (TextView) findViewById(R.id.R61);
        displayBoardBackground[6][6] = (TextView) findViewById(R.id.R061);
        displayBoard[7][6] = (TextView) findViewById(R.id.R71);
        displayBoardBackground[7][6] = (TextView) findViewById(R.id.R071);

        displayBoard[0][5] = (TextView) findViewById(R.id.R02);
        displayBoardBackground[0][5] = (TextView) findViewById(R.id.R002);
        displayBoard[1][5] = (TextView) findViewById(R.id.R12);
        displayBoardBackground[1][5] = (TextView) findViewById(R.id.R012);
        displayBoard[2][5] = (TextView) findViewById(R.id.R22);
        displayBoardBackground[2][5] = (TextView) findViewById(R.id.R022);
        displayBoard[3][5] = (TextView) findViewById(R.id.R32);
        displayBoardBackground[3][5] = (TextView) findViewById(R.id.R032);
        displayBoard[4][5] = (TextView) findViewById(R.id.R42);
        displayBoardBackground[4][5] = (TextView) findViewById(R.id.R042);
        displayBoard[5][5] = (TextView) findViewById(R.id.R52);
        displayBoardBackground[5][5] = (TextView) findViewById(R.id.R052);
        displayBoard[6][5] = (TextView) findViewById(R.id.R62);
        displayBoardBackground[6][5] = (TextView) findViewById(R.id.R062);
        displayBoard[7][5] = (TextView) findViewById(R.id.R72);
        displayBoardBackground[7][5] = (TextView) findViewById(R.id.R072);

        displayBoard[0][4] = (TextView) findViewById(R.id.R03);
        displayBoardBackground[0][4] = (TextView) findViewById(R.id.R003);
        displayBoard[1][4] = (TextView) findViewById(R.id.R13);
        displayBoardBackground[1][4] = (TextView) findViewById(R.id.R013);
        displayBoard[2][4] = (TextView) findViewById(R.id.R23);
        displayBoardBackground[2][4] = (TextView) findViewById(R.id.R023);
        displayBoard[3][4] = (TextView) findViewById(R.id.R33);
        displayBoardBackground[3][4] = (TextView) findViewById(R.id.R033);
        displayBoard[4][4] = (TextView) findViewById(R.id.R43);
        displayBoardBackground[4][4] = (TextView) findViewById(R.id.R043);
        displayBoard[5][4] = (TextView) findViewById(R.id.R53);
        displayBoardBackground[5][4] = (TextView) findViewById(R.id.R053);
        displayBoard[6][4] = (TextView) findViewById(R.id.R63);
        displayBoardBackground[6][4] = (TextView) findViewById(R.id.R063);
        displayBoard[7][4] = (TextView) findViewById(R.id.R73);
        displayBoardBackground[7][3] = (TextView) findViewById(R.id.R073);

        displayBoard[0][3] = (TextView) findViewById(R.id.R04);
        displayBoardBackground[0][3] = (TextView) findViewById(R.id.R004);
        displayBoard[1][3] = (TextView) findViewById(R.id.R14);
        displayBoardBackground[1][3] = (TextView) findViewById(R.id.R014);
        displayBoard[2][3] = (TextView) findViewById(R.id.R24);
        displayBoardBackground[2][3] = (TextView) findViewById(R.id.R024);
        displayBoard[3][3] = (TextView) findViewById(R.id.R34);
        displayBoardBackground[3][3] = (TextView) findViewById(R.id.R034);
        displayBoard[4][3] = (TextView) findViewById(R.id.R44);
        displayBoardBackground[4][3] = (TextView) findViewById(R.id.R044);
        displayBoard[5][3] = (TextView) findViewById(R.id.R54);
        displayBoardBackground[5][3] = (TextView) findViewById(R.id.R054);
        displayBoard[6][3] = (TextView) findViewById(R.id.R64);
        displayBoardBackground[6][3] = (TextView) findViewById(R.id.R064);
        displayBoard[7][3] = (TextView) findViewById(R.id.R74);
        displayBoardBackground[7][3] = (TextView) findViewById(R.id.R074);

        displayBoard[0][2] = (TextView) findViewById(R.id.R05);
        displayBoardBackground[0][2] = (TextView) findViewById(R.id.R005);
        displayBoard[1][2] = (TextView) findViewById(R.id.R15);
        displayBoardBackground[1][2] = (TextView) findViewById(R.id.R015);
        displayBoard[2][2] = (TextView) findViewById(R.id.R25);
        displayBoardBackground[2][2] = (TextView) findViewById(R.id.R025);
        displayBoard[3][2] = (TextView) findViewById(R.id.R35);
        displayBoardBackground[3][2] = (TextView) findViewById(R.id.R035);
        displayBoard[4][2] = (TextView) findViewById(R.id.R45);
        displayBoardBackground[4][2] = (TextView) findViewById(R.id.R045);
        displayBoard[5][2] = (TextView) findViewById(R.id.R55);
        displayBoardBackground[5][2] = (TextView) findViewById(R.id.R055);
        displayBoard[6][2] = (TextView) findViewById(R.id.R65);
        displayBoardBackground[6][2] = (TextView) findViewById(R.id.R065);
        displayBoard[7][2] = (TextView) findViewById(R.id.R75);
        displayBoardBackground[7][2] = (TextView) findViewById(R.id.R075);

        displayBoard[0][1] = (TextView) findViewById(R.id.R06);
        displayBoardBackground[0][1] = (TextView) findViewById(R.id.R006);
        displayBoard[1][1] = (TextView) findViewById(R.id.R16);
        displayBoardBackground[1][1] = (TextView) findViewById(R.id.R016);
        displayBoard[2][1] = (TextView) findViewById(R.id.R26);
        displayBoardBackground[2][1] = (TextView) findViewById(R.id.R026);
        displayBoard[3][1] = (TextView) findViewById(R.id.R36);
        displayBoardBackground[3][1] = (TextView) findViewById(R.id.R036);
        displayBoard[4][1] = (TextView) findViewById(R.id.R46);
        displayBoardBackground[4][1] = (TextView) findViewById(R.id.R046);
        displayBoard[5][1] = (TextView) findViewById(R.id.R56);
        displayBoardBackground[5][1] = (TextView) findViewById(R.id.R056);
        displayBoard[6][1] = (TextView) findViewById(R.id.R66);
        displayBoardBackground[6][1] = (TextView) findViewById(R.id.R066);
        displayBoard[7][1] = (TextView) findViewById(R.id.R76);
        displayBoardBackground[7][1] = (TextView) findViewById(R.id.R076);

        displayBoard[0][0] = (TextView) findViewById(R.id.R07);
        displayBoardBackground[0][0] = (TextView) findViewById(R.id.R007);
        displayBoard[1][0] = (TextView) findViewById(R.id.R17);
        displayBoardBackground[1][0] = (TextView) findViewById(R.id.R017);
        displayBoard[2][0] = (TextView) findViewById(R.id.R27);
        displayBoardBackground[2][0] = (TextView) findViewById(R.id.R027);
        displayBoard[3][0] = (TextView) findViewById(R.id.R37);
        displayBoardBackground[3][0] = (TextView) findViewById(R.id.R037);
        displayBoard[4][0] = (TextView) findViewById(R.id.R47);
        displayBoardBackground[4][0] = (TextView) findViewById(R.id.R047);
        displayBoard[5][0] = (TextView) findViewById(R.id.R57);
        displayBoardBackground[5][0] = (TextView) findViewById(R.id.R057);
        displayBoard[6][0] = (TextView) findViewById(R.id.R67);
        displayBoardBackground[6][0] = (TextView) findViewById(R.id.R067);
        displayBoard[7][0] = (TextView) findViewById(R.id.R77);
        displayBoardBackground[7][0] = (TextView) findViewById(R.id.R077);

        refreshBoard();
    }

    private void refreshBoard() {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {

                Square square = getSquare(i, j);
                Piece piece = board.getPiece(square);

                putPiece(i, j, piece);
            }
        }

    }

    private void putPiece(int i, int j, Piece piece) {
        if (displayBoard[i][j].getBackground()!=null){
            displayBoard[i][j].setBackground(null);
        }
        switch (piece) {
            case WHITE_KING:
                displayBoard[i][j].setBackgroundResource(R.drawable.wking);
                break;
            case BLACK_KING:
                displayBoard[i][j].setBackgroundResource(R.drawable.bking);
                break;

            case WHITE_QUEEN:
                displayBoard[i][j].setBackgroundResource(R.drawable.wqueen);
                break;
            case BLACK_QUEEN:
                displayBoard[i][j].setBackgroundResource(R.drawable.bqueen);
                break;
            case WHITE_ROOK:
                displayBoard[i][j].setBackgroundResource(R.drawable.wrook);
                break;
            case BLACK_ROOK:
                displayBoard[i][j].setBackgroundResource(R.drawable.brook);
                break;
            case WHITE_BISHOP:
                displayBoard[i][j].setBackgroundResource(R.drawable.wbishop);
                break;
            case BLACK_BISHOP:
                displayBoard[i][j].setBackgroundResource(R.drawable.bbishop);
                break;
            case WHITE_KNIGHT:
                displayBoard[i][j].setBackgroundResource(R.drawable.wknight);
                break;
            case BLACK_KNIGHT:
                displayBoard[i][j].setBackgroundResource(R.drawable.bknight);
                break;
            case WHITE_PAWN:
                displayBoard[i][j].setBackgroundResource(R.drawable.wpawn);
                break;
            case BLACK_PAWN:
                displayBoard[i][j].setBackgroundResource(R.drawable.bpawn);
                break;
            default:
                displayBoard[i][j].setBackgroundResource(0);
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

        if (clickedPosition!=null && board.getPiece(clickedPosition)!=null) {
            oldPosition = clickedPosition;
        }else{
            oldPosition= null;
            AnythingSelected=false;
        }
        switch (v.getId()) {
            case R.id.R00:
            case R.id.R000:
                clickedPosition = getSquare(0, 7);
                break;
            case R.id.R10:
            case R.id.R010:
                clickedPosition = getSquare(1, 7);
                break;
            case R.id.R20:
            case R.id.R020:
                clickedPosition = getSquare(2, 7);
                break;
            case R.id.R30:
            case R.id.R030:
                clickedPosition = getSquare(3, 7);
                break;
            case R.id.R40:
            case R.id.R040:
                clickedPosition = getSquare(4, 7);
                break;
            case R.id.R50:
            case R.id.R050:
                clickedPosition = getSquare(5, 7);
                break;
            case R.id.R60:
            case R.id.R060:
                clickedPosition = getSquare(6, 7);
                break;
            case R.id.R70:
            case R.id.R070:
                clickedPosition = getSquare(7, 7);
                break;

            case R.id.R01:
            case R.id.R001:
                clickedPosition = getSquare(0, 6);
                break;
            case R.id.R11:
            case R.id.R011:
                clickedPosition = getSquare(1, 6);
                break;
            case R.id.R21:
            case R.id.R021:
                clickedPosition = getSquare(2, 6);
                break;
            case R.id.R31:
            case R.id.R031:
                clickedPosition = getSquare(3, 6);
                break;
            case R.id.R41:
            case R.id.R041:
                clickedPosition = getSquare(4, 6);
                break;
            case R.id.R51:
            case R.id.R051:
                clickedPosition = getSquare(5, 6);
                break;
            case R.id.R61:
            case R.id.R061:
                clickedPosition = getSquare(6, 6);
                break;
            case R.id.R71:
            case R.id.R071:
                clickedPosition = getSquare(7, 6);
                break;

            case R.id.R02:
            case R.id.R002:
                clickedPosition = getSquare(0, 5);
                break;
            case R.id.R12:
            case R.id.R012:
                clickedPosition = getSquare(1, 5);
                break;
            case R.id.R22:
            case R.id.R022:
                clickedPosition = getSquare(2, 5);
                break;
            case R.id.R32:
            case R.id.R032:
                clickedPosition = getSquare(3, 5);
                break;
            case R.id.R42:
            case R.id.R042:
                clickedPosition = getSquare(4, 5);
                break;
            case R.id.R52:
            case R.id.R052:
                clickedPosition = getSquare(5, 5);
                break;
            case R.id.R62:
            case R.id.R062:
                clickedPosition = getSquare(6, 5);
                break;
            case R.id.R72:
            case R.id.R072:
                clickedPosition = getSquare(7, 5);
                break;

            case R.id.R03:
            case R.id.R003:
                clickedPosition = getSquare(0, 4);
                break;
            case R.id.R13:
            case R.id.R013:
                clickedPosition = getSquare(1, 4);
                break;
            case R.id.R23:
            case R.id.R023:
                clickedPosition = getSquare(2, 4);
                break;
            case R.id.R33:
            case R.id.R033:
                clickedPosition = getSquare(3, 4);
                break;
            case R.id.R43:
            case R.id.R043:
                clickedPosition = getSquare(4, 4);
                break;
            case R.id.R53:
            case R.id.R053:
                clickedPosition = getSquare(5, 4);
                break;
            case R.id.R63:
            case R.id.R063:
                clickedPosition = getSquare(6, 4);
                break;
            case R.id.R73:
            case R.id.R073:
                clickedPosition = getSquare(7, 4);
                break;

            case R.id.R04:
            case R.id.R004:
                clickedPosition = getSquare(0, 3);
                break;
            case R.id.R14:
            case R.id.R014:
                clickedPosition = getSquare(1, 3);
                break;
            case R.id.R24:
            case R.id.R024:
                clickedPosition = getSquare(2, 3);
                break;
            case R.id.R34:
            case R.id.R034:
                clickedPosition = getSquare(3, 3);
                break;
            case R.id.R44:
            case R.id.R044:
                clickedPosition = getSquare(4, 3);
                break;
            case R.id.R54:
            case R.id.R054:
                clickedPosition = getSquare(5, 3);
                break;
            case R.id.R64:
            case R.id.R064:
                clickedPosition = getSquare(6, 3);
                break;
            case R.id.R74:
            case R.id.R074:
                clickedPosition = getSquare(7, 3);
                break;

            case R.id.R05:
            case R.id.R005:
                clickedPosition = getSquare(0, 2);
                break;
            case R.id.R15:
            case R.id.R015:
                clickedPosition = getSquare(1, 2);
                break;
            case R.id.R25:
            case R.id.R025:
                clickedPosition = getSquare(2, 2);
                break;
            case R.id.R35:
            case R.id.R035:
                clickedPosition = getSquare(3, 2);
                break;
            case R.id.R45:
            case R.id.R045:
                clickedPosition = getSquare(4, 2);
                break;
            case R.id.R55:
            case R.id.R055:
                clickedPosition = getSquare(5, 2);
                break;
            case R.id.R65:
            case R.id.R065:
                clickedPosition = getSquare(6, 2);
                break;
            case R.id.R75:
            case R.id.R075:
                clickedPosition = getSquare(7, 2);
                break;

            case R.id.R06:
            case R.id.R006:
                clickedPosition = getSquare(0, 1);
                break;
            case R.id.R16:
            case R.id.R016:
                clickedPosition = getSquare(1, 1);
                break;
            case R.id.R26:
            case R.id.R026:
                clickedPosition = getSquare(2, 1);
                break;
            case R.id.R36:
            case R.id.R036:
                clickedPosition = getSquare(3, 1);
                break;
            case R.id.R46:
            case R.id.R046:
                clickedPosition = getSquare(4, 1);
                break;
            case R.id.R56:
            case R.id.R056:
                clickedPosition = getSquare(5, 1);
                break;
            case R.id.R66:
            case R.id.R066:
                clickedPosition = getSquare(6, 1);
                break;
            case R.id.R76:
            case R.id.R076:
                clickedPosition = getSquare(7, 1);
                break;

            case R.id.R07:
            case R.id.R007:
                clickedPosition = getSquare(0, 0);
                break;
            case R.id.R17:
            case R.id.R017:
                clickedPosition = getSquare(1, 0);
                break;
            case R.id.R27:
            case R.id.R027:
                clickedPosition = getSquare(2, 0);
                break;
            case R.id.R37:
            case R.id.R037:
                clickedPosition = getSquare(3, 0);
                break;
            case R.id.R47:
            case R.id.R047:
                clickedPosition = getSquare(4, 0);
                break;
            case R.id.R57:
            case R.id.R057:
                clickedPosition = getSquare(5, 0);
                break;
            case R.id.R67:
            case R.id.R067:
                clickedPosition = getSquare(6, 0);
                break;
            case R.id.R77:
            case R.id.R077:
                clickedPosition = getSquare(7, 0);
                break;
        }

        if (clickedPosition!=null) {
            if (oldPosition != null) {
                resetColorAtLastPosition(oldPosition);
            }
            setColorAtSelectedSquare(clickedPosition);

            if (AnythingSelected) {
                Move move = new Move(oldPosition, clickedPosition);
                if (board.getPiece(oldPosition)!=null && board.getPiece(oldPosition).getPieceSide().equals(board.getSideToMove()) && board.isMoveLegal(move, true)) {
                    board.doMove(move);
                    refreshBoard();
                }
            } else {
                if (!board.getPiece(clickedPosition).equals(Piece.NONE)) {
                    AnythingSelected = true;
                }
            }
        }
    }

    public void undo(View v) {

        if (!board.getBackup().isEmpty()) {
            board.undoMove();
            refreshBoard();
        }

    }

    void setColorAtSelectedSquare(Square square) {
        if (board.getPiece(square).getPieceType()==null || board.getPiece(square).getPieceType().equals(PieceType.NONE)) {
            displayBoardBackground[square.getFile().ordinal()][square.getRank().ordinal()].setBackgroundResource(R.color.colorPositionAvailable);
        } else {
            displayBoardBackground[square.getFile().ordinal()][square.getRank().ordinal()].setBackgroundResource(R.color.colorDanger);
        }
    }

    private void resetColorAtLastPosition(Square square) {
        if ((square.getFile().ordinal() + square.getRank().ordinal()) % 2 == 0) {
            displayBoardBackground[square.getFile().ordinal()][square.getRank().ordinal()].setBackgroundResource(R.color.colorBoardDark);
        } else {
            displayBoardBackground[square.getFile().ordinal()][square.getRank().ordinal()].setBackgroundResource(R.color.colorBoardLight);
        }
    }

}