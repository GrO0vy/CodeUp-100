package com.example.codeup;

import java.util.Scanner;

public class CodeUp1071 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num;
        while(true){
            num = sc.nextInt();
            if(num == 0) break;
            System.out.println(num);
        }

        sc.close();
    }
}
