package taller3;

import ucn.StdIn;
import ucn.StdOut;

public class ListaProducto {
	private Producto[] producto;
	private int cantActual;
	private int max;
	public ListaProducto(int max) {
		producto = new Producto[max];
		this.cantActual = 0;
		this.max = max;
	}
	public Producto[] getProducto() {
		return producto;
	}
	public void setProducto(Producto[] producto) {
		this.producto = producto;
	}
	public int getCantActual() {
		return cantActual;
	}
	public void setCantActual(int cantActual) {
		this.cantActual = cantActual;
	}
	public int getMax() {
		return max;
	}
	public void setMax(int max) {
		this.max = max;
	}
	public boolean agregarArch(Producto producto){
		if(this.cantActual >= max){
			return false;
		}
		
		this.producto[this.cantActual]= producto;
		this.cantActual++;
		return true;
	}
	
	public void Ordenar(){
		boolean menu = true;
		StdOut.println("Usted a escogido la opcion ordenar lista");
		while(menu){
		StdOut.println("Elija de que forma quiere ordenar la lista");
			StdOut.println(
					"1.-Por Id\n2.-Por nombre(alfabetico)\n3.-Por precio(de menor a mayor)\n4.-Salir");
			StdOut.println("Escriba el numero de la opcion que desee y presione enter:");
			String opcion = StdIn.readString() + StdIn.readLine();
			try {
				Integer.parseInt(opcion);
			} catch (NumberFormatException ex) {
				StdOut.println("Error,No escribio un numero, Escoja una numero entre 1 y 4 porfavor");
				continue;
			}
			int opcionDef = Integer.parseInt(opcion);
			if (opcionDef >= 5 || opcionDef <= 0) {
				StdOut.println("Error, Escoja una numero entre 1 y 4 porfavor");
				continue;
			}
			switch (opcionDef) {
			case 1:
				Producto aux;	
				for(int i =0; i < this.cantActual-1; i++){
					for(int j=i; j< this.cantActual;j++){
						if(this.producto[i].getId().compareTo(this.producto[j].getId())>0){
							aux = this.producto[i];
							this.producto[i] = this.producto[j];
							this.producto[j] = aux;
							
						}
					}
				}
				StdOut.println("Se a ordenado la lista segun la id");
				return;
			case 2:
				
				  
					for(int i =0; i < this.cantActual-1; i++){
						for(int j=i; j< this.cantActual;j++){
							if(this.producto[i].getNombre().compareTo(this.producto[j].getNombre())>0){
								aux = this.producto[i];
								this.producto[i] = this.producto[j];
								this.producto[j] = aux;
								
							}
						}
					}
					
					StdOut.println("Se a ordenado la lista segun el nombre");
				return;
			case 3:
					
				for(int i =0; i < this.cantActual-1; i++){
					for(int j=i; j< this.cantActual;j++){
						if(this.producto[i].getPrecio() > this.producto[j].getPrecio()){
							aux = this.producto[i];
							this.producto[i] = this.producto[j];
							this.producto[j] = aux;
							
						}
					}
				}
				StdOut.println("Se a ordenado la lista segun el precio");
				return;
			case 4:
				
				return;
		
			}

		}
	}
	
	
	public void invertirLista(){
		Producto aux;
		for(int i =0;i<this.cantActual/2;i++){
			aux = this.producto[i];
			this.producto[i] = this.producto[this.cantActual-1-i];
			this.producto[this.cantActual-1-i] = aux;
			
		}
		
	}
	public Producto obtenerProducto(int i){
		StdOut.println(i);
		return producto[i];
		
	}
	public boolean buscarProductoPorId(String id){
		for(int i=0;i<this.cantActual;i++){
			if(this.producto[i].getId().equalsIgnoreCase(id)){
				return true;
			}
		}
		return false;
	}
	
	
	public void editarStock(int Stock,String id) {
			

		for(int i=0;i<this.cantActual;i++){	
			if(this.producto[i].getId().equalsIgnoreCase(id)){
				if(Stock < this.producto[i].getStock()){
					StdOut.println("Error de autorizacion, ingreso un stock menor al actual");
					StdOut.println("Volviendo al menu principal...");
					return;
				}
					
				this.producto[i].setStock(Stock);
				
				
			}
		}
	
	}
	public void eliminarProducto(ListaProducto producto) {
		
		StdOut.println("Ingrese la ID del producto que desea eliminar: ");
		String id = StdIn.readString() + StdIn.readLine();
		int i;
		for (i = 0; i < this.cantActual; i++) {
			if (this.producto[i].getId().equalsIgnoreCase(id)) {
				for (int j = i; j < this.cantActual - 1; j++) {
					this.producto[j] = this.producto[j + 1];
				}
				this.cantActual--;
			}
			
		}
		StdOut.println("Ahora hay " + this.getCantActual() + " productos en la lista");

	}
}
