package cambio.view;

import java.sql.SQLException;
import java.util.Scanner;

import cambio.entity.Cambio;
import cambio.entity.NoExisteCambio;
import control.Conexion;
import jugador.entity.NoExisteJugador;
import partido.entity.NoExistePartido;
import view.InputTypes;

public class CambiosIO {

	private Conexion conexion;
	private Scanner scanner;

	public CambiosIO(Conexion conexion, Scanner scanner) {
		this.conexion = conexion;
		this.scanner = scanner;
	}
	
	public void add() throws NoExistePartido, NoExisteJugador {
		Cambio cambio = CambioIO.ingresar(scanner);
		String sql = "Insert into Cambio (codigoJugador, codigoPartido, minuto) values(?,?,?)";
		try {
			conexion.consulta(sql);
			conexion.getSentencia().setInt(1, cambio.getCodigoJugador());
			conexion.getSentencia().setInt(2, cambio.getCodigoPartido());
			conexion.getSentencia().setInt(3, cambio.getMinuto());
			conexion.modificacion();
		} catch (SQLException e) {
			throw new NoExistePartido();
		}
	}
	public void delete() {
		int codigoCambio = InputTypes.readInt("Código del cambio: ", scanner);
		String sql = "delete from cambio where codigoCambio = ?";
		try {
			conexion.consulta(sql);
			conexion.getSentencia().setInt(1, codigoCambio);
			conexion.modificacion();
		} catch (SQLException e) {
			System.out.println(e.getSQLState());
		}
	}
	
	public void update() throws NoExisteCambio, SQLException, NoExistePartido, NoExisteJugador {
		java.sql.ResultSet resultSet;
		Cambio cambio;
		int codigoJugador;
		int codigoPartido;
		int minuto;
		int codigo;
		int codigoCambio = InputTypes.readInt("Código del cambio: ", scanner);
		String sql = "select * from cambio where codigoCambio = ?";
		conexion.consulta(sql);
		conexion.getSentencia().setInt(1, codigoCambio);
		resultSet = conexion.resultado();
		if (resultSet.next()) {
			codigo = resultSet.getInt("codigoCambio");
			codigoJugador = resultSet.getInt("codigoJugador");
			codigoPartido = resultSet.getInt("codigoPartido");
			minuto = resultSet.getInt("minuto");
			cambio = new Cambio(codigo, codigoJugador, codigoPartido, minuto);
		} else {
			throw new NoExisteCambio();
		}

		System.out.println(cambio);
		Menu.menuModificar(scanner, cambio);

		sql = "update cambio set codigoJugador = ?, codigoPartido = ?, minuto = ?  where codigoCambio = ?";

		conexion.consulta(sql);
		conexion.getSentencia().setInt(1, cambio.getCodigoJugador());
		conexion.getSentencia().setInt(2, cambio.getCodigoPartido());
		conexion.getSentencia().setInt(3, cambio.getMinuto());
		conexion.modificacion();
	}
	
	public void list() throws SQLException {
		Cambio cambio;
		String sql = "select * from cambio ";
		conexion.consulta(sql);
		java.sql.ResultSet resultSet = conexion.resultado();
		while (resultSet.next()) {
			cambio = new Cambio(resultSet.getInt("codigoCambio"), resultSet.getInt("codigoJugador"), resultSet.getInt("codigoPartido"),
					resultSet.getInt("minuto"));
			System.out.println(cambio);
		}
		
	}
	
}
