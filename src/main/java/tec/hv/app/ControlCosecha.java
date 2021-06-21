package tec.hv.app;
import java.util.ArrayList;

public class ControlCosecha extends Thread {

	  ArrayList <PlantCreator > plantas;
	  int time;
	  int day;
	  Controller controlador;
	  
	  public ControlCosecha(ArrayList < PlantCreator > plantasx,int dia,Controller controller) {
	    this.plantas = plantasx;
	    this.day = dia;
	    this.controlador = controller;
	    
	  }

	  public void run() {
	    while (time!=20) {
	      int i = 0;
	      time++;
	      while (i < plantas.size()) {

	    	 
	    	//  System.out.println("Cosechaa");
	        
	    	  if ((day % plantas.get(i).getRangoCosecha()) == 0 && plantas.get(i).getCosecha() == true) {
	    		  	
	    		  	String pl = plantas.get(i).getNeeds();
	            	if(pl.contains("C") == false) {
	            		System.out.println("Dia de cosecha: " + plantas.get(i).getNombre() +" Dia: "+day);
	            		plantas.get(i).cosechar(false);
	            		controlador.mostrarCosecha(i, plantas.get(i).getTipo()); 
	            		plantas.get(i).setNeeds(plantas.get(i).getNeeds()+"C");
	            		
	            	}
	    		  	
	    	  }

	        i++;

	      }

	      try {
	        ControlCosecha.sleep(1000);
	        
	      } catch (InterruptedException e) {
	        System.out.println("Error en la clase ControlAbono " + e);
	      }

	    }
	  }
	
}
