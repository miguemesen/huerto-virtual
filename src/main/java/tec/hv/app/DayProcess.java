package tec.hv.app;
import java.util.Timer;
import java.util.TimerTask;
import java.util.ArrayList;

public class DayProcess {

 
  int dias=1;
  ArrayList < PlantCreator > plantas;
  Player jugador;
  Controller controlador;


@SuppressWarnings("deprecation")

public void iniciarDia(ArrayList < PlantCreator > plantasx, Player player,Controller controlador) {
	this.plantas=plantasx;
	this.jugador=player;
    this.controlador=controlador;
   
    ControlRiego hiloRiego = new ControlRiego(plantas,controlador);
    ControlAbono hiloAbono = new ControlAbono(plantas,dias,controlador);
    ControlPlaga hiloPlaga = new ControlPlaga(plantas,dias,controlador);
    ControlCosecha hiloCosecha = new ControlCosecha(plantas,dias,controlador);
    
    
    
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
	  System.out.print("Vamos a analizar: "+ dias);
	  
	  int puntaje;
	  int restar=0;
	  
	  
	  for (int i=0; i<plantas.size();i++) {	  
		  
		  if(plantas.get(i).getRiego()==false) {
			  restar=restar+5;
		  }
		  if(plantas.get(i).getAbono()==false) {
			  restar=restar+10;
		  }
		  if(plantas.get(i).getControlPlaga()==false) {
			  restar=restar+15;
		  }
		  if(plantas.get(i).getCosecha()==false && !"Ornamental2".equals(plantas.get(i).getTipo())) {
			  restar=restar+20;
		  }
	
	  }
	  
	  
	  puntaje = jugador.getPuntaje()-restar;
	  jugador.setPuntaje(puntaje);
	 
	  
	  System.out.println("Puntos: "+puntaje);
	  if (puntaje>=5) {
	  iniciarDia(plantas,jugador,controlador); 
	  }
	  else {
		  finalizar();
	  }
  }


public void finalizar() {
		  System.out.println("Fin del juego");
	  }
	  
 }
  
  

