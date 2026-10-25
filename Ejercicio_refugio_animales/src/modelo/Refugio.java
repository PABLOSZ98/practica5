
package modelo;

public class Refugio{

    private Animal animales[];
    float precio_alimentoKg;
    int animales_registrados;


    public Refugio(int capacidad ){

        this.animales = new Animal[capacidad];
        this.precio_alimentoKg = 3;
        this.animales_registrados = 0;


    }

    public Animal[] getanimales(){

        return animales;
    }

    public void setAnimales(Animal[] animales) {


        this.animales = animales;
    }

    public float precio_alimentoKg(){

        return precio_alimentoKg;
    }

    public void setprecio_alimentoKg(float precio_alimentoKg){

        this.precio_alimentoKg = precio_alimentoKg;
    }

    public int animales_registrados(){

        return animales_registrados;
    }

    public void setanimales_registrados(int animales_registrados){

        this.animales_registrados = animales_registrados;
    }


        public boolean anadirAnimal(Animal animal){

            if (animales_registrados >= animales.length){

                System.out.println("Numero de animales maximos \n");
                return false;
            }

            else{

             animales[animales_registrados] = animal;
             animales_registrados++;   

                 return true;
            }

           
        }







    
}





























