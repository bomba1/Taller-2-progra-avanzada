package taller3;
import ucn.*;
public class SistemaProductoImpl implements SistemaProducto {
	private ListaProducto listaProducto;
	private ListaCliente listaCliente;
	/**
	 * Constructor de la clase
	 */
	public SistemaProductoImpl(){
		listaProducto = new ListaProducto(99999);
		listaCliente = new ListaCliente(99999);
	}
	
	

	
	@Override
	/**
	 * Metodo que ingresa el producto a la lista
	 */
    public void ingresarProducto(ListaProducto listaProducto) {
   	 boolean x = true;
   	 boolean ingresarProducto = true;
   	 StdOut.println(
   			 "Ingrese un tipo de producto...\nComic(1)\nTarjeta de Baseball(2)\nFigura Coleccionable(3)\nPolera(4)");
   	 String prod = StdIn.readString();
   	 while (ingresarProducto) {
   		 switch (prod) {
   		 case "1":

   			 String nombrecomic = "null";
   			 String autor = "null";
   			 String fecha = "null";
   			 String nota = "null";
   			 int precio = 0;
   			 int stock = 0;

   			 StdOut.println("Ingrese el nombre del comic");
   			 while (x) {
   				 nombrecomic = StdIn.readString() + StdIn.readLine();
   				 try {
   					 Integer.parseInt(nombrecomic);
   					 StdOut.println("Error, escribio un numero");
   					 StdOut.println("Ingrese el nombre del comic");
   					 continue;

   				 } catch (NumberFormatException ex) {
   					 StdOut.println("Nombre Ingresado!");
   					 break;
   				 }
   			 } // Fin del while que valida al nombre

   			 StdOut.println("Ingrese el nombre del autor");
   			 while (x) {
   				 autor = StdIn.readString() + StdIn.readLine();
   				 try {
   					 Integer.parseInt(autor);
   					 StdOut.println("Error, escribio un numero");
   					 StdOut.println("Ingrese el nombre del autor");
   					 continue;

   				 } catch (NumberFormatException ex) {
   					 StdOut.println("Autor Ingresado!");
   					 break;
   				 }
   			 } // Fin del while que valida al autor

   			 StdOut.println("Ingrese la fecha de publicacion(ej: 20-04-1942)");
   			 fecha = StdIn.readString() + StdIn.readLine();

   			 StdOut.println("Ingrese notas al respecto");
   			 while (x) {
   				 nota = StdIn.readString() + StdIn.readLine();
   				 try {
   					 Integer.parseInt(nota);
   					 StdOut.println("Error, escribio un numero");
   					 StdOut.println("Ingrese notas al respecto");
   					 continue;

   				 } catch (NumberFormatException ex) {
   					 StdOut.println("Notas Ingresadas!");
   					 break;
   				 }
   			 } // Fin del while que valida las notas

   			 StdOut.println("Ingrese el precio");
   			 String aux2;
   			 while (x) {
   				 aux2 = StdIn.readString() + StdIn.readLine();
   				 try {
   					 precio = Integer.parseInt(aux2);
   					 if (precio <= 0) {
   						 StdOut.println("Escriba un numero positivo mayor que 0 porfavor");
   						 StdOut.println("Ingrese el precio");
   						 continue;
   					 }
   					 StdOut.println("Precio ingresado!");
   					 break;
   				 } catch (NumberFormatException ex) {
   					 StdOut.println("Error, escriba con numeros porfavor");
   					 StdOut.println("Ingrese el precio");
   					 continue;
   				 }
   			 } // Fin del while que valida el precio

   			 StdOut.println("Ingrese el stock");
   			 String aux;
   			 while (x) {
   				 aux = StdIn.readString() + StdIn.readLine();
   				 try {
   					 stock = Integer.parseInt(aux);
   					 if (stock <= 0) {
   						 StdOut.println("Escriba un numero positivo mayor que 0 porfavor");
   						 StdOut.println("Ingrese el stock");
   						 continue;
   					 }
   					 StdOut.println("Stock ingresado!");
   					 break;
   				 } catch (NumberFormatException ex) {
   					 StdOut.println("Error, escriba con numeros porfavor");
   					 StdOut.println("Ingrese el stock");
   					 continue;
   				 }
   			 } // Fin del while que valida el stock

   			 int contacomic = listaProducto.getCantActual();

   			 String idcom = "CO_000" + contacomic;

   			 if (contacomic == 9 || (contacomic >= 10 && contacomic < 99)) {
   				 idcom = idcom.substring(0, idcom.length() - 1);
   				 idcom = "CO_000" + contacomic;

   				 int newidcom = contacomic + 1;
   				 idcom = "CO_00" + newidcom;
   				 StdOut.println("La id del comic ingresado es: " + idcom);
   				 // stdout de arribita va hacer CO_0010
   				 // CASO DE 999 A 1000
   			 }

   			 contacomic = listaProducto.getCantActual();

   			 idcom = "CO_00" + contacomic;
   			 if (contacomic == 99 || (contacomic >= 100 && contacomic < 999)) {
   				 idcom = "CO_00" + contacomic;
   				 idcom = idcom.substring(0, idcom.length() - 2);

   				 int newidcom = contacomic + 1;
   				 idcom = "CO_0" + newidcom;
   				 StdOut.println("La id del comic ingresado es: " + idcom);
   				 // caso de 99 a 100

   			 }
   			 contacomic = listaProducto.getCantActual();

   			 idcom = "CO_0" + contacomic;
   			 if (contacomic == 999 || (contacomic == 1000 && contacomic < 9999)) {
   				 idcom = idcom.substring(0, idcom.length() - 3);
   				 idcom = "CO_0" + contacomic;

   				 int newidcom = contacomic + 1;
   				 idcom = "CO_" + newidcom;
   				 StdOut.println("La id del comic ingresado es:" + idcom);
   				 // caso de 999 a 1000

   			 }

   			 Producto Comic = new Comic(idcom, nombrecomic, autor, fecha, nota, precio, stock);
   			 listaProducto.agregarArch(Comic);
   			 
   			 return;
   			 
   			 

   		 case "2":
   			 String jugador = "null";
   			 String posicion = "null";
   			 String rareza = "null";
   			 int preciotarj = 0;
   			 int stocktarj = 0;

   			 StdOut.println("Ingrese el nombre del jugador: ");
   			 while (x) {
   				 jugador = StdIn.readString() + StdIn.readLine();
   				 try {
   					 Integer.parseInt(jugador);
   					 StdOut.println("Error, escribio un numero");
   					 StdOut.println("Ingrese el nombre del jugador: ");
   					 continue;

   				 } catch (NumberFormatException ex) {
   					 StdOut.println("Nombre Ingresado!");
   					 break;
   				 }
   			 } // Fin del while que valida al nombre

   			 StdOut.println("Ingrese la posicion: ");
   			 while (x) {
   				 posicion = StdIn.readString() + StdIn.readLine();
   				 try {
   					 Integer.parseInt(posicion);
   					 StdOut.println("Error, escribio un numero");
   					 StdOut.println("Ingrese la posicion: ");
   					 continue;

   				 } catch (NumberFormatException ex) {
   					 StdOut.println("Posicion Ingresada!");
   					 break;
   				 }
   			 } // Fin del while que valida la posicion

   			 StdOut.println("Ingrese la rareza de la tarjeta: ");
   			 while (x) {
   				 rareza = StdIn.readString() + StdIn.readLine();
   				 try {
   					 Integer.parseInt(rareza);
   					 StdOut.println("Error, escribio un numero");
   					 StdOut.println("Ingrese la rareza de la tarjeta: ");
   					 continue;

   				 } catch (NumberFormatException ex) {
   					 StdOut.println("Rareza Ingresada!");
   					 break;
   				 }
   			 } // Fin del while que valida la rareza

   			 StdOut.println("Ingrese el precio");
   			 while (x) {
   				 aux2 = StdIn.readString() + StdIn.readLine();
   				 try {
   					 preciotarj = Integer.parseInt(aux2);
   					 if (preciotarj <= 0) {
   						 StdOut.println("Escriba un numero positivo mayor que 0 porfavor");
   						 StdOut.println("Ingrese el precio");
   						 continue;
   					 }
   					 StdOut.println("Precio ingresado!");
   					 break;
   				 } catch (NumberFormatException ex) {
   					 StdOut.println("Error, escriba con numeros porfavor");
   					 StdOut.println("Ingrese el precio");
   					 continue;
   				 }
   			 } // Fin del while que valida el precio

   			 StdOut.println("Ingrese el stock");
   			 while (x) {
   				 aux = StdIn.readString() + StdIn.readLine();
   				 try {
   					 stocktarj = Integer.parseInt(aux);
   					 if (stocktarj <= 0) {
   						 StdOut.println("Escriba un numero positivo mayor que 0 porfavor");
   						 StdOut.println("Ingrese el stock");
   						 continue;
   					 }
   					 StdOut.println("Stock ingresado!");
   					 break;
   				 } catch (NumberFormatException ex) {
   					 StdOut.println("Error, escriba con numeros porfavor");
   					 StdOut.println("Ingrese el stock");
   					 continue;
   				 }
   			 } // Fin del while que valida el stock

   			 int contatarj = listaProducto.getCantActual();
   			 String idtarj = "BA_000" + contatarj;

   			 if (contatarj == 9 || (contatarj >= 10 && contatarj < 99)) {
   				 idtarj = idtarj.substring(0, idtarj.length() - 1);
   				 int newidtarj = contatarj + 1;
   				 idtarj = "BA_00" + newidtarj;
   				 StdOut.println("La id de la tarjeta de baseball es: " + idtarj);
   			 }
   			 // caso de 9 a 10
   			 contatarj = listaProducto.getCantActual();
   			 idtarj = "BA_00" + contatarj;

   			 if (contatarj == 99 || (contatarj >= 100 && contatarj < 999)) {
   				 idtarj = idtarj.substring(0, idtarj.length() - 2);
   				 int newidtarj = contatarj + 1;
   				 idtarj = "BA_0" + newidtarj;
   				 StdOut.println("La id de la tarjeta de baseball es: " + idtarj);
   				 // caso de 99 a 100

   			 }
   			 contatarj = listaProducto.getCantActual();
   			 idtarj = "BA_0" + contatarj;

   			 if (contatarj == 999 || (contatarj >= 1000 && contatarj < 9999)) {
   				 idtarj = idtarj.substring(0, idtarj.length() - 3);
   				 int newidtarj = contatarj + 1;
   				 idtarj = "BA_" + newidtarj;
   				 StdOut.println("La id de la tarjeta de baseball es: " + idtarj);
   				 // caso de 999 a 1000

   			 }

   			 Producto Tarjeta = new TarjetaBaseball(idtarj, jugador, posicion, rareza, preciotarj, stocktarj);
   			 listaProducto.agregarArch(Tarjeta);

   			 return;

   		 case "3":
   			 String figura = "null";
   			 String tipo = "null";
   			 String edicion = "null";
   			 int preciofig = 0;
   			 int stockfig = 0;

   			 StdOut.println("Ingrese el nombre de la figura coleccionable: ");
   			 while (x) {
   				 figura = StdIn.readString() + StdIn.readLine();
   				 try {
   					 Integer.parseInt(figura);
   					 StdOut.println("Error, escribio un numero");
   					 StdOut.println("Ingrese una el nombre de la figura coleccionable: ");
   					 continue;

   				 } catch (NumberFormatException ex) {
   					 StdOut.println("Nombre Ingresado!");
   					 break;
   				 }
   			 } // Fin del while que valida al nombre

   			 StdOut.println("Ingrese el tipo de figura (normal o nendoroid): ");
   			 while (x) {
   				 tipo = StdIn.readString() + StdIn.readLine();
   				 try {
   					 Integer.parseInt(tipo);
   					 StdOut.println("Error, escribio un numero");
   					 StdOut.println("Ingrese el tipo de figura (normal o nendoroid): ");
   					 continue;

   				 } catch (NumberFormatException ex) {
   					 if (tipo.equalsIgnoreCase("normal") || tipo.equalsIgnoreCase("nendoroid")) {
   						 StdOut.println("Tipo Ingresado!");
   						 break;

   					 } else {
   						 StdOut.println("Error, el tipo tiene que ser normal o nendoroid");
   						 StdOut.println("Ingrese el tipo de figura (normal o nendoroid): ");
   						 continue;
   					 }

   				 }
   			 } // Fin del while que valida al tipo

   			 StdOut.println("Ingrese la edicion (limitada o no): ");
   			 while (x) {
   				 edicion = StdIn.readString() + StdIn.readLine();
   				 try {
   					 Integer.parseInt(edicion);
   					 StdOut.println("Error, escribio un numero");
   					 StdOut.println("Ingrese la edicion (limitada o no): ");
   					 continue;

   				 } catch (NumberFormatException ex) {
   					 if (edicion.equalsIgnoreCase("limitada") || edicion.equalsIgnoreCase("no")) {
   						 StdOut.println("Edicion Ingresada!");
   						 break;
   					 } else {
   						 StdOut.println("Error, escoja una de las opciones en el parentesis");
   						 StdOut.println("Ingrese la edicion (limitada o no): ");
   						 continue;
   					 }

   				 }
   			 } // Fin del while que valida a la edicion

   			 StdOut.println("Ingrese el precio");
   			 while (x) {
   				 aux2 = StdIn.readString() + StdIn.readLine();
   				 try {
   					 preciofig = Integer.parseInt(aux2);
   					 if (preciofig <= 0) {
   						 StdOut.println("Escriba un numero positivo mayor que 0 porfavor");
   						 StdOut.println("Ingrese el precio");
   						 continue;
   					 }
   					 StdOut.println("Precio ingresado!");
   					 break;
   				 } catch (NumberFormatException ex) {
   					 StdOut.println("Error, escriba con numeros porfavor");
   					 StdOut.println("Ingrese el precio");
   					 continue;
   				 }
   			 } // Fin del while que valida el precio

   			 StdOut.println("Ingrese el stock");
   			 while (x) {
   				 aux = StdIn.readString() + StdIn.readLine();
   				 try {
   					 stockfig = Integer.parseInt(aux);
   					 if (stockfig <= 0) {
   						 StdOut.println("Escriba un numero positivo mayor que 0 porfavor");
   						 StdOut.println("Ingrese el stock");
   						 continue;
   					 }
   					 StdOut.println("Stock ingresado!");
   					 break;
   				 } catch (NumberFormatException ex) {
   					 StdOut.println("Error, escriba con numeros porfavor");
   					 StdOut.println("Ingrese el stock");
   					 continue;
   				 }
   			 } // Fin del while que valida el stock

   			 int contafig = listaProducto.getCantActual();
   			 String idfig = "FC_000" + contafig;

   			 if (contafig == 9 || (contafig >= 10 && contafig < 99)) {
   				 idfig = idfig.substring(0, idfig.length() - 1);
   				 int newidfig = contafig + 1;
   				 idfig = "FC_00" + newidfig;
   				 StdOut.println("La id de la figura coleccionable es: " + idfig);
   			 }
   			 // CASO DE 9 A 10
   			 contafig = listaProducto.getCantActual();
   			 idfig = "FC_00" + contafig;

   			 if (contafig == 99 || (contafig >= 100 && contafig < 999)) {
   				 idfig = idfig.substring(0, idfig.length() - 1);
   				 int newidfig = contafig + 1;
   				 idfig = "FC_0" + newidfig;
   				 StdOut.println("La id de la tarjeta de baseball es: " + idfig);
   				 // caso de 99 a 100

   			 }
   			 contafig = listaProducto.getCantActual();
   			 idfig = "FC_0" + contafig;

   			 if (contafig == 999 || (contafig >= 1000 && contafig < 9999)) {
   				 idfig = idfig.substring(0, idfig.length() - 1);
   				 int newidfig = contafig + 1;
   				 idfig = "FC_" + newidfig;
   				 StdOut.println("La id de la figura coleccionable es: " + idfig);
   				 // caso de 999 a 1000

   			 }

   			 Producto Figura = new FiguraColeccionable(idfig, figura, tipo, edicion, preciofig, stockfig);
   			 listaProducto.agregarArch(Figura);

   			 return;
   		 case "4":

   			 String polera = "null";
   			 String talla = "null";
   			 int preciopolera = 0;
   			 int stockpolera = 0;

   			 StdOut.println("Ingrese una polera: ");
   			 while (x) {
   				 polera = StdIn.readString() + StdIn.readLine();
   				 try {
   					 Integer.parseInt(polera);
   					 StdOut.println("Error, escribio un numero");
   					 StdOut.println("Ingrese una polera: ");
   					 continue;

   				 } catch (NumberFormatException ex) {
   					 StdOut.println("Polera Ingresada!");
   					 break;
   				 }
   			 } // Fin del while que valida la polera

   			 StdOut.println("Ingrese la talla: ");
   			 while (x) {
   				 talla = StdIn.readString() + StdIn.readLine();
   				 try {
   					 Integer.parseInt(talla);
   					 StdOut.println("Error, escribio un numero");
   					 StdOut.println("Ingrese la talla: ");
   					 continue;

   				 } catch (NumberFormatException ex) {
   					 StdOut.println("Talla Ingresada!");
   					 break;
   				 }
   			 } // Fin del while que valida la talla

   			 StdOut.println("Ingrese el precio");
   			 while (x) {
   				 aux2 = StdIn.readString() + StdIn.readLine();
   				 try {
   					 preciopolera = Integer.parseInt(aux2);
   					 if (preciopolera <= 0) {
   						 StdOut.println("Escriba un numero positivo mayor que 0 porfavor");
   						 StdOut.println("Ingrese el precio");
   						 continue;
   					 }
   					 StdOut.println("Precio ingresado!");
   					 break;
   				 } catch (NumberFormatException ex) {
   					 StdOut.println("Error, escriba con numeros porfavor");
   					 StdOut.println("Ingrese el precio");
   					 continue;
   				 }
   			 } // Fin del while que valida el precio

   			 StdOut.println("Ingrese el stock");
   			 while (x) {
   				 aux = StdIn.readString() + StdIn.readLine();
   				 try {
   					 stockpolera = Integer.parseInt(aux);
   					 if (stockpolera <= 0) {
   						 StdOut.println("Escriba un numero positivo mayor que 0 porfavor");
   						 StdOut.println("Ingrese el stock");
   						 continue;
   					 }
   					 StdOut.println("Stock ingresado!");
   					 break;
   				 } catch (NumberFormatException ex) {
   					 StdOut.println("Error, escriba con numeros porfavor");
   					 StdOut.println("Ingrese el stock");
   					 continue;
   				 }
   			 } // Fin del while que valida el stock

   			 int contapo = listaProducto.getCantActual();
   			 String idpo = "PO_000" + contapo;

   			 if (contapo == 9 || (contapo >= 10 && contapo < 99)) {
   				 idpo = idpo.substring(0, idpo.length() - 1);
   				 int newidpo = contapo + 1;
   				 idpo = "PO_00" + newidpo;
   				 StdOut.println("La id de la polera es: " + idpo);
   			 }
   			 // CASO DE 9 A 10
   			 contapo = listaProducto.getCantActual();
   			 idpo = "PO_00" + contapo;

   			 if (contapo == 99 || (contapo >= 100 && contapo < 999)) {
   				 idpo = idpo.substring(0, idpo.length() - 2);
   				 int newidpo = contapo + 1;
   				 idpo = "PO_0" + newidpo;
   				 StdOut.println("La id de la polera es: " + idpo);
   				 // caso de 99 a 100

   			 }
   			 contapo = listaProducto.getCantActual();
   			 idpo = "PO_0" + contapo;

   			 if (contapo == 999 || (contapo >= 1000 && contapo < 9999)) {
   				 idpo = idpo.substring(0, idpo.length() - 1);
   				 int newidpo = contapo + 1;
   				 idpo = "PO_" + newidpo;
   				 StdOut.println("La id de la polera es: " + idpo);
   				 // caso de 999 a 1000

   			 }

   			 Producto Polera = new Polera(idpo, polera, talla, preciopolera, stockpolera);
   			 listaProducto.agregarArch(Polera);

   			 return;
   			 
   		 default:
   			 StdOut.println("Opcion invalida, intentelo nuevamente.");
   			 prod = StdIn.readString() + StdIn.readLine();

   		 }
   	 }

   	 

    }// FIN INGRESAR PRODUCTO



	

	@Override
	/**
	 * Metodo que realiza la venta del programa
	 */
	public void realizarVenta(ListaCliente listaCliente) {
		boolean x = true;
	   	 String tipo = "null";
	   	 String nom = "null";
	   	 String ape = "null";
	   	 String pago = "null";
			StdOut.println("Ingrese el tipo de cliente(nino o adulto): ");
	   		while (x) {
				 tipo = StdIn.readString()+StdIn.readLine();
				 try {
					 Integer.parseInt(tipo);
					 StdOut.println("Error, escribio un numero");
					 StdOut.println("Ingrese el tipo de cliente(nino o adulto): ");
					 continue;

				 } catch (NumberFormatException ex) {
					 if (tipo.equalsIgnoreCase("nino") || tipo.equalsIgnoreCase("adulto")) {
   						 StdOut.println("Tipo Ingresado!");
   						 break;
   					 } else {
   						 StdOut.println("Error, escoja una de las opciones en el parentesis");
   						 StdOut.println("Ingrese el tipo de cliente(nino o adulto): ");
   						 continue;
   					 }
					 
				 }
			 } // Fin del while que valida el cliente
	   	 
	   	 StdOut.println("Ingrese el rut del cliente: ");
	   	 String rut = StdIn.readString()+StdIn.readLine();
	   	  
	   	StdOut.println("Ingrese el nombre del cliente: ");
  		while (x) {
  			nom = StdIn.readString()+ StdIn.readLine();
			 try {
				 Integer.parseInt(nom);
				 StdOut.println("Error, escribio un numero");
				 StdOut.println("Ingrese el nombre del cliente: ");
				 continue;

			 } catch (NumberFormatException ex) {
				 StdOut.println("Nombre Ingresado!");
				 break;
			 }
		 } // Fin del while que valida el cliente
	   	  
	   	 
	   	  
	   	StdOut.println("Ingrese el apellido del cliente: ");
  		while (x) {
  			ape = StdIn.readString()+StdIn.readLine();
			 try {
				 Integer.parseInt(ape);
				 StdOut.println("Error, escribio un numero");
				 StdOut.println("Ingrese el apellido del cliente: ");
				 continue;

			 } catch (NumberFormatException ex) {
				 StdOut.println("Apellido Ingresado!");
				 break;
			 }
		 } // Fin del while que valida el cliente
	   	 
	   	 
	   	  
  		StdOut.println("Ingrese la forma de pago: ");
  		while (x) {
  			pago = StdIn.readString()+StdIn.readLine();
			 try {
				 Integer.parseInt(pago);
				 StdOut.println("Error, escribio un numero");
				 StdOut.println("Ingrese la forma de pago: ");
				 continue;

			 } catch (NumberFormatException ex) {
				 StdOut.println("Pago Ingresado!");
				 break;
			 }
		 } // Fin del while que valida el cliente

		if (tipo.equalsIgnoreCase("nino")) {
			StdOut.println("Ingrese el tipo de producto de interes del niño: ");
			String inter = StdIn.readString()+StdIn.readLine();
		}
		Cliente Cliente = new Cliente(rut, nom, ape, pago, tipo);
		listaCliente.agregarCliente(Cliente);
		StdOut.println("Cliente ingresado en la base de datos.");

		String compra;
		int cant;
		
		while (x) {
			StdOut.println("Ingrese el/los producto/s que compro el cliente(-1 para salir) y la cantidad que compro: ");
			compra = StdIn.readString() + StdIn.readLine();
			
			StdOut.println("Ingrese la cantidad que compro: ");
			cant=StdIn.readInt();
			if (compra.equals("-1")) {
				x = false;
			}

		}
		

	}

}
