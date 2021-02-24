package Barco;

import java.time.LocalDate;

public class Velero extends Barco{
	private int numeroMastiles;

	public Velero(String matricula, double eslora, int añoFabricacion, int numeroMastiles) {
		super(matricula, eslora, añoFabricacion);
		this.numeroMastiles = numeroMastiles;
	}
	
	public Velero(int numeroMastiles) {
		super();
		this.numeroMastiles = numeroMastiles;
	}

	public Velero() {
		
	}
	
	@Override
	public double precioBarco() {
		return super.getEslora() * 10 + numeroMastiles;
	}

	@Override
	public String toString() {
		return super.toString()+ ", Velero con numeroMastiles: " + numeroMastiles;
	}
	
	
}
