import java.util.Random;
import java.util.Scanner;

public class ForEach {

    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        // Llamar a los métodos para ejecutar la lógica
        CountingEvenElements(myScanner);

        // Cerrar el Scanner después de su uso
        myScanner.close();
    }

    public static void CountingEvenElements(Scanner myScanner) {
        // Definimos el tamaño del array
        int[] arrays = new int[10];
        Random rand = new Random();

        // Inicializamos el array con números aleatorios menores a 100
        for (int i = 0; i < arrays.length; i++) {
            arrays[i] = rand.nextInt(100);
        }

        // Imprimimos los elementos del array en una única línea
        for (int item : arrays) {
            System.out.print(item + " ");
        }
        System.out.println();

        // Contamos los elementos pares
        int contadorPares = 0;

        for (int item : arrays) {
            if (item % 2 == 0) {
                contadorPares++;
            }
        }

        // Mostramos el total de elementos pares
        System.out.println("Total de elementos pares: " + contadorPares);

    }

}
