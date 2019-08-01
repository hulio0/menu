package codigocontrol;

import funcionalidad.Codigo;
import funcionalidad.Controlador;
import funcionalidad.Menu;

public class MiniBaseDatos implements Controlador{
	
	public static final String[] OPCIONES = {"Nombre","Edad","Nacionalidad"};
	public static final Codigo[] CONTROL = new Codigo[3];
	
	private Menu menu;
	public MiniBaseDatos() {
		this.menu = new Menu(OPCIONES);
		
		CONTROL[0] = () -> System.out.println("Nombre");
		CONTROL[1] = () -> System.out.println("Edad");
		CONTROL[2] = () -> System.out.println("Nacionalidad");
				
	}

	public void tratarSeleccion(int seleccion) {
		
		if(seleccion==-1)
			return;
		
		CONTROL[seleccion-1].ejecutar();
	}

	public void empezar() {
		while( true ) {
			menu.showOptions();
			tratarSeleccion( menu.reqOption() );
		}
	}

}
