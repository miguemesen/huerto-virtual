package tec.hv.app;

public class controlAnalisis extends Thread{
	Controller controlador;
	int puntaje;
	
	
	public controlAnalisis(Controller controlador,int puntaje) {
		this.controlador = controlador;
		this.puntaje=puntaje;
	}
	

	public void run() {
		  controlador.setPuntaje(puntaje);
		  }
	
	
	
}

