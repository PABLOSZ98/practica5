package modelo;


public class Cuidador{

    String nombre;
    String apellidos;
    boolean formacion;

        public Cuidador(String nombre,String apellidos, boolean formacion){

            this.nombre = nombre;
            this.apellidos = apellidos;
            this.formacion = formacion;

        }

            public String getnombre(){
                
                return nombre;
            }

            public void setnombre(String nombre){

                this.nombre = nombre;
            }

            public String getapellido(){

                return apellidos;
            }

            public void setapellidos(String apellidos){

                this.apellidos = apellidos;
            }

            public boolean getformacion(){

                return formacion;
            }

            public void setformacion(boolean formacion){

                this.formacion = formacion;
            }












    
}











