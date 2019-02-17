import java.sql.SQLOutput;

public class Variables {
    public static void main (String [] args) //ARGS: NOMBRE DEL PARAMETRO
    {
        //string es para texto
       String nombre = "Mildred";
       String apellidoPaterno = "Manrique" ;
       String apellidoMaterno = "Pech";
       int edad = 22;
       int tiempo = 1000;

       System.out.println(nombre +" "+ apellidoPaterno + " "+ apellidoMaterno);
       System.out.println("edad: " + edad);
        System.out.println("Pero en "  + tiempo + " años tendré: " + (edad + tiempo));

    }
}
