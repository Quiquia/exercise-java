import java.util.Scanner;

public class IfElse {

    public static void NumberPositivoNegativo(Scanner myScanner) {
        int num;

        System.out.println("Ingrese un número : ");
        num = myScanner.nextInt();

        boolean numPositivo = (num > 0);
        boolean numCero = num == 0;

        if (numPositivo) {

            System.out.println("El número ingresado es positivo ");
        } else if (numCero) {
            System.out.println("El número ingresado es cero ");
        } else {
            System.out.println("El número ingresado es negativo ");
        }



    }
    
    public static void EstructuraControl(Scanner myScanner) {
        int num;

        System.out.println("Ingrese un número del 0 al 100: ");
        num = myScanner.nextInt();
        myScanner.nextLine();

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


    }
   
     public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        NumberPositivoNegativo(myScanner);
        EstructuraControl(myScanner);

        myScanner.close();
        
    }
    
}