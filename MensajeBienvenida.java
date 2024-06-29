import java.math.BigDecimal;
import java.time.LocalDate;

public class MensajeBienvenida {
    
    public static void main(String[] args) {
        // Declarar y asignar la variable mensajeBienvenida
        String mensajeBienvenida = "Bienvenido a Java";
        // Imprimir mensajeBienvenida con contexto
        System.out.println("Mensaje de bienvenida: " + mensajeBienvenida);
        
        // Declarar y asignar la variable temperaturaActual
        double temperaturaActual = 19.0;
        // Imprimir temperaturaActual con contexto
        System.out.println("Temperatura actual: " + temperaturaActual + " grados Celsius");
        
       
        
        BigDecimal priceProduct = new BigDecimal("20.5");
        System.out.println("Precio: s/." + priceProduct);

        String nameLastname = "Emil Zapata";
        System.out.println("Nombre completo: " + nameLastname);

        // Declarar y asignar la variable para la fecha de nacimiento de una persona
        LocalDate birthdate = LocalDate.of(1995, 10, 14);
        System.out.println("Cumpleaños: " + birthdate);

        int numberPeople = 2000;
        System.out.println("Número de habitantes de Carhuamayo: " + numberPeople);


        // Declarar y asignar la variable datoLogico
        boolean itemAvailable = true;
        // Imprimir datoLogico con contexto
        System.out.println("Articulo disponible: " + itemAvailable);

        // Declarar y asignar la variable para la distancia entre dos ciudades
        double distanciaCiudades = 350.75;
        System.out.println("La distancia entre las dos ciudades es: " + distanciaCiudades + " kilómetros");

        // Declarar y asignar la variable para el número de teléfono de una persona
        String numeroTelefono = "+51 971656258";
        System.out.println("El número de teléfono es: " + numeroTelefono);

    }
}
