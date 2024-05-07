/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.principal;

/**
 * @author Fer
*/

public class Principal {
    public static void main(String[] args) {
        // no es triangulo
        Punto2D puntoA1 = new Punto2D(0, 0);
        Punto2D puntoB1 = new Punto2D(1, 1);
        Punto2D puntoC1 = new Punto2D(2, 2);
        Triangulo triangulo1 = new Triangulo(puntoA1, puntoB1, puntoC1);
        System.out.println(triangulo1);
        System.out.println();

        // isosceles
        Punto2D puntoA2 = new Punto2D(0, 0);
        Punto2D puntoB2 = new Punto2D(4, 0);
        Punto2D puntoC2 = new Punto2D(2, 3);
        Triangulo triangulo2 = new Triangulo(puntoA2, puntoB2, puntoC2); 
        System.out.println(triangulo2);
        System.out.println();

        // escaleno
        Punto2D puntoA3 = new Punto2D(-2, 0);
        Punto2D puntoB3 = new Punto2D(2, 0);
        Punto2D puntoC3 = new Punto2D(0, 4);
        Triangulo triangulo3 = new Triangulo(puntoA3, puntoB3, puntoC3);
        System.out.println(triangulo3);
        System.out.println();

        // equilatero
        Punto2D puntoA4 = new Punto2D(0, 0);
        Punto2D puntoB4 = new Punto2D(4, 0);
        Punto2D puntoC4 = new Punto2D(2, 3.464);
        Triangulo triangulo4 = new Triangulo(puntoA4, puntoB4, puntoC4);
        System.out.println(triangulo4);
    }
}
