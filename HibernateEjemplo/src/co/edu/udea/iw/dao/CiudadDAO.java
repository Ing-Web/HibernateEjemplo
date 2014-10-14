package co.edu.udea.iw.dao;

import java.util.List;

import co.edu.udea.iw.dto.Ciudad;
import co.edu.udea.iw.exception.IWDaoException;

/**
 * Interface que define los metodos que va a proveer el dao de ciudad
 * 
 * @author Hernán Darío Velásquez - hernanudea@gmail.com
 * 
 */

public interface CiudadDAO {

	/**
	 * entrga la lista de ciudades existentes en la base de datos
	 * 
	 * @return lista de ciudades
	 * @throws IWDaoException
	 *             Ocurre un error con la conexion
	 */

	public List<Ciudad> obtener() throws IWDaoException;

	/**
	 * Entrega los datos de una ciudad dado su codigo
	 * 
	 * @param codigo
	 *            codigo de la ciudad a consultar
	 * @return una instancia de los datps de la ciudad obtenida, si no existe
	 *         uan ciudad con el codigo dado retorna null
	 * @throws IWDaoEXception
	 *             ocurre un error con la base de datos
	 */
	public Ciudad obtener(Integer codigo) throws IWDaoException;

}
