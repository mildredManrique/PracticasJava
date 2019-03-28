package PracticasMetodos;

public class Nombres {
    public static void main (String args []){

obtenerNombre("Edwin", "Mildred");

String mayorCaracter = obtenerNombre("Edwiiiiiin", "azucenaaaaaaaaaaaaa");

        System.out.println( mayorCaracter + " tiene mayor numero de  letras" );
    }
    public static String obtenerNombre ( String nom1, String nom2 ){

        if (nom1.length () >  nom2.length ()) {

            if (nom1.length() < nom2.length()) {

            }
            return nom1;
        }
        return nom2;
        }

    }



