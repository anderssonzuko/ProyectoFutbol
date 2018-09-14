package jugador.view;

import java.sql.SQLException;
import java.util.Scanner;

import control.Conexion;
import equipo.entity.NoExisteEquipo;
import jugador.entity.Jugador;
import jugador.entity.NoExisteJugador;
import view.InputTypes;

public class JugadoresIO {

	private Conexion conexion;
	private Scanner scanner;

	public JugadoresIO(Conexion conexion, Scanner scanner) {
		this.conexion = conexion;
		this.scanner = scanner;
	}
	
	public void add() throws NoExisteEquipo {
		Jugador jugador = JugadorIO.ingresar(scanner);
		String sql = "Insert into Jugador (codigoEquipo, DNI, nombreCompleto, fechaNacimiento, numeroPolera, sueldo, nacionalidad, altura, peso, pieHabil) values(?,?,?,?,?,?,?,?,?,?)";
			try {
			conexion.consulta(sql);
			conexion.getSentencia().setInt(1, jugador.getCodigoEquipo());
			conexion.getSentencia().setInt(2, jugador.getDNI());
			conexion.getSentencia().setString(3, jugador.getNombreCompleto());
			conexion.getSentencia().setString(4, jugador.getFechaNacimiento());
			conexion.getSentencia().setInt(5, jugador.getNumeroPolera());
			conexion.getSentencia().setDouble(6, jugador.getSueldo());
			conexion.getSentencia().setString(7, jugador.getNacionalidad());
			conexion.getSentencia().setDouble(8, jugador.getAltura());
			conexion.getSentencia().setDouble(9, jugador.getPeso());
			conexion.getSentencia().setString(10, jugador.getPieHabil());
			conexion.modificacion();
			}catch (SQLException e) {
				throw new NoExisteEquipo();
			}
	}
	public void delete() {
		int codigoJugador = InputTypes.readInt("Código del jugador: ", scanner);
		String sql = "delete from jugador where codigoJugador = ?";
		try {
			conexion.consulta(sql);
			conexion.getSentencia().setInt(1, codigoJugador);
			conexion.modificacion();
		} catch (SQLException e) {
			System.out.println(e.getSQLState());
		}
	}
	
	public void update() throws NoExisteJugador, SQLException, NoExisteEquipo {
		java.sql.ResultSet resultSet;
		Jugador jugador;
		int codigoEquipo;
		int DNI;
		String nombreCompleto;
		String fechaNacimiento;
		int numeroPolera;
		double sueldo;
		String nacionalidad;
		double altura;
		double peso;
		String pieHabil;
		int codigo;
		int codigoJugador = InputTypes.readInt("Código del jugador: ", scanner);
		String sql = "select * from jugador where codigoJugador = ?";
		conexion.consulta(sql);
		conexion.getSentencia().setInt(1, codigoJugador);
		resultSet = conexion.resultado();
		if (resultSet.next()) {
			codigo = resultSet.getInt("codigoJugador");
			codigoEquipo = resultSet.getInt("codigoEquipo");
			DNI = resultSet.getInt("DNI");
			nombreCompleto = resultSet.getString("nombreCompleto");
			fechaNacimiento = resultSet.getString("fechaNacimiento");
			numeroPolera = resultSet.getInt("numeroPolera");
			sueldo = resultSet.getDouble("sueldo");
			nacionalidad = resultSet.getString("nacionalidad");
			altura = resultSet.getDouble("altura");
			peso = resultSet.getDouble("peso");
			pieHabil = resultSet.getString("pieHabil");
			jugador = new Jugador(codigo, codigoEquipo, DNI, nombreCompleto, fechaNacimiento, numeroPolera, sueldo, nacionalidad, altura, peso, pieHabil);
		} else {
			throw new NoExisteJugador();
		}

		System.out.println(jugador);
		Menu.menuModificar(scanner, jugador);

		sql = "update jugador set codigoEquipo = ?, DNI = ?, nombreCompleto = ?, fechaNacimiento = ?, numeroPolera=?, sueldo=?, nacionalidad=?, altura=?, peso=?, pieHabil=?  where codigoJugador = ?";

		conexion.consulta(sql);
		conexion.getSentencia().setInt(1, jugador.getCodigoEquipo());
		conexion.getSentencia().setInt(2, jugador.getDNI());
		conexion.getSentencia().setString(3, jugador.getNombreCompleto());
		conexion.getSentencia().setString(4, jugador.getFechaNacimiento());
		conexion.getSentencia().setInt(5, jugador.getNumeroPolera());
		conexion.getSentencia().setDouble(6, jugador.getSueldo());
		conexion.getSentencia().setString(7, jugador.getNacionalidad());
		conexion.getSentencia().setDouble(8, jugador.getAltura());
		conexion.getSentencia().setDouble(9, jugador.getPeso());
		conexion.getSentencia().setString(10, jugador.getPieHabil());
		conexion.modificacion();
	}
	
	public void list() throws SQLException {
		Jugador jugador;
		String sql = "select * from jugador ";
		conexion.consulta(sql);
		java.sql.ResultSet resultSet = conexion.resultado();
		while (resultSet.next()) {
			jugador = new Jugador(resultSet.getInt("codigoJugador"), resultSet.getInt("codigoEquipo"), resultSet.getInt("DNI"),
					resultSet.getString("NombreCompleto"), resultSet.getString("fechaNacimineto"), resultSet.getInt("numeroPolera"),
					resultSet.getDouble("sueldo"), resultSet.getString("nacionalidad"), resultSet.getDouble("altura"),
					resultSet.getDouble("peso"), resultSet.getString("pieHabil"));
			System.out.println(jugador);
		}
		
	}
	

}
