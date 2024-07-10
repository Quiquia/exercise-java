import java.util.Scanner;

public class Desafio {

    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        // Llamar a los métodos para ejecutar la lógica
        ConversionTemperatureUnits(myScanner);

        // Cerrar el Scanner después de su uso
        myScanner.close();
    }

    public static void ConversionTemperatureUnits(Scanner myScanner) {

        try {
            // Solicitar la temperatura al usuario
            System.out.println("Ingrese la temperatura: ");
            double num = myScanner.nextDouble();

            // Solicitar la unidad de medida al usuario
            System.out.println("Ingrese la unidad de medida: ");
            System.out.println("1. Celsius: C ");
            System.out.println("2. Fahrenheit: F");
            myScanner.nextLine();
            String undMedida = myScanner.nextLine().trim().toUpperCase();
            double resultado;

            // Verificar la unidad de medida y realizar la conversión
            if (undMedida.equals("F")) {
                resultado = (num - 32) * (5 / 9);
                System.out.println(num + " °" + undMedida + " equivale a " + resultado + " grados Celsius.");
            } else if (undMedida.equals("C")) {
                resultado = ((num) * (9 / 5)) + 32;
                System.out.println(num + " °" + undMedida + " equivale a " + resultado + " grados Fahrenheit.");
            } else {
                System.out.println("Unidad de medida no válida. Ingrese C para Celsius o F para Fahrenheit.");
            }

        } catch (Exception e) {
            // Temperatura no válida
            System.out.println("Temperatura no válida. Por favor, ingrese un número.");
        }

    }

}
