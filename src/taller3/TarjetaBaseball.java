package taller3;
public class TarjetaBaseball extends Producto{
	private String posicion;
	private String rareza;
	
	/**
	 * Constructor de la clase
	 * @param id
	 * @param nombres
	 * @param posicion
	 * @param rareza
	 * @param precio
	 * @param stock
	 */
	public TarjetaBaseball(String id, String nombres, String posicion, String rareza, int precio, int stock) {
		super(id, nombres, precio, stock);
		this.posicion = posicion;
		this.rareza = rareza;
	}

	/**
	 * @return the posicion
	 */
	public String getPosicion() {
		return posicion;
	}

	/**
	 * @param posicion the posicion to set
	 */
	public void setPosicion(String posicion) {
		this.posicion = posicion;
	}

	/**
	 * @return the rareza
	 */
	public String getRareza() {
		return rareza;
	}

	/**
	 * @param rareza the rareza to set
	 */
	public void setRareza(String rareza) {
		this.rareza = rareza;
	}
	
	
	

	
	
	

}
