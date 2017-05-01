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
public class P10_NoDivideByZero {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        double x = input.nextDouble();
        double y = input.nextDouble();
        double z = input.nextDouble();
        if(z!=0){
            System.out.format("%f",(x+y)/z);
        }else{
            System.out.println("cannot divide by zero");
        }
    }
}
