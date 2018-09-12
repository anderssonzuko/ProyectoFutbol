package cambio.entity;

public class NoExisteCambio extends Exception{
	private static final long serialVersionUID = 1L;

	public NoExisteCambio() {
		super("Este cambio no existe");
	} 

}
