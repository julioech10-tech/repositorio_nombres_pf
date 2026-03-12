import java.util.Scanner;

public class ProyectoFinal {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        String nombre;
        double compra1, compra2, compra3;
        double total, promedio;

        System.out.print("Ingrese el nombre del cliente: ");
        nombre = leer.nextLine();

        System.out.print("Ingrese compra 1: ");
        compra1 = leer.nextDouble();

        System.out.print("Ingrese compra 2: ");
        compra2 = leer.nextDouble();

        System.out.print("Ingrese compra 3: ");
        compra3 = leer.nextDouble();

        total = compra1 + compra2 + compra3;
        promedio = total / 3;

        System.out.println("\nNombre del cliente: " + nombre);
        System.out.println("Total compras: " + total);
        System.out.println("Promedio compras: " + promedio);

    }
}