package tec.hv.app;

import java.util.ArrayList;

public class controlBackend extends Thread{
	Controller controlador;
	
	
	
	public controlBackend(Controller controlador) {
		this.controlador = controlador;
	}



	public void run() {
	    JSONParser parser = new JSONParser();
	    ArrayList < PlantCreator > plantas = parser.cargarPlantas();
	    Player jugador = parser.cargarJugador();
	    
	    DayProcess dia = new DayProcess();
     	dia.iniciarDia(plantas,jugador,controlador); 
	}

}
