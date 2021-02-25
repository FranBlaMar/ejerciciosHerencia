package Empleados;

public abstract class Empleado {
	private String nombre;
	private int edad;
	private String dni;
	private double sueldo;
	
	//Constructor
	public Empleado(String nombre, int edad, String dni, double sueldo) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.dni = dni;
		this.sueldo = sueldo;
	}

	
	//Getters & Setter
	protected String getNombre() {
		return nombre;
	}


	protected int getEdad() {
		return edad;
	}


	protected String getDni() {
		return dni;
	}


	protected double getSueldo() {
		return sueldo;
	}


	//Hashcode, equal y toString
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dni == null) ? 0 : dni.hashCode());
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
		Empleado other = (Empleado) obj;
		if (dni == null) {
			if (other.dni != null)
				return false;
		} else if (!dni.equals(other.dni))
			return false;
		return true;
	}


	@Override
	public String toString() {
		return "nombre: " + nombre + ", edad: " + edad + ", dni: " + dni + ", sueldo: " + sueldo;
	}

}
