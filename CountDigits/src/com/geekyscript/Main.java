package com.geekyscript;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int t = n;
        int count = 0;
        while(t != 0){
            t = t/10;
            count++;
        }
        System.out.println(count);
    }
}
