package tec.hv.app;
import java.util.ArrayList;

public class ControlRiego extends Thread {

  ArrayList < PlantCreator > plantas;
  int time;

  public ControlRiego(ArrayList < PlantCreator > plantasx) {
    this.plantas = plantasx;

  }

  public void run() {
    while (time!=45) {
      int i = 0;
      time++;
      while (i < plantas.size()) {

      //  System.out.println("Regar: " + time);

        if ((time % (plantas.get(i).getRiegoxDia())) == 0 && plantas.get(i).getRiego() == true && time <= 39) {
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