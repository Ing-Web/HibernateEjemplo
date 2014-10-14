package co.edu.udea.iw.dto;

import java.io.Serializable;
import java.util.Date;

public class Cliente implements Serializable {
	/**
	 * Cedula del cliente
	 */
	private String cedula;

	/**
	 * Nombre del cliente
	 */
	private String nombres;

	/**
	 * Apellidos completos del cliente
	 */
	private String apellidos;

	/**
	 * Direcci�n de correo electronico del cliente
	 */
	private String correoelectronico;

	/**
	 * Referencia del usuario del sistema que crea el cliente
	 */
	private String usuarioCrea;

	/**
	 * Fecha de creacion del cliente en el sistema
	 */
	private Date fechaCreacion;

	/**
	 * Referencia del usuario que modifica los datos del cliente en el sistema
	 */

	private String usuarioModifica;

	/**
	 * Fecha en la que realiza la ultima modificacion al cliente
	 */
	private Date fechaModificacion;

	/**
	 * Determina si el cliente est� o no eliminado en el sistema. No se realiza
	 * borrado fisico, sino logico.
	 */
	private Boolean eliminado;

	/**
	 * Referencia del usuario que elimina los datos del cliente en el sistema
	 */
	private String usuarioElimina;

	/**
	 * Fecha de eliminacion del cliente en el sistema
	 */
	private Date fechaEliminacion;

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getCorreoelectronico() {
		return correoelectronico;
	}

	public void setCorreoelectronico(String correoelectronico) {
		this.correoelectronico = correoelectronico;
	}

	public String getUsuarioCrea() {
		return usuarioCrea;
	}

	public void setUsuarioCrea(String usuarioCrea) {
		this.usuarioCrea = usuarioCrea;
	}

	public Date getFechaCreacion() {
		return fechaCreacion;
	}

	public void setFechaCreacion(Date fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}

	public String getUsuarioModifica() {
		return usuarioModifica;
	}

	public void setUsuarioModifica(String usuarioModifica) {
		this.usuarioModifica = usuarioModifica;
	}

	public Date getFechaModificacion() {
		return fechaModificacion;
	}

	public void setFechaModificacion(Date fechaModificacion) {
		this.fechaModificacion = fechaModificacion;
	}

	public Boolean getEliminado() {
		return eliminado;
	}

	public void setEliminado(Boolean eliminado) {
		this.eliminado = eliminado;
	}

	public String getUsuarioElimina() {
		return usuarioElimina;
	}

	public void setUsuarioElimina(String usuarioElimina) {
		this.usuarioElimina = usuarioElimina;
	}

	public Date getFechaEliminacion() {
		return fechaEliminacion;
	}

	public void setFechaEliminacion(Date fechaEliminacion) {
		this.fechaEliminacion = fechaEliminacion;
	}

}
