package com.example.codeup;

import java.util.Scanner;

public class CodeUp1074 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        for(int i=num; i>=1; i--) System.out.println(i);

        sc.close();
    }
}
