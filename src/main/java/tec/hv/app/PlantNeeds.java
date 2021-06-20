package tec.hv.app;

public interface PlantNeeds {
	public abstract void regar(boolean condicion);
	public abstract void abonar(boolean condicion);
	public abstract void eliminarPlaga(boolean condicion);
	public abstract void estado(boolean condicion);
	public abstract void cosechar(boolean condicion);
}
