//package com.SAP.IntorToJava;
import java.util.Arrays;
import java.util.Scanner;
public class Plato {
    public static void main(String[] args) {
        String s;
        Scanner sc = new Scanner(System.in);
        s = sc.nextLine();
        char[] symbol = s.toCharArray();
        char c = symbol[0];
        int curr = 1;
        int result = 1;
        for(int i=1;i<s.length();i++){
            if(symbol[i] == c){
                curr ++;
            }
            else{
                if(curr> result) result = curr;
                curr = 1;
            }
            c = symbol[i];

        }
        if(curr> result) result = curr;
        System.out.println(result);
    }
}
