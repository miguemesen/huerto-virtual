package tec.hv.app;

import java.util.ArrayList;

public class startProcess {

	public static void main(String[] args) {
	    JSONParser parser = new JSONParser();
	    ArrayList < PlantCreator > plantas = parser.cargarPlantas();
	  
	    Player jugador = parser.cargarJugador();
	    DayProcess dia = new DayProcess();
	    dia.iniciarDia(plantas,jugador);
	}

}