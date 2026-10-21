
package modelo;

public class Refugio{

    private Animal animales[];
    float precio_alimentoKg;
    int animales_registrados;


    public Refugio(Animal animales[],float precio_alimentoKg, int animales_registrados ){

        this.animales = animales;
        this.precio_alimentoKg = precio_alimentoKg;
        this.animales_registrados = animales_registrados;


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









    
}





























