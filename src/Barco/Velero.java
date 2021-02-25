package Barco;


public class Velero extends Barco{
	private int numeroMastiles;

	public Velero(String matricula, double eslora, int añoFabricacion, int numeroMastiles) {
		super(matricula, eslora, añoFabricacion);
		this.numeroMastiles = numeroMastiles;
	}

	@Override
	public double precioBarco() {
		return super.precioBarco()+ numeroMastiles;
	}

	@Override
	public String toString() {
		return super.toString()+ ", Velero con numeroMastiles: " + numeroMastiles;
	}
	
	
}
