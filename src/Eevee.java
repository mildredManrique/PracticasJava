public class Eevee {
    public static void main (String [] args)
    {
        String nombre = "Eevee";
        String tipo = "Fuego";
        String piedra = "Hada";

        if (piedra == "Fuego")
        {
            nombre= "Flareon";
            tipo= "Fuego";

        }

        if (piedra == "Agua")
        {
            nombre= "Vaporeon";
            tipo= "Agua";

        }

         if (piedra == "Trueno")
         {
            nombre= "Jolteon";
            tipo= "Eléctrico";

         }

        if (piedra == "Alba")
            {
                nombre= "Espeon";
                tipo= "Psíquico";

            }

        if (piedra == "Hoja")
        {
            nombre= "Leafeon";
            tipo= "Planta";

        }

        if (piedra == "Noche")
        {
            nombre= "Umbreon";
            tipo= "Oscuro";

        }

        if (piedra == "Hielo")
        {
            nombre= "Glaceon";
            tipo= "Hielo";

        }

        if (piedra == "Hada")
        {
            nombre= "Sylveon";
            tipo= "Hada";

        }


        System.out.println("Nombre del pokemon: " + nombre);
        System.out.println("El tipo del pokemon es: " + tipo);
        System.out.println("El tipo de piedra que sostiene es: " + piedra);
    }
}

