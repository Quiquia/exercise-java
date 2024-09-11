import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Scanner;

    //Clase Libreria
 class Libreria {
        private HashSet<GestionCatalogoLibreria> catalogo;

        //constructor
        public Libreria() {
            catalogo = new HashSet<>();
        }
        
        // Método para agregar libros al catálogo
        public boolean agregarLibro(GestionCatalogoLibreria libro) {
            if (catalogo.add(libro)) {
                System.out.println("Libro agregado: " + libro.getTitulo());
                return true;
            } else {
                System.out.println("El libro ya existe en el catálogo: " + libro.getTitulo());
                return false;
            }
        }

     // Método para eliminar libros del catálogo por ISBN
     public boolean eliminarLibro(String isbn) {
         Iterator<GestionCatalogoLibreria> iterator = catalogo.iterator();
         while (iterator.hasNext()) {
             GestionCatalogoLibreria libro = iterator.next();
             if (libro.getIsbn().equals(isbn)) {
                 iterator.remove();
                 System.out.println("Libro eliminado: " + libro.getTitulo());
                 return true;
             }
         }
         System.out.println("No se encontró un libro con el ISBN proporcionado.");
         return false;
     }
    
    // Método para mostrar todos los libros en el catálogo
    public void mostrarCatalogo() {
        if (catalogo.isEmpty()) {
            System.out.println("El catálogo está vacío.");
        } else {
            for (GestionCatalogoLibreria libro : catalogo) {
                System.out.println(libro);
            }
        }
    }
        
    }


public class GestionCatalogoLibreria {

    private String titulo;
    private String autor;
    private String isbn;

    //constructor
    public GestionCatalogoLibreria(String titulo, String autor, String isbn) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
    }

    //Getters
    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public String getIsbn() {
        return isbn;
    }

    // Implementamos equals y hashCode para comparar por ISBN
    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;
        GestionCatalogoLibreria libro = (GestionCatalogoLibreria) o;
        return isbn.equals(libro.isbn);
    }
   
    @Override
    public int hashCode() {
        return Objects.hash(isbn);
    }


    @Override
    public String toString() {
        return "Libro{" +
                "Título='" + titulo + '\'' +
                ", Autor='" + autor + '\'' +
                ", ISBN='" + isbn + '\'' +
                '}';
    }
    

    // Clase Main para probar la implementación
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        Libreria libreria = new Libreria();
        int opcion;

        do{
            System.out.println("\n--- Gestión de Catálogo de Librería ---");
            System.out.println("1. Agregar libro");
            System.out.println("2. Eliminar libro");
            System.out.println("3. Mostrar catálogo");
            System.out.println("4. Salir");
            System.out.print("Selecciona una opción: "); 
            opcion = myScanner.nextInt();
            myScanner.nextLine();//consumir un salto de línea


            switch (opcion) {
                case 1:
                    System.out.print("Ingresa el título del libro: ");
                    String titulo = myScanner.nextLine().toLowerCase();
                    System.out.print("Ingresa el autor del libro: ");
                    String autor = myScanner.nextLine().toLowerCase();
                    System.out.print("Ingresa el número de ISBN: ");
                    String isbn = myScanner.nextLine().toLowerCase();

                    GestionCatalogoLibreria libro = new GestionCatalogoLibreria(titulo, autor, isbn);
                    libreria.agregarLibro(libro);
                    System.out.println("Libro agregado al catálogo.");
                    break;
                case 2:
                    System.out.print("Ingresa el número de ISBN del libro a eliminar: ");
                    String isbnEliminar = myScanner.nextLine();
                    libreria.eliminarLibro(isbnEliminar);
                    System.out.println("Libro eliminado del catálogo.");
                    break;
            
                case 3:
                    libreria.mostrarCatalogo();
                    break;
                case 4:
                     System.out.println("Saliendo del programa...");
                    break;
            
                default:
                System.out.println("Opción no válida. Por favor, selecciona una opción válida.");
                    break;
            }
        } while (opcion != 4);
        
        myScanner.close();
    }
}
