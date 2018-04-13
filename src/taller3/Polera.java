package taller3;
public class Polera extends Producto{
	private String talla;
	
	/**
	 * Constructor de la clase
	 * @param id
	 * @param nombres
	 * @param talla
	 * @param precio
	 * @param stock
	 */
	public Polera(String id, String nombres, String talla, int precio,int stock) {
		super(id, nombres, precio, stock);
		this.talla = talla;
	}

	/**
	 * @return the talla
	 */
	public String getTalla() {
		return talla;
	}

	/**
	 * @param talla the talla to set
	 */
	public void setTalla(String talla) {
		this.talla = talla;
	}


	

}
