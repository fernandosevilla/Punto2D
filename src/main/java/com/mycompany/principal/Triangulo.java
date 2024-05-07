/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.principal;

/**
 * @author Fer
*/

public class Triangulo extends Figura2D {
    enum Tipo {
        NO_TRIANGULO, EQUILATERO, ISOSCELES, ESCALENO;
    }

    Punto2D a, b, c;
    Tipo tipo;

    public Triangulo(Punto2D a, Punto2D b, Punto2D c) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.tipo = tipoTriangulo();
    }

    public Triangulo(double x1, double y1, double x2, double y2, double x3, double y3) {
        this.a = new Punto2D(x1, y1);
        this.b = new Punto2D(x2, y2);
        this.c = new Punto2D(x3, y3);
        this.tipo = tipoTriangulo();
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

    public boolean esTriangulo() {
        double area = area();

        return area != 0; // da true si no es 0
    }

    @Override
    public double area() {
        // se tiene que calcular las distancias 
        double lado1 = Punto2D.distancia(a, b);
        double lado2 = Punto2D.distancia(b, c);
        double lado3 = Punto2D.distancia(c, a);

        double semiperimetro = (lado1 + lado2 + lado3) / 2;

        return Math.sqrt(semiperimetro * (semiperimetro * lado1) * (semiperimetro * lado2) * (semiperimetro * lado3));
    }

    @Override
    public double perimetro() {
        double lado1 = Punto2D.distancia(a, b);
        double lado2 = Punto2D.distancia(b, c);
        double lado3 = Punto2D.distancia(c, a);

        return lado1 + lado2 + lado3;
    }

    @Override
    public String toString() {
        return "Punto A: " + getA() + "\n" +
               "Punto B: " + getB() + "\n" +
               "Punto C: " + getC() + "\n" +
               "Perímetro: " + perimetro() + "\n" +
               "Área: " + area() + "\n" +
               "Tipo de triángulo: " + tipo;
    }

    private Tipo tipoTriangulo() {
        if (!esTriangulo()) {
            return Tipo.NO_TRIANGULO;
        }

        double lado1 = Punto2D.distancia(a, b);
        double lado2 = Punto2D.distancia(b, c);
        double lado3 = Punto2D.distancia(c, a);

        if (lado1 == lado2 && lado2 == lado3) {
            return Tipo.EQUILATERO;
        } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
            return Tipo.ISOSCELES;
        } else {
            return Tipo.ESCALENO;
        }
    }
}
