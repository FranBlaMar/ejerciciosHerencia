package Cuenta;

import java.util.Scanner;
import java.text.DateFormat;
import java.time.LocalDate;


public class MainCuentas {
	
	public static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		
		double cant;
		Cuenta c1 = new Cuenta("1",10);
		try {
			System.out.println(c1);
			
			System.out.println("Introduce la cantidad a reintegrar");
			cant = Double.parseDouble(teclado.nextLine());
			c1.reintegro(cant);
			System.out.println(c1);
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		CuentaCredito c2 = new CuentaCredito(10,"1");
		try {
			System.out.println(c2);
			
			System.out.println("Introduce la cantidad a reintegrar");
			cant = Double.parseDouble(teclado.nextLine());
			c2.reintegro(cant);
			System.out.println(c2);
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		CuentaJoven c3 = new CuentaJoven("200",10,"Fran",LocalDate.parse("1998-09-30"));
		System.out.println(c3.mostrar());
		c3.ingreso(100);
		c3.reintegro(200);
		System.out.println(c3.mostrar());

	}

}
