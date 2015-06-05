/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rwl.test.training;

/**
 *
 * @author Thanthathon
 */
public class Fibonacci {

    private static int[] fibo;

    public static int fibonacci(int n) {
        if (n > 2) {
            return fibonacci(n - 1) + fibonacci(n - 2);
        } else if (n > 0) {
            return 1;
        } else {
            throw new IllegalArgumentException("Number must be more than zero");
        }
    }

    public static int[] getFibonacciSequence(int n) {
        fibo = new int[n];
        for (int i = 1; i <= n; i++) {
            fibo[i - 1] = fibonacci(i);
        }
        return fibo;
    }

    public static void printFibonacci() {
        if (fibo != null) {
            int length = fibo.length;
            for (int i = 0; i < length; i++) {
                if (i != length - 1) {
                    System.out.print(fibo[i] + " , ");
                } else {
                    System.out.println(fibo[i]);
                }
            }
        }
    }

}
