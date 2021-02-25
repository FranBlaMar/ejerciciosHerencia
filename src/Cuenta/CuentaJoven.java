package Cuenta;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class CuentaJoven extends Cuenta{
	private String titular;
	final static double BONIFICACION = 0.2;
	private LocalDate fechaNacimiento;
	
	
	public CuentaJoven(String numCuenta, String titular, LocalDate fechaNacimiento) throws Exception{
		super(numCuenta);
		this.titular = titular;
		this.fechaNacimiento = fechaNacimiento;
		if (!esTitularValido()){
			throw new Exception ("Edad invalidad para crear una cuenta joven");
		}
	}
	
	public CuentaJoven (String numCuenta, double saldo, String titular, LocalDate fechaNacimiento ) throws Exception {
		super(numCuenta,saldo);
		this.titular=titular;
		this.fechaNacimiento=fechaNacimiento;
		if (!esTitularValido()){
			throw new Exception ("Edad invalidad para crear una cuenta joven");
		}
	}


	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public static double getBonificacion() {
		return BONIFICACION;
	}
	
	
	@Override
	public String toString() {
		return super.toString() + ", titular: " + titular + ", fechaNacimiento: " + fechaNacimiento;
	}

	public boolean esTitularValido() {
	long edad = ChronoUnit.YEARS.between(this.fechaNacimiento,LocalDate.now());
	if (edad >= 18 && edad <= 25) {
		return true;
	}
	else {
		return false;
	}
	}
	
	
	public String mostrar() {
		double bonificacion = super.getSaldo()+ (super.getSaldo()*this.BONIFICACION);
		return toString() + ", Saldo bonificacion: " + bonificacion;
		}
	
	public void reintegro(double cant) throws Exception {
		if (esTitularValido()) {
			super.reintegro(cant);
		}
		else {
			throw new Exception ("No cumple la edad valida");
		}
		
	}
}


