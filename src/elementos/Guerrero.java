package elementos;

import logicaJuego.Constantes;

public class Guerrero extends Jugador{

	public Guerrero(char simbolo, int fil, int col) {
		super(simbolo, fil, col);
		super.setVelocidad(Constantes.GUERRERO_VELOCIDAD);
		super.setFuerza(Constantes.GUERRERO_FUERZA);
		super.setMagia(Constantes.GUERRERO_MAGIA);
	}
	
	
}
