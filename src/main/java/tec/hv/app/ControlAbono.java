package tec.hv.app;
import java.util.ArrayList;

public class ControlAbono extends Thread{
	
  ArrayList <PlantCreator > plantas;
  int time;
  int day;
  Controller controlador;
  
  public ControlAbono(ArrayList < PlantCreator > plantasx,int day,Controller controlador) {
    this.plantas = plantasx;
    this.day = day;
    this.controlador=controlador;
  }

  public void run() {
    while (time!=30) {
      int i = 0;
      time++;
      
      while (i < plantas.size()) { 
    //	System.out.println(day);
    	
        if ((day % plantas.get(i).getRangoAbono()) == 0 && plantas.get(i).getAbono() == true) {
        	
            String pl = plantas.get(i).getNeeds();
            
        	  if(pl.contains("A") == false) {
        		  
    			 System.out.println("Dia de Abonar: " + plantas.get(i).getNombre());
    			 plantas.get(i).abonar(false);
        		 controlador.alertaAbono(i); 
        		 plantas.get(i).setNeeds(plantas.get(i).getNeeds()+"A");
        		
        	}
       
        }

        i++;

     //   if (time == 45) {
     //     time = 0;
     //     day++;
      //  }
      }

      try {
        ControlAbono.sleep(1000);
        
      } catch (InterruptedException e) {
        System.out.println("Error en la clase ControlAbono " + e);
      }

    }
  }

}
