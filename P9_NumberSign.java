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
public class P9_NumberSign {
    public static void main(String args[]){
    Scanner input = new Scanner(System.in);
    int scan = input.nextInt();
    if(scan > 0){
        System.out.println("positive");
    }else if(scan == 0){
        System.out.println("zero");
    }else{
        System.out.println("negative");
    }
    }
}
