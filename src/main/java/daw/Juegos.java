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
            System.out.println(
                    "¿Quieres entrar por la puerta llena de fluidos viscosos, o crees que la situación te supera? (Entrar / Salir)");
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
                    System.out.println(
                            "Ahora puedes elegir entre abrir la puerta mugrienta del salón, la puerta colorida de la biblioteca o salir de la casa");
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

                        if (numAleatorio1 == 1) {
                            String enunciadoSalorSalir = """

                                    ---------------------------------------------------------------------------------------------------
                                    Por suerte para ti, has encontrado un agujero debajo de uno de los sofás roidos, aunque es un tanto
                                    estrecho. Aun así, cualquier cosa es útil mientras ayude a salir de esta casa.

                                    Cuidado con hacer ruido moviendo el sofá que hay tapando el agujero, dentro de la chimenea hay un
                                    ser que emite muy recurrentemente los sonidos de un elefante para identificar seres vivos u objetos
                                    a su alrededor, por lo que no sabemos qué pasará si ese ser se diera cuenta de tu presencia
                                    ---------------------------------------------------------------------------------------------------
                                    """;

                            System.out.println(enunciadoSalorSalir);

                            break;
                        } else if (numAleatorio1 == 2) {
                            String enunciadoSalorJuego = """

                                    -----------------------------------------------------------------------------------------------------------------------------
                                    Mientras avanzas entre los muebles roídos, el crujido del suelo se mezcla con el titilar irregular de las velas.
                                    El gran candil arroja sombras deformes sobre las paredes, donde cuelgan retratos antiguos de una familia: el patriarca con
                                    mirada altiva, la madre con un gesto rígido, y tres hijos de expresión casi idéntica, todos con los ojos demasiado vivos para
                                    estar pintados.

                                    Cuando te detienes frente a uno de los cuadros, las pupilas del retrato giran lentamente hacia ti. El aire se enfría de golpe.
                                    Un candelabro cae al suelo, apagándose, y en el instante de oscuridad total escuchas un susurro múltiple,
                                    apenas detrás de tu oído: 'Has vuelto a casa... por fin.'

                                    Cuando la luz parpadea de nuevo, los retratos están vacíos. No hay rostros en ellos.
                                    Pero al mirar hacia los muebles, ves que ahora las figuras de los cuadros están sentadas en los sillones, con la cabeza ladeada,
                                    los ojos fijos en ti. El patriarca se levanta despacio, el cuello crujiendo como madera vieja, y te ofrece la mano ensangrentada.

                                    — Toma asiento. Falta muy poco para el retrato familiar.
                                    ------------------------------------------------------------------------------------------------------------------------------

                                    """;

                            System.out.println(enunciadoSalorJuego);
                            System.out.println(
                                    "El espíritu de la casa te ha retado a un juego para liberar tu alma. Debes adivinar un número entre 1 y 20. Tienes 3 intentos.");
                            int numeroSecreto = numAleatorio.nextInt(1, 21);
                            int intentos = 3;
                            boolean adivinado = false;

                            for (int i = 1; i <= intentos; i++) {
                                System.out.println("Introduce tu intento número " + i + ":");
                                int intentoUsuario = teclado.nextInt();
                                teclado.nextLine(); // Consumir el salto de línea

                                if (intentoUsuario == numeroSecreto) {
                                    System.out.println("¡Has adivinado el número! El espíritu de la casa te libera.");
                                    adivinado = true;
                                    break;
                                } else if (intentoUsuario < numeroSecreto) {
                                    System.out.println("El número es mayor.");
                                } else {
                                    System.out.println("El número es menor.");
                                }
                            }
                        }

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

                        if (numAleatorio1 == 1) {
                            String enunciadoBibliotecaSalir = """

                                    ---------------------------------------------------------------------------------------------------
                                    Por suerte para ti, has movido accidentalmente una estantería y has descubierto un pasadizo secreto.
                                    Es estrecho y oscuro, pero parece que conduce fuera de la casa. A medida que avanzas, sientes una
                                    brisa fresca.

                                    A medida que avanzas, sientes que el aire se vuelve más fresco y limpio. Finalmente, llegas a una
                                    salida que te lleva al exterior de la casa. Has logrado escapar.
                                    ---------------------------------------------------------------------------------------------------
                                    """;

                            System.out.println(enunciadoBibliotecaSalir);

                            break;
                        } else if (numAleatorio1 == 2) {
                            String enunciadoBibliotecaJuego = """

                                    -----------------------------------------------------------------------------------------------------------------------------
                                    Entre los libros abiertos en el suelo, hay un mapa de Europa cubierto de anotaciones en tinta seca.
                                    Sobre él, una pluma se mueve sola, trazando líneas que dividen territorios y nombres tachados con violencia.
                                    En la silla frente al escritorio, la forma difusa de un hombre con uniforme antiguo murmura en francés, repitiendo órdenes de
                                    guerra a soldados que ya no existen.

                                    Cada vez que pronuncia “Austerlitz”, los libros cercanos se abren de golpe, como respondiendo a un mando militar.
                                    Y cuando el espectro se gira hacia ti, bajo el bicornio vacío, no hay rostro, solo un remolino de polvo y tinta que murmura:
                                    — Mis planes no murieron conmigo.
                                    ------------------------------------------------------------------------------------------------------------------------------

                                    """;

                            System.out.println(enunciadoBibliotecaJuego);
                            System.out.println(
                                    "El espíritu de Napoleón te ha retado a un juego para liberar tu alma. Debes adivinar un número entre 1 y 20. Tienes 3 intentos.");
                            int numeroSecreto = numAleatorio.nextInt(1, 21);
                            int intentos = 3;
                            boolean adivinado = false;

                            for (int i = 1; i <= intentos; i++) {
                                System.out.println("Introduce tu intento número " + i + ":");
                                int intentoUsuario = teclado.nextInt();
                                teclado.nextLine(); // Consumir el salto de línea

                                if (intentoUsuario == numeroSecreto) {
                                    System.out.println("¡Has adivinado el número! El espíritu de la casa te libera.");
                                    adivinado = true;
                                    break;
                                } else if (intentoUsuario < numeroSecreto) {
                                    System.out.println("El número es mayor.");
                                } else {
                                    System.out.println("El número es menor.");
                                }
                            }
                        }

                    } else if (respuesta1.equalsIgnoreCase("salir")) {
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
            }
        } while (repetir);
        return "";
    }

    public static String CasoVentana() {
        boolean repetir = false;
        Scanner teclado = new Scanner(System.in);
        Random numAleatorio = new Random();
        int numAleatorio1 = numAleatorio.nextInt(1, 3);

        String enunciado = """
                ------------------------------------------------------------------------------------------------------------
                Por suerte o por desgracia, la única manera de entrar a la casa es por la ventana de la cocina.
                Hay muchos cristales rotos, por lo que te podrías cortar muy fácilmente, y el marco de la ventana
                está llena de cortes profundos, un cuchillo cualquiera no ha podido hacer ese corte.
                ------------------------------------------------------------------------------------------------------------

                """;

        System.out.println(enunciado);

        do {
            System.out.println(
                    "¿Quieres entrar por la ventana con cristales rotos, o crees que la situación te supera? (Entrar / Salir)");
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
                    System.out.println(
                            "Ahora puedes elegir entre entrar a la despensa, ir al pasillo o salir de la casa");
                    System.out.println("(Despensa / Pasillo / Salir)");
                    String respuesta2 = teclado.nextLine();

                    if (respuesta2.equalsIgnoreCase("despensa")) {
                        String enunciadoDespensa = """
                                --------------------------------------------------------------------------------------------------
                                La despensa está completamente vacía, no hay nada de comida, como si la persona que vivía aquí
                                supiera que ya no iba a volver a vivir aquí nunca más.

                                Lo único que hay son dos baldosas para apoyar la comida
                                --------------------------------------------------------------------------------------------------
                                """;

                        System.out.println(enunciadoDespensa);
                        System.out.println();

                        if (numAleatorio1 == 1) {
                            String enunciadoDespensaSalir = """

                                    ---------------------------------------------------------------------------------------------------
                                    Por suerte para ti, has movido accidentalmente una estantería y has descubierto un pasadizo secreto.
                                    Es estrecho y oscuro, pero parece que conduce fuera de la casa. A medida que avanzas, sientes una
                                    brisa fresca.

                                    A medida que avanzas, sientes que el aire se vuelve más fresco y limpio. Finalmente, llegas a una
                                    salida que te lleva al exterior de la casa. Has logrado escapar.
                                    ---------------------------------------------------------------------------------------------------
                                    """;

                            System.out.println(enunciadoDespensaSalir);

                            break;
                        } else if (numAleatorio1 == 2) {
                            String enunciadoDespensaJuego = """

                                    -----------------------------------------------------------------------------------------------------------------------------
                                    Entre los libros abiertos en el suelo, hay un mapa de Europa cubierto de anotaciones en tinta seca.
                                    Sobre él, una pluma se mueve sola, trazando líneas que dividen territorios y nombres tachados con violencia.
                                    En la silla frente al escritorio, la forma difusa de un hombre con uniforme antiguo murmura en francés, repitiendo órdenes de
                                    guerra a soldados que ya no existen.

                                    Cada vez que pronuncia “Austerlitz”, los libros cercanos se abren de golpe, como respondiendo a un mando militar.
                                    Y cuando el espectro se gira hacia ti, bajo el bicornio vacío, no hay rostro, solo un remolino de polvo y tinta que murmura:
                                    — Mis planes no murieron conmigo.
                                    ------------------------------------------------------------------------------------------------------------------------------

                                    """;

                            System.out.println(enunciadoDespensaJuego);
                            System.out.println(
                                    "El espíritu de Napoleón te ha retado a un juego para liberar tu alma. Debes adivinar un número entre 1 y 20. Tienes 3 intentos.");
                            int numeroSecreto = numAleatorio.nextInt(1, 21);
                            int intentos = 3;
                            boolean adivinado = false;

                            for (int i = 1; i <= intentos; i++) {
                                System.out.println("Introduce tu intento número " + i + ":");
                                int intentoUsuario = teclado.nextInt();
                                teclado.nextLine(); // Consumir el salto de línea

                                if (intentoUsuario == numeroSecreto) {
                                    System.out.println("¡Has adivinado el número! El espíritu de Napoleón te libera.");
                                    adivinado = true;
                                    break;
                                } else if (intentoUsuario < numeroSecreto) {
                                    System.out.println("El número es mayor.");
                                } else if (intentoUsuario > numeroSecreto) {
                                    System.out.println("El número es menor.");
                                } else {
                                    System.out.println("No has conseguido ganar a Napoleón, ahora sufrirás el bucle eterno de la desesperación.");
                                }
                            }
                        }

                    } else if (respuesta2.equalsIgnoreCase("pasillo")) {
                        String enunciadoPasillo = """
                                --------------------------------------------------------------------------------------------------------
                                En el pasillo hay un silencio muy raro, y hay una oscuridad que hace que no quieras mirar atrás. Se
                                supone que la casa, por su antigüedad, no tiene ninguna instalación eléctrica, pero al final del pasillo
                                se ve una tenue luz blanca que no es posible crear sin electricidad.
                                --------------------------------------------------------------------------------------------------------
                                 """;
                        System.out.println(enunciadoPasillo);

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

            } else if (respuesta.equalsIgnoreCase("salir")) {
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
