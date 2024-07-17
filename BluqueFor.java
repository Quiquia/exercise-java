import java.util.Scanner;

public class BluqueFor {

    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        // Llamar a los métodos para ejecutar la lógica
        // PrintingItems(myScanner);
        // FindingMinimumValue(myScanner);
        // PrintingItemsReverseOrder(myScanner);
        // InvertirArray(myScanner);
        CalculateCumulativeSum(myScanner);

        // Cerrar el Scanner después de su uso
        myScanner.close();
    }

    public static void PrintingItems(Scanner myScanner) {
        // int[] number = { 1, 2, 4, 5, 9, 10, 11, 13 };
        String[] nombres = { "maria", "carlos", "pablo", "patricia" };

        for (int i = 0; i < nombres.length; i++) {
            System.out.println("Recorre el arrays: " + nombres[i]);
        }
    }

    public static void FindingMinimumValue(Scanner myScanner) {
        int[] number = { 1, 2, 0, 5, 9, 25, 11, 13 };

        int minNum = number[0];

        for (int i = 0; i < number.length; i++) {

            if (minNum > number[i]) {
                minNum = number[i];
            }

            // System.out.println("Recorre el arrays: " + number[i]);
        }

        System.out.println("Número minimo: " + minNum);
    }

    public static void PrintingItemsReverseOrder(Scanner myScanner) {
        int[] numbers = { 1, 2, 3, 4, 5 };

        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.println(" numeros ordenados: " + numbers[i]);
        }

        // for( int num : numbers){
        // System.out.print(" numeros ordenados: " + num);
        // }
    }

    public static void InvertirArray(Scanner myScanner) {

        // Definimos el array de ejemplo
        int[] array = { 1, 2, 3, 4, 5 };

        // Llamamos a la función para invertir el array
        // invertirArray(array);

        int n = array.length;
        // Usamos dos punteros, uno al inicio y otro al final del array
        int inicio = 0;
        int fin = n - 1;

        // Intercambiamos los elementos hasta que los punteros se encuentren
        while (inicio < fin) {
            // Intercambio de elementos
            int temp = array[inicio];
            array[inicio] = array[fin];
            array[fin] = temp;

            // Movemos los punteros
            inicio++;
            fin--;
        }

        // Imprimimos el array resultante
        for (int i : array) {
            System.out.print(i + " ");
        }

    }

    public static void CalculateCumulativeSum(Scanner myScanner) {
        // Definimos el array de ejemplo
        int[] array = { 1, 2, 3, 4, 5 };

    
        // calcular la suma acumulada
        for (int i = 1; i < array.length; i++) {
            array[i] = array[i] + array[i - 1];
        }

        // Imprimimos el array resultante
        for (int i : array) {
            System.out.print(i + " ");
        }
        
        
    }
}
