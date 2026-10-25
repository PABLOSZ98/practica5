
package modelo;

public class Animal {

    private Cuidador cuidador;
    String nombre;
    String especie;
    int peso;
    int consumoDiario;
    


    public Animal(Cuidador cuidador, String nombre, String especie, int peso, int consumoDiario){

        this.cuidador = cuidador;
        this.nombre = nombre;
        this.especie = especie;
        this.peso = peso;
        this.consumoDiario = consumoDiario; 
    }

    public Cuidador getcuidador(){

        return cuidador;
    }

    public void setcuidador(Cuidador cuidador){

        this.cuidador = cuidador;
    }

    public String getnombre(){

        return nombre;
    }

    public void setnombre(String nombre){

        this.nombre = nombre;
    }

    public String getespecie(){

        return especie;
    }

    public void setespecie(String especie){

        this.especie = especie;
    }

    public int getpeso(){

        return peso;
    }

    public void setpeso(int peso){

        this.peso = peso;
    }

    public int getconsumoDiario(){

        return consumoDiario;
    }

    public void setconsumoDiario(int consumoDiario){

        this.consumoDiario = consumoDiario;
    }





}
















