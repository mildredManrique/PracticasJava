public class SwitchEevee {
    public static void main (String [] args) throws Exception {
        String nombre = "Eevee";
        String tipo= "normal";
        String piedra ="agua";

        switch (piedra) {
            case "fuego":
                nombre="Flareon";
                tipo= "fuego";
                break;

            case "agua":
                nombre="Vaporeon";
                tipo= "Agua";
                break;

            case "trueno":
                break;

            case "alba":
                break;

            case "hoja":
                break;

            case "noche":
                break;

            case "hielo":
                break;

            case "hada":
                break;

            default :
                throw new IllegalArgumentException( "esta piedra no existe");

        }
        System.out.println(nombre + " es de tipo: " + tipo);






    }




}
