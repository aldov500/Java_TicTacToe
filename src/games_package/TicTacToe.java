package games_package;
import java.util.Hashtable;

public class TicTacToe {
	
	public boolean corriendo;
	private char[][] tablero;
	int ganador;
	
	Hashtable<Integer,Character> jugadores;
	
	public TicTacToe() {
		
		tablero   = new char[3][3];
		jugadores = new Hashtable<Integer,Character>();
		
		jugadores.put(1,'X');
		jugadores.put(2,'O');
		
		ganador = 0;
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
		System.out.printf("||_%c_|_%c_|_%c_||\n",tablero[0][0],tablero[0][1],tablero[0][2]);
		System.out.printf("||_%c_|_%c_|_%c_||\n",tablero[1][0],tablero[1][1],tablero[1][2]);
		System.out.printf("||_%c_|_%c_|_%c_||\n",tablero[2][0],tablero[2][1],tablero[2][2]);
	}

	public boolean MovimientoNuevo(int jugador, int posicion) {
		int x = 0, y = 0;
		switch(posicion) {
		case 1:
			x = 0;
			y = 0;
			break;
		case 2:
			x = 0;
			y = 1;
			break;
		case 3:
			x = 0;
			y = 2;
			break;
		case 4:
			x = 1;
			y = 0;
			break;
		case 5:
			x = 1;
			y = 1;
			break;
		case 6:
			x = 1;
			y = 2;
			break;
		case 7:
			x = 2;
			y = 0;
			break;
		case 8:
			x = 2;
			y = 1;
			break;
		case 9:
			x = 2;
			y = 2;
			break;		
		}
		tablero[x][y] = jugadores.get(jugador);
		
		int posible_ganador = RevisarGanador(jugador);
		if(posible_ganador != 0) {
			System.out.printf("Ganador\n");
			ganador = posible_ganador;
			return true;
		}else {
			return false;
		}
			
	}
	
	public void TerminarJuego() {
		corriendo = false;
		if(ganador!= 0) {
			System.out.println("El ganador fue " + ganador);
		}
	}
	
	private int RevisarGanador(int jugador) {
		int ganador = 0;
		int token_consecutivo = 0;
		char token_jugador = jugadores.get(jugador);
		
		// Revisar las Columnas
		for(int fila=0; fila<3; fila++){
			for(int col=0; col<3; col++) {
				if(tablero[fila][col] == token_jugador) {
					token_consecutivo += 1;
				}
			}
			if(token_consecutivo > 2) {
				ganador = jugador;
			}else {
				token_consecutivo = 0;
			}
		}
		
		// Revisar las Filas
		for(int col=0; col<3; col++){
			for(int fila=0; fila<3; fila++) {
				if(tablero[fila][col] == token_jugador) {
					token_consecutivo += 1;
				}
			}
			if(token_consecutivo > 2) {
				ganador = jugador;
			}else {
				token_consecutivo = 0;
			}
		}
		// Revisar Diagonales
		
		for(int fila=0; fila<3; fila++) {
			if(tablero[fila][fila] == token_jugador) {
				token_consecutivo += 1;
			}
		}
		if(token_consecutivo > 2) {
			ganador = jugador;
		}else {
			token_consecutivo = 0;
		}
		
		// Revisar las Diagonales Invertidas
		
		return ganador;
	}
	
}
