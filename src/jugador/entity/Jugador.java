package jugador.entity;

public class Jugador {

	private int codigoJugador;
	private int codigoEquipo;
	private int DNI;
	private String nombreCompleto;
	private String fechaNacimiento;
	private int numeroPolera;
	private double sueldo;
	private String nacionalidad;
	private double altura;
	private double peso;
	
	public Jugador(int codigoJugador, int codigoEquipo, int DNI, String nombreCompleto,
			String fechaNacimiento, int numeroPolera, double sueldo, String nacionalidad,
			double altura, double peso) {
		this.codigoJugador = codigoJugador;
		this.codigoEquipo = codigoEquipo;
		this.DNI = DNI;
		this.nombreCompleto = nombreCompleto;
		this.fechaNacimiento = fechaNacimiento;
		this.numeroPolera = numeroPolera;
		this.sueldo = sueldo;
		this.nacionalidad = nacionalidad;
		this.altura = altura;
		this.peso = peso;
	}

	public Integer getCodigoJugador() {
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

	public int getDNI() {
		return DNI;
	}

	public void setDNI(int dNI) {
		DNI = dNI;
	}

	public String getNombreCompleto() {
		return nombreCompleto;
	}

	public void setNombreCompleto(String nombreCompleto) {
		this.nombreCompleto = nombreCompleto;
	}

	public String getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(String fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public int getNumeroPolera() {
		return numeroPolera;
	}

	public void setNumeroPolera(int numeroPolera) {
		this.numeroPolera = numeroPolera;
	}

	public double getSueldo() {
		return sueldo;
	}

	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}

	public String getNacionalidad() {
		return nacionalidad;
	}

	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	@Override
	public String toString() {
		return "Jugador [codigoJugador=" + codigoJugador + ", codigoEquipo=" + codigoEquipo + ", DNI=" + DNI
				+ ", nombreCompleto=" + nombreCompleto + ", fechaNacimiento=" + fechaNacimiento + ", numeroPolera="
				+ numeroPolera + ", sueldo=" + sueldo + ", nacionalidad=" + nacionalidad + ", altura=" + altura
				+ ", peso=" + peso + "]";
	}
}
