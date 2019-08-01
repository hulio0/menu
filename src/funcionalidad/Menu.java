package funcionalidad;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {
	
	private String[] opciones;
	private static Scanner sc = new Scanner(System.in);
	
	public Menu(String[] opciones) {
		this.opciones=opciones;
	}
	
	public void showOptions() {
		int i = 1;
		for( String opcion : opciones )
			System.out.println( (i++) + ". " + opcion );
	}

	// Devuelve -1 si la selección no es válida
	public int reqOption() {
		int seleccion = -1;
		  try { seleccion = sc.nextInt(); }
		  catch(InputMismatchException e) { System.out.println("La selección se hace con NÚMEROS"); }
		  finally { sc.nextLine(); } // Limpia el buffer
		  
		if( !isOk(seleccion) )
			return -1;
		
		return seleccion;
	}
	
	private boolean isOk(int seleccion) {
		return 1 <= seleccion && seleccion <= opciones.length;
	}
}
