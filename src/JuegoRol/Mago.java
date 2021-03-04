package JuegoRol;

public class Mago extends Personaje{
	private String ArrayHechizos [] = new String [4];
	private int contadorHechizos = 0;
	
	
	protected String[] getArrayHechizos() {
		return ArrayHechizos;
	}

	public Mago(String nombre, String raza, int fuerza, int inteligencia, int vidaMax) throws PersonajeException {
		super(nombre, raza, fuerza, inteligencia, vidaMax);
		if (inteligencia < 17) {
			throw new PersonajeException("El mago debe tener una inteligencia superior a 17");
		}
		if (fuerza > 15) {
			throw new PersonajeException("El mago debe tener una fuerza inferior a 15");
		}
	}
	
	public void aprenderHechizo (String Hechizo) throws PersonajeException{
		if (this.contadorHechizos == 3) {
			throw new PersonajeException ("Has llegado al máximo de hechizos aprendidos (4)");
		}
		else {
			for (int i = 0; i < 4; i++) {
				if (ArrayHechizos[i] == null) {
					ArrayHechizos[i] = Hechizo;
					contadorHechizos ++;
				}
			}
		}	
	}
	
	
	public void lanzarHechizo(Personaje enemigo, String hechizo) {
		enemigo.setVidaActual(enemigo.getVidaActual()-10);
		
	}
}
