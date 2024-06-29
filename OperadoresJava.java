public class OperadoresJava {
    public static void main(String[] args) {
        
        //operaciones +, -, *, /, %
        System.out.println(" 5 + 5 =" + (5 + 5));
        System.out.println(" 7 + 5 =" + (7 % 5));
        System.out.println(" 7 + 5 =" + (7D / 5D));

        int num1 = 10;
        int num2 = 5;

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
    
}
