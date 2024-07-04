import java.util.Scanner;

public class Switch {

    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        // Llamar a los métodos para ejecutar la lógica
        // Weekdays(myScanner);
        // Ratings(myScanner);
        // Options(myScanner);
        GeometricFigure(myScanner);


        myScanner.close();

    }

    public static void Weekdays(Scanner myScanner) {

        System.out.println("Ingrese un número del 1 al 7: ");
        int number = myScanner.nextInt();

        switch (number) {
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miercoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            case 6:
                System.out.println("Sabado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
            default:
                System.out.println("Número incorrecto");
                break;
        }

    }
    
    public static void Ratings(Scanner myScanner) {

        System.out.println("Ingrese un número del 1 al 5: ");
        int number = myScanner.nextInt();

        switch (number) {
            case 1 -> System.out.println("Muy deficiente");
            case 2 -> System.out.println("Deficiente");
            case 3 -> System.out.println("Suficiente");
            case 4 -> System.out.println("Notable");
            case 5 -> System.out.println("Sobresaliente");
            default -> System.out.println("Número incorrecto");

        }

    }
    
    public static void Options(Scanner myScanner) {

        System.out.println("Ingrese un número del 1 al 3: ");
        int number = myScanner.nextInt();

        switch (number) {
            case 1 -> System.out.println("Opción 1: Guardar");
            case 2 -> System.out.println("Opción 2: Cargar");
            case 3 -> System.out.println("Opción 3: Salir");
            default -> System.out.println("Número incorrecto");

        }

    }

    public static void GeometricFigure(Scanner myScanner) {
        System.out.println("Seleccionar una figura geométrica: ");
        System.out.println("1 para círculo ");
        System.out.println("2 para cuadrado");
        System.out.println("3 para triángulo ");
         
        int number = myScanner.nextInt();

        
        switch (number) {
            case 1:
            System.out.println("Ingrese el radio del circulo:");
            float radio = myScanner.nextInt();
            System.out.println("Escoja una opción:");
            System.out.println("1. Perímetro");
            System.out.println("2. Área");
             int option = myScanner.nextInt();
            
            
            switch (option) {
                    case 1:
                        float perimetro = 2 * radio;
                    System.out.println("Perímertro: "+perimetro + "pi" );    
                        break;
                    case 2:
                        float area = (float)Math.pow(radio,2);
                    System.out.println("Area:"+area+"pi");
                    break;                    
                    default:
                        break;
                }
                
                break;
            case 2:
                System.out.println("Ingrese la medida del lado del cuadrado: ");
                float lado = myScanner.nextInt();
                System.out.println("Escoja una opción:");
                System.out.println("1. Perímetro");
                System.out.println("2. Área");

                option = myScanner.nextInt();

                switch (option) {

                    case 1:
                        float perimetro = 4 * lado;
                    System.out.println("Perímertro: "+perimetro );    
                        break;
                    case 2:
                        float area = (float)Math.pow(lado,2);
                    System.out.println("Area:"+area);
                    break;                    
                    default:
                        break;
                }

                break;
            case 3:
                System.out.println("Ingrese el los lados del triángulo: ");
                float lado1 = myScanner.nextInt();
                float lado2 = myScanner.nextInt();
                float lado3 = myScanner.nextInt();

                System.out.println("Ingrese el la base del triángulo: ");
                float base = myScanner.nextInt();
                myScanner.nextLine();
                System.out.println("Ingrese la altura del triángulo: ");
                float altura = myScanner.nextInt();

                System.out.println("Escoja una opción:");
                System.out.println("1. Perímetro");
                System.out.println("2. Área");
                option = myScanner.nextInt();

                 switch (option) {
                    case 1:
                    float perimetro = lado1 + lado2 + lado3;
                    System.out.println("Perímertro: "+perimetro );    
                        break;
                    case 2:
                    float area = (float)(base*altura*0.5);
                    System.out.println("Area:"+area);
                    break;                    
                    default:
                        break;
                }

                break;
            
            default:
                System.out.println("Número incorrecto");
                break;
        }
        
    }
}