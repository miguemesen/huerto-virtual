package tec.hv.app;
import java.util.ArrayList;

public class ControlRiego extends Thread {

  ArrayList < PlantCreator > plantas;
  Controller controlador;
  int time;

  public ControlRiego(ArrayList < PlantCreator > plantasx,Controller controlador) {
    this.plantas = plantasx;
    this.controlador = controlador;
  }

  public void run() {
    while (time!=30) {
      int i = 0;
      time++;
      System.out.println("Regar: " + time);
      while (i < plantas.size()) {

      

        if ((time % (plantas.get(i).getRiegoxDia())) == 0 && plantas.get(i).getRiego() == true && time <= 25) {
          plantas.get(i).regar(false);
          
         
          System.out.println("Hora de regar: " + plantas.get(i).getNombre());

        }

        i++;

        //if (time == 45) {
        //  time = 0;
       // }
      }

      try {
        ControlRiego.sleep(1000);
      } catch (InterruptedException e) {
        System.out.println("Error en la clase ControlRiego " + e);
      }

    }
  }

}