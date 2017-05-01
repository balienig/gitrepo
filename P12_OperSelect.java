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
public class P12_OperSelect {

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        int y = input.nextInt();
        int z = input.nextInt();

        if (z == 1) {
            System.out.println(x + y);
        }
        if (z == 2) {
            System.out.println(x - y);
        }
        if (z == 3) {
            System.out.println(x * y);
        }
        if (z == 4) {
            if (y == 0) {
                System.out.println("cannot divide by zero");
            } else {
                System.out.println(x / y);
            }
        }
        if (z == 5) {
            if (y == 0) {
                System.out.println("cannot divide by zero");
            } else {
                System.out.println(x % y);
            }
        }
    }
}
