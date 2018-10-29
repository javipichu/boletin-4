/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin4_4;

/**
 *
 * @author jalvarezotero
 */
  public class Polbo {

    private int cantPolbo;
    private int cantPatatas;

    public Polbo() {
    }

    public Polbo(int polbo, int patatas) {
        this.cantPolbo = polbo;
        this.cantPatatas = patatas;
    }

    public int clientes() {
        int c = 0;
        int a = this.cantPolbo;
        int b = this.cantPatatas;
        while ((a - 2 >= 0) && (b >= 1)) {
            c = c + 3;
            a = a - 2;
            b = b - 1;
        }
        return c;
    }

    public int comen() {
        int c = 0;
        while ((this.cantPolbo - 2 >= 0) && (this.cantPatatas >= 1)) {
            c = c + 3;
            this.cantPolbo = this.cantPolbo - 2;
            this.cantPatatas = this.cantPatatas - 1;
        }
        return c;
    }

    public void engadirPolbo(int x) {
        this.cantPolbo = this.cantPolbo + x;
    }

    public void engadirPatatas(int x) {
        this.cantPatatas = this.cantPatatas + x;
    }

    public void amosarPolbo() {
        System.out.print("\nA cantidade de polbo é: " + this.cantPolbo);
    }

    public void amosarPatatas() {
        System.out.println("\nA cantidade de patatas é: " + this.cantPatatas);
    }

}  

