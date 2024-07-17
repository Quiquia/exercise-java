import java.util.Scanner;

public class DoWhile {

    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        // Llamar a los métodos para ejecutar la lógica
        MenuInteractivo(myScanner);

        // Cerrar el Scanner después de su uso
        myScanner.close();
    }

    public static void MenuInteractivo(Scanner myScanner) {

        int opcion;

        do {
            // Mostrar el menú
            System.out.println("Menú Interactivo:");
            System.out.println("1. Comprar producto");
            System.out.println("2. Realizar devolución");
            System.out.println("3. Ver mis pedidos");
            System.out.println("4. Preguntas frecuentes");
            System.out.println("5. Salir");
            System.out.print("Elige una opción: ");

            // Leer la opción del usuario
            opcion = myScanner.nextInt();

            // Mostrar mensaje según la opción elegida
            switch (opcion) {
                case 1:
                    System.out.println("Has elegido: Comprar producto");
                    break;
                case 2:
                    System.out.println("Has elegido: Realizar devolución");
                    break;
                case 3:
                    System.out.println("Has elegido: Ver mis pedidos");
                    break;
                case 4:
                    System.out.println("Has elegido: Preguntas frecuentes");
                    break;
                case 5:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, elige una opción del 1 al 5.");
            }

            System.out.println(); // Imprimir una línea en blanco para separar cada iteración
        } while (opcion != 5);


        System.out.println(opcion);
    }
    
    
    

    
}
