package taller3;
public class FiguraColeccionable extends Producto {
	private String tipo;
	private String edicion;
	/**
	 * Constructor de la clase
	 * @param id
	 * @param nombres
	 * @param tipo
	 * @param edicion
	 * @param precio
	 * @param stock
	 */
	public FiguraColeccionable(String id, String nombres, String tipo, String edicion, int precio, int stock) {
		super(id, nombres, precio, stock);
		this.tipo = tipo;
		this.edicion = edicion;
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
	/**
	 * @return the edicion
	 */
	public String getEdicion() {
		return edicion;
	}
	/**
	 * @param edicion the edicion to set
	 */
	public void setEdicion(String edicion) {
		this.edicion = edicion;
	}
	
	
	
	
}
