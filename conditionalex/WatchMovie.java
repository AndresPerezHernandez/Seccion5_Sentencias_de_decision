/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conditionalex;

import java.util.Scanner;

/**
 *
 * @author anshenoy
 */
public class WatchMovie {

    public static void main(String args[]) {
        int priceMovie,rate;
        Scanner sc=new Scanner(System.in);
        System.out.print("Ingresa el precio de la pelicula \n");
        priceMovie=sc.nextInt();
        System.out.println("Ingresa el puntaje de la pelicula: ");
        rate= sc.nextInt();
        if(priceMovie>=12 && rate==5){
            System.out.println("Me interesa esta pelicula");
        }
        else
        {
            System.out.println("No me interesa esta pelicula");
        }
        

    }
}
