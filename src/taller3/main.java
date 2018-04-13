package taller3;
import ucn.*;
import java.io.IOException;


import ucn.*;

public class main {
		
public static void main(String[] args) throws IOException {
		SistemaProducto s = new SistemaProductoImpl();
		ListaProducto listaProducto = new ListaProducto(999999);
		ListaCliente listaCliente = new ListaCliente(999999);
		leerInventario(listaProducto);
		menu(listaProducto,s,listaCliente);
	
	
		 
	
	}

/**
 * Menu principal del programa
 * @param listaProducto
 * @param s
 * @param listaCliente
 */
	public static void menu(ListaProducto listaProducto,SistemaProducto s,ListaCliente listaCliente){
		boolean menu = true;
		StdOut.println("Bienvenido a la base de datos de Calabozo De Androides");
		while(menu){
		StdOut.println("Menu Principal: ");
			StdOut.println(
					"1.-Ingresar Producto\n2.-Editar Stock\n3.-Ordenar Lista\n4.-Invertir Lista\n5.-Eliminar Producto\n6.-Sublista\n7.-Realizar Ventar De La Tienda\n8.-Ver Compras De Un Cliente\n9.-Salir");
			StdOut.println("Escriba el numero de la opcion que desee y presione enter:");
			String opcion = StdIn.readString() + StdIn.readLine();
			try {
				Integer.parseInt(opcion);
			} catch (NumberFormatException ex) {
				StdOut.println("Error,No escribio un numero, Escoja una numero entre 1 y 9 porfavor");
				continue;
			}
			int opcionDef = Integer.parseInt(opcion);
			if (opcionDef >= 10 || opcionDef <= 0) {
				StdOut.println("Error, Escoja una numero entre 1 y 9 porfavor");
				continue;
			}
			switch (opcionDef) {
			case 1:
				s.ingresarProducto(listaProducto);
				StdOut.println("Volviendo al menu principal...");
				break;
			case 2:	
				editarStock(listaProducto,s);
				
				break;
			case 3:
				listaProducto.Ordenar();
				StdOut.println("Volviendo al menu principal...");
				break;
			case 4:
				listaProducto.invertirLista();
				StdOut.println("Lista invertida!");
				StdOut.println("Volviendo al menu principal...");
				break;
			case 5:
				listaProducto.eliminarProducto(listaProducto);
				StdOut.println("Volviendo al menu principal...");
				break;
			case 6:
				StdOut.println("No se puede usar esta opcion ;c");
				break;
			case 7:
				s.realizarVenta(listaCliente);
				break;
			case 8:
				StdOut.println("No se puede usar esta opcion ;c");
				break;
			case 9:
				StdOut.println("Adios :)");
				return;
			}

		}
	}
	
	/**
	 * Lee el archivo InventarioMazmorra y lo inserta en una lista
	 * @param listaProducto
	 * @throws IOException
	 */
	public static void leerInventario(ListaProducto listaProducto ) throws IOException{
		In arch1 = new In("InventarioMazmorra.txt");
		
		for(int i=0;!arch1.isEmpty();i++){
			int cont=0;
			String[] line = arch1.readLine().split(",");
			
			String Id = line[0];
			String nombre = line[1];
		
			
			
			
			if(line.length == 7){
				
				String autor = line[2];
				String fecha = line[3];
				String notas = line[4];
				int precio = Integer.parseInt(line[5]);
				int stock = Integer.parseInt(line[6]);
				
				Producto comic = new Comic(Id,nombre,autor,fecha,notas,precio,stock);
				listaProducto.agregarArch(comic);
				
				
				
			} 
			
		
			
			if(line.length == 6){
				if(!line[2].equalsIgnoreCase("Normal") || !line[2].equalsIgnoreCase("Nendoroid")){
					String posicion = line[2];
					String rareza = line[3];
					int precio = Integer.parseInt(line[4]);
					int stock = Integer.parseInt(line[5]);
					Producto tarjeta = new TarjetaBaseball(Id,nombre,posicion,rareza,precio,stock);
					listaProducto.agregarArch(tarjeta);
				
				}else{
					String tipo = line[2];
					String edicion = line[3];
					int precio = Integer.parseInt(line[4]);
					int stock = Integer.parseInt(line[5]);
					Producto figura = new FiguraColeccionable(Id,nombre,tipo,edicion,precio,stock);
					listaProducto.agregarArch(figura);
					
				}
			}
			
			if(line.length == 5){
				String talla = line[2];
				int precio = Integer.parseInt(line[3]);
				int stock = Integer.parseInt(line[4]);
				Producto polera = new Polera(Id,nombre,talla,precio,stock);
				listaProducto.agregarArch(polera);
			}
		}
		arch1.close();
	}
	
	/**
	 * Subprograma que ayuda al editar stock
	 * @param listaProducto
	 * @param s
	 */
	public static void editarStock(ListaProducto listaProducto,SistemaProducto s){
		boolean x = true;
		StdOut.println("A elegido la opcion editar Stock");
		String id = "null";
		
		StdOut.println("Ingrese la id del producto a editar(Escriba salir para salir):");
  		 while (x) {
  			 id = StdIn.readString() + StdIn.readLine();
  			 try {
  				 Integer.parseInt(id);
  				 StdOut.println("Error, escribio un numero");
  				StdOut.println("Ingrese la id del producto a editar:");
  				 continue;

  			 } catch (NumberFormatException ex) {
  				 if(id.equalsIgnoreCase("salir")){
  					 StdOut.println("Volviendo al menu principal...");
  					 return;
  				 }
  				 boolean verificar = listaProducto.buscarProductoPorId(id);
  				 if(verificar == true){
  					
  					StdOut.println("Id encontrada!");
  					
  					break;
  				 }else{
  					 StdOut.println("No se a encontrado la id");
  					StdOut.println("Ingrese la id del producto a editar:");
  					continue;
  				 }
  			 }
  		 } // Fin del while que valida la id
  	
  		 StdOut.println("Ingrese el nuevo stock del producto a editar");
  		String aux2;
  		int stock = 0;
    	while(x){
        	aux2 = StdIn.readString() + StdIn.readLine();
        	try {
            	stock = Integer.parseInt(aux2);
            	if(stock <0){
                	StdOut.println("Escriba un numero positivo porfavor");
                	StdOut.println("Ingrese el nuevo stock del producto a editar");
                	continue;
            	}
            	StdOut.println("Stock ingresado!");
            	break;
        	} catch (NumberFormatException ex) {
            	StdOut.println("Error, escriba con numeros porfavor");
            	StdOut.println("Ingrese el nuevo stock del producto a editar");
            	continue;
        	}
    	}//Fin del while que valida el stock
		
		listaProducto.editarStock(stock, id);
		
    	
	}
}
