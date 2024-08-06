import java.util.Arrays;
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

    public static void PlusPrimeNumbers(Scanner myScanner) {
        System.out.println(
                "Introduce la cantidad de números primos que quieres obtener (escribe un número negativo si quieres salir): ");
        int cantidad = myScanner.nextInt();
        int numCantidad = 0;

        do {
            if (numCantidad < cantidad) {

                for (int i = 0; i <= Math.sqrt(numCantidad); i++) {

                    if (numCantidad % i == 0) {

                    }

                }

            }

        } while (numCantidad < cantidad);

    }

    
public class Oraciones {
    
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.println("Por favor escriba una oracion: ");
String oracion = scanner.nextLine();
int opcion = 0;
while (opcion != 9) {
System.out.println("Seleccione una opcion: ");
if (oracion.equals("")) {
System.out.println("1.- Crear oración");
} else {
System.out.println("1.- Borrar oración");
}
System.out.println("2.- Calcular cantidad de caracteres");
System.out.println("3.- Calcular cantidad de palabras");
System.out.println("4.- Mostrar en orden alfabético");
System.out.println("5.- Buscar palabra por indice");
System.out.println("6.- Verificar palabra");
System.out.println("7.- Modificar palabra");
System.out.println("8.- Agregar contenido");
System.out.println("9.- Salir");
System.out.print("Eliga una opcion: ");
opcion = scanner.nextInt();
scanner.nextLine(); // Consumir el carácter de nueva línea

switch (opcion) {
case 1 -> {
if (oracion.equals("")) {
System.out.println("Ingrese la nueva oración: ");
oracion = scanner.nextLine();
} else {
oracion = "";
System.out.println("Oración borrada.");
}
}
case 2 -> System.out.println("Cantidad de caracteres: " + oracion.length());
case 3 -> System.out.println("Cantidad de palabras: " + oracion.split("\\s+").length);
case 4 -> {
String[] palabras = oracion.split("\\s+");
Arrays.sort(palabras);
System.out.println("Palabras en orden alfabetico: " + String.join(" ", palabras));
}
case 5 -> {
String[] palabras = oracion.split("\\s+");
System.out.print("Por favor ingrese el indice de la palabra que desea encontrar: ");
int indice = scanner.nextInt();
scanner.nextLine();
while (indice < 0 || indice >= palabras.length) {
System.out.print("Por favor ingrese un índice válido: ");
indice = scanner.nextInt();
scanner.nextLine();
}
System.out.println("Esta es la palabra que busca: " + palabras[indice]);
}
case 6 -> {
System.out.print("Ingrese la palabra a verificar: ");
String palabra = scanner.nextLine();
boolean encontrada = false;

String[] palabras = oracion.split("\\s+");
for (int i = 0; i < palabras.length; i++) {
if (palabra.equals(palabras[i])) {
encontrada = true;
System.out.println("La palabra \"" + palabra + "\" está en la oración en la posición " + i);
}
}

if (!encontrada) {
System.out.println("La palabra \"" + palabra + "\" no está en la oración.");
}
}
case 7 -> {
System.out.print("Ingrese la palabra a modificar: ");
String palabraModificar = scanner.nextLine();
System.out.print("Ingrese la nueva palabra: ");
String nuevaPalabra = scanner.nextLine();
oracion = oracion.replace(palabraModificar, nuevaPalabra);
System.out.println("Oración modificada: " + oracion);
}
case 8 -> {
System.out.print("Ingrese el contenido a agregar: ");
String contenido = scanner.nextLine();
oracion = oracion + " " + contenido;
System.out.println("Contenido agregado. Nueva oración: " + oracion);
}
case 9 -> System.out.println("Saliendo del programa.");
default -> System.out.println("Por favor ingrese una opción válida");
}
}

scanner.close();
}
}

}
