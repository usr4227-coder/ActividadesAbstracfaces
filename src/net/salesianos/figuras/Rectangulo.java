package net.salesianos.figuras;

/*
 * Clase que representa un rectángulo.
 * Implementa la interfaz CalculoBidimensional
 * para calcular su área y perímetro.
 */
public class Rectangulo implements CalculoBidimensional {

    private double base;
    private double altura;

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return base * altura;
    }

    @Override
    public double calcularPerimetro() {
        return 2 * (base + altura);
    }

    public double getBase() {
        return base;
    }

    public double getAltura() {
        return altura;
    }
}
