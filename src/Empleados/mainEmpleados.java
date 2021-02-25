package Empleados;

import java.time.LocalDate;

public class mainEmpleados {

	public static void main(String[] args) {
		//Creando empleados
		Temporal t1 = new Temporal ("David", 22, "77823435F", 1200.0, LocalDate.parse("2019-02-10"), LocalDate.parse("2021-03-01"));
		PorHoras h1 = new PorHoras ("Carlos", 26, "67836137K", 1000.0, 15.0, 90);
		Fijo f1 = new Fijo ("Ana", 21, "54434546H", 1800.0, 2018);
		
		//Compruebo los toString()
		System.out.println(t1);
		System.out.println(h1);
		System.out.println(f1);
		
		//Compruebo el calculo de sueldo
		System.out.println("Sueldo del empleado temporal: " + t1.calculoSueldo());
		System.out.println("Sueldo del empleado por horas: " + h1.calculoSueldo());
		System.out.println("Sueldo del empleado fijo: " + f1.calculoSueldo());
	}

}
