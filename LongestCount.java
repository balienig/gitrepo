/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compro2;

import java.util.Scanner;

/**
 *
 * @author BALIENIG
 */
public class LongestCount {

    public static void main(String args[]) {
        int max = Integer.MIN_VALUE;
        Scanner input = new Scanner(System.in);
        int count = 0;
        int saveLine = 0;
        while (true) {
            count++;
            String str = input.nextLine();
            if (str.length() == 0) {
                break;
            }
            if (str.length() >= max) {
                saveLine++;
                if (str.length() != max) {
                    saveLine = 1;
                }
                max = str.length();
                
            }
        }
        System.out.println(max);
        System.out.println(saveLine);
    }
}
