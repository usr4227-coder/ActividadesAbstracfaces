package net.salesianos.figuras;

/*
 * Clase que representa un círculo.
 * Implementa la interfaz CalculoBidimensional
 * para calcular su área y perímetro.
 */
public class Circulo implements CalculoBidimensional {

    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * radio * radio;
    }

    @Override
    public double calcularPerimetro() {
        return 2 * Math.PI * radio;
    }

    public double getRadio() {
        return radio;
    }
}
