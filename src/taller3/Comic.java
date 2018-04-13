package taller3;
public class Comic extends Producto {

	private String autor;
	private String fecha;
	private String notas;
	/**
	 * Constructor de la clase
	 * @param id
	 * @param nombre
	 * @param autor
	 * @param fecha
	 * @param notas
	 * @param precio
	 * @param stock
	 */
	public Comic(String id, String nombre, String autor, String fecha, String notas, int precio, int stock) {
		super(id, nombre, precio, stock);
		this.autor = autor;
		this.fecha = fecha;
		this.notas = notas;

	}
	/**
	 * @return the autor
	 */
	public String getAutor() {
		return autor;
	}
	/**
	 * @param autor the autor to set
	 */
	public void setAutor(String autor) {
		this.autor = autor;
	}
	/**
	 * @return the fecha
	 */
	public String getFecha() {
		return fecha;
	}
	/**
	 * @param fecha the fecha to set
	 */
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	/**
	 * @return the notas
	 */
	public String getNotas() {
		return notas;
	}
	/**
	 * @param notas the notas to set
	 */
	public void setNotas(String notas) {
		this.notas = notas;
	}

	
}