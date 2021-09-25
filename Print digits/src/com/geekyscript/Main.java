package com.geekyscript;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int dig = nod(n);
        int div = (int)Math.pow(10, dig-1);
        while(div!=0){
             int q = n/div;
             System.out.println(q);
             n = n%div;
             div = div/10;
        }

    }
    public static int nod(int a){
        int t = a;
        int c = 0;
        while(t!=0){
            t = t/10;
            c++;
        }
        return c;
    }
}
