package games_package;
import java.util.Hashtable;

public class TicTacToe {
	
	public boolean corriendo;
	private char[] tablero;
	
	Hashtable<Integer,Character> jugadores;
	
	public TicTacToe() {
		
		tablero = new char[9];
		jugadores = new Hashtable<Integer,Character>();
		
		jugadores.put(1,'X');
		jugadores.put(2,'O');
		
		corriendo = true;
	}
	
	// Imprimir el tablero
	
	public void NuevoJuego() {
		System.out.println("Player 1 X");
		System.out.println("Player 2 O");
		System.out.println("Presione F para opciones o P para jugar");
		System.out.println();
		
		System.out.println("||___ ___ ___||");
		System.out.println("||   |   |   ||");
		System.out.println("||_1_|_2_|_3_||");
		System.out.println("||   |   |   ||");
		System.out.println("||_4_|_5_|_6_||");
		System.out.println("||   |   |   ||");
		System.out.println("||_7_|_8_|_9_||");
		System.out.println("||           ||");
	}
	
	public void RefrescarTablero() {
		
		System.out.println("Player 1 X");
		System.out.println("Player 2 O");
		
		
		System.out.println("||___ ___ ___||");
		System.out.println("||   |   |   ||");
		System.out.println("||_" + tablero[0] +"_|_" + tablero[1] + "_|_" + tablero[2] + "_||");
		System.out.println("||   |   |   ||");
		System.out.println("||_" + tablero[3] +"_|_" + tablero[4] + "_|_" + tablero[5] + "_||");
		System.out.println("||   |   |   ||");
		System.out.println("||_" + tablero[6] +"_|_" + tablero[7] + "_|_" + tablero[8] + "_||");
		System.out.println("||           ||");
	}

	public void MovimientoNuevo(int jugador, int posicion) {
		tablero[posicion] = jugadores.get(jugador);
	}
	
	public void TerminarJuego() {
		corriendo = false;
	}
}
