package daw;

import java.util.Random;
import java.util.Scanner;

public class Juegos {
    

    public static final String MensajeInicial = """

                        ~ Bienvenido a la casa del terror ~
                        
                        La gente suele entrar aquí para pasárselo bien, pero no son lo suficientemente inteligentes 
                        como para salir de aquí, y mucho menos con vida.

                        Quizá su encanto exterior con muros derroidos, animales muertos en plena descomposición y 
                        huesos rotos en el jardín hace creer a la gente que llega aquí que son muy valientes para entrar. 

                        El problema es que eso hará que haya más huesos rotos en el jardín, 
                        a nuestros inquilinos no les gusta la gente nueva.
                        """;

    public static String DecidirPuertaVentana() {
        Random numAleatorio = new Random();
        int puertaOVentanaInt = numAleatorio.nextInt(1, 2);
        String puertaOVentana = "";

        switch (puertaOVentanaInt) {
            case 1:
                puertaOVentana = "puerta";
                break;
            case 2:
                puertaOVentana = "ventana";
                break;
        }

        return puertaOVentana;
    }

    public static String CasoPuerta() {

        boolean repetir = false; 
        Scanner teclado = new Scanner(System.in);

        String enunciado = """
                ------------------------------------------------------------------------------------------------------------
                Por suerte o por desgracia, la única manera de entrar a la casa es por la puerta del salón llena de fluidos 
                viscosos. ¿Serán las mucosidades de algún flipado?
                ------------------------------------------------------------------------------------------------------------
                """;

        System.out.println(enunciado);
        

        do {
            System.out.println("¿Quieres entrar por la puerta llena de fluidos viscosos, o crees que la situación te supera? (Entrar / Salir)");
            String respuesta = teclado.nextLine();

            if (respuesta.equalsIgnoreCase("entrar")) {
                String enunciadoEntrar = """
                        ---------------------------------------------------------------------------------------------------------------
                        Abres la puerta viscosa del salón. Cuesta un poco de abrir, pero está tan, pero tan viscosa que no haces ruido. 
                        (Incluso hay bichos pegados que no han visto en la vida)

                        El salón está repleto de muebles antiguos, aunque algunos están roidos y manchados de sangre. 
                        Da la sensación de que la casa era de una familia de alta cuna. La única iluminación que hay es 
                        la de los desgastados candelabros y del gran candil del techo, del cual cae una cortina desgastada
                        ------------------------------------------------------------------------------------------------------------
                        """;

                System.out.println(enunciadoEntrar);
                
            } else if (respuesta.equalsIgnoreCase("salir")){
                System.out.println("----------------------------------------------------------------------");
                System.out.println();
                System.out.println("Has decidido salir. ");
                System.out.println("Nuestra querida monja se ha quedado con las ganas de que te confieses.");
                break;
            } else {
                System.out.println("----------------------------------------------------------------------");
                System.out.println();
                System.out.println("Has introducido mal tu respuesta");
                repetir = true;
            }
        } while (repetir);
        
        return enunciado; 
        

    }

    public static String CasoVentana() {
        boolean repetir = false; 
        Scanner teclado = new Scanner(System.in);

        String enunciado = """
                ------------------------------------------------------------------------------------------------------------
                Por suerte o por desgracia, la única manera de entrar a la casa es por la ventana de la cocina. 
                Hay muchos cristales rotos, por lo que te podrías cortar muy fácilmente, y el marco de la ventana 
                está llena de cortes profundos, un cuchillo cualquiera no ha podido hacer ese corte. 
                ------------------------------------------------------------------------------------------------------------
        
                """;

        System.out.println(enunciado);
        

        do {
            System.out.println("¿Quieres entrar por la ventana con cristales rotos, o crees que la situación te supera? (Entrar / Salir)");
            String respuesta = teclado.nextLine();

            if (respuesta.equalsIgnoreCase("entrar")) {
                String enunciadoEntrar = """
                        ------------------------------------------------------------------------------------------------------------
                        Abres la puerta viscosa del salón. Cuesta un poco de abrir, pero está tan, pero tan viscosa que no haces ruido. 
                        (Incluso hay bichos pegados que no han visto en la vida)

                        El salón está repleto de muebles antiguos, aunque algunos están roidos y manchados de sangre. 
                        Da la sensación de que la casa era de una familia de alta cuna. La única iluminación que hay es 
                        la de los desgastados candelabros y del gran candil del techo, del cual cae una cortina desgastada
                        ------------------------------------------------------------------------------------------------------------
                        """;
                
            } else if (respuesta.equalsIgnoreCase("salir")){
                System.out.println("----------------------------------------------------------------------");
                System.out.println();
                System.out.println("Has decidido salir. ");
                System.out.println("Nuestra querida monja se ha quedado con las ganas de que te confieses.");
                break;
            } else {
                System.out.println("----------------------------------------------------------------------");
                System.out.println();
                System.out.println("Has introducido mal tu respuesta");
                repetir = true;
            }
        } while (repetir);
        
        return enunciado; 
    }
}
