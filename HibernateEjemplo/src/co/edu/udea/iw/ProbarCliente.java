package co.edu.udea.iw;

import java.util.Date;

import co.edu.udea.iw.dao.ClienteDAO;
import co.edu.udea.iw.dao.hibernate.ClienteDAOHibernate;
import co.edu.udea.iw.dto.Cliente;
import co.edu.udea.iw.exception.IWDaoException;

public class ProbarCliente {

	public static void main(String[] args) {

		ClienteDAO dao = new ClienteDAOHibernate();

		try {
			Cliente cliente = new Cliente();

			cliente.setCedula("15264970");
			cliente.setApellidos("Velasquez");
			cliente.setNombres("Hernan");
			cliente.setCorreoelectronico("hernandvo@gmail.com");
			cliente.setUsuarioCrea("elver");
			cliente.setFechaCreacion(new Date());

			System.out.println("antes de insertar");
			dao.insertar(cliente);
			System.out.println("antes de guardar");

		} catch (IWDaoException e) {
			e.getStackTrace();
			System.out.println("Error: " + e.getMessage());

		}
	}
}
