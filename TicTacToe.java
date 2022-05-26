package com.bridgelabz.tictactoe;
import java.util.Random;
import java.util.Scanner;

public class TicTacToe {
    static char[] arr = new char[10];
    static char user ;
    static char computer;
    static int counter=0;
    static int toss=0;


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Welocome to Tic-tac-Toe Masters");
        uc1();
        uc2();
        uc6();

    }
    public static void uc1(){
        arr[0] = ' ';
        for(int i=1; i<10; i++){
            arr[i] = ' ';
        }
    }
    public static void uc2(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your symbol ,X - O");
        user = sc.next().charAt(0);
        if (user == 'X' || user == 'x'){
            System.out.println("User choose X");
            System.out.println("Computer have O");
            computer = 'O';
        }else {
            System.out.println("User choose O");
            System.out.println("Computer have X");
            computer = 'X';
        }
    }
    public static void uc3(){
        System.out.println();
        for (int i=1;i<4;i++){
            System.out.print(arr[i]+" | ");
        }
        System.out.println();
        for (int i=4;i<7;i++){
            System.out.print(arr[i]+" | ");
        }
        System.out.println();
        for (int i=7;i<10;i++){
            System.out.print(arr[i]+" | ");
        }
    }
    public static void uc4(){
        Scanner sc = new Scanner(System.in);
        System.out.println();
        if(counter < 10){
            System.out.println("please choose the position (1-9)");
            int pos = sc.nextInt();

            if(arr[pos] == ' ') {
                arr[pos] = user;
                //counter++;
            }else{
                System.out.println("Entered position is not empty please try again");
                uc4();
            }
        }else{
            System.out.println("No more free space");
        }
        uc3();
    }
    public static void uc5(){
        Random random = new Random();
        System.out.println();
        if(counter<9){
            System.out.println("computer's turn");

            int pos = random.nextInt(9)+1;
            if(arr[pos] == ' ') {
                arr[pos] = computer;
                //counter++;
            }else{
                uc5();
            }
        }else{
            System.out.println("no more free space");
        }
        uc3();
    }
    public static void uc6(){
        Random random = new Random();
        toss = random.nextInt(2);
        if(toss == 0){
            System.out.println("user will play first");
            while(counter<10) {
                if (counter % 2 == 0) {
                    uc4();
                } else {
                    uc5();
                }
                counter++;
            }
        }else{
            System.out.println("Computer will play first");
            while(counter<10) {
                if (counter % 2 == 1) {
                    uc4();
                } else {
                    uc5();
                }
                counter++;
            }
        }

    }
}
