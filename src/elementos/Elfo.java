package elementos;

import logicaJuego.Constantes;

public class Elfo extends Jugador{

	public Elfo(char simbolo, int fil, int col) {
		super(simbolo, fil, col);
		super.setVelocidad(Constantes.ELFO_VELOCIDAD);
		super.setFuerza(Constantes.ELFO_FUERZA);
		super.setMagia(Constantes.ELFO_MAGIA);
	}
	
	
}
