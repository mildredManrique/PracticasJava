public class StringMethods {
    public static void main (String [] args) {
        String Direct = "Calle 14 entre 19 y 21";

        System.out.println("Mi direccion es: " + Direct.toLowerCase() + " y contiene " + Direct.length() + " caracteres");

        if(Direct.length() > 5){
            System.out.println("Tu dirección es mayor que 5");
        } else {
            System.out.println("Tu dirección es muy corta");

        }

        //obtener primer caracter
        System.out.println("Index of: " + Direct.indexOf("e"));
        System.out.println("Substring: " + Direct.substring(0, 5));
    }
}







