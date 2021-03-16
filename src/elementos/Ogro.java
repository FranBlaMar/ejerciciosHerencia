package elementos;

import logicaJuego.Constantes;

public class Ogro extends Jugador{

	public Ogro(char simbolo, int fil, int col) {
		super(simbolo, fil, col);
		super.setVelocidad(Constantes.OGRO_VELOCIDAD);
		super.setFuerza(Constantes.OGRO_FUERZA);
		super.setMagia(Constantes.OGRO_MAGIA);
	}
	
	
}
