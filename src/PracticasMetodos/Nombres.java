package PracticasMetodos;

public class Nombres {
    public static void main(String args[]) {

//obtenerNombre("Edwin", "Mildred");

        String mayorCaracter = obtenerNombre("Edwin", "azu"); //Edwin


        System.out.println(mayorCaracter + " tiene mayor numero de  letras " + mayorCaracter.length());
    }

    public static String obtenerNombre(String nom1, String nom2) {

        if (nom1.length() > nom2.length()) {

            return nom1;
        } else {
            return nom2;
        }



    }
}



