package tec.hv.app;
import java.util.ArrayList;
//import java.util.List;

public abstract class AbstractPlant {

	  private String tipo;
	  private String nombre;
	  private int riegoPordia;
	  private int abonoRango;
	  private int cosechaRango;

	  private boolean riego;
	  private boolean abono;
	  private boolean cosecha;
	  private boolean controlPlaga;

	 private String needs;
	




	  public AbstractPlant(String tipo, String nombre, int riegoPordia, int abonoRango, int cosechaRango) {
		super();
		this.tipo = tipo;
		this.nombre = nombre;
		this.riegoPordia = riegoPordia;
		this.abonoRango = abonoRango;
		this.cosechaRango = cosechaRango;
		
	    this.riego = true;
	    this.abono = true;
	    this.controlPlaga = true;
	    this.cosecha = true;
	    this.needs = "N";
	}
	
	  //Ver detalles de la plantas
	  
	  public String getTipo() {
		    return this.tipo;
		  }
	  public String getNombre() {
	    return this.nombre;
	  }

	  public int getRiegoxDia() {
	    return this.riegoPordia;
	  }

	  public int getRangoAbono() {
	    return this.abonoRango;
	  }
	  
	  public int getRangoCosecha() {
		    return this.cosechaRango;
	  }
	  public String getNeeds() {
		    return this.needs;
	  }
	  
	  public void setNeeds(String need) {
		    this.needs = need;
	  }

	  //Ver estado del cuidado de la planta
	  public boolean getRiego() {
	    return this.riego;
	  }

	  public boolean getAbono() {
	    return this.abono;
	  }

	  public boolean getControlPlaga() {
	    return this.controlPlaga;
	  }
	  
	  public boolean getCosecha() {
		    return this.cosecha;
		  }
	  
	  //public boolean getEstado() {
	  //  return this.estado;
	  //}

	  //Realizar cuidados de las plantas
	  public void regar(boolean estado) {
	    this.riego = estado;
	  }

	  public void abonar(boolean estado) {
	    this.abono = estado;
	  }

	  public void eliminarPlaga(boolean estado) {
	    this.controlPlaga = estado;
	  }
	  
	  public void cosechar(boolean estado) {
		    this.cosecha = estado;
	  }
	  
	  //public void estado(boolean estado) {
	  //  this.estado = estado;
	 // }



}
