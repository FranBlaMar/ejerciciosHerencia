package Barco;


public class Deportivo extends Barco{
	protected int potenciaCV;
	
	
	public Deportivo (String matricula, double eslora, int añoFabricacion, int potenciaCV) {
		super(matricula, eslora, añoFabricacion);
		this.potenciaCV= potenciaCV;
	}
	

	@Override
	public double precioBarco() {
		return super.precioBarco() + potenciaCV;
	}
	
	@Override
	public String toString() {
		return super.toString()+ ", deportivo con CV: " + potenciaCV;
	}
}
