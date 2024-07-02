import java.util.Scanner;

public class SegundoEjercicioIfElse {
    
    
    public static void main(String[] args) {
        Scanner myscanner = new Scanner(System.in);
        // Llamar a los métodos para ejecutar la lógica

        //NumberPositivoNegativo(myscanner);
        //EstructuraControl(myscanner);
        //Divisibility(myscanner);
        //PasswordVerification(myscanner);
        // DiscountCalculation(myscanner);
        DeterminationOfAges(myscanner);

        
       // Cerrar el Scanner después de su uso
        myscanner.close();
      
    }

 

    public static void NumberPositivoNegativo(Scanner myScanner) {

        System.out.println("Ingrese un número: ");
        float num = myScanner.nextInt();
        myScanner.nextLine();
    
        if (num > 0) {
            System.out.println("El número ingresado es positivo");
        } else if (num == 0) {
            System.out.println("El número ingresado es cero");
        } else {
            System.out.println("El número ingresado es negativo");
        }
    }

    public static void EstructuraControl(Scanner myScanner) {
         System.out.println("Ingrese un número del 0 al 100: ");
        float num = myScanner.nextInt();
        myScanner.nextLine();

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

    public static void Divisibility(Scanner myScanner) {
    
        System.out.println("Ingrese un número: ");
        float num = myScanner.nextInt();
        myScanner.nextLine();


        float divisibilityThree = num % 3;
        float divisibilityFive = num % 5;

        if (divisibilityFive == 0 && divisibilityThree == 0) {
            System.out.println("Si es divisible por 3 y 5");   
        } else {
            System.out.println("NO es divisible por 3 y 5");   
        }



        
    }
   
    public static void PasswordVerification(Scanner myScanner) {

        String initPassword = "AABBCC";
        System.out.println("Ingrese un Contraseña: ");
        String password = myScanner.nextLine();

        if (password.equals(initPassword)) {
            System.out.println("Acceso Concedido");

        } else {
            System.out.println("Acceso Denegado");
        }

    }

    public static void DiscountCalculation(Scanner myScanner) {

        System.out.println("Ingrese el precio: ");
        double price = myScanner.nextInt();
        myScanner.nextLine();

        // Verificar si el precio es igual o mayor a $100
        if (price >= 100) {
            // Verificar si el precio es igual o mayor a $100
            double result = price - (price * 0.1);
            // Mostrar el nuevo precio con descuento
            System.out.println("El producto tiene un 10% de descuento, ahora le cuesta : $" + result);
        } else {
            // Mostrar el precio original sin descuento
            System.out.println("El producto: $" + price);
        }
    }

    public static void DeterminationOfAges(Scanner myScanner) {
        System.out.println("Ingrese su edad: ");
         float ages = myScanner.nextInt();
         myScanner.nextLine();
        
         if (ages >= 18 && ages <= 64) {
            System.out.println("Eres adulto");        
        } else if (ages >= 65) {
            System.out.println("Eres un adulto mayor");          
        } else {
            System.out.println("Eres menor de edad");          
            
         }


        
    }
}

