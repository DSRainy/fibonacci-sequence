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
        System.out.print("Please input a number of fibonacci seq : ");
        n = scanner.nextInt();

        fibo = Fibonacci.getFibonacciSequence(n);

        int length = fibo.length;
        System.out.print("fibonacci sequence is ");
        for (int i = 0; i < length; i++) {
            if (i != length - 1) {
                System.out.print(fibo[i] + " , ");
            } else {
                System.out.println(fibo[i]);
            }
        }
    }
}
