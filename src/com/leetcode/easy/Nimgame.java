package com.leetcode.easy;

import java.util.Scanner;

public class Nimgame {
    public static boolean canWinNim(int n) {
        if ((n % 4) == 0)
            return false;
        else 
            return true;
        
    }
    public static void main(String args[]){
    	@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
    	System.out.println("enter number? ");
    	int input = sc.nextInt();
        if (canWinNim(input))
            System.out.println("you win");
        
        else
            System.out.println("you lose");

    }
}