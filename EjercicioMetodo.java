import java.util.Scanner;

public class EjercicioMetodo {
    
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        Integer numero = solicitarNumero(myScanner);

        if (esPar(numero)) {
            System.out.println("El " + numero + " es par");
        } else {
            System.out.println("El " + numero + " no es par");
        }

        myScanner.close();
    }
    
 // Método para solicitar un número al usuario
    public static Integer solicitarNumero(Scanner  myScanner) {
        Integer numero = null;
        
        System.out.println("Por favor ingrese un número:");
        do {
            try {
                numero = myScanner.nextInt();
            } catch (Exception e) {
                myScanner.nextLine();
                System.out.println("No ingresó un número, intente nuevamente:");
            }
        } while (numero == null);
        
        return numero;

    }
    
    // Método para verificar si un número es par
    public static boolean esPar(Integer numero) {
        return numero % 2 == 0;
    }
    
    
}
