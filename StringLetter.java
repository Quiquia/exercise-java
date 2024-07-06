import java.util.Scanner;

public class StringLetter {

    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        // Llamar a los métodos para ejecutar la lógica
        // LongitudText(myScanner);
        // StringConcatenation(myScanner);
        // SubstringExtraction(myScanner);
        // CharacterSearch(myScanner);
        // CharacterReplacement(myScanner);
        // WhiteSpaceRemoval(myScanner);
        // ChainComparison(myScanner);
        LongitudTextWithSpaces(myScanner);

        
       // Cerrar el Scanner después de su uso
        myScanner.close();

    }

    public static void LongitudText(Scanner myScanner) {
        System.out.println("Ingrese un texto: ");
        String texto = myScanner.nextLine();
        String textWithSpacy = texto.trim();
        int longitud = textWithSpacy.length();

        System.out.println("La palabra tiene: " + longitud + textWithSpacy+" letras");
        System.out.println("La palabra tiene: " + texto.length() + " letras con espacios");


    }
        

    public static void StringConcatenation(Scanner myScanner) {
        System.out.println("Ingrese nombre: ");
        String name = myScanner.nextLine();
        System.out.println("Ingrese apellido: ");
        String lastname = myScanner.nextLine();

        System.out.println("Nombre completo: " + name.concat(" ") +lastname);
    }
        
    public static void SubstringExtraction(Scanner myScanner) {
        System.out.println("Ingresar una frase: ");
        String phrase = myScanner.nextLine();
        System.out.println("Ingrese un número inicial: ");
        int indexStarting = myScanner.nextInt();
        myScanner.nextLine();
        System.out.println("Ingrese un número final: ");
        int indexFinal = myScanner.nextInt();

        String substring = phrase.substring(indexStarting, indexFinal);

        System.out.println("Frase: " + phrase);
        System.out.println("Subcadena: " + substring);

    }

    public static void CharacterSearch(Scanner myScanner) {
        System.out.println("Ingresar una palabra: ");
        String text = myScanner.nextLine().toLowerCase();
        System.out.println("Escribe un caracter: ");
        String character = myScanner.nextLine().toLowerCase();

        // Finding the index of a character
        int findCharacter = text.indexOf(character);
        System.out.println("Index of " + character + " : " + findCharacter);

        // Finding the index of a character starting from a specific index
        int index1 = text.indexOf('e', 2);
        System.out.println("Index of 'e' starting from index 2: " + index1);

    }

    public static void CharacterReplacement(Scanner myScanner) {
        System.out.println("Ingresar una frase: ");
        String phrase = myScanner.nextLine().toUpperCase();
        System.out.println("Escribe un caracter: ");
        String character = myScanner.nextLine().toUpperCase();
        System.out.println("Escribe un caracter: ");
        String replaceCharacter = myScanner.nextLine().toUpperCase();

        String newPhrase = phrase.replace(character, replaceCharacter);

        System.out.println("Frase: " + phrase);
        System.out.println("New Frase: " + newPhrase);

    }

    public static void WhiteSpaceRemoval(Scanner myScanner) {
        System.out.println("Ingrese un frase: ");
        String phrase = myScanner.nextLine();
        String textWithSpacy = phrase.trim();

        System.out.println("Frase: " + phrase);
        System.out.println("Frase sin espacios:" + textWithSpacy);

    }

    public static void ChainComparison(Scanner myScanner) {
        System.out.println("Ingresa primera palabra");
        String word1 = myScanner.nextLine().toLowerCase();
        System.out.println("Ingresa segunda palabra");
        String word2 = myScanner.nextLine().toLowerCase();

        boolean equalWord = word1.equals(word2);

        String text = equalWord ? "Las dos palabras son iguales" : "Las dos palabras son diferentes";

        System.out.println(text);

    }

     public static void LongitudTextWithSpaces(Scanner myScanner) {
        System.out.println("Ingrese una frase: ");
        String texto = myScanner.nextLine();
        String textWithSpacy = texto.replace(" ", "").toLowerCase();

        System.out.println("Frase sin espacios: " + textWithSpacy);
        System.out.println("Frase inicial: " + texto );


    }
}
    
   