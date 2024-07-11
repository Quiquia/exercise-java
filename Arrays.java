import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        // Llamar a los métodos para ejecutar la lógica
        // AddingElements(myScanner);
        // AveragingElements(myScanner);
        // FindingMaximum(myScanner);
        // SearchingItem(myScanner);
        CopyingElements(myScanner);

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
        arrayExtendido[1] =array[1] ;
        arrayExtendido[2] = array[2] ;

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
}
