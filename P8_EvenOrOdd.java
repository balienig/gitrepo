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
public class P8_EvenOrOdd {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        int scan = input.nextInt();
        if(scan%2==0){
            System.out.println("even");
        }else{
            System.out.println("odd");
        }
    }
}
