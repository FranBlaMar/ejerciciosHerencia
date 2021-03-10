package Magos;

import java.util.Random;

public abstract class Personaje {
	private String nombre;
	private String raza;
	private int fuerza;
	private int inteligencia;
	private int vidaMax;
	private int vidaActual;
	
	//Builder
	public Personaje(String nombre, String raza, int fuerza, int inteligencia, int vidaMax) throws PersonajeException{
		super();
		if (!raza.toUpperCase().equals("HUMANO") && !raza.toUpperCase().equals("ELFO") && !raza.toUpperCase().equals("ENANO") && !raza.toUpperCase().equals("ORCO")) {
			throw new PersonajeException ("Raza de personaje no permitida");
		}
		if (fuerza < 0 || fuerza > 20) {
			throw new PersonajeException ("Valores de fuerza erroneos");
		}
		if (inteligencia < 0 || inteligencia > 20) {
			throw new PersonajeException ("Valores de inteligencia erroneos");
		}
		if (vidaMax < 0 || vidaMax > 100) {
			throw new PersonajeException ("Valores de vida máxima erroneos");
		}
		this.nombre = nombre;
		this.raza = raza;
		this.fuerza = fuerza;
		this.inteligencia = inteligencia;
		this.vidaMax = vidaMax;
		this.vidaActual = vidaMax;
	}
	
	
	//Geters y seters
	protected String getNombre() {
		return nombre;
	}

	protected void setNombre(String nombre) {
		this.nombre = nombre;
	}

	protected String getRaza() {
		return raza;
	}

	protected void setRaza(String raza) {
		this.raza = raza;
	}

	protected int getFuerza() {
		return fuerza;
	}

	protected void setFuerza(int fuerza) {
		this.fuerza = fuerza;
	}

	protected int getInteligencia() {
		return inteligencia;
	}

	protected void setInteligencia(int inteligencia) {
		this.inteligencia = inteligencia;
	}

	protected int getVidaMax() {
		return vidaMax;
	}

	protected void setVidaMax(int vidaMax) {
		this.vidaMax = vidaMax;
	}

	protected int getVidaActual() {
		return vidaActual;
	}

	protected void setVidaActual(int vidaActual) {
		this.vidaActual = vidaActual;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Personaje other = (Personaje) obj;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "nombre: " + nombre + ", raza: " + raza + ", fuerza: " + fuerza + ", inteligencia: "
				+ inteligencia + ", vidaMax: " + vidaMax + ", vidaActual: " + vidaActual;
	}
	
}
