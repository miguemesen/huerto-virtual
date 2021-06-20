package tec.hv.app;

public class Player {
	int id;
	private String nombre;
	private String rango;
	private int puntaje;
	
	public Player(int id,String nombre, String rango, int puntaje) {
		
		this.id = id;
		this.nombre = nombre;
		this.rango = rango;
		this.puntaje = puntaje;
	}

	public String getNombre() {
		return nombre;
	}

	public String getRango() {
		return rango;
	}

	public void setRango(String rango) {
		this.rango = rango;
	}

	public int getPuntaje() {
		return puntaje;
	}

	public void setPuntaje(int puntaje) {
		this.puntaje = puntaje;
	}
}
