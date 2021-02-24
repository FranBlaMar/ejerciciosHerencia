package Barco;

import java.time.LocalDate;

public class Barco {
	private String matricula;
	private double eslora;
	private LocalDate fechaFabricacion;
	
	
	public Barco() {
		
	}
	
	public Barco(String matricula, double eslora, LocalDate fechaFabricacion) {
		super();
		this.matricula = matricula;
		this.eslora = eslora;
		this.fechaFabricacion = fechaFabricacion;
	}
	
	
	public String getMatricula() {
		return matricula;
	}
	protected void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public double getEslora() {
		return eslora;
	}
	protected void setEslora(double eslora) {
		this.eslora = eslora;
	}
	public LocalDate getFechaFabricacion() {
		return fechaFabricacion;
	}
	protected void setFechaFabricacion(LocalDate fechaFabricacion) {
		this.fechaFabricacion = fechaFabricacion;
	}

	public double precioBarco() {
		return this.eslora * 10;
	}
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((matricula == null) ? 0 : matricula.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Barco other = (Barco) obj;
		if (matricula == null) {
			if (other.matricula != null)
				return false;
		} else if (!matricula.equals(other.matricula))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Barco con matricula: " + matricula + ", eslora: " + eslora + ", fechaFabricacion: " + fechaFabricacion;
	}
	
	
	
	
	
}
