package tec.hv.app;
import java.util.ArrayList;

public class ControlAbono extends Thread{
	
  ArrayList <PlantCreator > plantas;
  int time;
  int day;
  
  public ControlAbono(ArrayList < PlantCreator > plantasx,int day,Controller controlador) {
    this.plantas = plantasx;
    this.day = day;

  }

  public void run() {
    while (time!=45) {
      int i = 0;
      time++;
      
      while (i < plantas.size()) { 
    //	System.out.println(day);
    	
        if ((day % plantas.get(i).getRangoAbono()) == 0 && plantas.get(i).getAbono() == true) {
          plantas.get(i).abonar(false);
          System.out.println("Dia de Abonar: " + plantas.get(i).getNombre() + "Dia: " + day);
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
