/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter10;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class minimax_sum {
    
    
 public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long arr[] = new long[5];
        for (int arr_i = 0; arr_i < 5; arr_i++) {
            arr[arr_i] = in.nextLong();
        }
        long minVal = 0, maxVal = 0;
        for (int i = 0; i < 5; i++) {
            long minf = sumOfNumbers(i, arr);
            long maxf = sumOfNumbers(i, arr);
            if (i == 0) {
                minVal = minf;
                maxVal = maxf;
            }
            if (minf < minVal) {
                minVal = minf;
            }
            if (maxf > maxVal) {
                maxVal = maxf;
            }
        }
        System.out.println(minVal + " " + maxVal);
    }
 
    static long sumOfNumbers(int a, long[] arr) {
        long sum = 0;
        for (int i = 0; i < 5; i++) {
            if (a != i) {
                sum += arr[i];
            }
        }
        return sum;
    }
}

