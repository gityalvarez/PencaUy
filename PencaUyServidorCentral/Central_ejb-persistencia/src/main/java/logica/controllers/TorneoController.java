package logica.controllers;

import logica.controllers.interfaces.TorneoControllerInterface;

public class TorneoController implements TorneoControllerInterface{

	private static TorneoController instancia = null;
	
	private TorneoController() {
		//Inicializaciones
	}
	
	public static TorneoController getInstancia() {
		if(instancia == null) {
			instancia = new TorneoController();
		}
		return instancia;
	}

	@Override
	public String altaTorneo(/* Parametros */) {
		String mensaje = "NO_IMPLEMENTADA";
		return mensaje;
	}
}
