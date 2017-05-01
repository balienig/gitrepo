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
public class P6_SecondLast {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        int scan = input.nextInt();
        System.out.println(((scan%100)-scan%10)/10);
    }
}
