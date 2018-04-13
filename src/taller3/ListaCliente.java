package taller3;

public class ListaCliente {
	private Cliente[] cliente;
	private int cantActual;
	private int Max;
	/**
	 * Constructor de la clase
	 * @param max
	 */
	public ListaCliente(int max) {
		cliente = new Cliente[max];
		Max = max;
		this.cantActual = 0;
	}
	/**
	 * @return the cliente
	 */
	public Cliente[] getCliente() {
		return cliente;
	}
	/**
	 * @param cliente the cliente to set
	 */
	public void setCliente(Cliente[] cliente) {
		this.cliente = cliente;
	}
	/**
	 * @return the cantActual
	 */
	public int getCantActual() {
		return cantActual;
	}
	/**
	 * @param cantActual the cantActual to set
	 */
	public void setCantActual(int cantActual) {
		this.cantActual = cantActual;
	}
	/**
	 * @return the max
	 */
	public int getMax() {
		return Max;
	}
	/**
	 * @param max the max to set
	 */
	public void setMax(int max) {
		Max = max;
	}
	
	/**
	 * Metodo para agregar un cliente a la lista
	 * @param cliente
	 * @return
	 */
	public boolean agregarCliente(Cliente cliente){
		if(this.cantActual >= Max){
			return false;
		}
		
		this.cliente[this.cantActual]= cliente;
		this.cantActual++;
		return true;
	}
}
