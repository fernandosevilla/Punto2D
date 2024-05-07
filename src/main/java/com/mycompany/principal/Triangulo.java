/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.principal;

/**
 * @author Fer
*/

public class Triangulo extends Figura2D {
    Punto2D a, b, c;

    public Triangulo(Punto2D a, Punto2D b, Punto2D c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public Punto2D getA() {
        return a;
    }

    public void setA(Punto2D a) {
        this.a = a;
    }

    public Punto2D getB() {
        return b;
    }

    public void setB(Punto2D b) {
        this.b = b;
    }

    public Punto2D getC() {
        return c;
    }

    public void setC(Punto2D c) {
        this.c = c;
    }

    @Override
    public double area(Figura2D figura) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public double perimetro(Figura2D figura) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    enum tipo {
        NO_TRIANGULO, EQUILATERO, ISOSCELES, ESCALENO;
    }
}
