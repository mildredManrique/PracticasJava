public class SwitchCase {
    public static void main(String[] args) {
        String comida = "mole";
        int anios = 2013;

        switch (comida)
        {
            case "pozole" :
                System.out.println("Esta comida me gusta");
                break;

            case "Elote" :
                 System.out.println("esta comida me encanta");
                break;
            case "Sacol" :
                System.out.println("Esta comida no me gusta");
                break;
             default:
                 System.out.println( "Esta comida no la conozco" );
         }

         switch (anios)
         {
             case 1996 :
                 System.out.println( "En este año nací" );
                 break;

             case 2001 :
                 System.out.println( "En este año entre a la primaria" );
                 break;

             case 2013 :
                 System.out.println( "En este año comencé la universidad" );
                 break;

             default :
                 System.out.println( "No recuerdo esta fecha" );
         }

         if (anios >  2017)
         {
             System.out.println( "Estas por acabar la universidad" );
         }

         else{
             System.out.println( "te fala por terminar la universidad" );
         }




    }
}
