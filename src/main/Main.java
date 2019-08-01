package main;

import funcionalidad.Menu;

public class Main {
	
	public static void main(String[] args) {
		
		String[] opciones = {"Nombre","Edad","Nacionalidad"};
		
		Menu menu = new Menu(opciones);
		menu.showOptions();
		
	}

}
