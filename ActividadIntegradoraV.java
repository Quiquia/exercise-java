import java.util.Arrays;
import java.util.Scanner;

public class ActividadIntegradoraV {

    // Variable de instancia para almacenar la oración
    private static String oracion = "maria es bailarina";

    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);
        boolean continuar = true;

        // Llamar a los métodos para ejecutar la lógica
        while (continuar) {
            continuar = menuOptions(myScanner);

        }

        // Cerrar el Scanner después de su uso
        myScanner.close();
    }

    public static boolean menuOptions(Scanner myScanner) {

        System.out.println("Menú de opciones: ");
        System.out.println("1. Crear oración o Borrar oración: ");
        System.out.println("2. Cantidad de caracteres de la oración: ");
        System.out.println("3. Cantidad de palabras de la oración: ");
        System.out.println("4. Mostrar palabras ordenadas alfabéticamente: ");
        System.out.println("5. Ingresar un número y devolver la palabra correspondiente: ");
        System.out.println("6. Buscar palabra dentro de la oración: ");
        System.out.println("7. Modificar palabra dentro de la oración: ");
        System.out.println("8. Agregar contenido a la oración: ");
        System.out.println("9. Salir. ");
        System.out.println("Eliga una opción (ingrese un número): ");
        int numOption = myScanner.nextInt();

        switch (numOption) {
            case 1:
                crearOracionOBorrar(myScanner);
                break;
            case 2:
                cantidadCaracteresOracion();
                break;
            case 3:
                cantidadPalabrasOracion();
                break;
            case 4:
                mostrarPalabrasOrdenadasAlfabéticamente();
                break;
            case 5:
                ingreseNumeroDevolverPalabra(myScanner);
                break;

            case 6:
                buscarPalabraOracion(myScanner);
                break;
            case 7:
                modificarPalabraDentroOracion(myScanner);
                break;
            case 8:
                agregarContenido(myScanner);
                break;
            case 9:
                System.out.println("Salir del programa.");
                return false;
            default:
                System.out.println("Opción no válida. Intente de nuevo.");
        }

        return true;

    }

    public static void crearOracionOBorrar(Scanner myScanner) {
        if (oracion.isEmpty()) {
            System.out.println("Por favor escriba una oracion: ");
            oracion = myScanner.nextLine();
            System.out.println("Crear oración");
            // myScanner.nextLine();
            System.out.println("Oración creada: " + oracion + "\n");
        } else {
            oracion = "";
            System.out.println("Borrar oración");
        }
    }

    public static void cantidadCaracteresOracion() {
        System.out.println("Cantidad de caracteres en la oración: " + oracion.length() + "\n");

    }

    public static void cantidadPalabrasOracion() {
        String[] palabras = oracion.split("\\s+");
        System.out.println("Cantidad de palabras en la oración: " + palabras.length + "\n");
    }

    public static void mostrarPalabrasOrdenadasAlfabéticamente() {
        String[] palabras = oracion.split("\\s+");
        Arrays.sort(palabras);
        System.out.println("Nombres ordenados: " + String.join(" ", palabras) + "\n");
        for (String palabra : palabras) {
            System.out.println(palabra);
        }
        System.out.println();
    }

    public static void ingreseNumeroDevolverPalabra(Scanner myScanner) {
        System.out.print("Ingrese un número: ");
        int num = myScanner.nextInt();
        myScanner.nextLine();
        String[] palabras = oracion.split("\\s+");

        if (0 < num && num <= palabras.length) {
            String palabra = palabras[num - 1];
            System.out.println("Palabra correspondiente: " + palabra + "\n");
        } else {
            System.out.println("Número inválido. Intente nuevamente. \n");

        }
    }

    public static void buscarPalabraOracion(Scanner myScanner) {

        System.out.print("Ingrese la palabra a buscar: ");
        myScanner.nextLine();
        String palabraFind = myScanner.nextLine().toLowerCase();
        String[] palabras = oracion.split("\\s+");
        boolean encontrada = true;

        for (int i = 0; i < palabras.length; i++) {

            if (palabras[i].toLowerCase().equals(palabraFind)) {
                encontrada = true;
                System.out.println(
                        "La palabra \"" + palabraFind + "\" está en la oración en la posición " + (i + 1) + "\n");
            }

            if (!encontrada) {
                System.out.println("La palabra \"" + palabraFind + "\" no está en la oración. ");
            }

        }

    }

    public static void modificarPalabraDentroOracion(Scanner myScanner) {
        System.out.print("Ingrese la palabra a modificar: ");
        myScanner.nextLine();
        String palabraVieja = myScanner.nextLine();
        if (oracion.contains(palabraVieja)) {
            System.out.print("Ingrese la nueva palabra: ");
        myScanner.nextLine();
            String palabraNueva = myScanner.nextLine();
            oracion = oracion.replace(palabraVieja, palabraNueva);
            System.out.println("Oración modificada: " + oracion + "\n");
        } else {
            System.out.println("La palabra \"" + palabraVieja + "\" no se encuentra en la oración.\n");
        }

    }

    public static void agregarContenido(Scanner myScanner) {
        System.out.print("Ingrese el contenido a agregar: ");
        myScanner.nextLine();
        String contenido = myScanner.nextLine();
        String newOracion = oracion + " " + contenido+ "\n";
        System.out.print("Nueva oración: " + newOracion + "\n");

    }
}
