package estadistica.entity;

public class Estadistica {

	private int codigoEstadistica;
	private String codigoTarjetas;
	private String codigoEquipos;
	private String disparos;
	private String posesion;
	private String tirosLibres;
	private String corners;
	private String penales;
	private String fueraDeJuego;
	private String goles;
	private String codigoCambios;
	


	public Estadistica(int codigoEstadistica,String codigoTarjetas,String codigoEquipos, 
			String disparos, String posesion, String tirosLibres, String corners,
			String penales, String fueraDeJuego, String goles,String codigoCambios) {
		
		this.codigoEstadistica = codigoEstadistica;
		this.codigoTarjetas = codigoTarjetas;
		this.codigoEquipos = codigoEquipos;
		this.disparos = disparos;
		this.posesion = posesion;
		this.tirosLibres = tirosLibres;
		this.corners = corners;
		this.penales = penales;
		this.fueraDeJuego = fueraDeJuego;
		this.goles = goles;
		this.codigoCambios = codigoCambios;

	}



	public int getCodigoEstadistica() {
		return codigoEstadistica;
	}



	public void setCodigoEstadistica(int codigoEstadistica) {
		this.codigoEstadistica = codigoEstadistica;
	}



	public String getCodigoTarjetas() {
		return codigoTarjetas;
	}



	public void setCodigoTarjetas(String codigoTarjetas) {
		this.codigoTarjetas = codigoTarjetas;
	}



	public String getCodigoEquipos() {
		return codigoEquipos;
	}



	public void setCodigoEquipos(String codigoEquipos) {
		this.codigoEquipos = codigoEquipos;
	}



	public String getDisparos() {
		return disparos;
	}



	public void setDisparos(String disparos) {
		this.disparos = disparos;
	}



	public String getPosesion() {
		return posesion;
	}



	public void setPosesion(String posesion) {
		this.posesion = posesion;
	}



	public String getTirosLibres() {
		return tirosLibres;
	}



	public void setTirosLibres(String tirosLibres) {
		this.tirosLibres = tirosLibres;
	}



	public String getCorners() {
		return corners;
	}



	public void setCorners(String corners) {
		this.corners = corners;
	}



	public String getPenales() {
		return penales;
	}



	public void setPenales(String penales) {
		this.penales = penales;
	}



	public String getFueraDeJuego() {
		return fueraDeJuego;
	}



	public void setFueraDeJuego(String fueraDeJuego) {
		this.fueraDeJuego = fueraDeJuego;
	}



	public String getGoles() {
		return goles;
	}



	public void setGoles(String goles) {
		this.goles = goles;
	}



	public String getCodigoCambios() {
		return codigoCambios;
	}



	public void setCodigoCambios(String codigoCambios) {
		this.codigoCambios = codigoCambios;
	}



	@Override
	public String toString() {
		return "Estadistica [codigoEstadistica=" + codigoEstadistica + ", codigoTarjetas=" + codigoTarjetas
				+ ", codigoEquipos=" + codigoEquipos + ", disparos=" + disparos + ", posesion=" + posesion
				+ ", tirosLibres=" + tirosLibres + ", corners=" + corners + ", penales=" + penales + ", fueraDeJuego="
				+ fueraDeJuego + ", goles=" + goles + ", codigoCambios=" + codigoCambios + "]";
	}

}