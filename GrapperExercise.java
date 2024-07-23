import java.util.Scanner;

public class GrapperExercise {

    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        // Llamar a los métodos para ejecutar la lógica
        // CheckingValidNumber(myScanner);
        // StringNumberConversion(myScanner);
        CheckingStringContainsOnlyLetters(myScanner);

        // Cerrar el Scanner después de su uso
        myScanner.close();
    }

    public static void CheckingValidNumber(Scanner myScanner) {
        System.out.println("Introduce una cadena: ");
        String inputNum = myScanner.nextLine();

        try {
            Double number = Double.valueOf(inputNum);
            System.out.println("La cadena ingresada es el siguiente número: " + number);

        } catch (NumberFormatException e) {
            // Todo: handle exception
            System.out.println("La cadena ingresada no es un número válido.");

        }
    }

    public static void StringNumberConversion(Scanner myScanner) {
        System.out.println("Introduce una cadena que represente un número: ");
        String inputNum = myScanner.nextLine();

        try {
            int number = Integer.valueOf(inputNum);
            System.out.println("Es un entero número: " + number);

        } catch (NumberFormatException e) {
            // Todo: handle exception
            System.out.println("La cadena ingresada no es un número entero válido ");

        }

    }

    public static void CheckingStringContainsOnlyLetters(Scanner myScanner) {
        System.out.println("Introduce una cadena que represente un número: ");
        String inputText = myScanner.nextLine();

        boolean soloLetras = true;

        for (int i = 0; 0 < inputText.length(); i++) {
            Character caracter = inputText.charAt(i);
            soloLetras = Character.isLetter(caracter);
            // System.out.println("La cadena contiene solo letras." + soloLetras);

            if (!soloLetras) {
                soloLetras = false;
                break;
            }

        }

        if (soloLetras) {
            System.out.println("La cadena contiene solo letras.");
        } else {
            System.out.println("La cadena contiene letras y otros caracteres.");
        }

    }

}
