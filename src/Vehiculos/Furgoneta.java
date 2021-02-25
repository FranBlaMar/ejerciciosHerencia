package Vehiculos;

public class Furgoneta extends Vehiculo{
	private double pesoMaximo;

	public Furgoneta(String matricula, String gama, String combustible, int dias, double pesoMaximo) {
		super(matricula, gama, combustible, dias);
		this.pesoMaximo = pesoMaximo;
	}

	
	
	
}
