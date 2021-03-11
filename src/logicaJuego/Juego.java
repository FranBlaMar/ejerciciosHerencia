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
	private int alto = Constantes.ALTO;
	private int ancho = Constantes.ANCHO;
	private int numJugadores;
	private boolean finished = false;
	private int jugadorJuega;
	

	//builder
	
	public Juego(int numJugadores) throws JuegoException{
		super();
		if (numJugadores > Constantes.NOMBRE_JUGADORES.length) {
			throw new JuegoException ("¡Ups! El máximo de jugadores es 6. ¡Le ser espectador a algun amigo!");
		}
		this.numJugadores = numJugadores;
	}
	
	//Métodos
	
	public void crearTablero() {
		Elemento tablero[][] = new Elemento [this.alto][this.ancho];
	}
	
	public void crearJugador(char simbolo) {
		int x;
		int y;
		do {
			x = (int) Math.random()*10;
			y = (int) Math.random()*10;
			}
		while(tablero [x][y] != null);
		tablero [x][y] = new Jugador (simbolo,x,y);
		}
	
	public void crearRocas() {
		int x;
		int y;
		do {
			x = (int) Math.random()*10;
			y = (int) Math.random()*10;
			}
		while(tablero [x][y] != null);
		tablero [x][y] = new Roca (Constantes.ROCA);
		}
	
	public void crearArboles() {
		int x;
		int y;
		do {
			x = (int) Math.random()*10;
			y = (int) Math.random()*10;
			}
		while(tablero [x][y] != null);
		tablero [x][y] = new Arbol (Constantes.ARBOL);
		}
	
	public void crearGemas() {
		int x;
		int y;
		do {
			x = (int) Math.random()*10;
			y = (int) Math.random()*10;
			}
		while(tablero [x][y] != null);
		tablero [x][y] = new Gema (Constantes.GEMA);
		}
	
	public void crearPociones() {
		int x;
		int y;
		do {
			x = (int) Math.random()*10;
			y = (int) Math.random()*10;
			}
		while(tablero [x][y] != null);
		tablero [x][y] = new Pocion (Constantes.POCION);
		}
	
	public void crearDinero() {
		int x;
		int y;
		do {
			x = (int) Math.random()*10;
			y = (int) Math.random()*10;
			}
		while(tablero [x][y] != null);
		tablero [x][y] = new Dinero (Constantes.DINERO);
		}
	
	
}

