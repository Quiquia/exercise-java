import java.util.Scanner;

public class Operadores {

    public void OperationBasic() {
        Scanner number = new Scanner(System.in);
        
        int num1;
        int num2;
        
        System.out.print("Ingrese el 1ER número : ");
        num1=  number.nextInt();
        number.nextLine();
        System.out.print("Ingrese el 2DO número :");
        num2 = number.nextInt();

      

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

    public void OperationComparation() {

        Scanner number = new Scanner(System.in);

        int num1;
        int num2;

        System.out.print("Ingrese el 1er número : ");
        num1 = number.nextInt();
        number.nextLine();
        System.out.print("Ingrese el 2do número :");
        num2 = number.nextInt();

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
        num3 = number.nextInt();
        number.nextLine();
        System.out.print("Ingrese el 4to número : ");
        num4 = number.nextInt();

        System.out.println(" num1 > num2 && num3 > num4 : " + (num1 > num2 && num3 > num4));
        System.out.println(" num1 > num2 || num3 > num4 : " + (num1 > num2 || num3 > num4));

        
    }
    
    
    public void ExerciseComplem() {

        Scanner date = new Scanner(System.in);

        int anoNacimiento;
        System.out.print("Ingrese el año de nacimiento : ");
        anoNacimiento = date.nextInt();
        int anoActual = 2024;

        int calculaEdad = anoActual - anoNacimiento;
        String mayorEdadoMenorEdad = (calculaEdad > 18) ? "Eres mayor de edad" : "Eres menor de edad";

        System.out.println("Tienes " + calculaEdad + " años y " + mayorEdadoMenorEdad);

    }
    
    public void AreaPerimetroRectangulo() {
        Scanner areaPerimetro = new Scanner(System.in);
        int baseRectangulo;
        int alturaRectangulo;
        System.out.print("Ingrese la baseRectangulo del rectángulo : ");
        baseRectangulo = areaPerimetro.nextInt();
        System.out.print("Ingrese la alturaRectangulo del rectángulo : ");
        alturaRectangulo = areaPerimetro.nextInt();

        int calcularArea = baseRectangulo * alturaRectangulo;
        int calcularPerimetro = (baseRectangulo + alturaRectangulo) * 2;

        System.out.println("El área del rectángulo es: " + calcularArea + "m2");
        System.out.println("El Perímetro del rectángulo es: " + calcularPerimetro + "metros");

    }
  
    
   
    



    public static void main(String[] args) {

        Operadores operadores = new Operadores();

        // operadores.OperationBasic();
        // operadores.OperationComparation();
        // operadores.ExerciseComplem();
        operadores.AreaPerimetroRectangulo();
       

    }

    
}
