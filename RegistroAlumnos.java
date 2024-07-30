import java.util.ArrayList;
import java.util.Scanner;

class Alumno {
    private String nombre;
    private double nota;

    public Alumno(String nombre, double nota) {
        this.nombre = nombre;
        this.nota = nota;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNota(double nota) {
        this.nota = nota;

    }

    public double getNota() {
        return nota;
    }
}

public class RegistroAlumnos {
    // string de alumnos registrados
    private static ArrayList<Alumno> alumnos = new ArrayList<>();

    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);

        boolean continuar = true;

        // Llamar a los métodos para ejecutar la lógica
        while (continuar) {
            continuar = mostrarOption(myScanner);
        }

        // Cerrar el Scanner después de su uso
        myScanner.close();

    }

    public static boolean mostrarOption(Scanner myScanner) {

        System.out.println("Menú de opciones: ");
        System.out.println("1. Registrar alumno ");
        System.out.println("2. Mostrar todos los alumnos ");
        System.out.println("3. Mostrar promedio de notas ");
        System.out.println("4. Buscar alumno por nombre ");
        System.out.println("5. Modificar nota por nombre ");
        System.out.println("6. Eliminar alumno por nombre ");
        System.out.println("7. Salir ");
        System.out.print("Eliga una opción (ingrese un número): ");
        int numOption = myScanner.nextInt();

        switch (numOption) {
            case 1:
                registroAlumnos(myScanner);
                break;
            case 2:
                mostrarAlumnos();
                break;
            case 3:
                mostrarPromedioNotas();
                break;
            case 4:
                buscarAlumnoPorNombre(myScanner);
                break;
            case 5:
                modificarNotaPorNombre(myScanner);
                break;
            case 6:
                eliminarAlumnoPorNombre(myScanner);
                break;

            case 7:
                return false;

            default:
                System.out.println("Opción no válida. Intente de nuevo.");
        }

        return true;

    }

    public static void registroAlumnos(Scanner myScanner) {

        String nombre;
        while (true) {
            System.out.println("Ingrese el nombre del alumno: ");

            nombre = myScanner.nextLine().toLowerCase();
            if (!nombre.trim().isEmpty() && nombre.matches("[a-zA-Z\\s]+")) {
                break;
            } else {
                System.out.println(
                        "Nombre inválido. Por favor, ingrese un nombre que no contenga números ni caracteres especiales..");
            }
        }

        double nota;
        while (true) {

            System.out.print("Ingrese la nota del alumno (0-20): ");
            try {
                nota = myScanner.nextDouble();
                myScanner.nextLine();

                if (0 <= nota && nota <= 20) {
                    break;
                } else {
                    System.out.println("Nota inválida. Ingrese otra nota entre 0 y 20. ");
                }
            } catch (Exception e) {
                System.out.println("Entrada inválida. ");
                myScanner.nextLine();

            }

        }

        Alumno alumno = new Alumno(nombre, nota);
        RegistroAlumnos.alumnos.add(alumno);
        System.out.println("Alumno registrado con éxito.\n");

    }

    public static void mostrarAlumnos() {
        if (alumnos.isEmpty()) {
            System.out.println("No hay alumnos registrados.\n");
        } else {
            System.out.println("Alumnos registrados:");

            for (Alumno alumno : alumnos) {
                System.out.println("Nombre: " + alumno.getNombre() + ", Nota: " + alumno.getNota());
            }
            System.out.println();
        }

    }

    public static void mostrarPromedioNotas() {
        if (alumnos.isEmpty()) {
            System.out.println("No hay alumnos registrados.\n");
        } else {
            double sumaNotas = 0;
            for (Alumno alumno : alumnos) {
                sumaNotas += alumno.getNota();
            }

            double promedio = sumaNotas / alumnos.size();

            System.out.println("El promedio de notas es: " + promedio + "\n");
        }
    }

    public static void buscarAlumnoPorNombre(Scanner myScanner) {
        System.out.println("Ingrese el nombre del alumno a buscar: ");
        myScanner.nextLine(); // agregar esta linea
        String nombreBuscar = myScanner.nextLine().toLowerCase();
        boolean encontrado = true;

        for (Alumno alumno : alumnos) {
            if (alumno.getNombre().equals(nombreBuscar)) {
                System.out.println(
                        "Alumno encontrado: Nombre: " + alumno.getNombre() + ", Nota: " + alumno.getNota() + "\n");
                encontrado = true;
                break;
            }
        }

        if (!encontrado) {
            System.out.println("Alumno no encontrado.\n");
        }

    }

    public static void modificarNotaPorNombre(Scanner myScanner) {
        System.out.println("Ingrese el nombre del alumno a buscar: ");
        myScanner.nextLine(); // agregar esta linea
        String nombreBuscar = myScanner.nextLine().toLowerCase();
        boolean encontrado = true;

        for (Alumno alumno : alumnos) {
            if (alumno.getNombre().equals(nombreBuscar)) {
                System.out.println("Ingrese la nueva nota:");
                double newNota = myScanner.nextDouble();
                alumno.setNota(newNota);
                System.out.println("Nota modificada con éxito.\n");
                encontrado = true;
                break;
            }
        }

        if (!encontrado) {
            System.out.println("Alumno no encontrado.\n");
        }

    }

    public static void eliminarAlumnoPorNombre(Scanner myScanner) {
        System.out.println("Ingrese el nombre del alumno que desea eliminar: ");
        myScanner.nextLine(); // agregar esta linea
        String nombreBuscar = myScanner.nextLine().toLowerCase();
        boolean encontrado = true;

        for (int i = 0; i < alumnos.size(); i++) {
            if (alumnos.get(i).getNombre().equals(nombreBuscar)) {
                alumnos.remove(i);
                System.out.println("Alumno eliminado con éxito.\n");
                encontrado = true;
                break;
            }
        }

        if (!encontrado) {
            System.out.println("Alumno no encontrado.\n");
        }
    }
}
