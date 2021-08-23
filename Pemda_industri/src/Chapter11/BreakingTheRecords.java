/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter11;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class BreakingTheRecords {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(); //Number of scores

        int high = in.nextInt();
        int low = high;
        int highRecordsBroken = 0;
        int lowRecordsBroken = 0;

        for (int score = 1; score < n; score++) {
            int s = in.nextInt();

            if (s > high) {
                high = s;
                highRecordsBroken++;
            }

            if (s < low) {
                low = s;
                lowRecordsBroken++;
            }
        }
        System.out.println(highRecordsBroken + " " + lowRecordsBroken);
    }
}
