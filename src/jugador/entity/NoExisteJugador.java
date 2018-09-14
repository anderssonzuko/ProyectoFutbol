package jugador.entity;

public class NoExisteJugador extends Exception{
	private static final long serialVersionUID = 1L;

	public NoExisteJugador() {
		super("El jugador no está registrado");
	} 

}
