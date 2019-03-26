public class ClaseBooleana {
    public static void main(String[] args) {
        boolean edad = true;
        boolean apellido = false;
        int a = 1;
        int b = 10;
        boolean mayor = a > b;
        boolean menor = a < b;


        //System.out.println( edad );
        //System.out.println( apellido );
        System.out.println( mayor );
        System.out.println( menor );

        if(mayor)
        {
            System.out.println("Eres mayor");
        }

        else
            {
                System.out.println( "No eres mayor" );
        }

        if (menor)
        {
            System.out.println( "ERES MENOR" );
        }

        else
        {
            System.out.println( "NO ERES MENOR" );
        }

        if (b < a)
        {
            System.out.println( "EDWIN" );
        }

        else{ //ELSE SIEMPRE VA A IMPRIMIR LO QUE ES FALSO
            System.out.println( "MILDRED" );
        }

        }
    }


