import java.util.InputMismatchException;
import java.util.Scanner;

public class EstructuraControlTryCatch {

    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        // Llamar a los métodos para ejecutar la lógica
        // Division(myScanner);
        // Division2(myScanner);
        // Subtraction(myScanner);
        ConversionfromStringtoInteger(myScanner);

        myScanner.close();

    }
    
    public static void Division(Scanner myScanner) {
        System.out.println("Ingrese dos número: ");
        int num1;
        int num2;

        try {
            num1 = myScanner.nextInt();
            num2 = myScanner.nextInt();
            double result = num1 / num2;
            System.out.println("El resultado es: " + result);

        } catch (ArithmeticException e) {
            // Todo: handle exception
            System.out.println("Error: No es posible dividir por 0.");
        } catch (InputMismatchException e) {
            // Todo: handle exception
            System.out.println("Error: Se detectó un valor inválido ingresado");
        }
    }
    
    public static void Division2(Scanner myScanner) {
        try {
    System.out.print("Ingrese un divisor: ");
    int numero = myScanner.nextInt();// Posible entrada inválida
    // String palabra = "hola";
    float resultado = 10 / numero ;// Posible división por cero
    System.out.println("El resultado es: " + resultado);
    } catch (ArithmeticException e) {
    System.out.println("Error: División por cero.");
    } catch (InputMismatchException e) {
        System.out.println("Error: Se detectó un valor inválido ingresado por teclado.");
    } catch (Exception e) {
    System.out.println("Error: Ups!");  
    }
    }
    
    public static void Subtraction(Scanner myScanner) {
        System.out.println("Ingrese dos número: ");
        int num1;
        int num2;

        float result = 0;

        try {
            num1 = myScanner.nextInt();
            num2 = myScanner.nextInt();
            result = num1 - num2;
            System.out.println("El resultado es: " + result);

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error: Ups!: " + e.getMessage());
        }

    }

    public static void ConversionfromStringtoInteger(Scanner myScanner) {
         System.out.println("Ingrese un número: ");
         String stringNumber;
          
         try {
         stringNumber = myScanner.nextLine();
        float number = Integer.parseInt(stringNumber);
         System.out.println("El número es: " + number);
            
         } catch (NumberFormatException e) {
             // Todo: handle exception
         System.out.println("El caracter ingresado no se puede convertir en número");

            
         }

        
    }
}