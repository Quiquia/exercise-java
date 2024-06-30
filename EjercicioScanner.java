import java.util.Scanner;

public class EjercicioScanner {

    public static void main(String[] args) {
        Scanner date = new Scanner(System.in);
        int edad;
        System.out.print("Por favor ingrese una edad: ");
        edad = date.nextInt();
        date.nextLine();
        System.out.print("Por favor ingrese nombre: ");
        String name = date.nextLine();

        System.out.println("Mi nombre es " + name + " tengo " + edad);
    }


  
    
}
