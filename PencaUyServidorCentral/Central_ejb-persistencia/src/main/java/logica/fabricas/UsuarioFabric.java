package logica.fabricas;

import logica.controllers.UsuarioController;
import logica.controllers.interfaces.UsuarioControllerInterface;

public class UsuarioFabric {

	private static UsuarioFabric instancia = null;

	private UsuarioFabric() {
		// Inicializaciones
	}

	public static UsuarioFabric getInstancia() {
		if (instancia == null) {
			instancia = new UsuarioFabric();
		}
		return instancia;
	}
	
	public UsuarioControllerInterface getController() {
		return (UsuarioControllerInterface) UsuarioController.getInstancia();
	}

}
