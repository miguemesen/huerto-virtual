package tec.hv.app;
import java.util.ArrayList;

public class ControlCosecha extends Thread {

	  ArrayList <PlantCreator > plantas;
	  int time;
	  int day;

	  
	  public ControlCosecha(ArrayList < PlantCreator > plantasx,int dia,Controller controlador) {
	    this.plantas = plantasx;
	    this.day = dia;
	  }

	  public void run() {
	    while (time!=30) {
	      int i = 0;
	      time++;
	      while (i < plantas.size()) {

	    	 
	    	//  System.out.println("Cosechaa");
	        if ((day % plantas.get(i).getRangoCosecha()) == 0 && plantas.get(i).getCosecha() == true) {
	          plantas.get(i).cosechar(false);
	          System.out.println("Dia de cosecha: " + plantas.get(i).getNombre() +" Dia: "+day);
	        }

	        i++;

	        //if (time == 45) {
	         // time = 0;
	          
	         // day++;
	          
	        //}
	      }

	      try {
	        ControlCosecha.sleep(1000);
	        
	      } catch (InterruptedException e) {
	        System.out.println("Error en la clase ControlAbono " + e);
	      }

	    }
	  }
	
}
