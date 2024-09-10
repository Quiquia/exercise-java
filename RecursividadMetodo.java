import java.util.Scanner;

public class RecursividadMetodo {

    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        // Llamar a los métodos para ejecutar la lógica
        FibonacciCalculator(myScanner);

        // Cerrar el Scanner después de su uso
        myScanner.close();
    }

    public static void FibonacciCalculator(Scanner myScanner) {

        int posicion = 0;

        do {
            System.out.println("Introduce una posición o (escribe un número negativo si quieres salir): ");

            try {

                posicion = myScanner.nextInt();

                if (posicion < 0) {
                    System.out.println("Salisté del Programa.");
                } else {
                    double resultado = calcularFibonacci(posicion);
                    System.out.println("Posición " + posicion + ": " + resultado + "\n");
                }

            } catch (Exception e) {
                System.out.println("Error: Por favor, ingrese un número válido.");
                myScanner.next(); // Descartar la entrada no válida

            }

        } while (posicion > 0);

    }

    public static double calcularFibonacci(int posicion) {
        if (posicion == 0) {
            return 0;
        }
        if (posicion == 1) {
            return 1;
        }
        return calcularFibonacci(posicion - 1) + calcularFibonacci(posicion - 2);
    }

}
