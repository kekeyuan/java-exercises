package com.example.exercises;

/*
 print an American flag on the screen
 */

public class Exercise1 {
    public static void main(String[] args) {

        for (int a = 0; a < 3; a++) {
            for (int b = 0; b < 6; b++) {
                System.out.print("* ");
            }

            for (int c = 0; c < 25; c++) {
                System.out.print("=");
            }
            System.out.println();

            for (int b = 0; b < 5; b++) {
                System.out.print(" *");
            }
            System.out.print(" ");

            for (int c = 0; c < 26; c++) {
                System.out.print("=");
            }
            System.out.println();
        }

        for (int a = 0; a < 1; a++) {
            for (int d = 0; d < 6; d++) {
                System.out.print("* ");
            }

            for (int e = 0; e < 25; e++) {
                System.out.print("=");
            }
            System.out.println();
        }

        for (int f = 0; f < 6; f++) {
            for (int h = 0; h < 37; h++) {
                System.out.print("=");
            }
            System.out.println();
        }

    }
}

