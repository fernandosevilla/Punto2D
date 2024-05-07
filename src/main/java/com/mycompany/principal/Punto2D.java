/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.principal;

/**
 * @author Fer
 */
public class Punto2D {

    private double x, y;

    public Punto2D(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public static boolean distintos(Punto2D a, Punto2D b) {
        return !(a.equals(b)); // si son distintos da true, si son iguales false
    }

    public static double distancia(Punto2D a, Punto2D b) {
        return Math.sqrt(Math.abs(Math.pow((b.getX() - a.getX()), 2)) + Math.abs(Math.pow((b.getY() - a.getY()), 2)));
    }

    public static double calcularPendiente(Punto2D a, Punto2D b) {
        double calculoX = b.getX() - b.getX();

        if (calculoX == 0) {
            return Double.POSITIVE_INFINITY;
        } else {
            return (b.getY() - a.getY()) / calculoX;
        }
    }

    @Override
    public boolean equals(Object otro) {
        if (otro instanceof Punto2D) { // verifica si el objeto que se pasa como parametro es un Punto2D
            Punto2D otroPunto = (Punto2D) otro; // se convierte otro a Punto2D

            return this.getX() == otroPunto.getX() && this.getY() == otroPunto.getY(); // se comparan coordenadas
        }
        return false;
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }

}
