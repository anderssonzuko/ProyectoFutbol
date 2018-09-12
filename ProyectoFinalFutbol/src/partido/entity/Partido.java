package partido.entity;

public class Partido {
	
	private int codigoPartido;
	private int codigoEquipo1;
	private int codigoEquipo2;
	private int codigoArbitro;
	private int codigoEstadistica;
	private String fecha;
	private String estadio;
	private String ciudad;
	


	public Partido(int codigoPartido,int codigoEquipo1,int CodigoEquipo2, int codigoArbitro,
			int codigoEstadistica,String fecha,String estadio,String ciudad) {
		
		this.codigoPartido = codigoPartido;
		this.codigoEquipo1 = codigoEquipo1;
		this.codigoEquipo2 = CodigoEquipo2;
		this.codigoArbitro = codigoArbitro;
		this.codigoEstadistica = codigoEstadistica;
		this.fecha = fecha;
		this.estadio = estadio;
		this.ciudad = ciudad;
	}



	public int getCodigoPartido() {
		return codigoPartido;
	}



	public void setCodigoPartido(int codigoPartido) {
		this.codigoPartido = codigoPartido;
	}



	public int getCodigoEquipo1() {
		return codigoEquipo1;
	}



	public void setCodigoEquipo1(int codigoEquipo1) {
		this.codigoEquipo1 = codigoEquipo1;
	}



	public int getCodigoEquipo2() {
		return codigoEquipo2;
	}



	public void setCodigoEquipo2(int codigoEquipo2) {
		this.codigoEquipo2 = codigoEquipo2;
	}



	public int getCodigoArbitro() {
		return codigoArbitro;
	}



	public void setCodigoArbitro(int codigoArbitro) {
		this.codigoArbitro = codigoArbitro;
	}



	public int getCodigoEstadistica() {
		return codigoEstadistica;
	}



	public void setCodigoEstadistica(int codigoEstadistica) {
		this.codigoEstadistica = codigoEstadistica;
	}



	public String getFecha() {
		return fecha;
	}



	public void setFecha(String fecha) {
		this.fecha = fecha;
	}



	public String getEstadio() {
		return estadio;
	}



	public void setEstadio(String estadio) {
		this.estadio = estadio;
	}



	public String getCiudad() {
		return ciudad;
	}



	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}



	@Override
	public String toString() {
		return "Partido [codigoPartido=" + codigoPartido + ", codigoEquipo1=" + codigoEquipo1 + ", codigoEquipo2="
				+ codigoEquipo2 + ", codigoArbitro=" + codigoArbitro + ", codigoEstadistica=" + codigoEstadistica
				+ ", fecha=" + fecha + ", estadio=" + estadio + ", ciudad=" + ciudad + "]";
	}
	
	
	
		
}
