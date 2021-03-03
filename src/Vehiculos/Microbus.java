package Vehiculos;

public class Microbus extends Vehiculo{
	private int plazas;
	private static final int PRECIOPLAZA = 5;
	
	//builder
	public Microbus(String matricula, String gama, int plazas) throws VehiculoException{
		super(matricula, gama);
		this.plazas = plazas;
	}

	
	
	//Calcular precio
	public double calcularPrecio() {
		return super.calcularPrecio() + (this.plazas * PRECIOPLAZA);
	}
}
