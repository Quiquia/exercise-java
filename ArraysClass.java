import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ArraysClass {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        // Llamar a los métodos para ejecutar la lógica
        // AddingElements(myScanner);
        // AveragingElements(myScanner);
        // FindingMaximum(myScanner);
        // SearchingItem(myScanner);
        // CopyingElements(myScanner);
        // RandomNumber(myScanner);
        // AddingElementsPositions(myScanner);
        SortingNamesAlphabetically(myScanner);

        // Cerrar el Scanner después de su uso
        myScanner.close();
    }

    public static void AddingElements(Scanner myScanner) {
        int[] array1 = { 20, 40, 30 };

        // int result = array1[0] + array1[1] + array1[2];
        int result = 0;

        for (int i = 0; i < array1.length; i++) {
            result = result + array1[i];
        }

        System.out.println("Resultado: " + result);
    }

    public static void AveragingElements(Scanner myScanner) {

        int totalNumbers = 4;
        int[] num = new int[totalNumbers];

        int sum = 0;

        System.out.printf("Ingrese (%d) números enteros:", totalNumbers);
        for (int i = 0; i < totalNumbers; i++) {
            System.out.printf("(%d) - Ingresa un número: %n", i + 1);
            num[i] = myScanner.nextInt();
            sum = sum + num[i];
        }

        float promedio = (float) sum / totalNumbers;

        System.out.println("Suma de los números: " + sum);
        System.out.println("Promedio: " + promedio);
    }

    public static void FindingMaximum(Scanner myScanner) {
        int totalNumbers = 5;
        int[] num = new int[totalNumbers];

        // Pedir al usuario que ingrese cinco números enteros
        System.out.printf("Ingrese (%d) números enteros:", totalNumbers);
        for (int i = 0; i < totalNumbers; i++) {
            System.out.printf("(%d) - Ingresa un número: %n", i + 1);
            num[i] = myScanner.nextInt();
        }

        // Encontrar el máximo valor en el array
        int maximo = num[0];
        for (int i = 1; i < totalNumbers; i++) {
            if (num[i] > maximo) {
                maximo = num[i];
            }
        }

        // Imprimir el máximo valor encontrado
        System.out.println("El máximo valor en el array es: " + maximo);

    }

    public static void SearchingItem(Scanner myScanner) {
        int totalNumbers = 3;
        int[] num = new int[totalNumbers];

        // Pedir al usuario que ingrese tres números enteros
        System.out.printf("Ingrese (%d) números enteros: %n", totalNumbers);
        for (int i = 0; i < totalNumbers; i++) {
            System.out.printf("(%d) - Ingresa un número: %n", i + 1);
            num[i] = myScanner.nextInt();
        }

        // Pedir al usuario que ingrese un número para buscar en el array
        System.out.print("Ingrese un número para buscar en el array: ");
        int numSearch = myScanner.nextInt();

        // Verificar si el número buscado está presente en el array
        boolean isSearch = false;
        for (int i = 0; i < totalNumbers; i++) {
            if (numSearch == num[i]) {
                isSearch = true;
            }
        }

        // Mostrar el resultado de la búsqueda
        if (isSearch) {
            System.out.print("El número SI SE encuentra en el array. ");
        } else {
            System.out.print("El número NO SE encuentra en el array. ");
        }
    }

    public static void CopyingElements(Scanner myScanner) {
        int[] array = { 1, 2, 3 };

        // Crear una copia del array original con dos elementos adicionales
        int[] arrayExtendido = new int[array.length + 2];

        arrayExtendido[0] = array[0];
        arrayExtendido[1] = array[1];
        arrayExtendido[2] = array[2];

        // Solicitar al usuario que ingrese dos números para las nuevas posiciones
        System.out.println("Ingrese un número: ");
        int num1 = myScanner.nextInt();
        System.out.println("Ingrese otro número: ");
        int num2 = myScanner.nextInt();

        // Asignar los números ingresados a las nuevas posiciones del array extendido
        arrayExtendido[array.length] = num1;
        arrayExtendido[array.length + 1] = num2;

        // Mostrar el contenido del nuevo array
        System.out.println("Contenido del nuevo array:");
        System.out.print(arrayExtendido[0] + " ");
        System.out.print(arrayExtendido[1] + " ");
        System.out.print(arrayExtendido[2] + " ");
        System.out.print(arrayExtendido[3] + " ");
        System.out.println(arrayExtendido[4]);
        System.out.println(array[1]);

    }

    public static void RandomNumber(Scanner myScanner) {

        int[] arrays = new int[6];
        int numMax = 10;
        int numMin = 0;
        Random rand = new Random();

        for (int i = 0; i < arrays.length; i++) {
            arrays[i] = rand.nextInt(numMax) + numMin;
        }

        // Contar la cantidad de elementos pares en el array
        int cantidadPares = 0;
        for (int i = 0; i < arrays.length; i++) {
            if (arrays[i] % 2 == 0) {
                cantidadPares++;
            }
        }

        // Mostrar el array y la cantidad de pares por consola
        System.out.print("Array: ");
        for (int i = 0; i < arrays.length; i++) {
            System.out.print(arrays[i] + " ");
        }
        System.out.println("\nCantidad de elementos pares: " + cantidadPares);
    }

    public static void AddingElementsPositions(Scanner myScanner) {
        int totalNumbers = 5;
        int[] num = new int[totalNumbers];

        // Pedir al usuario que ingrese 5 números enteros
        System.out.printf("Ingrese (%d) números enteros: %n", totalNumbers);
        for (int i = 0; i < totalNumbers; i++) {
            System.out.printf("(%d) - Ingresa un número: %n", i + 1);
            num[i] = myScanner.nextInt();
        }

        // Suma de los tres números
        int addNumPares = 0;

        for (int i = 0; i < num.length; i = i + 2) {
            addNumPares = addNumPares + num[i];
            System.out.print(num[i] + " ");

        }

        System.out.println("\nSuma de elementos pares: " + addNumPares);

    }

    public static void SortingNamesAlphabetically(Scanner myScanner){
        String[] nombre = new String[4];

        // Pedir al usuario ingresar 4 nombres
        System.out.printf("Ingrese (%d) nombres: %n", 4);
        for (int i = 0; i < nombre.length; i++) {
            System.out.printf("(%d) - Ingresa un nombre: %n", i + 1);
            nombre[i] = myScanner.nextLine();
        }

         // Ordenar los nombres alfabéticamente
         Arrays.sort(nombre);
        
         // Imprimir los nombres ordenados
         System.out.println("nombres ordenados: " + Arrays.toString(nombre));

         
         // Imprimir los nombres ordenados
        // System.out.println("Nombres ordenados alfabéticamente:");
        // for (String name : nombre) {
        //     System.out.println(name);
        // }

    }

 

}
