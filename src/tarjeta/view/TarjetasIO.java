package tarjeta.view;

import java.sql.SQLException;
import java.util.Scanner;

import control.Conexion;
import equipo.entity.NoExisteEquipo;
import jugador.entity.NoExisteJugador;
import partido.entity.NoExistePartido;
import tarjeta.entity.NoExisteTarjeta;
import tarjeta.entity.Tarjeta;
import view.InputTypes;

public class TarjetasIO {

	private Conexion conexion;
	private Scanner scanner;

	public TarjetasIO(Conexion conexion, Scanner scanner) {
		this.conexion = conexion;
		this.scanner = scanner;
	}
	
	public void add() throws NoExisteJugador, NoExistePartido {
		Tarjeta tarjeta = TarjetaIO.ingresar(scanner);
		String sql =  "Insert into Tarjeta (codigoJugador, codigoPartido, tipo, montoMulta, minuto) values(?,?,?,?,?)";
			try {
			conexion.consulta(sql);
			conexion.getSentencia().setInt(1, tarjeta.getCodigoJugador());
			conexion.getSentencia().setInt(2, tarjeta.getCodigoPartido());
			conexion.getSentencia().setString(3, tarjeta.getTipo());
			conexion.getSentencia().setDouble(4, tarjeta.getMontoMulta());
			conexion.getSentencia().setInt(5, tarjeta.getMinuto());
			conexion.modificacion();
			}catch (SQLException e) {
				throw new NoExisteJugador();
				throw new NoExisteEquipo();
			}
	}
	public void delete() {
		int codigoTarjeta = InputTypes.readInt("Código de la tarjeta: ", scanner);
		String sql = "delete from tarjeta where codigoTarjeta = ?";
		try {
			conexion.consulta(sql);
			conexion.getSentencia().setInt(1, codigoTarjeta);
			conexion.modificacion();
		} catch (SQLException e) {
			System.out.println(e.getSQLState());
		}
	}
	
	public void update() throws NoExisteTarjeta, SQLException, NoExisteJugador, NoExistePartido {
		java.sql.ResultSet resultSet;
		Tarjeta tarjeta;
		int codigoJugador;
		int codigoPartido;
		String tipo;
		double montoMulta;
		int minuto;
		int codigo;
		int codigoTarjeta = InputTypes.readInt("Código de la tarjeta: ", scanner);
		String sql = "select * from tarjeta where codigoTarjeta = ?";
		conexion.consulta(sql);
		conexion.getSentencia().setInt(1, codigoTarjeta);
		resultSet = conexion.resultado();
		if (resultSet.next()) {
			codigo = resultSet.getInt("codigoTarjeta");
			codigoJugador = resultSet.getInt("codigoJugador");
			codigoPartido = resultSet.getInt("codigoPartido");
			tipo = resultSet.getString("tipo");
			montoMulta = resultSet.getDouble("montoMulta");
			minuto = resultSet.getInt("minuto");
			tarjeta = new Tarjeta(codigo, codigoJugador, codigoPartido, tipo, montoMulta, minuto);
		} else {
			throw new NoExistePartido();
		}

		System.out.println(tarjeta);
		Menu.menuModificar(scanner, tarjeta);

		sql = "update tarjeta set codigoJugador = ?, codigoPartido = ?, tipo = ?, montoMulta = ?, minuto=? where codigoTarjeta = ?";

		conexion.consulta(sql);
		conexion.getSentencia().setInt(1, tarjeta.getCodigoJugador());
		conexion.getSentencia().setInt(2, tarjeta.getCodigoPartido());
		conexion.getSentencia().setString(3, tarjeta.getTipo());
		conexion.getSentencia().setDouble(4, tarjeta.getMontoMulta());
		conexion.getSentencia().setInt(5, tarjeta.getMinuto());
		conexion.modificacion();
	}
	
	public void list() throws SQLException {
		Tarjeta tarjeta;
		String sql = "select * from tarjeta ";
		conexion.consulta(sql);
		java.sql.ResultSet resultSet = conexion.resultado();
		while (resultSet.next()) {
			tarjeta = new Tarjeta(resultSet.getInt("codigoTarjeta"), resultSet.getInt("codigoJugador"),resultSet.getInt("codigoPartido"),
					resultSet.getString("tipo"),resultSet.getDouble("montoMulto"), resultSet.getInt("minuto"));
			System.out.println(tarjeta);
		}
		
	}
	

}
