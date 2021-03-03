package Vehiculos;

public abstract class Vehiculo {
	private String matricula;
	private String gama;
	private static final int PRECIOGAMAALTA = 50;
	private static final int PRECIOGAMAMEDIA = 40;
	private static final int PRECIOGAMABAJA = 30;
	
	
	//constructor
	public Vehiculo(String matricula, String gama) throws VehiculoException{
		super();
		if (!gama.toUpperCase().equals("ALTA") && !gama.toUpperCase().equals("BAJA") && !gama.toUpperCase().equals("MEDIA")){
			throw new VehiculoException ("Gama incorrecta. Gamas permitidas: (alta,media,baja)");
		}
		this.matricula = matricula;
		this.gama = gama;
	}

	
	//Geters
	protected String getMatricula() {
		return matricula;
	}

	protected String getGama() {
		return gama;
	}

	protected static int getPreciogamaalta() {
		return PRECIOGAMAALTA;
	}

	protected static int getPreciogamamedia() {
		return PRECIOGAMAMEDIA;
	}

	protected static int getPreciogamabaja() {
		return PRECIOGAMABAJA;
	}
	
	//calcular precio
	public double calcularPrecio() {
		if (gama.toUpperCase().equals("BAJA")) {
			return PRECIOGAMABAJA;
		}
		else if (gama.toUpperCase().equals("MEDIA")) {
			return PRECIOGAMAMEDIA;
		}
		else {
			return PRECIOGAMAALTA;
		}
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
		return "Vehiculo con matricula: " + matricula + ", gama: " + gama;
	}
	
	
}
