package com.bridgelabz.tictactoe;

import java.util.Scanner;

public class TicTacToe {
    public static void main(String[] args) {
        System.out.println("Welocome to Tic-tac-Toe Masters");
        uc1();
    }
    static void uc1(){
        char[] arr = new char[10];
        arr[0] = ' ';
        for(int i=1; i<10; i++){
            arr[i] = ' ';
        }
    }
}
