package tarjeta.entity;

public class Tarjeta {

	private int codigoTarjeta;
	private int codigoJugador;
	private int codigoPartido;
	private String tipo;
	private int montoMulta;
	


	public Tarjeta(int codigoTarjeta,int codigoJugador,int codigoPartido,String tipo,
			int montoMulta) {
		
		this.codigoTarjeta = codigoTarjeta;
		this.codigoJugador = codigoJugador;
		this.codigoPartido = codigoPartido;
		this.tipo = tipo ;
		this.montoMulta = montoMulta;
	}



	public int getCodigoTarjeta() {
		return codigoTarjeta;
	}



	public void setCodigoTarjeta(int codigoTarjeta) {
		this.codigoTarjeta = codigoTarjeta;
	}



	public int getCodigoJugador() {
		return codigoJugador;
	}



	public void setCodigoJugador(int codigoJugador) {
		this.codigoJugador = codigoJugador;
	}



	public int getCodigoPartido() {
		return codigoPartido;
	}



	public void setCodigoPartido(int codigoPartido) {
		this.codigoPartido = codigoPartido;
	}



	public String getTipo() {
		return tipo;
	}



	public void setTipo(String tipo) {
		this.tipo = tipo;
	}



	public int getMontoMulta() {
		return montoMulta;
	}



	public void setMontoMulta(int montoMulta) {
		this.montoMulta = montoMulta;
	}



	@Override
	public String toString() {
		return "Tarjeta [codigoTarjeta=" + codigoTarjeta + ", codigoJugador=" + codigoJugador + ", codigoPartido="
				+ codigoPartido + ", tipo=" + tipo + ", montoMulta=" + montoMulta + "]";
	}
	
	
}
