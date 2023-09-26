package com.gitPractice;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        int sum;
        System.out.println("please input first number ");
        Scanner sc = new Scanner(System.in);
        int a =sc.nextInt();
        System.out.println("please input Second number ");
        Scanner sc1 = new Scanner(System.in);
        int b =sc.nextInt();
        sum = a+b;
        System.out.println("the sum is "+sum);
    }
}
