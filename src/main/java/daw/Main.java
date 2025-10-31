package daw;

public class Main {
    public static void main(String[] args) {
        
        // Juego "La casa del terror"
        // Al iniciar el juego, el espíritu de la casa informa al usuario del sufrimiento que va a padecer si entra y lo asusta para que no lo haga
        // Aleatoriamente, el espíritu decide abrir una puerta o una ventana de la casa y se lo indica al jugador.
        // En este momento le pregunta si realmente quiere entrar o está tan aterrado que prefiere salir. 

        /* 
         * Si decide entrar y lo hace por la puerta, el usuario avanza hasta el recibidor 
         * de la casa y debe elegir si quiere abrir la puerta de la biblioteca o la puerta del salón.
         *  En cada una de estas estancias pueden pasar dos situaciones, una siempre es tenebrosa y en la otra consigue escapar de la casa. 
         * Por ejemplo, si decide entrar en la biblioteca puede pasar que salga un grupo de zombis del suelo buscándote 
         * para comerte o que encuentres un agujero en el suelo que te permite escapar de la casa. Si decide entrar al salón 
         * puede pasar que venga Frankenstein con intención de estrangularte o que haya una escalera en la chimenea y consigas escapar...
         */

         /* 
          * Si el jugador decide entrar por la ventana, el usuario llega a la cocina de la casa y debe elegir si quiere abrir la puerta de despensa 
          * o la puerta que da al pasillo. En cada una de estas estancias pueden
          * pasar dos situaciones, una siempre es tenebrosa y la otra es que
          * consigues escapar. Inventa tus propias situaciones. Dale un toque personal al juego.
          */

        /* 
          * En cualquier caso, al entrar en una estancia el juego elige aleatoriamente entre una de las dos posibles situaciones. 
          * Si surge la situación tenebrosa, entonces el espíritu de la casa aparece para jugar contigo. 
          * El maligno pensará un número entre 1 y 20 (aleatoriamente) y le dará 3 vidas al jugador para adivinarlo. 
          * Si el jugador lo adivina antes de las tres rondas, entonces libera a la casa del espíritu y se proclama héroe del pueblo. 
          * En caso contrario, el espíritu maligno devuelve al jugador a la posición inicial para seguir torturándolo.
          */

        boolean salir = false;
        
        System.out.println(Juegos.MensajeInicial);
        String puertaOVentana = Juegos.DecidirPuertaVentana();

        if (puertaOVentana.equalsIgnoreCase("puerta")) {
            String casoPuerta = Juegos.CasoPuerta();
        } else {
            
        }
    }
}