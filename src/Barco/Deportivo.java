package Barco;

import java.time.LocalDate;

public class Deportivo extends Barco{
	protected int potenciaCV;
	
	
	public Deportivo() {
		
	}
	
	public Deportivo(int potenciaCV) {
		super();
		this.potenciaCV = potenciaCV;
	}
	
	public Deportivo (String matricula, double eslora, LocalDate fechaFabricacion, int potenciaCV) {
		super(matricula, eslora, fechaFabricacion);
		this.potenciaCV= potenciaCV;
	}
	
	
	protected int getPotenciaCV() {
		return potenciaCV;
	}

	protected void setPotenciaCV(int potenciaCV) {
		this.potenciaCV = potenciaCV;
	}

	@Override
	public double precioBarco() {
		return super.getEslora() * 10 + potenciaCV;
	}
}
