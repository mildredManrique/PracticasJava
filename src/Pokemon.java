public class Pokemon {
    public static void main (String [] args)
    {
    String nombre = "Charmander";
    String tipo1 = "Fuego";
    String tipo2 = null;
    int nivel = 5;


    if(nivel >= 16)
    {
        nombre = "Charmeleon";
    }

    if(nivel >= 36)
        {
            nombre = "Charizard";
            tipo2 = "Volador";
        }

        System.out.println( "Nombre del pokemon: " + nombre);
        System.out.println("Tipo 1 de pokemon: " + tipo1);
        System.out.println( "Tipo 2 de pokemon: " + tipo2 );
        System.out.println( "NIvel del pokemon: " + nivel);



    }
}
