import java.util.HashSet;
import java.util.Scanner;

public class ExerciceListInvitadosCollectionFramework {

    // HashSet para almacenar los nombres de los invitados
    private HashSet<String> invitados;
    
    //Constructor de la clase
    public ExerciceListInvitadosCollectionFramework() {
        invitados = new HashSet<>();
    }
    
    //Método para agregar un invitado
    public void agregarInvitado(String nombre) {
        boolean agregado = invitados.add(nombre);
        if (agregado) {
            System.out.println(nombre + " ha sido agregado a la lista de invitados. ");
        } else {
            System.out.println(nombre + " ya está en la lista de invitados.");
        }
    }
    
    //Método para eliminar un invitado
    public void eliminarInvitado(String nombre) {
        boolean eliminado = invitados.remove(nombre);
        if (eliminado) {
            System.out.println(nombre + " ha sido elimindao de la lista de invitados. ");
        } else {
            System.out.println(nombre + " no estaba en la lista de invitados.");
        }
    }

    //Método para mostrar la lista de invitados
    public void mostrarInvitados() {
        System.out.println("Lista de invitados:\n ");
        if (invitados.isEmpty()) {
            System.out.println("No hay invitados en la lista.");
        } else {
            for (String invitado : invitados) {
                System.out.println("* "+ invitado);
            }
        }
    }

     // Método principal con menú interactivo
     public static void main(String[] args) {
        
        Scanner myScanner = new Scanner(System.in);
        ExerciceListInvitadosCollectionFramework registro = new ExerciceListInvitadosCollectionFramework();
        int opcion;

        do {
            //Mostrar menú de opciones
            System.out.println("\nMenú");
            System.out.println("1. Agregar invitado");
            System.out.println("2. Eliminar invitado");
            System.out.println("3. Mostrar lista de invitados");
            System.out.println("4. Salir");
            System.out.println("Selecciona una opción.");

            //Leer opción del usuario
            opcion = myScanner.nextInt();
            myScanner.nextLine();

            switch (opcion) {
                case 1:
                    //agregar invitado
                    System.out.print("Ingrese el nombre del invitado a Agregar:\n");
                    String nombreAgregar = myScanner.nextLine().toLowerCase();
                    registro.agregarInvitado(nombreAgregar);
                    break;

                case 2:
                    // Eliminar invitado
                    System.out.print("Ingrese el nombre del invitado a Eliminar:\n ");
                    String nombreDelete = myScanner.nextLine().toLowerCase();
                    registro.eliminarInvitado(nombreDelete);
                    break;

                case 3:
                    //Lista de invitados
                    registro.mostrarInvitados();
                    break;

                case 4:
                    //Mostrar lista de invitados
                    System.out.println("Saliendo del programa...");

                default:
                    System.out.println("Opción inválida. Inténtalo de nuevo. ");
                    break;
            }

        } while (opcion != 4);
        // Continuar hasta que el usuario elija salir

        myScanner.close();
    }
    
    
}
