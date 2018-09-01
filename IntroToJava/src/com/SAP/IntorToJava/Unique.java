package com.SAP.IntorToJava;

import java.util.Scanner;

public class Unique {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s ;

        s = sc.nextLine();

        for(int i=0; i<s.length();i++){
            for(int j=i+1;j<s.length();j++){
                if(s.charAt(i) == s.charAt(j)){
                    System.out.print(false);
                    return;

                }

            }

        }
        System.out.print(true);

    }

}
