package funcionalidad;

public class Menu {
	
	private String[] opciones;
	
	public Menu(String[] opciones) {
		this.opciones=opciones;
	}
	
	public void showOptions() {
		int i = 1;
		for( String opcion : opciones )
			System.out.println( (i++) + ". " + opcion );
	}

}
