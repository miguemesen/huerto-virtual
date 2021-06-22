package tec.hv.app;
import java.util.ArrayList;

public class DayProcess extends Thread {

 
  int dias=1;
  int puntaje;
  ArrayList < PlantCreator > plantas;
  Player jugador;
  Controller controlador;
  ControlRiego hiloRiego;
  ControlAbono hiloAbono;
  ControlPlaga hiloPlaga;
  ControlCosecha hiloCosecha;
@SuppressWarnings("deprecation")

public void iniciarDia(ArrayList < PlantCreator > plantasx, Player player,Controller controlador) {
	this.plantas=plantasx;
	this.jugador=player;
    this.controlador=controlador;
   
    this.hiloRiego = new ControlRiego(plantas,controlador);
    this.hiloAbono = new ControlAbono(plantas,dias,controlador);
    this.hiloPlaga = new ControlPlaga(plantas,dias,controlador);
    this.hiloCosecha = new ControlCosecha(plantas,dias,controlador);
    
    controlador.setDia(dias);
    controlador.setTimer(00);
    
    hiloRiego.start();
    try {
      hiloRiego.sleep(10);
    } catch (InterruptedException e) {
      System.out.println("Error en el hilo1 " + e);
    }
    
    hiloAbono.start();
    try {
      hiloAbono.sleep(10);
    } catch (InterruptedException e) {
      System.out.println("Error en el hilo2 " + e);
    }
    
    hiloPlaga.start();
    try {
      hiloPlaga.sleep(10);
    } catch (InterruptedException e) {
      System.out.println("Error en el hilo3 " + e);
    }
    
    hiloCosecha.start();
    try {
      hiloCosecha.sleep(10);
    } catch (InterruptedException e) {
      System.out.println("Error en el hilo4 " + e);
    }
    
    try {
		hiloCosecha.join();
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
    
    analisis();
    
  }
  
  public void analisis() {
	  dias++;
	  int restar=0;  
	  for (int i=0; i<plantas.size();i++) {	  
		  
		  plantas.get(i).setNeeds("N");
		  
		  if(plantas.get(i).getRiego()==false) {
			  restar=restar+5;
		  }
		  if(plantas.get(i).getAbono()==false) {
			  restar=restar+10;
		  }
		  if(plantas.get(i).getControlPlaga()==false) {
			  restar=restar+15;
		  }
		  if(plantas.get(i).getCosecha()==false) {
			  restar=restar+20;
		  }
	
	  }
	  
	  puntaje = jugador.getPuntaje()-restar; 
	  jugador.setPuntaje(puntaje);
	 
	  
	  
	  System.out.println("\nPuntos: "+puntaje);
	  	  
	  if (puntaje>=5) {
		  controlador.setPuntaje(puntaje);
		  iniciarDia(plantas,jugador,controlador); 
	  
	  }
	  else {
		  controlador.setPuntaje(00);
		  finalizar();
	  }
  }

public void finalizar() {
	hiloRiego.stop();
	hiloAbono.stop();
	hiloCosecha.stop();
	hiloPlaga.stop();
	
	System.out.println("Fin del juego");
		  
}
	 

 }
  
  

