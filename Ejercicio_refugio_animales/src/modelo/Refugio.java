
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

    public float getprecio_alimentoKg(){

        return precio_alimentoKg;
    }

    public void setprecio_alimentoKg(float precio_alimentoKg){

        this.precio_alimentoKg = precio_alimentoKg;
    }

    public int getsanimales_registrados(){

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


        
        public float calcularCosteDiarioTotal() {
            float total = 0.0f;
            for (int i = 0; i < this.animales_registrados; i++) {
                total += this.animales[i].calcularCosteDiario(this.precio_alimentoKg);
            }
            return total;
        }


        public float calcularPesoMedio() {
            if (this.animales_registrados == 0) {
                return 0.0f;
            }
            float sumaPesos = 0.0f;
            for (int i = 0; i < this.animales_registrados; i++) {
                sumaPesos += this.animales[i].getpeso();
            }
            return sumaPesos / this.animales_registrados;
        }



























    
}





























