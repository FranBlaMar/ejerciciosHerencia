package Barco;

import java.time.LocalDate;

public class Yate extends Deportivo{
	private int numCamarotes;

	
	public Yate(int numCamarotes) {
		super();
		this.numCamarotes = numCamarotes;
	}
	public Yate(int numCamarotes,int potenciaCV) {
		super(potenciaCV);
		this.numCamarotes = numCamarotes;
	}
	
	public Yate (String matricula, double eslora, LocalDate fechaFabricacion, int potenciaCV, int numCamarotes) {
		super(matricula, eslora, fechaFabricacion,potenciaCV);
		this.numCamarotes= numCamarotes;
	}
	
	@Override
	public double precioBarco() {
		return super.getEslora() * 10 + super.getPotenciaCV() + numCamarotes;
	}
	
}
