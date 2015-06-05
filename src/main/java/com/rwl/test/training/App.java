/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rwl.test.training;

import java.util.Scanner;

/**
 *
 * @author Thanthathon
 */
public class App {

    /**
     * @param args the command line arguments
     */
    private static int fibo[];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;

        System.out.println("Fibonacci Algorithm\n");
        System.out.print("Please input a number : ");
        n = scanner.nextInt();
        fibo = new int[n];
        fibonacci(n);
        int length = fibo.length;
        System.out.println("number of fibonacci is " + n);
        System.out.print("fibonacci sequence is ");
        for (int i = 0; i < length; i++) {
            if (i != length - 1) {
                System.out.print(fibo[i] + " , ");
            } else {
                System.out.println(fibo[i]);
            }
        }
    }

    private static int fibonacci(int n) {
        if (n > 2) {
            fibo[n - 1] = fibonacci(n - 1) + fibonacci(n - 2);
            return fibo[n - 1];
        } else if (n > 0) {
            fibo[n - 1] = 1;
            return 1;
        } else {
            throw new IllegalArgumentException("Number must be more than zero");
        }
    }
}
