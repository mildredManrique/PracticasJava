public class PermisoConducir {
    public static void main (String []args) throws Exception {
        String Nombre = "Mildred";
        int EdadActual = 15 ;
        int EdadPermitida = 18;
        boolean SabeManejar = false;
        boolean TieneAuto= true;

     if (SabeManejar) {

         if (EdadActual >= EdadPermitida) {
             System.out.println(Nombre + " YA PUEDES MANEJAR");

             if (TieneAuto) {
                 System.out.println("Que chido, tienes auto");

             } else {
                 System.out.println("No mames, sabes manejar pero no tienes auto");
             }
         } else {
             System.out.println("AUN NO PUEDES MANEJAR por que tienes " + EdadActual + " años");
         }
     } else{
         System.out.println("No sabes manejar, para que quieres la licencia");
         }
     }

    }

