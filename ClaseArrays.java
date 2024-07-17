import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class ClaseArrays {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        // Llamar a los métodos para ejecutar la lógica
        // SortDescending(myScanner);

        // Cerrar el Scanner después de su uso
        myScanner.close();

    }

    public static void SortDescending(Scanner myScanner) {

        // Declarar y inicializar el arreglo con 10 elementos aleatorios entre 1 y 100
        Integer[] arreglo = new Integer[10];
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = (int) (Math.random() * 100) + 1;
        }
        
        // Imprimir el arreglo inicial
        System.out.println("Arreglo inicial: " + Arrays.toString(arreglo));

        // Ordenar el arreglo en forma descendente
        Arrays.sort(arreglo, Collections.reverseOrder());

        // Imprimir el arreglo ordenado
        System.out.println("Arreglo ordenado en forma descendente: " + Arrays.toString(arreglo));

    }

    public static void BinarySearch(Scanner myScanner) {

        // Declarar y inicializar el arreglo con 10 elementos aleatorios entre 1 y 100
        Integer[] arreglo = new Integer[10];
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = (int) (Math.random() * 100) + 1;
        }
        // Imprimir el arreglo inicial
        System.out.println("Arreglo inicial: " + Arrays.toString(arreglo));

        Arrays.sort(arreglo);

    }

}
