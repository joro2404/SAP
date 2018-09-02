package com.SAP.IntorToJava;
import java.util.Scanner;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Champion {
    public static void main(String[] args) {
        String s;
        Scanner sc = new Scanner(System.in);
        s = sc.nextLine();
        String[] arr = s.split(" ");
        int res = 1;
        int curr = 1;
        int check = 0;
        int num = 0 ;
        int symbol = Integer.parseInt(arr[0]);
        int[] integers = new int[arr.length];
        for(int p=0;p<arr.length;p++){
            integers[p] = Integer.parseInt(arr[p]);
        }
        Arrays.sort(integers);
        for(int j =1;j<arr.length;j++){
            if(integers[j] == symbol){
                curr++;
            }
            else {
                if(curr > res){
                    res = curr;
                    num = symbol;
                }
                symbol = integers[j];
                curr = 1;
            }
        }
        if(curr > res){
            res = curr;
            num = symbol;
        }


        //for(int i =0;i<arr.length;i++) {
            //System.out.print(" "+arr[i]);
        //}
        System.out.print(num);
        System.out.println(" "+res);

    }

}
