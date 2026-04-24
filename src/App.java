import java.util.Scanner;

import net.salesianos.figuras.Rectangulo;
import net.salesianos.figuras.Circulo;
import net.salesianos.vehiculos.CocheCombustion;

/*
 * Clase principal del proyecto. 
 * Aquí se ejecutan las dos partes de la práctica: 
 * primero las figuras geométricas y luego el coche de combustión.
 * Se encarga de pedir los datos necesarios y mostrar los resultados por consola.
 */

public class App {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        ejecutarFiguras(scanner);
        ejecutarVehiculos();

        scanner.close();
    }

    private static void ejecutarFiguras(Scanner scanner) {

        System.out.println(" RECTÁNGULO:");
        System.out.print("Introduce la base: ");
        double base = scanner.nextDouble();

        System.out.print("Introduce la altura: ");
        double altura = scanner.nextDouble();

        Rectangulo rectangulo = new Rectangulo(base, altura);

        System.out.println("\nBase: " + base);
        System.out.println("Altura: " + altura);
        System.out.println("Área: " + rectangulo.calcularArea());
        System.out.println("Perímetro: " + rectangulo.calcularPerimetro());

        System.out.println("\n CÍRCULO:");
        System.out.print("Introduce el radio: ");
        double radio = scanner.nextDouble();

        Circulo circulo = new Circulo(radio);

        System.out.println("\nRadio: " + radio);
        System.out.println("Área: " + circulo.calcularArea());
        System.out.println("Perímetro: " + circulo.calcularPerimetro());
    }

    private static void ejecutarVehiculos() {

        CocheCombustion coche = new CocheCombustion(
                "Plateado",
                2,
                4,
                "Aston Martin DB5",
                "JAMES BOND",
                20);

        coche.mover();
        coche.arrancar();
        coche.mover();
        coche.mover();
        coche.mover();

        System.out.println("\nCombustible restante: " + coche.getLitrosCombustible());

        coche.setLitrosCombustible(2);

        coche.mover();
        coche.mover();
        coche.mover();
    }
}
