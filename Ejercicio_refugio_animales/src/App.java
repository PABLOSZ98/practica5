import modelo.Refugio;
import modelo.Animal;
import modelo.Cuidador;
import es.usal.progiii.tools.Esdia;

public class App {
    public static void main(String[] args) throws Exception {

        System.out.println("---GESTION DE REFUGIO DE ANIMALES---\n\n");
        int opcion,capacidad = 0;

       do{

        capacidad = Esdia.readInt("Introduce la cantidad maxima de animales: ");

       }while(capacidad <= 0);


        do {
            System.out.println("1) Crear un nuevo registro de animales ");
            System.out.println("2) Configurar el precio del alimento por kg ");
            System.out.println("3) Añadir un nuevo animal al refugio ");
            System.out.println("4) Mostrar informacion de los animales ");
            System.out.println("5) Salir (se borrara toda la informacion ) ");

            opcion = Esdia.readInt("Introduce la opcion deseada -> ");

            switch (opcion) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida.");
                    break;
            }
        } while (opcion != 5);
    }
}