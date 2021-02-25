package Empleados;

import java.time.LocalDate;
public class Fijo extends Empleado{
	private int añoAlta;
	private final static int COMPLEMENTOANUAL = 20;
	
	//Constructor
	public Fijo(String nombre, int edad, String dni, double sueldo, int añoAlta) {
		super(nombre, edad, dni, sueldo);
		this.añoAlta = añoAlta;
	}
	
	//Sueldo base, mas los años que lleva en la empresa por complemento
	public double calculoSueldo() {
		
		return super.getSueldo() + (LocalDate.now().getYear() - añoAlta) * COMPLEMENTOANUAL;
	}
	
	//ToString
	@Override
	public String toString() {
		return super.toString() + ", añoAlta: " + añoAlta;
	}
	
}
