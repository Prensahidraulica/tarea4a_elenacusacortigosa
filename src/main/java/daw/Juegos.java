package daw;

import java.nio.channels.Pipe.SourceChannel;
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
        int puertaOVentanaInt = numAleatorio.nextInt(1, 3);
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

        Random numAleatorio = new Random();
        int numAleatorio1 = numAleatorio.nextInt(1, 3);
        boolean repetir = false; 
        Scanner teclado = new Scanner(System.in);

        String enunciado = """
                ------------------------------------------------------------------------------------------------------------
                Por suerte o por desgracia, la única manera de entrar a la casa es por la puerta principal de la casa, 
                llena de fluidos viscosos. ¿Serán las mucosidades de algún flipado?
                ------------------------------------------------------------------------------------------------------------
                """;

        System.out.println(enunciado);
        

        do {
            System.out.println("¿Quieres entrar por la puerta llena de fluidos viscosos, o crees que la situación te supera? (Entrar / Salir)");
            String respuesta1 = teclado.nextLine();

            if (respuesta1.equalsIgnoreCase("entrar")) {
                String enunciadoEntrar = """
                        ---------------------------------------------------------------------------------------------------------------
                        Abres la puerta viscosa de la entrada y entras al recibidor. Cuesta un poco de abrir, pero está tan, pero tan 
                        viscosa que no haces ruido. (Incluso hay bichos pegados que no se han visto en la vida).

                        Hay varios cuadros en las paredes. Uno de ellos, el más grande y destacable, es "La consagración de Napoleón".
                        Siento que el ovispo que sujeta la enorme cruz que está a la derecha de Napoleón me sigue con la mirada
                        ---------------------------------------------------------------------------------------------------------------
                        """;

                System.out.println();
                System.out.println(enunciadoEntrar);
                System.out.println();

                do {
                    System.out.println("Ahora puedes elegir entre abrir la puerta mugrienta del salón, la puerta colorida de la biblioteca o salir de la casa");
                    System.out.println("Salón / Biblioteca / Salir");
                    String respuesta2 = teclado.nextLine();

                    if (respuesta2.equalsIgnoreCase("salón")) {
                        String enunciadoSalon = """
                                --------------------------------------------------------------------------------------------------
                                El salón está repleto de muebles antiguos, aunque algunos están roidos y manchados de sangre. 
                                Da la sensación de que la casa era de una familia de alta cuna. La única iluminación que hay es 
                                la de los desgastados candelabros y del gran candil del techo, del cual cae una cortina desgastada
                                --------------------------------------------------------------------------------------------------
                                """;
    
                        System.out.println(enunciadoSalon);
    
                    } else if (respuesta2.equalsIgnoreCase("biblioteca")) {
                        String enunciadoBiblioteca = """
                                -----------------------------------------------------------------------------------------------------
                                La biblioteca está llena de libros muy antiguos y polvorientos, algunos son de la época de Napoleón.
                                El suelo está lleno de libros, todos abiertos por alguna página, y muchas hojas color café. Parece 
                                como si el último dueño se pasara las noches en la biblioteca creando hipótesis paranóicas o haciendo
                                un plan importante. 
                                -----------------------------------------------------------------------------------------------------
                                 """;
                        System.out.println(enunciadoBiblioteca);
                    
                    } else if (respuesta2.equalsIgnoreCase("salir")) {
                        System.out.println("Has decidido salir corriendo de la casa.");
                        break;

                    } else {
                        System.out.println();
                        System.out.println("- Error al introducir el dato. Recuerda poner la tilde a salón -");
                        repetir = true;
                    }
                    
                } while (repetir);


                
            } else if (respuesta1.equalsIgnoreCase("salir")){
                System.out.println("----------------------------------------------------------------------");
                System.out.println();
                System.out.println("Has decidido salir. ");
                System.out.println("Nuestra querida monja se ha quedado con las ganas de que te confieses.");
                break;
            } else {
                System.out.println("----------------------------------------------------------------------");
                System.out.println();
                System.out.println("- Has introducido mal tu respuesta, vuelve a introducirla -");
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
                        Entras por la ventana a duras penas, te haces un corte en la pierna. Reza a Dios para que ese corte no se 
                        infecte. Ves que toda la cocina está muy revuelta, toda la vajilla está en la pila con comida y roña seca, 
                        hay vasos rotos y cubiertos por todo el suelo y una mesa y varias puertas de armarios caídas por el moho 
                        blanco

                        Todo el suelo está lleno de un líquido muy oscuro y pegajoso, como una mezcla entre granate y un marrón café.
                        Da la sensación de que alguno de los vasos rotos del suelo contendría un líquido de un color parecido.
                        Hay que reconocer que heule especialmente mal, todo está lleno de moscas
                        ------------------------------------------------------------------------------------------------------------
                        """;

                        System.out.println(enunciadoEntrar);
                        System.out.println();

                        do {
                            System.out.println("Ahora puedes elegir entre entrar a la despensa, ir al pasillo o salir de la casa");
                            System.out.println("(Despensa / Pasillo / Salir)");
                            String respuesta2 = teclado.nextLine();
        
                            if (respuesta2.equalsIgnoreCase("despensa")) {
                                String enunciadoSalon = """
                                        --------------------------------------------------------------------------------------------------
                                        La despensa está completamente vacía, no hay nada de comida, como si la persona que vivía aquí
                                        supiera que ya no iba a volver a vivir aquí nunca más. 

                                        Lo único que hay son dos baldosas para apoyar la comida
                                        --------------------------------------------------------------------------------------------------
                                        """;
                                
                                System.out.println(enunciadoSalon);
                                System.out.println();
            
                            } else if (respuesta2.equalsIgnoreCase("pasillo")) {
                                String enunciadoBiblioteca = """
                                        --------------------------------------------------------------------------------------------------------
                                        En el pasillo hay un silencio muy raro, y hay una oscuridad que hace que no quieras mirar atrás. Se 
                                        supone que la casa, por su antigüedad, no tiene ninguna instalación eléctrica, pero al final del pasillo
                                        se ve una tenue luz blanca que no es posible crear sin electricidad.  
                                        --------------------------------------------------------------------------------------------------------
                                         """;
                                System.out.println(enunciadoBiblioteca);

                            } else if (respuesta2.equalsIgnoreCase("salir")) {
                                System.out.println("Has decidido salir corriendo de la casa.");
                                break;
                    
                            } else {
                                System.out.println("-------------------------------------------------------------");
                                System.out.println("Error al introducir el dato. Recuerda poner la tilde a salón");
                                System.out.println("-------------------------------------------------------------");
                                repetir = true;
                            }
                            
                        } while (repetir);
                
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
