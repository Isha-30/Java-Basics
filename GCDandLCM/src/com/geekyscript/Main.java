package com.geekyscript;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner s = new Scanner(System.in);
        int n1 = s.nextInt();
        int n2 = s.nextInt();
        int a = n1;
        int b = n2;
        while(a % b != 0){
            int r = a%b;
            a = b;
            b = r;
        }
        int gcd = b;
        int lcm = (n1*n2)/gcd;
        System.out.println(gcd);
        System.out.println(lcm);
    }
}
