import java.util.InputMismatchException;
import java.util.Scanner;

public class EstructuraControlTryCatch {

    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        // Llamar a los métodos para ejecutar la lógica
        Division(myScanner);

        myScanner.close();

    }
    
    public static void Division(Scanner myScanner) {
        System.out.println("Ingrese dos número: ");
        int num1 = 0;
        int num2 = 0;

        try {
          num1 = myScanner.nextInt();
          num2 = myScanner.nextInt();
          int result = num1 / num2;
          System.out.println("El resultado es: " + result);

            
        } catch (ArithmeticException e) {
            // Todo: handle exception
            System.out.println("Error: No es posible dividir por 0.");
        }
        catch (InputMismatchException e) {
            // Todo: handle exception
            System.out.println("Error: Se detectó un valor inválido ingresado"
);

        }





        
    }
    

}