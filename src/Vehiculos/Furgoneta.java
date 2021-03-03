package Vehiculos;

public class Furgoneta extends Vehiculo{
	private double pesoMaximo;
	private static final double PRECIOPORPESO = 0.5;
	
	//builder
	public Furgoneta(String matricula, String gama, double pesoMaximo) throws VehiculoException{
		super(matricula, gama);
		this.pesoMaximo = pesoMaximo;
	}
	
	//calcular precio
	public double calcularPrecio() {
		return super.calcularPrecio() + (pesoMaximo * PRECIOPORPESO);
	}
	
}
