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

	    for (int i=0; i < plantas.size(); i++){
	    	if (plantas.get(i).getTipo().equals("cicloCorto") && i==0){
	    		controlador.plantaNormal_PLANTA_UNO.setVisible(false);
	    		controlador.plantaBrocoli_PLANTA_UNO.setVisible(true);
			}
			if (plantas.get(i).getTipo().equals("cicloCorto") && i==1){
				controlador.plantaNormal_PLANTA_DOS.setVisible(false);
				controlador.plantaBrocoli_PLANTA_DOS.setVisible(true);
			}
			if (plantas.get(i).getTipo().equals("cicloCorto") && i==2){
				controlador.plantaNormal_PLANTA_TRES.setVisible(false);
				controlador.plantaBrocoli_PLANTA_TRES.setVisible(true);
			}
		}

	    Player jugador = parser.cargarJugador();
	    
	    DayProcess dia = new DayProcess();
     	dia.iniciarDia(plantas,jugador,controlador);
     	
	}

}
