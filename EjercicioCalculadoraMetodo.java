import java.util.Scanner;

public class EjercicioCalculadoraMetodo {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        menu(myScanner);

        myScanner.close();
    }

    // Método que muestra el menú y maneja la lógica del bucle para seleccionar operaciones
    public static void menu(Scanner myScanner) {
        boolean continuar = true;

        while (continuar) {
            System.out.println("Seleccione una opción:");
            System.out.println("1. Suma");
            System.out.println("2. Resta");
            System.out.println("3. Multiplicación");
            System.out.println("4. División");
            System.out.println("5. Salir");

            int option = solicitarNumero("Ingrese una opción: ", myScanner);

            if (option == 5) {
                System.out.println("Saliendo... del programa!");
                continuar = false;
            } else if (option >= 1 && option <= 4) {
                int num1 = solicitarNumero("Ingrese el primer número: ", myScanner);
                int num2 = solicitarNumero("Ingrese el segundo número: ", myScanner);

                int result = 0;
                boolean validOperation = true;

                switch (option) {
                    case 1:
                        result = num1 + num2;
                        System.out.println("La suma es: " + result +"\n");
                        break;
                    case 2:
                        result = num1 - num2;
                        System.out.println("La resta es: " + result + "\n");
                        break;
                    case 3:
                        result = num1 * num2;
                        System.out.println("La multiplicación es: " + result + "\n");
                        break;
                    case 4:
                        if (num2 != 0) {
                            result = num1 / num2;
                            System.out.println("La división es: " + result + "\n");
                        } else {
                            System.out.println("Error: División por cero no es permitida.");
                            validOperation = false;
                        }
                        break;
                    default:
                        System.out.println("Operación no válida.");
                        validOperation = false;
                        break;
                }

                if (validOperation) {
                    System.out.println( "\n");
                }
            } else {
                System.out.println("Opción no válida. Por favor, intente nuevamente.");
            }
        }

    }

    // Método para solicitar un número al usuario con manejo de excepciones
    public static int solicitarNumero(String mensaje, Scanner myScanner) {
        int numero = 0;
        boolean validInput = false;

        while (!validInput) {
            System.out.println(mensaje);
            try {
                numero = myScanner.nextInt();
                validInput = true;
            } catch (Exception e) {
                System.out.println("Entrada inválida. Por favor, ingrese un número.");
                myScanner.nextLine(); // Limpiar el buffer
            }
        }

        return numero;
    }
}
