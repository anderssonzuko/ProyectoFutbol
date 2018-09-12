package estadistica.entity;

public class Estadistica {

	private int codigoEstadistica;
	private int codigoTarjeta;
	private int codigoEquipo;
	private int codigoJugador;
	private int disparos;
	private int posesion;
	private int tirosLibres;
	private int corners;
	private int penales;
	private int fueraDeJuego;
	private int goles;
	private int codigoCambio;
	


	public Estadistica(int codigoEstadistica,int codigoTarjeta,int codigoEquipo, 
			int codigoJugador, int disparos, int posesion,int tirosLibres,int corners,
			int penales,int fueraDeJuego,int goles,int codigoCambio) {
		
		this.codigoEstadistica = codigoEstadistica;
		this.codigoTarjeta = codigoTarjeta;
		this.codigoEquipo = codigoEquipo;
		this.codigoJugador = codigoJugador;
		this.disparos = disparos;
		this.posesion = posesion;
		this.tirosLibres = tirosLibres;
		this.corners = corners;
		this.penales = penales;
		this.fueraDeJuego = fueraDeJuego;
		this.goles = goles;
		this.codigoCambio = codigoCambio;

	}



	public int getCodigoEstadistica() {
		return codigoEstadistica;
	}



	public void setCodigoEstadistica(int codigoEstadistica) {
		this.codigoEstadistica = codigoEstadistica;
	}



	public int getCodigoTarjeta() {
		return codigoTarjeta;
	}



	public void setCodigoTarjeta(int codigoTarjeta) {
		this.codigoTarjeta = codigoTarjeta;
	}



	public int getCodigoEquipo() {
		return codigoEquipo;
	}



	public void setCodigoEquipo(int codigoEquipo) {
		this.codigoEquipo = codigoEquipo;
	}



	public int getCodigoJugador() {
		return codigoJugador;
	}



	public void setCodigoJugador(int codigoJugador) {
		this.codigoJugador = codigoJugador;
	}



	public int getDisparos() {
		return disparos;
	}



	public void setDisparos(int disparos) {
		this.disparos = disparos;
	}



	public int getPosesion() {
		return posesion;
	}



	public void setPosesion(int posesion) {
		this.posesion = posesion;
	}



	public int getTirosLibres() {
		return tirosLibres;
	}



	public void setTirosLibres(int tirosLibres) {
		this.tirosLibres = tirosLibres;
	}



	public int getCorners() {
		return corners;
	}



	public void setCorners(int corners) {
		this.corners = corners;
	}



	public int getPenales() {
		return penales;
	}



	public void setPenales(int penales) {
		this.penales = penales;
	}



	public int getFueraDeJuego() {
		return fueraDeJuego;
	}



	public void setFueraDeJuego(int fueraDeJuego) {
		this.fueraDeJuego = fueraDeJuego;
	}



	public int getGoles() {
		return goles;
	}



	public void setGoles(int goles) {
		this.goles = goles;
	}



	public int getCodigoCambio() {
		return codigoCambio;
	}



	public void setCodigoCambio(int codigoCambio) {
		this.codigoCambio = codigoCambio;
	}



	@Override
	public String toString() {
		return "Estadistica [codigoEstadistica=" + codigoEstadistica + ", codigoTarjeta=" + codigoTarjeta
				+ ", codigoEquipo=" + codigoEquipo + ", codigoJugador=" + codigoJugador + ", disparos=" + disparos
				+ ", posesion=" + posesion + ", tirosLibres=" + tirosLibres + ", corners=" + corners + ", penales="
				+ penales + ", fueraDeJuego=" + fueraDeJuego + ", goles=" + goles + ", codigoCambio=" + codigoCambio
				+ "]";
	}
	
	
}
