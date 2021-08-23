/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter12;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class Angry_Professor {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner input = new Scanner(System.in);
        int T = input.nextInt();

        testCases:
        for (int i = 0; i < T; i++) {
            int n = input.nextInt();
            int k = input.nextInt();
            int onTime = 0;
            for (int j = 0; j < n; j++) {
                int arrivalTime = input.nextInt();
                if (arrivalTime <= 0) {
                    onTime++;
                }
            }
            if (onTime >= k) {
                System.out.println("NO");
            } else {
                System.out.println("YES");
            }
        }
    }
}
