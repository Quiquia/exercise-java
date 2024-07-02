import java.util.Scanner;

public class Operadores {


    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        
        // OperationBasic(myScanner);
        // OperationComparation(myScanner);
        // ExerciseComplem(myScanner);
        AreaPerimetroRectangulo(myScanner);

        myScanner.close();


    }

    public static void OperationBasic(Scanner myScanner) {
        
        int num1;
        int num2;
        
        System.out.print("Ingrese el 1ER número : ");
        num1=  myScanner.nextInt();
        myScanner.nextLine();
        System.out.print("Ingrese el 2DO número :");
        num2 = myScanner.nextInt();

      

        // Realiza las 5 operaciones básicas posibles en Java
        int suma = num1 + num2;
        int resta = num1 - num2;
        int multiplicacion = num1 * num2;
        int division = num1 / num2;
        int modulo = num1 % num2;
        System.out.println(" suma : " + suma);
        System.out.println(" resta : " + resta);
        System.out.println(" multiplicación : " + multiplicacion);
        System.out.println(" division : " + division);
        System.out.println(" modulo : " + modulo);


    }

    public void OperationComparation(Scanner myScanner) {


        int num1;
        int num2;

        System.out.print("Ingrese el 1er número : ");
        num1 = myScanner.nextInt();
        myScanner.nextLine();
        System.out.print("Ingrese el 2do número :");
        num2 = myScanner.nextInt();

        System.out.println(" num1  : " + num1);
        System.out.println(" num2  : " + num2);
        System.out.println(" num1 > num2 : " + (num1 > num2));
        System.out.println(" num1 < num2 : " + (num1 < num2));
        System.out.println(" num1 = num2 : " + (num1 == num2));
        System.out.println(" num1 <= num2 : " + (num1 <= num2));
        System.out.println(" num1 >= num2 : " + (num1 >= num2));
        System.out.println(" num1 != num2 : " + (num1 != num2));

        System.out.println(" num1  : " + (num1 % 2));

        int num3;
        int num4;

        System.out.print("Ingrese el 3er número : ");
        num3 = myScanner.nextInt();
        myScanner.nextLine();
        System.out.print("Ingrese el 4to número : ");
        num4 = myScanner.nextInt();

        System.out.println(" num1 > num2 && num3 > num4 : " + (num1 > num2 && num3 > num4));
        System.out.println(" num1 > num2 || num3 > num4 : " + (num1 > num2 || num3 > num4));

        
    }
    
    
    public static void ExerciseComplem(Scanner myScanner) {
        int anoNacimiento;
        System.out.print("Ingrese el año de nacimiento : ");
        anoNacimiento = myScanner.nextInt();
        int anoActual = 2024;

        int calculaEdad = anoActual - anoNacimiento;
        String mayorEdadoMenorEdad = (calculaEdad > 18) ? "Eres mayor de edad" : "Eres menor de edad";

        System.out.println("Tienes " + calculaEdad + " años y " + mayorEdadoMenorEdad);

    }
    
    public static void AreaPerimetroRectangulo(Scanner myScanner) {
        int baseRectangulo;
        int alturaRectangulo;
        System.out.print("Ingrese la baseRectangulo del rectángulo : ");
        baseRectangulo = myScanner.nextInt();
        System.out.print("Ingrese la alturaRectangulo del rectángulo : ");
        alturaRectangulo = myScanner.nextInt();

        int calcularArea = baseRectangulo * alturaRectangulo;
        int calcularPerimetro = (baseRectangulo + alturaRectangulo) * 2;

        System.out.println("El área del rectángulo es: " + calcularArea + "m2");
        System.out.println("El Perímetro del rectángulo es: " + calcularPerimetro + "metros");

    }
  

    
}
