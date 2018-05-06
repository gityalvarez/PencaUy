package logica.fabricas;

import logica.controllers.PencaController;
import logica.controllers.interfaces.PencaControllerInterface;

public class PencaFabric {

	private static PencaFabric instancia = null;

	private PencaFabric() {
		// Inicializaciones
	}

	public static PencaFabric getInstancia() {
		if (instancia == null) {
			instancia = new PencaFabric();
		}
		return instancia;
	}
	
	public PencaControllerInterface getController() {
		return (PencaControllerInterface) PencaController.getInstancia();
	}

}
