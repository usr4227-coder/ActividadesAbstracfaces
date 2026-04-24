package net.salesianos.vehiculos;

/*
 * Clase que representa un coche de combustión.
 * Extiende de Vehiculo e implementa la lógica necesaria
 * para arrancar, parar el motor y mover el coche consumiendo combustible.
 */
public class CocheCombustion extends Vehiculo {

    private boolean motorEncendido;
    private int litrosCombustible;

    public CocheCombustion(String color, int numeroPuertas, int numeroRuedas,
            String modelo, String matricula, int litrosCombustible) {

        super(color, numeroPuertas, numeroRuedas, modelo, matricula);
        this.motorEncendido = false;
        this.litrosCombustible = litrosCombustible;
    }

    public int getLitrosCombustible() {
        return litrosCombustible;
    }

    public void setLitrosCombustible(int litrosCombustible) {
        this.litrosCombustible = litrosCombustible;
    }

    @Override
    public void arrancar() {
        if (litrosCombustible > 0) {
            motorEncendido = true;
            litrosCombustible--;
            System.out.println("El motor ha arrancado. Combustible restante: " + litrosCombustible);
        } else {
            motorEncendido = false;
            System.out.println("No se puede arrancar. No hay combustible.");
        }
    }

    @Override
    public void pararMotor() {
        motorEncendido = false;
        System.out.println("El motor se ha apagado.");
    }

    @Override
    public void mover() {
        if (!motorEncendido) {
            System.out.println("No se puede mover. El motor está apagado.");
            return;
        }

        if (litrosCombustible <= 0) {
            System.out.println("No se puede mover. No queda combustible.");
            pararMotor();
            return;
        }

        litrosCombustible--;
        System.out.println("El coche se mueve. Combustible restante: " + litrosCombustible);
    }
}
