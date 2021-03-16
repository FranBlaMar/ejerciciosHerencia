package logicaJuego;
import logicaJuego.Constantes; 
public class mainJuego {

	public static void main(String[] args) throws JuegoException{
		Juego j1 = new Juego (3);
		j1.crearJugador(Constantes.NOMBRE_JUGADORES[0]);
		j1.crearJugador(Constantes.NOMBRE_JUGADORES[1]);
		j1.crearJugador(Constantes.NOMBRE_JUGADORES[2]);
		System.out.println(j1);
	}

}
