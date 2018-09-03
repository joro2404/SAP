//package com.SAP.IntorToJava;
import java.util.Scanner;
import java.util.Arrays;


public class Anagram {
    public static void main(String[] args) {
        String s;
        Scanner sc = new Scanner(System.in);
        s = sc.nextLine();
        String[] arr = s.split(" ");
        char[] a = arr[0].toLowerCase().toCharArray();
        char[] b = arr[1].toLowerCase().toCharArray();
//        Arrays.sort(a);
//        Arrays.sort(b);
        for(int i =0; i<a.length;i++){
            for(int j=0;j<b.length;j++){
                if(a[i] == b[j]){
                    a[i] = 0;
                    b[j] = 0;

                }
            }
        }
        if(check(a) && check(b))System.out.println(true);
        else {
            System.out.println(false);
        }
//        System.out.println(a);
//        System.out.println(b);
    }
    public static boolean check(char[] s){
        for(int i=0;i<s.length;i++){
            if((s[i] >='A' && s[i]<='Z') || (s[i] >='a' && s[i]<='z'))return false;
        }
        return true;
    }
}
