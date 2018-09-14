package partido.entity;

public class NoExistePartido extends Exception{
	private static final long serialVersionUID = 1L;

	public NoExistePartido() {
		super("El partido nunca se jugó");
	} 

}
