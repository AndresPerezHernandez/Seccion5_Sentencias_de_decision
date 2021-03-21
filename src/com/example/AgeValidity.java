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
public class AgeValidity {

    public static void main(String[] args) {
 int age;
 boolean drivingUnderAge;
 drivingUnderAge=false;
 Scanner scr =new Scanner(System.in);
        System.out.println("Ingresa tu Edad: ");
        age=scr.nextInt();
        if(age<=18)
        {
            drivingUnderAge=true;
        }
        System.out.println(drivingUnderAge);
 
       
    }
}
