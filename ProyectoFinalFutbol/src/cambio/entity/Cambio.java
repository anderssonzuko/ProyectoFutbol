package cambio.entity;

public class Cambio {

	private int codigoCambio;
	private int codigoJugador;
	private int codigoEquipo;
	private int codigoPartido;
	private int minuto;
	
	public Cambio(int codigoCambio,int  codigoJugador,int codigoEquipo, int codigoPartido,int minuto) {
		
		this.codigoCambio = codigoCambio;
		this.codigoJugador = codigoJugador;
		this.codigoEquipo = codigoEquipo;
		this.codigoPartido = codigoPartido;
		this.minuto = minuto;
	}

	public int getCodigoCambio() {
		return codigoCambio;
	}

	public void setCodigoCambio(int codigoCambio) {
		this.codigoCambio = codigoCambio;
	}

	public int getCodigoJugador() {
		return codigoJugador;
	}

	public void setCodigoJugador(int codigoJugador) {
		this.codigoJugador = codigoJugador;
	}

	public int getCodigoEquipo() {
		return codigoEquipo;
	}

	public void setCodigoEquipo(int codigoEquipo) {
		this.codigoEquipo = codigoEquipo;
	}

	public int getCodigoPartido() {
		return codigoPartido;
	}

	public void setCodigoPartido(int codigoPartido) {
		this.codigoPartido = codigoPartido;
	}

	public int getMinuto() {
		return minuto;
	}

	public void setMinuto(int minuto) {
		this.minuto = minuto;
	}

	@Override
	public String toString() {
		return "Cambio [codigoCambio=" + codigoCambio + ", codigoJugador=" + codigoJugador + ", codigoEquipo="
				+ codigoEquipo + ", codigoPartido=" + codigoPartido + ", minuto=" + minuto + "]";
	}
	
	
}
