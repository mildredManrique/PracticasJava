package PracticasMetodos;

public class Antro {
    public static void main (String args []){

        calcularEdadPermitida( "Mildred", 18, "CocoBongo", 18);
        calcularEdadPermitida( "Edwin", 23, "El Pecado", 26);

    }

    public static void calcularEdadPermitida(String nomPersona, int edadPersona, String nomAntro, int edadPermitida ){
        if (edadPersona >= edadPermitida){
            System.out.println(nomPersona + " puede entrar al antro " + nomAntro);
        }
        else {
            System.out.println(nomPersona + " no puedes entrar al antro " + nomAntro + " porque tienes " + edadPersona + " años");
        }
    }
}
