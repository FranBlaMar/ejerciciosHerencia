package elementos;

import logicaJuego.Constantes; 

public class Jugador extends Elemento{
	private int fuerza;
	private int	magia;
	private int	velocidad;
	private int	fil;
	private int	col;
	private int	dinero;
	private int	pociones;
	private int	gemas;
	
	
	//builder
	public Jugador(char simbolo, int fil, int col) {
		super(simbolo);
		this.fil = fil;
		this.col = col;
	}
	
	
	//geters & seters
	public int getFuerza() {
		return fuerza;
	}

	protected void setFuerza(int fuerza) {
		this.fuerza = fuerza;
	}

	public int getMagia() {
		return magia;
	}

	protected void setMagia(int magia) {
		this.magia = magia;
	}

	public int getVelocidad() {
		return velocidad;
	}

	protected void setVelocidad(int velocidad) {
		this.velocidad = velocidad;
	}

	public int getFil() {
		return fil;
	}

	public void setFil(int fil) {
		this.fil = fil;
	}

	public int getCol() {
		return col;
	}

	public void setCol(int col) {
		this.col = col;
	}

	public int getDinero() {
		return dinero;
	}

	public void setDinero(int dinero) {
		this.dinero = dinero;
	}

	public int getPociones() {
		return pociones;
	}

	public void setPociones(int pociones) {
		this.pociones = pociones;
	}

	public int getGemas() {
		return gemas;
	}

	public void setGemas(int gemas) {
		this.gemas = gemas;
	}
	
	
	
	
	//Metodos
	public int nextCol (char direccion) {
		switch (direccion) {
		case 'N':
			this.col ++;
			break;
		case 'S':
			this.col --;
			break;
		}
		return this.col;
	}
	
	public int nextFil (char direccion) {
		switch (direccion) {
		case 'E':
			this.fil ++;
			break;
		case 'O':
			this.fil --;
			break;
		}
		return this.fil;
	}
	
	public String resumen() {
		return "El jugador " + simbolo + " tiene: Dinero-> " + dinero + ", Pociones -> " + pociones + ", Gemas -> " + gemas;
	}

	
	//HashCode y equal
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + simbolo;
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
		Jugador other = (Jugador) obj;
		if (simbolo != other.simbolo)
			return false;
		return true;
	}
	
	
	
}
