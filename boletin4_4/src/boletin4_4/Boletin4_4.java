/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin4_4;

import java.util.Scanner;

/**
 *
 * @author jalvarezotero
 */
public class Boletin4_4 {

    /**
     * @param args the command line arguments
     */
       public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Polbo restaurante = new Polbo(2, 3);
        Boolean r;
        Boolean s = false;

        while (s == false) {
            restaurante.amosarPolbo();
            restaurante.amosarPatatas();

            System.out.print("Pueden comer: " + restaurante.clientes()
                    + " clientes");
            System.out.println("\nComen?(true/false): ");
            r = ler.nextBoolean();

            if (r == true) {
                restaurante.comen();
            }
            restaurante.amosarPolbo();
            restaurante.amosarPatatas();

            System.out.print("\nCuantos kg de Polbo engade?: ");
            restaurante.engadirPolbo(ler.nextInt());
            System.out.print("Cuantos kg de Patatas engade?: ");
            restaurante.engadirPatatas(ler.nextInt());

            System.out.println("Quiere salir?(true/false): ");
            s = ler.nextBoolean();
        }

        /*System.out.print("\nPueden comer: "
            + restaurante.clientes()+" clientes");
            System.out.print("\nComen?(true/false): ");
            r = ler.nextBoolean();
            if (r=true){
                restaurante.comen();
            } 
    
            restaurante.amosarPolbo();
            restaurante.amosarPatatas();
         */
    }

}
    
    

