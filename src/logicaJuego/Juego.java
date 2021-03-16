package logicaJuego;

import elementos.Jugador;
import elementos.Pocion;
import elementos.Roca;
import java.util.Arrays;
import elementos.Arbol;
import elementos.Dinero;
import elementos.Elemento;
import elementos.Gema;

public class Juego {
	private Elemento tablero[][];
	private Jugador jugadores [];
	private int alto;
	private int ancho;
	private int numJugadores;
	private boolean finished = false;
	private int jugadorJuega;
	

	//builder
	
	public Juego(int numJugadores) throws JuegoException{
		super();
		if (numJugadores > Constantes.NOMBRE_JUGADORES.length) {
			throw new JuegoException ("¡Ups! El máximo de jugadores es 6. ¡Le toca ser espectador a algun amigo!");
		}
		this.numJugadores = numJugadores;
		this.alto = Constantes.ALTO;
		this.ancho = Constantes.ANCHO;
		this.jugadorJuega = (int) Math.random() * numJugadores-1;
		crearTablero();
	}
	
	public Juego(int alto, int ancho, int numJugadores) throws JuegoException{
		super();
		if (numJugadores > Constantes.NOMBRE_JUGADORES.length) {
			throw new JuegoException ("¡Ups! El máximo de jugadores es 6. ¡Le toca ser espectador a algun amigo!");
		}
		this.alto = alto;
		this.ancho = ancho;
		this.numJugadores = numJugadores;
		this.jugadorJuega = (int) Math.random() * numJugadores-1;
		crearTablero();
	}



	//Métodos
	
	private void crearTablero() {
		tablero = new Elemento [this.alto][this.ancho];
		crearRocas();
		crearArboles();
		crearGemas();
		crearPociones();
		crearDinero();
	}
	
	
	public void crearJugador(char simbolo) {
		int x;
		int y;
		do {
			x = (int) (Math.random() * (this.ancho - 1));
			y = (int) (Math.random() * (this.alto - 1));
			}
		while(tablero [x][y] != null);
		tablero [x][y] = new Jugador (simbolo,x,y);
		}
	
	
	private void crearRocas() {
		int x;
		int y;
		for (int i = 0; i < 5; i++) {
		do {
			x = (int) (Math.random() * (this.ancho - 1));
			y = (int) (Math.random() * (this.alto - 1));
			
			}
		while(tablero [x][y] != null);
		tablero [x][y] = new Roca (Constantes.ROCA);
			}
		}
	
	private void crearArboles() {
		int x;
		int y;
		for (int i = 0; i < 5; i++) {
		do {
			x = (int) (Math.random() * (this.ancho - 1));
			y = (int) (Math.random() * (this.alto - 1));
			}
		while(tablero [x][y] != null);
		tablero [x][y] = new Arbol (Constantes.ARBOL);
			}
		}
	
	private void crearGemas() {
		int x;
		int y;
		for (int i = 0; i < 5; i++) {
		do {
			x = (int) (Math.random() * (this.ancho - 1));
			y = (int) (Math.random() * (this.alto - 1));
			}
		while(tablero [x][y] != null);
		tablero [x][y] = new Gema (Constantes.GEMA);
			}
		}
	
	private void crearPociones() {
		int x;
		int y;
		for (int i = 0; i < 5; i++) {
		do {
			x = (int) (Math.random() * (this.ancho - 1));
			y = (int) (Math.random() * (this.alto - 1));
			}
		while(tablero [x][y] != null);
		tablero [x][y] = new Pocion (Constantes.POCION);
			}
		}
	
	private void crearDinero() {
		int x;
		int y;
		for (int i = 0; i < 5; i++) {
		do {
			x = (int) (Math.random() * (this.ancho - 1));
			y = (int) (Math.random() * (this.alto - 1));
			}
		while(tablero [x][y] != null);
		tablero [x][y] = new Dinero (Constantes.DINERO);
			}
		}
	
	
	public void isTerminado() {
		this.finished = true;
	}
	
	
	public String imprimeNombreJugadores() {
		String jugadores = "";
		int cont = 1;
		for (int i = 0; i < numJugadores; i++) {
			jugadores = jugadores + "El Jugador " + cont + " es el carácter " + Constantes.NOMBRE_JUGADORES[i] + "\n";
			cont ++;
		}
		return jugadores;
	}
	
	
//	public String imprimeValoresJugadores() {
//		
//	}
	
	
	public String getJugadorTurno() {
		int dado = (int) Math.random() * jugadores[jugadorJuega].getVelocidad();
		return "Le toca al jugador " + Constantes.NOMBRE_JUGADORES[jugadorJuega] + ". El dado saca " + dado + " movimientos.";
	}

	@Override
	public String toString() {
		for (int i = 0; i < this.alto; i++) {
			System.out.println("-----------------------------------------");
			for (int a = 0; a <this.ancho; a++ ) {
				if (tablero[i][a] == null) {
					System.out.print("| " + "  ");
				}
				else {
				System.out.print("| " + tablero[i][a] + " ");
				}
			}
			System.out.println("| ");
		}
		System.out.println("----------------------------------------- \n");
		
		return imprimeNombreJugadores();
	}
	
//	public int getMovimientoJugador() {
//		
//	}
	
	
}

