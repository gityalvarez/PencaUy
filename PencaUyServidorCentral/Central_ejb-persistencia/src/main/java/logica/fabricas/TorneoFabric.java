package logica.fabricas;

import logica.controllers.TorneoController;
import logica.controllers.interfaces.TorneoControllerInterface;

public class TorneoFabric {

	private static TorneoFabric instancia = null;

	private TorneoFabric() {
		// Inicializaciones
	}

	public static TorneoFabric getInstancia() {
		if (instancia == null) {
			instancia = new TorneoFabric();
		}
		return instancia;
	}
	
	public TorneoControllerInterface getController() {
		return (TorneoControllerInterface) TorneoController.getInstancia();
	}

}
