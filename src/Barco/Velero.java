package Barco;

import java.time.LocalDate;

public class Velero extends Barco{
	private int numeroMastiles;

	public Velero(String matricula, double eslora, LocalDate fechaFabricacion, int numeroMastiles) {
		super(matricula, eslora, fechaFabricacion);
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
}
