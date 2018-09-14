package estadistica.entity;

public class NoExisteEstadistica extends Exception{
	private static final long serialVersionUID = 1L;

	public NoExisteEstadistica() {
		super("No se tomaron datos de estas estadisticas");
	} 

}
