import geometria.*;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int opcion;

        do {

            System.out.println("\n===== FIGURAS GEOMÉTRICAS =====");
            System.out.println("1. Círculo");
            System.out.println("2. Cuadrado");
            System.out.println("3. Rectángulo");
            System.out.println("4. Triángulo");
            System.out.println("5. Salir");

            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();

            if (opcion >= 1 && opcion <= 4) {

                sc.nextLine();

                System.out.print("Ingrese el color: ");
                String color = sc.nextLine();

                // Referencia de la clase padre
                FiguraGeometrica figura = null;

                try {

                    switch (opcion) {

                        case 1:
                            System.out.print("Ingrese el radio: ");
                            double radio = sc.nextDouble();

                            figura = new Circulo(color, radio);
                            break;

                        case 2:
                            System.out.print("Ingrese el lado: ");
                            double lado = sc.nextDouble();

                            figura = new Cuadrado(color, lado);
                            break;

                        case 3:
                            System.out.print("Ingrese la base: ");
                            double base = sc.nextDouble();

                            System.out.print("Ingrese la altura: ");
                            double altura = sc.nextDouble();

                            figura = new Rectangulo(
                                    color, base, altura
                            );
                            break;

                        case 4:
                            System.out.print("Ingrese lado 1: ");
                            double lado1 = sc.nextDouble();

                            System.out.print("Ingrese lado 2: ");
                            double lado2 = sc.nextDouble();

                            System.out.print("Ingrese lado 3: ");
                            double lado3 = sc.nextDouble();

                            figura = new Triangulo(
                                    color, lado1, lado2, lado3
                            );
                            break;
                    }

                    // POLIMORFISMO
                    if (figura != null) {
                        figura.imprimirDatos();
                    }

                } catch (IllegalArgumentException e) {
                    System.out.println(
                            "Error: " + e.getMessage()
                    );
                }

            } else if (opcion != 5) {
                System.out.println("Opción incorrecta");
            }

        } while (opcion != 5);

        System.out.println("Programa finalizado");

        sc.close();
    }
}