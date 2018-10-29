/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin4_3;

/**
 *
 * @author jalvarezotero
 */
public class Boletin4_3 {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
              
        Circulo circulo1 = new Circulo(5.5);
        System.out.println(circulo1.getRadio());
        circulo1.setRadio(6.5);
        System.out.println(circulo1.getRadio());
        System.out.println(circulo1.calcularArea());
        System.out.println(circulo1.calcularPerimetro());
    }
    
}
   
    

