package tarjeta.entity;

public class NoExisteTarjeta extends Exception{
	private static final long serialVersionUID = 1L;

	public NoExisteTarjeta() {
		super("La tarjeta no existe");
	} 

}
