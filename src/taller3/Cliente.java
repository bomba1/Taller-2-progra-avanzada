package taller3;

public class Cliente {
	private String rut;
	private String nombre;
	private String apellido;
	private String formaDePago;
	private String tipo;
	/**
	 * @param rut
	 * @param nombre
	 * @param apellido
	 * @param formaDePago
	 * @param tipo
	 */
	public Cliente(String rut, String nombre, String apellido, String formaDePago, String tipo) {
		this.rut = rut;
		this.nombre = nombre;
		this.apellido = apellido;
		this.formaDePago = formaDePago;
		this.tipo = tipo;
	}
	/**
	 * @return the rut
	 */
	public String getRut() {
		return rut;
	}
	/**
	 * @param rut the rut to set
	 */
	public void setRut(String rut) {
		this.rut = rut;
	}
	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}
	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/**
	 * @return the apellido
	 */
	public String getApellido() {
		return apellido;
	}
	/**
	 * @param apellido the apellido to set
	 */
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	/**
	 * @return the formaDePago
	 */
	public String getFormaDePago() {
		return formaDePago;
	}
	/**
	 * @param formaDePago the formaDePago to set
	 */
	public void setFormaDePago(String formaDePago) {
		this.formaDePago = formaDePago;
	}
	/**
	 * @return the tipo
	 */
	public String getTipo() {
		return tipo;
	}
	/**
	 * @param tipo the tipo to set
	 */
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	

}
