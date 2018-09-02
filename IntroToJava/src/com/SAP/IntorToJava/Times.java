
//package com.SAP.IntorToJava;


import java.util.Arrays;
import java.util.Scanner;

    public class Times {
        public static void main(String[] args) {
            String s;
            Scanner sc = new Scanner(System.in);
            s = sc.nextLine();
            String[] nums = s.split(" ");
            int[] result = solve(nums);
            for(int i = 0; i < result.length - 1; i++) {
                System.out.print(result[i] + " ");
            }
            System.out.println(result[result.length - 1]);
        }
          public static int[] solve(String[] s) {
            int l = s.length;
            int[] unique = getUniques(s);
            int[] count = new int[unique.length];
            for(int i = 0; i < unique.length; i++) {
                int c = 0;
                int a = unique[i];
                for(int j = 0; j < l; j++) {
                    if(a == Integer.parseInt(s[j])) c++;
                }
                count[i] = c;
            }
            int[] result = new int[unique.length * 2];
            for(int i = 0, j = 0; i < result.length; i += 2, j++) {
                result[i] = unique[j];
                result[i + 1] = count[j];
            }
            return result;
        }

        public static int[] getUniques(String[] s) {
            int l1 = s.length;
            int[] uniques = new int[l1];
            int l2 = 0;
            for(int i = 0;i < l1; i++) {
                int a = Integer.parseInt(s[i]);
                boolean isContains = false;
                for (int j = 0; j < l2; j++) {
                    if(a == uniques[j]) {
                        isContains = true;
                        break;
                    }
                }
                if(!isContains) {
                    uniques[l2] = a;
                    l2++;
                }
            }
            int[] finals = new int[l2];
            for(int i = 0; i < l2; i++) finals[i] = uniques[i];
            return finals;
        }
    }
