package Vehiculos;

public abstract class Vehiculo {
	private String matricula;
	private String gama;
	private String combustible;
	private int dias;
	
	//constructor
	public Vehiculo(String matricula, String gama, String combustible, int dias) {
		super();
		this.matricula = matricula;
		this.gama = gama;
		this.combustible = combustible;
		this.dias = dias;
	}

	
	//Geters
	protected String getMatricula() {
		return matricula;
	}

	
	protected String getGama() {
		return gama;
	}



	protected String getCombustible() {
		return combustible;
	}


	//hashcode, equal y toString
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
		Vehiculo other = (Vehiculo) obj;
		if (matricula == null) {
			if (other.matricula != null)
				return false;
		} else if (!matricula.equals(other.matricula))
			return false;
		return true;
	}


	@Override
	public String toString() {
		return "Vehiculo con matricula: " + matricula + ", gama: " + gama + ", combustible: " + combustible;
	}
	
	
}
