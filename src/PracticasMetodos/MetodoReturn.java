package PracticasMetodos;

public class MetodoReturn {
    public static void main(String args[]) {

        obtenerMayor(100, 32, 15);

        int numMayor = obtenerMayor(5, 1, 3);
        int numMayor2 = obtenerMayor(1, 8, 3);
        int numMayor3 = obtenerMayor(2, 6, 10);

        System.out.println("El número final es " + numMayor);
        System.out.println("El número final es " + numMayor2);
        System.out.println("El número final es " + numMayor3);
    }

    public static int obtenerMayor(int a, int b, int c) {
       if (a > b && a >c ){
           return a;

       }
         if (b > c && b > a){
               return b;
           }
         else {
             return c;
       }

        }
    }











