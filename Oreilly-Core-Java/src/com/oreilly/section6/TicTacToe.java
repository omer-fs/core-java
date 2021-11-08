package com.oreilly.section6;

import java.util.Scanner;

public class TicTacToe {
    public static String[][] gameBoard=new String[3][3];
    public static int placed=0;
    public static boolean turn=true;
    public static int row=0;
    public static int column=0;
    public static void main(String[] args) {
        initializeGameBoard();
        playGame();
    }
    public static void initializeGameBoard()
    {
        for(int i=0;i<gameBoard.length;i++)
        {
            for(int j=0;j<gameBoard[i].length;j++)
            {
                gameBoard[i][j]="0";
            }
        }
    }
    public static void playGame()
    {
        Scanner keyboard=new Scanner(System.in);
        while (true)
        {
            if (placed==9)
            {
                System.out.println("draw match!!game over");
                printBoard();
                break;
            }
            if(checkIfXWins())
            {
                printBoard();
                System.out.println("X won the game!!");
                break;
            }
            if(checkIfYWins())
            {
                printBoard();
                System.out.println("Y won the game!!");
                break;
            }
            printBoard();
            if(turn)
            {
                System.out.println("player X turn");
                System.out.println("please enter row and column number");
                row=keyboard.nextInt();
                column=keyboard.nextInt();
                if(checkBoard(row,column))
                {
                    placeAtPosition(row,column,"X");
                    placed+=1;
                }
                else
                {
                    continue;
                }
            }
            else
            {
                System.out.println("player Y turn");
                System.out.println("please enter row and column number");
                row=keyboard.nextInt();
                column=keyboard.nextInt();
                if(checkBoard(row,column))
                {
                    placeAtPosition(row,column,"Y");
                    placed+=1;
                }
                else
                {
                    continue;
                }
            }
            turn=!turn;
        }
    }
    public static void printBoard()
    {
        for(int i=0;i<gameBoard.length;i++)
        {
            for(int j=0;j<gameBoard[i].length;j++)
            {
                if(j==gameBoard[i].length-1)
                    System.out.print(gameBoard[i][j]);
                else
                    System.out.print(gameBoard[i][j]+" | ");
            }
            if(i==gameBoard.length-1)
                continue;
            System.out.println("\n_ _ _ _ _");
        }
        System.out.println();
    }
    public static boolean checkBoard(int r,int c)
    {
        if(!gameBoard[r-1][c-1].equals("X") && !gameBoard[r-1][c-1].equals("Y"))
            return true;
        return false;
    }
    public static void placeAtPosition(int r,int c,String value)
    {
        gameBoard[r-1][c-1]=value;
    }
    public static boolean checkIfXWins()
    {
        if((gameBoard[0][0].equals("X") && gameBoard[0][1].equals("X") && gameBoard[0][2].equals("X"))||(gameBoard[1][0].equals("X") && gameBoard[1][1].equals("X") && gameBoard[1][2].equals("X"))||(gameBoard[2][0].equals("X") && gameBoard[2][1].equals("X") && gameBoard[2][2].equals("X"))||(gameBoard[0][0].equals("X") && gameBoard[1][0].equals("X") && gameBoard[2][0].equals("X"))||(gameBoard[0][1].equals("X") && gameBoard[1][1].equals("X") && gameBoard[2][1].equals("X"))||(gameBoard[0][2].equals("X") && gameBoard[1][2].equals("X") && gameBoard[2][2].equals("X"))||(gameBoard[0][0].equals("X") && gameBoard[1][1].equals("X") && gameBoard[2][2].equals("X"))||(gameBoard[0][2].equals("X") && gameBoard[1][1].equals("X") && gameBoard[2][0].equals("X")))
            return true;
        else
            return false;
    }
    public static boolean checkIfYWins()
    {
        if((gameBoard[0][0].equals("Y") && gameBoard[0][1].equals("Y") && gameBoard[0][2].equals("Y"))||(gameBoard[1][0].equals("Y") && gameBoard[1][1].equals("Y") && gameBoard[1][2].equals("Y"))||(gameBoard[2][0].equals("Y") && gameBoard[2][1].equals("Y") && gameBoard[2][2].equals("Y"))||(gameBoard[0][0].equals("Y") && gameBoard[1][0].equals("Y") && gameBoard[2][0].equals("Y"))||(gameBoard[0][1].equals("Y") && gameBoard[1][1].equals("Y") && gameBoard[2][1].equals("Y"))||(gameBoard[0][2].equals("Y") && gameBoard[1][2].equals("Y") && gameBoard[2][2].equals("Y"))||(gameBoard[0][0].equals("Y") && gameBoard[1][1].equals("Y") && gameBoard[2][2].equals("Y"))||(gameBoard[0][2].equals("Y") && gameBoard[1][1].equals("Y") && gameBoard[2][0].equals("Y")))
            return true;
        else
            return false;
    }
}
