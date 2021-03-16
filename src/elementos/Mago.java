package elementos;

import logicaJuego.Constantes;

public class Mago extends Jugador{

	public Mago(char simbolo, int fil, int col) {
		super(simbolo, fil, col);
		super.setVelocidad(Constantes.MAGO_VELOCIDAD);
		super.setFuerza(Constantes.MAGO_FUERZA);
		super.setMagia(Constantes.MAGO_MAGIA);
	}
	
	
}
