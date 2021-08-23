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
public class The_Hurdle_Race {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int max = 0;
        for (int i = 0; i < n; i++) {
            max = Math.max(max, in.nextInt());
        }
        if (k - max < 0) {
            System.out.println(Math.abs(k - max));
        } else {
            System.out.println(0);
        }
    }
}
