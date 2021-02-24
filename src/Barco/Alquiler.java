package Barco;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Alquiler {
	private String nombre;
	private String dni;
	private LocalDate fechaInicio;
	private LocalDate fechaFinal;
	private int posicionAmarre;
	private Barco barco;
	final static int PRECIO = 20;
	
	
	public Alquiler() {
	}

	public Alquiler(String nombre, String dni, LocalDate fechaInicio, LocalDate fechaFinal, int posicionAmarre, Barco barco) {
		super();
		this.nombre = nombre;
		this.dni = dni;
		this.fechaInicio = fechaInicio;
		this.fechaFinal = fechaFinal;
		this.posicionAmarre = posicionAmarre;
		this.barco = barco;
	}
	
	public Alquiler(String nombre, String dni, LocalDate fechaInicio, LocalDate fechaFinal, int posicionAmarre) {
		super();
		this.nombre = nombre;
		this.dni = dni;
		this.fechaInicio = fechaInicio;
		this.fechaFinal = fechaFinal;
		this.posicionAmarre = posicionAmarre;
	}

	public String getNombre() {
		return nombre;
	}

	protected void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDni() {
		return dni;
	}

	protected void setDni(String dni) {
		this.dni = dni;
	}

	public LocalDate getFechaInicio() {
		return fechaInicio;
	}

	protected void setFechaInicio(LocalDate fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	public LocalDate getFechaFinal() {
		return fechaFinal;
	}

	protected void setFechaFinal(LocalDate fechaFinal) {
		this.fechaFinal = fechaFinal;
	}

	public int getPosicionAmarre() {
		return posicionAmarre;
	}

	protected void setPosicionAmarre(int posicionAmarre) {
		this.posicionAmarre = posicionAmarre;
	}

	public Barco getBarco() {
		return barco;
	}

	protected void setBarco(Barco barco) {
		this.barco = barco;
	}

	public static int getPrecio() {
		return PRECIO;
	}

	public double calcularPrecioAlquiler() {
		long dias = ChronoUnit.DAYS.between(fechaInicio, fechaFinal);
		return barco.precioBarco() * dias * 20;	
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((barco == null) ? 0 : barco.hashCode());
		result = prime * result + ((dni == null) ? 0 : dni.hashCode());
		result = prime * result + ((fechaFinal == null) ? 0 : fechaFinal.hashCode());
		result = prime * result + ((fechaInicio == null) ? 0 : fechaInicio.hashCode());
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
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
		Alquiler other = (Alquiler) obj;
		if (barco == null) {
			if (other.barco != null)
				return false;
		} else if (!barco.equals(other.barco))
			return false;
		if (dni == null) {
			if (other.dni != null)
				return false;
		} else if (!dni.equals(other.dni))
			return false;
		if (fechaFinal == null) {
			if (other.fechaFinal != null)
				return false;
		} else if (!fechaFinal.equals(other.fechaFinal))
			return false;
		if (fechaInicio == null) {
			if (other.fechaInicio != null)
				return false;
		} else if (!fechaInicio.equals(other.fechaInicio))
			return false;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Propietario: " + nombre + ", dni: " + dni + ", fechaInicio: " + fechaInicio + ", fechaFinal: "
				+ fechaFinal + ", posicionAmarre: " + posicionAmarre + ", barco: " + barco;
	}
	
	
	
	
	
}
