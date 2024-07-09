import java.util.Scanner;

public class ClaseMath {

    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        // Llamar a los métodos para ejecutar la lógica
        // AbsoluteValue(myScanner);
        // RoundingNumbers(myScanner);
        RandomNumbers(myScanner);
        // PowNumbers(myScanner);
        // SquareRoot(myScanner);

        // Cerrar el Scanner después de su uso
        myScanner.close();

    }

    public static void AbsoluteValue(Scanner myScanner) {

        System.out.println("Ingrese un número: ");
        int num = myScanner.nextInt();
        myScanner.nextLine();
        int absNum = Math.abs(num);
        System.out.println("Número: " + num);
        System.out.println("Número Absoluto: " + absNum);
    }

    public static void RoundingNumbers(Scanner myScanner) {
        System.out.println("Ingrese un número decimal: ");
        double num = myScanner.nextDouble();
        myScanner.nextLine();
        long roundNum = Math.round(num);
        System.out.println("Número decimal: " + num);
        System.out.println("Número redondeado: " + roundNum);

    }

    public static void RandomNumbers(Scanner myScanner) {

        // Generando un número aleatorio entre dos límites
        // System.out.println("Número limite inferior: ");
        // int numLowerLimit = myScanner.nextInt();
        // System.out.println("Número limite superior: ");
        // int numUpperLimit = myScanner.nextInt();

        // Generación aleatoria y análisis de raíz cuadrada
        System.out.println("Ingrese un número entre 1 al 30: ");
        System.out.println("Número limite superior: ");
        int numUpperLimit = myScanner.nextInt();

        //INICIO BOOLEAN:
        boolean isPrimo = true;

        double randomNum = Math.random() * (numUpperLimit - 1 + 1) + 1;
        int roundRandonNum = (int) Math.floor(randomNum);
        double squartNum = Math.sqrt(roundRandonNum);

        System.out.println("Número random: " + randomNum);
        System.out.println("Raiz cuadrada: " + squartNum);
        System.out.println("Número round random: " + roundRandonNum);

        //es un número primo
        if (roundRandonNum >= 1) {
            for (int i = 2; i <= squartNum; i++) {
                if (roundRandonNum % i == 0) {
                    isPrimo = false;
                }
            }
        }

        if (isPrimo) {
            System.out.println("SI Es primo ");

        } else {
            System.out.println("NO Es primo ");
        }

    }

    public static void PowNumbers(Scanner myScanner) {
        System.out.println("Ingrese el número base: ");
        int base = myScanner.nextInt();
        System.out.println("Ingrese el exponente: ");
        int exponente = myScanner.nextInt();

        double powNumber = Math.pow(base, exponente);

        System.out
                .println("Número: " + base + "elevado a la exponente " + exponente + "es resultado es : " + powNumber);

    }

    public static void SquareRoot(Scanner myScanner) {
        System.out.println("Ingrese un número positivo y calcule su raíz cuadrada: ");
        int num = myScanner.nextInt();

        double squareNum = Math.sqrt(num);
        System.out.println("La raíz cuadra de: " + num + " es igual: " + squareNum);

    }

}
