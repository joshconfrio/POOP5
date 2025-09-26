/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop5;

/**
 *
 * @author joshy
 */
public class Circulo {
    // Atributos
    double PI = Math.PI;
    private double radio;

    // Métodos constructores
    public Circulo() {
    }

    public Circulo(double radio) {
        this.radio = radio;
    }

    // Getter
    public double getRadio() {
        return radio;
    }

    // Setter
    public void setRadio(double radio) {
        this.radio = radio;
    }

    // Método para calcular perímetro
    public double perimetro() {
        double perimetro = 2 * PI * radio;
        return perimetro;
    }

    // Método para calcular área
    public double area() {
        double area = PI * Math.pow(radio, 2);
        return area;
    }
}