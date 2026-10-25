import modelo.Refugio;
import modelo.Animal;
import modelo.Cuidador;
import es.usal.progiii.tools.Esdia;

public class App {
    public static void main(String[] args) throws Exception {

        System.out.println("---GESTION DE REFUGIO DE ANIMALES---\n\n");
        int opcion,capacidad = 0;
        Refugio refugio = null;

       


        do {
            System.out.println("1) Crear un nuevo registro de animales ");
            System.out.println("2) Configurar el precio del alimento por kg ");
            System.out.println("3) Añadir un nuevo animal al refugio ");
            System.out.println("4) Mostrar informacion de los animales ");
            System.out.println("5) Salir (se borrara toda la informacion ) ");

            opcion = Esdia.readInt("Introduce la opcion deseada -> ");

            switch (opcion) {
                case 1: 
                
                do{

                  capacidad = Esdia.readInt("Introduce la cantidad maxima de animales: ");

                    }while(capacidad <= 0);

                    refugio = new Refugio(capacidad);
                    System.out.println("Registro creado correctamente ");    
                    break;


                case 2:

                  
                    if (refugio == null) {
                        System.out.println("Error: No existe ningún registro, crea uno primero.\n");
                    }
                    else{
                        
                    float nuevoPrecio = 0;
                    do {
                        nuevoPrecio = Esdia.readFloat("Introduce el nuevo precio del alimento por kg: ");
                    } while (nuevoPrecio <= 0);

                    refugio.setprecio_alimentoKg(nuevoPrecio);
                    System.out.println("Precio del alimento actualizado correctamente a " + nuevoPrecio + " €/kg.\n");
                    break;}
                    
                   

                case 3:

                    if (refugio == null){

                        System.out.println("Error: No existe ningun registro, crea uno primero \n");
                        break;
                    }

                   
                    String nombre = Esdia.readString("Nombre del cuidador: ");
                    String apellido = Esdia.readString("Apellidos del cuidador: ");
                    boolean formacion = Esdia.yesOrNo("¿Tiene formación en cuidado animal? (s/n): ");

                   
                    Cuidador nuevoCuidador = new Cuidador(nombre, apellido, formacion);

                   
                    String nomAnimal = Esdia.readString("Nombre del animal: ");
                    String especie = Esdia.readString("Especie: ");

                    int peso = 0;
                    do {
                        peso = Esdia.readInt("Peso en kg : ");
                    } while (peso <= 0);

                    int consumo = 0;
                    do {
                        consumo = Esdia.readInt("Consumo diario de alimento en kg: ");
                    } while (consumo <= 0);

                    Animal nuevoAnimal = new Animal(nuevoCuidador, nomAnimal, especie, peso, consumo);

                     boolean guardado = refugio.anadirAnimal(nuevoAnimal);

                    if (guardado) {
                        System.out.println("Animal añadido correctamente al refugio.\n");
                    } else {
                        System.out.println("Error: El refugio está lleno. No caben más animales.\n");
                    break;}

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