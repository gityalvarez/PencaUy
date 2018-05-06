package logica.controllers;

import logica.controllers.interfaces.UsuarioControllerInterface;

public class UsuarioController implements UsuarioControllerInterface{

	private static UsuarioController instancia = null;
	
	private UsuarioController() {
		//Inicializaciones
	}
	
	public static UsuarioController getInstancia() {
		if(instancia == null) {
			instancia = new UsuarioController();
		}
		return instancia;
	}
}
