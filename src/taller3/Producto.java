package taller3;
public abstract class Producto {
	private String id;
	private String nombre;
	private int precio;
	private int stock;
	/**
	 * Constructor de la clase
	 * @param id
	 * @param nombre
	 * @param precio
	 * @param stock
	 */
	public Producto(String id, String nombre, int precio, int stock) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.precio = precio;
		this.stock = stock;
	}
	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
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
	 * @return the precio
	 */
	public int getPrecio() {
		return precio;
	}
	/**
	 * @param precio the precio to set
	 */
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	/**
	 * @return the stock
	 */
	public int getStock() {
		return stock;
	}
	/**
	 * @param stock the stock to set
	 */
	public void setStock(int stock) {
		this.stock = stock;
	}

	
}
