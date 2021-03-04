package Vehiculos;

import java.util.Scanner;

public class calculadorPrecio {
	static Scanner teclado = new Scanner (System.in);
	public static void main(String[] args) throws Exception {
	int opcion;
	Vehiculo [] ArrayVehiculos = new Vehiculo [200];
	int contador = 0; 
	do {
		opcion = leerInt("1.Dar de Alta un Vehiculo\n2.Cálculo de precio de Alquiler\n3.Salir");
		switch (opcion) {
			case 1:
				String matricula = leerString ("Introduzca la matrícula de su vehiculo");
				String gama = leerString ("Introduzca la gama de su vehiculo");
				String tipoVehiculo = leerString ("¿Qué tipo de vehiculo desea dar de alta? (Coche,Microbus,furgoneta)").toUpperCase();
				switch (tipoVehiculo) {
				case "COCHE":
					String combustible = leerString ("¿Qué tipo de combustible usa su coche? (gasolina o diesel)");
					try {
					ArrayVehiculos [contador] = new Coche (matricula, gama, combustible);
					contador ++;
					}catch(VehiculoException E) {
						System.out.println(E.getMessage());
					}
					break;
					
				case "MICROBUS":
					int plazas = leerInt("¿Cuántas plazas tiene su microbus?");
					try {
						ArrayVehiculos [contador] = new Microbus (matricula, gama, plazas);
						contador ++;
						}catch(VehiculoException E) {
							System.out.println(E.getMessage());
						}
					break;
				case "FURGONETA":
					double peso = leerDouble ("¿Cuál es el peso de su furgoneta?");
					try {
						ArrayVehiculos [contador] = new Furgoneta (matricula, gama, peso);
						contador ++;
						}catch(VehiculoException E) {
							System.out.println(E.getMessage());
						}
					break;
					
				default:
					System.out.println("Error.Introduzca uno de estos tipos: coche, microbus, furgoneta");
				
				}
				break;
				
			case 2:
				if (contador == 0) {
					throw new Exception ("No hay ningun coche dado de alta");
				}
				matricula = leerString("Introduzca la matrícula del vehiculo");
				int dias = leerInt ("¿De cuántos días será el alquiler?");
				for (int i = 0; i < contador; i ++) {
					if (ArrayVehiculos[i].getMatricula().equals(matricula)) {
						System.out.println("El precio del alquiler es: " + ArrayVehiculos[i].calcularPrecio() * dias);
					}
				}
				break;
				
			case 3:
				break;
				
			default:
				System.out.println("Elija una opcion del 1 al 3");
		}	
	}while(opcion != 3);
		

	}
	
	public static String leerString(String mensaje) {
		System.out.println(mensaje);
		return teclado.nextLine();
	}
	public static int leerInt(String mensaje) {
		System.out.println(mensaje);
		return Integer.parseInt(teclado.nextLine());
	}
	public static double leerDouble(String mensaje) {
		System.out.println(mensaje);
		return Double.parseDouble(teclado.nextLine());
	}
}
