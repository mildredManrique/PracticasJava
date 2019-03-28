package PracticasMetodos;

public class AreaTriangulo {
    public static void main (String args []){

        int triangulo1 = obtenerArea(15, 20);
        int triangulo2 = obtenerArea(10, 15);

        System.out.println("El área del triangulo es  " + triangulo1 );
        System.out.println("El área del triangulo es  " + triangulo2 );

    }

    public static int obtenerArea ( int altura, int base){
        int area = (altura * base) / 2;
        return area;

    }
}
