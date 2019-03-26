package PracticasMetodos;

public class Metodos {
    //Metodos main

    public static void main (String args []){
        int a = 15;
        int b = 5;
        int c = 85;

        metodoSumar (a, b, c);
        obtenerPromedio(5, 8.5, 9, 10,  "Mildred");

        Antro.calcularEdadPermitida("Jose", 15, "Manzana Envenenada", 20);


    }

    //Metodo 1
    //void = vacio
    // Dentro de los parentesis van los parametros
    public static void metodoSumar(int num1, int num2, int num3){
        int resultado = num1 + num2 + num3;
                System.out.println("El resultado es: " + resultado);

    }

    //Metodo 2
    public static void obtenerPromedio (double cal1, double cal2, double cal3, double cal4, String nombre){
        double promedio = (cal2 + cal2 + cal3 + cal4) / 4;
        System.out.println("El promedio de: " + nombre + " es: " + promedio);
    }
}
