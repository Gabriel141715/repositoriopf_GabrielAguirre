
package javaapplication5;

import java.util.Scanner;

public class pf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar nombre del cliente
        System.out.print("Ingrese el nombre del cliente: ");
        String nombreCliente = scanner.nextLine();

        // Ingreso de las tres compras
        System.out.print("Ingrese el valor de la primera compra: ");
        double compra1 = scanner.nextDouble();

        System.out.print("Ingrese el valor de la segunda compra: ");
        double compra2 = scanner.nextDouble();

        System.out.print("Ingrese el valor de la tercera compra: ");
        double compra3 = scanner.nextDouble();

        // Cálculos
        double totalCompras = compra1 + compra2 + compra3;
        double promedioCompras = totalCompras / 3;

        // Resultados
        System.out.println("\nResumen del cliente: " + nombreCliente);
        System.out.println("Total de compras: $" + totalCompras);
        System.out.println("Promedio de compras: $" + promedioCompras);
    }
}
