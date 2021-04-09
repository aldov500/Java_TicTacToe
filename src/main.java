import games_package.TicTacToe;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		TicTacToe juego = new TicTacToe();
		
		juego.NuevoJuego();
		
		Scanner entrada_jugador = new Scanner(System.in);
		Scanner posicion = new Scanner(System.in);
		
		String opcion = "A";
		System.out.println("Presione P ...");
		opcion = entrada_jugador.nextLine();
		
		while(juego.corriendo == true) {
			
			
			if(opcion.equals("P")) {
				
				int p = 0;
						
				juego.RefrescarTablero();
				System.out.println("El turno es del jugador 1 :");
				p = posicion.nextInt();
				juego.MovimientoNuevo(1, p);
				
				juego.RefrescarTablero();
				System.out.println("El turno es del jugador 2 :");
				p = posicion.nextInt();
				juego.MovimientoNuevo(2, p);
				
			}
			
		}
		
		posicion.close();
		entrada_jugador.close();
	}
	
}


