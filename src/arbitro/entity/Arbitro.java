package arbitro.entity;

public class Arbitro {
	
	private int codigoArbitro;
	private int codigoPartido;
	private int DNI;
	private String nombre;
	private String fechaNacimiento;
    private String nacionalidad;
	
	

	public Arbitro(int codigoArbitro,int codigoPartido,int DNI, String nombre,
			String FechaNacimiento,String nacionalidad) {
		
		this.codigoArbitro = codigoArbitro;
		this.codigoPartido = codigoPartido;
		this.DNI = DNI;
		this.nombre = nombre;
		this.fechaNacimiento = fechaNacimiento;
		this.nacionalidad = nacionalidad;
	}



	public int getCodigoArbitro() {
		return codigoArbitro;
	}



	public void setCodigoArbitro(int codigoArbitro) {
		this.codigoArbitro = codigoArbitro;
	}



	public int getCodigoPartido() {
		return codigoPartido;
	}



	public void setCodigoPartido(int codigoPartido) {
		this.codigoPartido = codigoPartido;
	}



	public int getDNI() {
		return DNI;
	}



	public void setDNI(int dNI) {
		DNI = dNI;
	}



	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public String getFechaNacimiento() {
		return fechaNacimiento;
	}



	public void setFechaNacimiento(String fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}



	public String getNacionalidad() {
		return nacionalidad;
	}



	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}



	@Override
	public String toString() {
		return "Arbitro [codigoArbitro=" + codigoArbitro + ", codigoPartido=" + codigoPartido + ", DNI=" + DNI
				+ ", nombre=" + nombre + ", fechaNacimiento=" + fechaNacimiento + ", nacionalidad=" + nacionalidad
				+ "]";
	}
	
	
}
