package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        square();
        triangle1();
        triangle2();
        triangle3();
        triangle4();
        triangle5();
        triangle6();
        rectangle();
    }
    public static void rectangle(){
        System.out.println("\n***************Rectangle********************\n");
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(" * ");
            }
            System.out.println("");
        }
        System.out.println("\n***************Rectangle 2********************\n");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(" * ");
            }
            System.out.println("");
        }


    }
    public static void square(){
        System.out.println("\n***************Square********************\n");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(" * ");
            }
            System.out.println("");
        }

    }
    public static void triangle1(){

        System.out.println("\n*******Bottom left half square*********************\n");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(" * ");
            }
            System.out.println("");
        }

    }
    public static void triangle2(){
        System.out.println("\n**************Top left half square**************\n");
        for (int i = 5; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print(" * ");
            }
            System.out.println("");
        }
    }


    public static void triangle3(){

        System.out.println("\n***************Top right half of a square ******************\n");
        int x = 1;
        for (int i = 5; i > 0; i--) {

            for (int j = 0; j < i; j++) {
                System.out.print(" * ");
            }
            System.out.println("");
            for (int a = 0; a < x; a++) {
                System.out.print("   ");
            }
            x++;
        }

    }

    public static void triangle4(){
        System.out.println("\n***************Bottom Right Half of the square ******************\n");
        int x =4;
        for(int i=1; i <=5; i++){
            for(int a=x; a>0;a--){
                System.out.print("   ");
            }
            for(int j = i; j >0; j--){
                System.out.print(" * ");
            }
            System.out.println("");

            x--;
        }
    }

    public static void triangle5(){
        System.out.println("\n***************Pyramid triangle******************\n");
        int x =10;
        for(int i=1; i <=11; i++){
            for(int a=x; a>0;a--){
                System.out.print(" ");
            }
            for(int j = 0; j <i; j++){
                System.out.print("* ");
            }
            System.out.println("");

            x--;

        }
    }
    public static void triangle6(){
        System.out.println("\n***************Triangle reverse******************\n");
        int x =0;
        for(int i=11; i >=1; i--){
            for(int j =i; j >0; j--){
                System.out.print("* ");
            }
            System.out.println("");
            for(int a=0; a<=x;a++){
                System.out.print(" ");
            }
            x++;

        }
    }

}
