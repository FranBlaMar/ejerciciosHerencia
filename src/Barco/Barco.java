package Barco;


public abstract class Barco {
	private String matricula;
	private double eslora;
	private int añoFabricacion;
	private int PRECIO = 10;
	
	
	public Barco(String matricula, double eslora, int añoFabricacion) {
		super();
		this.matricula = matricula;
		this.eslora = eslora;
		this.añoFabricacion = añoFabricacion;
	}
	
	
	public String getMatricula() {
		return matricula;
	}
	protected void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public double getEslora() {
		return eslora;
	}
	protected void setEslora(double eslora) {
		this.eslora = eslora;
	}
	public int getañoFabricacion() {
		return añoFabricacion;
	}
	protected void setFechaFabricacion(int añoFabricacion) {
		this.añoFabricacion = añoFabricacion;
	}

	public double precioBarco() {
		return this.eslora * PRECIO;
	}
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((matricula == null) ? 0 : matricula.hashCode());
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
		Barco other = (Barco) obj;
		if (matricula == null) {
			if (other.matricula != null)
				return false;
		} else if (!matricula.equals(other.matricula))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Barco con matricula: " + matricula + ", eslora: " + eslora + ", añoFabricacion: " + añoFabricacion;
	}
	
	
	
	
	
}
