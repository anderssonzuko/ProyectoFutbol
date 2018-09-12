package equipo.entity;

public class Equipo {
	
	private int codigoEquipo;
	private String nombre;
	private String ciudad;
	private int presupuestoAnual;

	
	public Equipo(int codigoEquipo, String nombre,String ciudad, int presupuestoAnual) {
		
		this.codigoEquipo = codigoEquipo;
		this.nombre = nombre;
		this.ciudad = ciudad;
		this.presupuestoAnual = presupuestoAnual;
	}


	public int getCodigoEquipo() {
		return codigoEquipo;
	}


	public void setCodigoEquipo(int codigoEquipo) {
		this.codigoEquipo = codigoEquipo;
	}

	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getCiudad() {
		return ciudad;
	}


	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}


	public int getPresupuestoAnual() {
		return presupuestoAnual;
	}


	public void setPresupuestoAnual(int presupuestoAnual) {
		this.presupuestoAnual = presupuestoAnual;
	}


	@Override
	public String toString() {
		return "Equipo [codigoEquipo=" + codigoEquipo + ", nombre=" + nombre + ", ciudad=" + ciudad
				+ ", presupuestoAnual=" + presupuestoAnual + "]";
	}
}
