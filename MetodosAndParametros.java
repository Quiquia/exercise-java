import java.util.Scanner;


class DatosPersonales {

    // Variable global para el Scanner
    private static Scanner scanner = new Scanner(System.in);

    // Método para imprimir nombre y edad
    public void imprimeNombreYEdad(String nombre, int edad) {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
    }

    // Método para obtener el nombre
    public String obtenerNombre() {
        System.out.print("Ingrese su nombre: ");
        return scanner.nextLine();
    }

    // Método para obtener la edad
    public int obtenerEdad() {
        System.out.print("Ingrese su edad: ");
        return scanner.nextInt();
    }

    public static void main(String[] args) {
        DatosPersonales datos = new DatosPersonales();

        String nombre = datos.obtenerNombre();
        int edad = datos.obtenerEdad();

        datos.imprimeNombreYEdad(nombre, edad);
    }
}

public class MetodosAndParametros {

    
 

}
