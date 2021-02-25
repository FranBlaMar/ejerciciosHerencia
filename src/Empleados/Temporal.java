package Empleados;

import java.time.LocalDate;
public class Temporal extends Empleado{
	private LocalDate fechaAlta;
	private LocalDate fechaBaja;
	
	//Constructor
	public Temporal(String nombre, int edad, String dni, double sueldo, LocalDate fechaAlta, LocalDate fechaBaja) {
		super(nombre, edad, dni, sueldo);
		this.fechaAlta = fechaAlta;
		this.fechaBaja = fechaBaja;
	}
	
	//Sueldo es igual a sueldo base
	public double calculoSueldo() {
		return super.getSueldo();
	}
	
	//ToString
	@Override
	public String toString() {
		return super.toString() + ", fechaAlta: " + fechaAlta + ", fechaBaja: " + fechaBaja;
	}
	
}
