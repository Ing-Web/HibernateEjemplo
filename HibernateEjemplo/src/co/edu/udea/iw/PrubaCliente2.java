package co.edu.udea.iw;

import java.util.List;

import co.edu.udea.iw.dao.ClienteDAO;
import co.edu.udea.iw.dao.hibernate.ClienteDAOHibernate;
import co.edu.udea.iw.dto.Cliente;
import co.edu.udea.iw.exception.IWDaoException;

public class PrubaCliente2 {

	public static void main(String[] args) {
		ClienteDAO clienteDAO = null;
		try {
			clienteDAO = new ClienteDAOHibernate();

			List<Cliente> clientes = clienteDAO.obtener();
			for (Cliente cliente : clientes) {
				System.out.println("Identificacion: " + cliente.getCedula());
				System.out.println("Nombres: " + cliente.getNombres() + " "
						+ cliente.getApellidos());
				System.out.println("Nombre Usuario Crea: "
						+ cliente.getUsuarioCrea().getNombres() + " "
						+ cliente.getUsuarioCrea().getApellidos());
				System.out.println("Rol Usuario Crea: "
						+ cliente.getUsuarioCrea().getRol().getNombre());
			}
		} catch (IWDaoException e) {
			System.out.println(e.getMessage());
		}

	}

}
