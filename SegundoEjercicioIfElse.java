import java.util.Scanner;

public class SegundoEjercicioIfElse {
    
    
    public static void main(String[] args) {
        Scanner myscanner = new Scanner(System.in);
        // Llamar a los métodos para ejecutar la lógica
       NumberPositivoNegativo(myscanner);
       EstructuraControl(myscanner);
        
       // Cerrar el Scanner después de su uso
        myscanner.close();
      
    }

 

    public static void NumberPositivoNegativo(Scanner myScanner) {
        int num = myScanner.nextInt();
    
        if (num > 0) {
            System.out.println("El número ingresado es positivo");
        } else if (num == 0) {
            System.out.println("El número ingresado es cero");
        } else {
            System.out.println("El número ingresado es negativo");
        }
    }

    public static void EstructuraControl(Scanner myScanner) {
        int num = myScanner.nextInt();

        if (num >= 0 && num <= 100) {
            if (num >= 90) {
                System.out.println("La nota es: A");
            } else if (num >= 80) {
                System.out.println("La nota es: B");
            } else if (num >= 70) {
                System.out.println("La nota es: C");
            } else if (num >= 60) {
                System.out.println("La nota es: D");
            } else {
                System.out.println("La nota es: F");
            }
        } else {
            System.out.println("El número ingresado está fuera del rango");
        }
    }

   

}

