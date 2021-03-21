/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example;
import java.util.Scanner;
/**
 *
 * @author anshenoy
 */
public class SwitchEx1 {

    public static void main(String args[]) {
        int day;
        Scanner sc=new Scanner(System.in);
        System.out.println("Ingresa el mes en numero");
        day=sc.nextInt();
        switch(day){
            case 1:
                System.out.println("Enero");
                break;
            case 2:
                System.out.println("Febrero");
                break;
            case 3:
                System.out.println("Marzo");
                break;
            default:
                System.out.println("Mes Invalido");
        }
    }
    
}
