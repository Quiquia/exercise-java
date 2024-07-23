import java.util.Scanner;

public class ActividadIntegradoraII {

    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        // Llamar a los métodos para ejecutar la lógica
        // CalculoFactorial(myScanner);
        // Sumatoria(myScanner);
        // ImprovedFibonacciSeries(myScanner);
        // ImprovedFibonacciSeries(myScanner);

        // Cerrar el Scanner después de su uso
        myScanner.close();

    }

    public static void CalculoFactorial(Scanner myScanner) {

        System.out.println("Introduce una número o (escribe cero si quieres salir): ");
        int number = myScanner.nextInt();

        long factorial = 1;
        int i = 1;

        StringBuilder operacion = new StringBuilder("El factorial de " + number + " se calcula como ");

        do {

            if (number <= 0) {
                System.out.println("Salisté del Programa.");
                break;
            }

            factorial *= i;
            operacion.append(i);

            if (i < number) {
                operacion.append(" * ");
            }

            i++;

        } while (i <= number);

        if (number > 1) {

            operacion.append(" lo que resulta en ").append(factorial).append(".");
            System.out.println(operacion.toString());
        }

    }

    public static void Sumatoria(Scanner myScanner) {
        int sum = 0;
        int num;

        do {
            System.out.print("Ingresa un número (negativo para terminar): ");
            num = myScanner.nextInt();
            if (num >= 0) {
                sum += num;
            }
        } while (num >= 0);

        System.out.println("La sumatoria es " + sum);
    }

    public static void ImprovedFibonacciSeries(Scanner myScanner) {
        System.out.println("Introduce una posición o (escribe un número negativo si quieres salir): ");
        int posicion = myScanner.nextInt();

        double fib0 = 0;
        double fib1 = 1;
        double resultado = 0;
        int i = 2;

        boolean numNegative = posicion <= -1 ? true : false;

        do {

            if (numNegative) {
                System.out.println("Salisté del Programa.");
                break;
            }

            if (posicion == 0) {
                resultado = 0;
                break;
            }
            
            if (posicion == 1) {
                resultado = 1;
                break;
            }

            resultado = fib0 + fib1;
          

            fib0 = fib1;
            fib1 = resultado;
            i++;


        } while (i <= posicion);

        if (!numNegative) {
            System.out.println("Posición " + posicion + ": " + resultado);
        }

    }
}
