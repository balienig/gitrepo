/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compro2;

import static java.lang.Math.abs;
import java.util.Scanner;

/**
 *
 * @author BALIENIG
 */
public class P13_AbsoluteValue {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        int scan = input.nextInt();
        System.out.println(abs(scan));
    }
}
