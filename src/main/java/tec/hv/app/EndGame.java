package tec.hv.app;

public class EndGame extends Thread{
	
	Controller controlador = new Controller();
	
	public void run() {
		controlador.gameOver();
		
	}
	
}
