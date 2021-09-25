package com.geekyscript;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();

        for(int i=0; i<t; i++){
            int n = scn.nextInt();

            int count=0;
            for(int j = 2; j*j<=n; j++){
                if(n%j==0){
                    count++;
                    break;
                }
            }

            if(count==0){
                System.out.println("Prime");
            }
            else{
                System.out.println("Not Prime");
            }

        }
    }
}
