package com.example.codeup;

import java.util.Scanner;

public class CodeUp1056 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean num1 = sc.nextInt() !=0;
        boolean num2 = sc.nextInt() !=0;

        if(num1 != num2) System.out.println(1);
        else System.out.println(0);
    }
}
