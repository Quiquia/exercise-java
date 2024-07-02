import java.util.Scanner;

public class IfElse {

    public void NumberPositivoNegativo() {
        Scanner number = new Scanner(System.in);
        int num;

        System.out.println("Ingrese un número : ");
        num = number.nextInt();

        boolean numPositivo = (num > 0);
        boolean numCero = num == 0;

        if (numPositivo) {

            System.out.println("El número ingresado es positivo ");
        } else if (numCero) {
            System.out.println("El número ingresado es cero ");
        } else {
            System.out.println("El número ingresado es negativo ");
        }

        // number.close();


    }
    
    public void EstructuraControl() {
        Scanner letra = new Scanner(System.in);
        int num;

        System.out.println("Ingrese un número del 0 al 100: ");
        num = letra.nextInt();
        letra.nextLine();

        if (num >= 0 && num <= 100) {
            if (num >= 90) {

                System.out.println("La nota es : A ");
            } else if (num >= 80) {

                System.out.println("La nota es : B ");
            } else if (num >= 70) {
                System.out.println("La nota es : C ");
            } else if (num >= 60) {
                System.out.println("La nota es : D ");
            } else {
                System.out.println("La nota es : F ");
            }
        } else {
            System.out.println("El número ingresado es fuera del rango ");

        }

        // letra.close();

    }

    
     public static void main(String[] args) {
        
        IfElse exercise = new IfElse();

        exercise.NumberPositivoNegativo();
        exercise.EstructuraControl();
        
    }



    
}