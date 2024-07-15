import java.util.Scanner;

public class BluqueFor {

    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        // Llamar a los métodos para ejecutar la lógica
        // PrintingItems(myScanner);
        // FindingMinimumValue(myScanner);
        PrintingItemsReverseOrder(myScanner);

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
        //     System.out.println(" numeros ordenados: " + num);
        // }
    }

    
}
