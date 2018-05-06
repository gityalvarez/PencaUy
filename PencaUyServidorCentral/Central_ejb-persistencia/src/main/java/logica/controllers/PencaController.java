package logica.controllers;

import logica.controllers.interfaces.PencaControllerInterface;

public class PencaController implements PencaControllerInterface{

	private static PencaController instancia = null;
	
	private PencaController() {
		//Inicializaciones
	}
	
	public static PencaController getInstancia() {
		if(instancia == null) {
			instancia = new PencaController();
		}
		return instancia;
	}
	
	
}
