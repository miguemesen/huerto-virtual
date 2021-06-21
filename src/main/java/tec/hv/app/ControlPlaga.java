package tec.hv.app;
import java.util.ArrayList;
import java.util.Random;

public class ControlPlaga extends Thread {
  ArrayList < PlantCreator > plantas;
  Random r = new Random();

  int time;
  int day;

  //int plagaDay = r.nextInt(2)+1;
  int plagaDay = 2;
  int infectada;
  Controller controlador;
  
  public ControlPlaga(ArrayList < PlantCreator > plantasx, int dia,Controller controlador) {
	this.day = dia;  
    this.plantas = plantasx;
    this.infectada = r.nextInt(plantas.size());
    this.controlador = controlador;
  }

  public void run() {
	
    while (time!=45) {
  //  System.out.println("rplaga: "+plagaDay);
      time++;

      
          if (day % plagaDay==0 && plantas.get(infectada).getControlPlaga() == true && day!=1) {
        	  plantas.get(infectada).eliminarPlaga(false);
        	if(!"P".contains(plantas.get(infectada).getNeeds())) {
        	
        	if (infectada == 0){
        	    controlador.activarPlaga_PLANTA_UNO();
              }
            if (infectada == 1){
              controlador.activarPlaga_PLANTA_DOS();
            }
            if (infectada == 2){
              controlador.activarPlaga_PLANTA_TRES();
            }
        	  System.out.println("Se infect�: " + plantas.get(infectada).getNombre());
        	 plantas.get(infectada).setNeeds(plantas.get(infectada).getNeeds()+"P");
        	  
        	}
        }
      
      
      //if (time == 45) {
        //time = 0;
       //day++;
      
      //}
      
      try {
        ControlPlaga.sleep(1000);

      } catch (InterruptedException e) {
        System.out.println("Error en la clase ControlAbono " + e);
      }


}
  }
}

