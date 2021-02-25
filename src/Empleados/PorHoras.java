package Empleados;

public class PorHoras extends Empleado{
	private double precioHora;
	private int horas;
	
	//Constructor
	public PorHoras(String nombre, int edad, String dni, double sueldo, double precioHora, int horas) {
		super(nombre, edad, dni, sueldo);
		this.precioHora = precioHora;
		this.horas = horas;
	}

	//Sueldo es igual a horas trabajadas por el precioHorA
		public double calculoSueldo() {
			return horas * precioHora;
		}
	
	//ToString
	@Override
	public String toString() {
		return super.toString() + ", precioHora: " + precioHora + ", horas: " + horas;
	}
	
	
}
