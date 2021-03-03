package Vehiculos;

public class Coche extends Vehiculo{
	private String combustible;
	private static final double PRECIOGASOLINA = 3.5;
	private static final double PRECIODIESEL = 2;
	
	
	//builder
	public Coche(String matricula, String gama, String combustible) throws VehiculoException{
		super(matricula, gama);
		if (!combustible.equals("gasolina") && !combustible.contentEquals("diesel")) {
			throw new VehiculoException ("Combustible incorrecto. Solo está permitido gasolina y diesel.");
		}
		this.combustible = combustible;
	}

	//calcular precio
	public double calcularPrecio() {
		if (combustible.toUpperCase().equals("GASOLINA")) {
			return super.calcularPrecio() + PRECIOGASOLINA;
		}
		else {
			return super.calcularPrecio() + PRECIODIESEL;
		}
	}
}
