import java.util.Scanner;

public class Activities {


    public static void NumberParImpar(Scanner myScanner) {

        int num;

        System.out.println("Ingrese un número : ");
        num = myScanner.nextInt();
        myScanner.nextLine();
        int divisibleEntreDos = (num % 2);
        String numParImpar = (divisibleEntreDos != 0) ? "IMPAR" : "PAR";

        System.out.println("El número " + num + " es " + numParImpar);

    }
    
     public static void Calculator(Scanner myScanner) {
        
        int num1;
        int num2;
        

        System.out.println("Ingrese un número : ");
        num1 = myScanner.nextInt();
        myScanner.nextLine();
        System.out.println("Ingrese el segundo número : ");
        num2 = myScanner.nextInt();



        int operation;
        System.out.println("Qué operación quieres realizar: ");
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicación");
        System.out.println("4. División");

        operation = myScanner.nextInt();

        int result;

        if (operation == 1) {
         result = num1 + num2;    
        System.out.println("la suma es : " + result);      
    } else if (operation == 2) {
        result = num1 - num2;
        System.out.println("la resta es : " + result);      
    } else if (operation == 3) {
         result = num1 * num2;
        System.out.println("la multiplicación es : " + result);      
    } else if (operation == 4) {
         result = num1 / num2;
        System.out.println("la división es : " + result);
         }
         
    }


    public static void main(String[] args) {
        
        Scanner myScanner = new Scanner(System.in);
       

        // NumberParImpar(myScanner);
        Calculator(myScanner);

        myScanner.close();
        
    }
    
}
