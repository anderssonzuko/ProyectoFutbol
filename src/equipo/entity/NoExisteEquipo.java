package equipo.entity;

public class NoExisteEquipo extends Exception{
	private static final long serialVersionUID = 1L;

	public NoExisteEquipo() {
		super("El equipo no está registrado");
	}
}


