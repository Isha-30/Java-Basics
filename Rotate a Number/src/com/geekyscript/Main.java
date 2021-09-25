package com.geekyscript;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int k = s.nextInt();
        int t = n;
        if(k>=0){
            int p = (int)Math.pow(10, k);
            int q = t/p;
            int r = t%p;
            int dig = nod(q);
            int num = r*(int)Math.pow(10, dig) + q;
            System.out.println(num);
        }

        if(k<0){
            int dig = nod(t);
            int p = (int)Math.pow(10, dig+k);
            int q = t/p;
            int r = t%p;
            int num = r*(int)Math.pow(10,-k)+ q;
            System.out.println(num);
        }
    }
    public static int nod(int a){
        int count = 0;
        while(a!=0){
            a = a/10;
            count++;
        }
        return count;
    }
}
