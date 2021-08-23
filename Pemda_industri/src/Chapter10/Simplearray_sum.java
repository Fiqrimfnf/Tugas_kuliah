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
public class Simplearray_sum {
    
     static int simpleArraySum(int n, int[] ar) {

        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum = sum + ar[i];
        }
        return sum;
        // Complete this function
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for (int ar_i = 0; ar_i < n; ar_i++) {
            ar[ar_i] = in.nextInt();
        }
        int result = simpleArraySum(n, ar);
        System.out.println(result);
    }
}
