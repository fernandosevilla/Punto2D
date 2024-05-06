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

    public boolean distintos(Punto2D a, Punto2D b){
        return !(a.equals(b));
    }
    
    public double distancia(Punto2D a, Punto2D b) {
        return Math.sqrt(Math.pow((b.x - a.x),2) + Math.pow((b.y - a.y), 2));
    }
    
    public double calcularPendiente(Punto2D a, Punto2D b) {
        return (b.y - a.y) / (b.x - b.x);
    }
    
    @Override
    public boolean equals(Object otro) {
        // Verifica si el objeto pasado es un Punto2D
        if (otro instanceof Punto2D otroPunto) {
            // Comparar las coordenadas
            return this.x == otroPunto.x && this.y == otroPunto.y;
        }
        return false;
    }
    
//    @Override
//    public boolean equals(Object otro) {
//        // Verifica si el objeto pasado es un Punto2D
//        if (otro instanceof Punto2D) {
//            // Convertir el objeto a Punto2D
//            Punto2D otroPunto = (Punto2D) otro;
//            // Comparar las coordenadas
//            return this.x == otroPunto.x && this.y == otroPunto.y;
//        }
//        return false;
//    }
}
