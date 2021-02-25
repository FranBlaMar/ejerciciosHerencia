package Barco;

public class Yate extends Barco{
	private int numCamarotes;
	private int potenciaCV;
	
	
	public Yate (String matricula, double eslora, int añoFabricacion, int potenciaCV, int numCamarotes) {
		super(matricula, eslora, añoFabricacion);
		this.potenciaCV= potenciaCV;
		this.numCamarotes= numCamarotes;
	}
	
	@Override
	public double precioBarco() {
		return super.precioBarco() + numCamarotes + potenciaCV;
	}
	
	@Override
	public String toString() {
		return super.toString()+ ", numero de camarotes: " + numCamarotes + ", potencia en CV: "+ potenciaCV;
	}
}
