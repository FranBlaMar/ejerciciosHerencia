package Barco;

import java.time.LocalDate;
public class mainBarco {

	public static void main(String[] args) {
		Deportivo d1 = new Deportivo ("1234AE", 100, 2002, 200);
		Alquiler a1 = new Alquiler ("Fran","77823435D", LocalDate.parse("2021-10-12"),LocalDate.parse("2021-10-22"), 23, d1);
		System.out.println(d1);
		System.out.println(a1);
		System.out.println(d1.precioBarco());
		System.out.println(a1.calcularPrecioAlquiler());
	}

}
