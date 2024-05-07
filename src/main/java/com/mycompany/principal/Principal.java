/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.principal;

/**
 * @author Fer
*/

public class Principal {
    public static void main(String[] args) {
        Punto2D puntoA = new Punto2D(42, 2);
        Punto2D puntoB = new Punto2D(4, 6);
        Punto2D puntoC = new Punto2D(1, 3);

        Triangulo triangulo = new Triangulo(puntoA, puntoB, puntoC);

        System.out.println("Información del triángulo:");
        System.out.println(triangulo.toString());
    }
}
