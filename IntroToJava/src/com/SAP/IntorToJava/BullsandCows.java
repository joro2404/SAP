package com.SAP.IntorToJava;
import java.util.Scanner;
import java.util.Arrays;

public class BullsandCows {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int gene = random(1000, 9999);
        //System.out.println(gene);

        int[] integers = new int[4];
        int[] desired = new int[4];
        int cows = 0;
        int bulls = 0;
        // Setting number to array for generated random number
        for (int i = 0; i < desired.length; i++) {
            int num2 = gene % 10;
            desired[i] = num2;
            gene = gene / 10;
        }
        //Making the array in right order

        swap(desired);

        //Making gene without same digits
        while (desired[0] == desired[1] || desired[0] == desired[2] || desired[0] == desired[3] || desired[1] == desired[2] || desired[1] == desired[3] || desired[2] == desired[3]) {
            gene = random(1000, 9999);
            for (int i = 0; i < desired.length; i++) {
                int num2 = gene % 10;
                desired[i] = num2;
                gene = gene / 10;
            }
        }
        for(int j : desired) {
            System.out.print(" " + j);
        }
        System.out.println();

        while (bulls <= 4) {
            cows = 0;
            bulls = 0;
            int guess = sc.nextInt();
            // Setting number to array for the input
            for (int i = 0; i < integers.length; i++) {
                int num1 = guess % 10;
                integers[i] = num1;
                guess = guess / 10;
            }

            swap(integers);

            for(int j : integers) {
                System.out.print(" " + j);
            }
            System.out.println();


            //Calculating bulls
            for (int p = 0; p < integers.length; p++) {
                if (integers[p] == desired[p]) bulls++;
            }

            //Calculating cows
            for (int i = 0; i < integers.length; i++) {
                for (int j = 0; j < desired.length; j++) {

                    if ((integers[i] == desired[j]) && i != j) cows++;
                }
            }

            cows = cows - bulls;
            System.out.println("Cows -> " + cows);
            System.out.println("Bulls -> " + bulls);

            /*for(int j : integers){
                System.out.print(j);
            }
            for(int j : desired){
                System.out.print(" "+j);
            }*/

        }
        System.out.println("You won !");
    }
    private static void swap(int[] s){
        int help1 = s[0];
        int help2 = s[1];
        s[0] = s[3];
        s[3] = help1;
        s[1] = s[2];
        s[2] = help2;

    }
    private  static int random(int min, int max){
        int range = (max - min) + 1;
        return (int)(Math.random() * range) + min;
    }


}
