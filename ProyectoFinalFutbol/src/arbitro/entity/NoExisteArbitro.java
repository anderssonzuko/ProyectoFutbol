package arbitro.entity;


public class NoExisteArbitro extends Exception{
	private static final long serialVersionUID = 1L;

	public NoExisteArbitro() {
		super("El arbitro no está registrado");
	}
}
