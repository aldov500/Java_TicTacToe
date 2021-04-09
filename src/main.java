import games_package.TicTacToe;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		TicTacToe juego = new TicTacToe();
		
		juego.NuevoJuego();
		
		Scanner entrada_jugador = new Scanner(System.in);
		Scanner posicion = new Scanner(System.in);

		
		while(juego.corriendo == true) {
			
			int p = 0;
			
			juego.RefrescarTablero();
			System.out.println("El turno es del jugador 1 :");
			p = posicion.nextInt();
			if (juego.MovimientoNuevo(1, p) == true) {
				juego.RefrescarTablero();
			
				juego.TerminarJuego();
				break;
			}
			
			juego.RefrescarTablero();
			System.out.println("El turno es del jugador 2 :");
			p = posicion.nextInt();
			if (juego.MovimientoNuevo(2, p) == true) {
				juego.RefrescarTablero();
			
				juego.TerminarJuego();
				break;
			}
		
		}
		
		posicion.close();
		entrada_jugador.close();
		
	}
	
}


