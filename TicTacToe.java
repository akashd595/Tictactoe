package com.bridgelabz.tictactoe;
import java.util.Scanner;

public class TicTacToe {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Welocome to Tic-tac-Toe Masters");
        char[] arr = new char[10];
        uc1(arr);
        System.out.println("Please enter your symbol ,X - O");
        uc2(arr);
        uc3(arr);

    }
    public static void uc1(char[] arr){
        arr[0] = ' ';
        for(int i=1; i<10; i++){
            arr[i] = ' ';
        }
    }
    public static void uc2(char[] arr){

        Scanner sc = new Scanner(System.in);
        char user = sc.next().charAt(0);
        char computer;
        if (user == 'X'){
            System.out.println("User choose X");
            System.out.println("Computer have O");
            computer = 'O';
        }else {
            System.out.println("User choose O");
            System.out.println("Computer have X");
            computer = 'X';
        }
    }
    public static void uc3(char[] arr){
        for (int i=1;i<4;i++){
            System.out.print(arr[i]+" | ");
        }
        System.out.println();
        for (int i=5;i<8;i++){
            System.out.print(arr[i]+" | ");
        }
        System.out.println();
        for (int i=7;i<10;i++){
            System.out.print(arr[i]+" | ");

        }
        System.out.println();
    }
}
